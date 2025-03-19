package com.fdmgroup.iprep.pages;

import com.fdmgroup.Utilities.BrowserUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.fdmgroup.data.IPrep_Datafile.*;

public class MockExamPage extends BrowserUtilities {

    @FindBy(xpath = "//h2[contains(text(),'Mock Exam')]")
    private WebElement mockExamPageTitle;

    @FindBy(xpath = "//button[contains(text(),'Subject')]")
    private WebElement subjectButton;

    @FindBy(xpath = "//app-dropdown-button[@name='Subject']//button[contains(text(), 'Java')]")
    private WebElement javaMockType;
    @FindBy(xpath = "//app-dropdown-button[@name='Subject']//button[contains(text(), 'JavaScript')]")
    private WebElement javascriptMockType;
    @FindBy(xpath = "//app-dropdown-button[@name='Subject']//button[contains(text(), 'QA')]")
    private WebElement qaMockType;
    @FindBy(xpath = "//app-dropdown-button[@name='Subject']//button[contains(text(), 'BA/PM')]")
    private WebElement baMockType;
    @FindBy(xpath = "//app-dropdown-button[@name='Subject']//button[contains(text(), 'ITSM')]")
    private WebElement itsmMockType;

    @FindBy(xpath = "//button[contains(text(),'Take Mock Exam')]")
    private WebElement takeMockExamButton;

    @FindBy(xpath = "//input[@value = 'a']")
    private WebElement aOptionRadioButton;
    @FindBy(xpath = "//input[@value = 'b']")
    private WebElement bOptionRadioButton;
    @FindBy(xpath = "//input[@value = 'c']")
    private WebElement cOptionRadioButton;
    @FindBy(xpath = "//input[@value = 'd']")
    private WebElement dOptionRadioButton;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    private WebElement nextButton;

    @FindBy(xpath = "//button[contains(text(),'Submit Answers')]")
    private WebElement submitAnswersButton;

    @FindBy(xpath = "//div[@class = 'score-text']")
    private WebElement score;

    @FindBy(xpath = "//div[@class = 'results-box']")
    private WebElement resultsBox;

    @FindBy(xpath = "//div[@class ='feedbackText']")
    private WebElement mockExamFeedBackText;

    @FindBy(xpath ="//div[@class = 'button-container']/button[contains(text(),'Review')]")
    private WebElement reviewButton;

    @FindBy(xpath ="//div[@class = 'button-container']/button[contains(text(),'Retry')]")
    private WebElement retryButton;
    
    @FindBy(xpath ="/html/body/app-root/main/app-mock-exam/div/div/p[1]/span")
    private WebElement questionPoints;
    
    @FindBy(xpath = "//caption[@class='loading-container']/span[@class='spinner']")
    private WebElement loadingSpinner;

    Actions action = new Actions(driver);

    public MockExamPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean isMockExamTitlePresent() {
        return mockExamPageTitle.getText().contains(MOCK_EXAM_PAGE_TITLE);
    }

    public void clickOnSubjectDropdown() {
        action.moveToElement(subjectButton).click().perform();
    }

    public void clickOnDropDownItem(String item){
        switch (item) {
            case JAVA -> clickJavaMockExamType();
            case JAVASCRIPT -> clickJavascriptMockExamType();
            case BA_PM -> clickBAPmMockExamType();
            case QA -> clickQAMockExamType();
            case ITSM -> clickItsmMockExamType();
        }
    }

    //Dropdown Items
    private void clickBAPmMockExamType() {
        baMockType.click();
    }
    private void clickItsmMockExamType() {
        itsmMockType.click();
    }
    private void clickQAMockExamType() {
        qaMockType.click();
    }
    private void clickJavascriptMockExamType() {
        javascriptMockType.click();
    }
    private void clickJavaMockExamType() {
        javaMockType.click();
    }
    public void clickTakeMockExamButton() {
        takeMockExamButton.click();
    }

    public void clickOnRadioButtonItem(String item) {
        switch (item) {
            case A_OPTION -> clickOnAnswerA();
            case B_OPTION -> clickOnAnswerB();
            case C_OPTION-> clickOnAnswerC();
            case D_OPTION -> clickOnAnswerD();
        }
    }

    private void clickOnAnswerD() {
        action.moveToElement(dOptionRadioButton).click().perform();
    }
    private void clickOnAnswerC() {
        action.moveToElement(cOptionRadioButton).click().perform();
    }
    private void clickOnAnswerB() {
        action.moveToElement(bOptionRadioButton).click().perform();
    }
    private void clickOnAnswerA() {
        action.moveToElement(aOptionRadioButton).click().perform();
    }
    public void clickonNextQuestionButton() {
        nextButton.click();
    }
    public void clicksubmitAnswersButton() {
        submitAnswersButton.click();
    }
    public boolean isMockExamScorePresent() {
        return score.isDisplayed();
    }
    public boolean areMockExamResultsDisplayed() {
        return resultsBox.isDisplayed();
    }
    
    public boolean isSubmitAnswersButtonDisplayed() {
    	try {
            return driver.findElement(By.xpath("//button[contains(text(),'Submit Answers')]")).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isMockExamFeedbackPresent() {
        return mockExamFeedBackText.isDisplayed();
    }

    public boolean isReviewButtonPresent() {
        return reviewButton.isDisplayed();
    }

    public boolean isRetryButtonPresent() {
        return retryButton.isDisplayed();
    }

    public void clickRetryButton() {
        action.moveToElement(retryButton).click().perform();
    }
    
    public boolean isPointsAppearingBesideQuestion(int numPoints) {
    	return questionPoints.isDisplayed() && questionPoints.getText().equals(numPoints + " Point" + ((numPoints > 1) ? "s" : ""));
    }

	public boolean isLoadingDisplayed() {
		try {
	        Thread.sleep(2000); // Sleep for 2 seconds
	        return loadingSpinner.isDisplayed();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	        return false;
	    }	}
}
