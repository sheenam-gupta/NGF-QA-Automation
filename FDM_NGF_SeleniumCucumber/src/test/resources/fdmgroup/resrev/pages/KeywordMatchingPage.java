package com.fdmgroup.resrev.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

import static com.fdmgroup.data.ResRev_DataFile.*;

public class KeywordMatchingPage extends BrowserUtilities {

    @FindBy(xpath = "//h1[contains(text(),'Keyword')]")
    private WebElement keywordMatchingTitle;

    @FindBy(xpath = "//button[contains(text(),'recruiter')]" )
    private WebElement recruiterButton;

    @FindBy(xpath = "//button[contains(text(),'job seeker')]" )
    private WebElement jobSeekerButton;

    @FindBy(xpath = "//textarea[@name = 'jobDescription']")
    private WebElement jobDescription;

    @FindBy(xpath = "//textarea[@name = 'resume']")
    private WebElement resume;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement receiveFeedbackButton;

    @FindBy(xpath = "//div[@class='message-container ng-star-inserted']")
    private WebElement feedbackContainer;

    @FindBy(xpath = "(//div[@class='enhancement-button']/button)")
    private  WebElement enhanceResumeButton;

    @FindBy(xpath = "//h3[contains(text(),'Enhanced Resume')]")
    private  WebElement enhanceResumeSection;

    @FindBy(xpath = "//div[@class = 'feedback-container']")
    private  WebElement jobMatchingResumeSection;

    private Actions action;
    private WebDriverWait wait;

    public KeywordMatchingPage(){
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        maximizeWindow();
    }

    public boolean isOnKeywordMatchingPage(){
        return keywordMatchingTitle.getText().contains(KEYWORD_MATCHING_PAGE);
    }

    public void clickRecruiterButton(){
        recruiterButton.click();
    }

    public void clickJobSeekerButton(){
        jobSeekerButton.click();
    }

    public void enterJobDescription(String jobDescription) {
        this.jobDescription.click();
        this.jobDescription.sendKeys(jobDescription);
    }

    public String readFile(String resumeFilePath) {
        String path="src/test/java/com/fdmgroup/data/";
        try {
            return Files.readString(Path.of(path+resumeFilePath)).replaceAll("\\t", "\\\s");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterJobDescriptionInformation(String jobDescriptionFilePath){
        String jobDescription = readFile(jobDescriptionFilePath);
        this.jobDescription.sendKeys(jobDescription);
    }

    public void enterResumeInformation(String resumeFilePath){
        String resume = readFile(resumeFilePath);
        for (int i=0; i<resume.length();i+=100){
            String chunk = resume.substring(i,Math.min(i+100,resume.length()));
            this.resume.sendKeys(chunk);
        }
    }

    public void clickReceiveFeedbackbutton(){
        receiveFeedbackButton.click();
    }

    public boolean isResumeReviewResponseValid() {
        return feedbackContainer.getText().contains(KEYWORD_MATCHING_FEEDBACK);
    }

    public void clickEnhanceResumeButton() {
        enhanceResumeButton.click();
    }

    public boolean isEnhancedResumeResponseValid() {
        return enhanceResumeSection.getText().contains(ENHANCED_RESUME);
    }

    public boolean isResumeRefinementResponseValid(){
        return jobMatchingResumeSection.getText().contains(KEYWORD_MATCHING_FEEDBACK);
    }


}
