package com.fdmgroup.iprep.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;

public class InterviewFAQsPage extends BrowserUtilities {

    @FindBy(xpath = "//a[contains(text(), 'Interview FAQ')]")
    private WebElement interviewFAQButton;

    @FindBy(xpath = "//h2[contains(text(), 'Interview FAQ')]")
    private WebElement interviewFAQTitle;

    @FindBy(xpath = "//button[contains(text(), 'Interview Type')]")
    private WebElement interviewTypeButton;

    @FindBy(xpath = "//button[contains(text(), 'Behavioral')]")
    private WebElement behavioralInterviewType;

    @FindBy(xpath = "//button[contains(text(), 'Technical')]")
    private WebElement technicalInterviewType;

    @FindBy(xpath = "//button[contains(text(), 'Choose Level')]")
    private WebElement chooseLevelButton;

    @FindBy(xpath = "//button[contains(text(), 'Beginner')]")
    private WebElement beginnerLevel;

    @FindBy(xpath = "//button[contains(text(), 'Intermediate')]")
    private WebElement intermediateLevel;

    @FindBy(xpath = "//button[contains(text(), 'Advanced')]")
    private WebElement advancedLevel;

    @FindBy(xpath = "//button[contains(text(), 'Subject')]")
    private WebElement subjectButton;

    @FindBy(xpath = "//button[contains(text(), 'Java')]")
    private WebElement javaSubject;

    @FindBy(xpath = "//button[contains(text(), 'BA/PM')]")
    private WebElement baPmSubject;

    @FindBy(xpath = "//button[contains(text(), 'QA')]")
    private WebElement qaSubject;

    @FindBy(xpath = "//button[contains(text(), 'ITSM')]")
    private WebElement itsmSubject;

    @FindBy(xpath = "//button[contains(text(), 'Role')]")
    private WebElement roleButton;

    @FindBy(xpath = "//button[contains(text(), 'Developer')]")
    private WebElement developerRole;

    @FindBy(xpath = "//button[contains(text(), 'Scrum Master')]")
    private WebElement scrumMasterRole;

    @FindBy(xpath = "//button[contains(text(), 'SRE/Prod Support')]")
    private WebElement sreProdSupportRole;

    @FindBy(xpath = "//button[contains(text(), 'Submit')]")
    private WebElement submitButton;

    @FindBy(xpath = "//button[contains(text(), 'Reset')]")
    private WebElement resetButton;

    private Actions action;
    private WebDriverWait wait;

    public InterviewFAQsPage() {
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        maximizeWindow();
    }

    public void clickInterviewFAQButton() {
        interviewFAQButton.click();
    }

    public boolean isInterviewFAQTitleDisplayed() {
        return interviewFAQTitle.isDisplayed();
    }

    public void selectDropdown(String dropdownName) {
        switch (dropdownName) {

        }
    }

    public void selectDropdownItem(String item) {
        switch (item) {

        }
    }



}
