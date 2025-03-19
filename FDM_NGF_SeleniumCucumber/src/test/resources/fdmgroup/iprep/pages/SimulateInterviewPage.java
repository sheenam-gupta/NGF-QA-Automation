package com.fdmgroup.iprep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;

import static com.fdmgroup.data.IPrep_Datafile.*;

public class SimulateInterviewPage extends BrowserUtilities {

    @FindBy(xpath = "//div[@class = 'content-container']/h3")
    private WebElement welcomeMessage;

    @FindBy(xpath = "//a[@href='/mock-interview']//button")
    private WebElement mockInterviewButton;

    @FindBy(xpath = "//a[@href='/schedule-interview']//button")
    private WebElement scheduleInterviewButton;

    @FindBy(xpath = "//a[@href ='/practice-history']")
    private WebElement practiceHistoryButton;

    @FindBy(xpath = "//a[contains(text(), 'Interview FAQ')]")
    private WebElement interviewFAQButton;

    @FindBy(xpath = "//h2[contains(text(), 'Mock Interview')]")
    private WebElement mockInterviewTitle;

    @FindBy(xpath = "//app-dropdown-button[@name='Interview Type']")
    private WebElement interviewTypeDropdown;
        @FindBy(xpath = "//app-dropdown-button[@name='Interview Type']//button[contains(text(), 'Behavioral')]")
        private WebElement behavioralInterviewType;
        @FindBy(xpath = "//app-dropdown-button[@name='Interview Type']//button[contains(text(), 'Developer')]")
        private WebElement developerInterviewType;
        @FindBy(xpath = "//app-dropdown-button[@name='Interview Type']//button[contains(text(), 'QA')]")
        private WebElement qaInterviewType;
        @FindBy(xpath = "//app-dropdown-button[@name='Interview Type']//button[contains(text(), 'BA')]")
        private WebElement baInterviewType;
        @FindBy(xpath = "//app-dropdown-button[@name='Interview Type']//button[contains(text(), 'PO')]")
        private WebElement poInterviewType;

    @FindBy(xpath = "//app-dropdown-button[@name='Choose Level']")
    private WebElement chooseLevelDropdown;
        @FindBy(xpath = "//app-dropdown-button[@name='Choose Level']//button[contains(text(), 'Beginner')]")
        private WebElement beginnerLevel;
        @FindBy(xpath = "//app-dropdown-button[@name='Choose Level']//button[contains(text(), 'Intermediate')]")
        private WebElement intermediateLevel;
        @FindBy(xpath = "//app-dropdown-button[@name='Choose Level']//button[contains(text(), 'Advanced')]")
        private WebElement advancedLevel;

    @FindBy(xpath = "//app-dropdown-button[@name='Stream']")
    private WebElement streamButton;
        @FindBy(xpath = "//app-dropdown-button[@name='Stream']//button[contains(text(), 'Java')]")
        private WebElement javaStream;
        @FindBy(xpath = "//app-dropdown-button[@name='Stream']//button[contains(text(), 'Python')]")
        private WebElement pythonStream;
        @FindBy(xpath = "//app-dropdown-button[@name='Stream']//button[contains(text(), 'C#')]")
        private WebElement cSharpStream;
        @FindBy(xpath = "//app-dropdown-button[@name='Stream']//button[contains(text(), 'Manual Testing')]")
        private WebElement automationManualTestingStream;
        @FindBy(xpath = "//app-dropdown-button[@name='Stream']//button[contains(text(), 'MGMT')]")
        private WebElement mgmtStream;
        @FindBy(xpath = "//app-dropdown-button[@name='Stream']//button[contains(text(), 'UX Product')]")
        private WebElement uxProductStream;

    @FindBy(xpath = "//button[contains(text(), 'Show Questions')]")
    private WebElement showQuestionsButton;

    @FindBy(xpath = "//div[@class='answer-box']//textarea")
    private WebElement answerTextArea;

    @FindBy(xpath = "//div[@class='pagination']//button[contains(text(), 'Previous')]")
    private WebElement previousButton;

    @FindBy(xpath = "//div[@class='pagination']//button[contains(text(), 'Next')]")
    private WebElement nextButton;

    @FindBy(xpath = "//div[@class='submit-container']//button")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='container']//div[@class='question-container']//h3[1]")
    private WebElement feedbackTitle;

    @FindBy(xpath = "//div[@class='feedback-box']//textarea[1]")
    private WebElement feedbackTextArea;

    @FindBy(xpath = "(//button[@class ='btn btn-black-currant'])[1]")
    private WebElement  viewDetailsInPracticeHistoryButton;

    @FindBy(xpath = "//table[@class = 'practice-history-table']")
    private WebElement practiceHistoryTable;

    @FindBy(xpath = "//th[contains(text(),'Type')]")
    private WebElement typeFieldPracticeHistoryTable;

    @FindBy(xpath = "//th[contains(text(),'Level')]")
    private WebElement levelFieldPracticeHistoryTable;

    @FindBy(xpath = "//th[contains(text(),'Performance')]")
    private WebElement performanceFieldPracticeHistoryTable;

    @FindBy(xpath = "//div[@class = 'session-details']/h4[contains(text(),'Questions')]")
    private WebElement viewQuestionsInSessionDetails;

    @FindBy(xpath = "//div[@class = 'session-details']/h4[contains(text(),'Answers')]")
    private WebElement viewAnswersInSessionDetails;

    @FindBy(xpath = "//div[@class = 'session-details']/h4[contains(text(),'Individual Feedbacks')]")
    private WebElement viewFeedbackInSessionDetails;

    private Actions action;
    private WebDriverWait wait;
    private WebDriver driver;

    public SimulateInterviewPage() {
        driver = BrowserUtilities.driver;
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        BrowserUtilities.maximizeWindow();
    }

    public void clickDropdown(String dropdownName) {
        switch (dropdownName) {
            case INTERVIEW_TYPE -> clickInterviewTypeDropdown();
            case CHOOSE_LEVEL -> clickChooseLevelButton();
            case STREAM -> clickStreamDropdown();
        }
    }

    public void clickDropdownItem(String item)  {
        switch (item) {
            case BEHAVIORAL -> clickBehavioralInterviewType();
            case DEVELOPER -> clickDeveloperInterviewType();
            case QA -> clickQaInterviewType();
            case BA -> clickBaInterviewType();
            case PO -> clickPoInterviewType();
            case BEGINNER -> clickBeginnerLevel();
            case INTERMEDIATE -> clickIntermediateLevel();
            case ADVANCED -> clickAdvancedLevel();
            case JAVA -> clickJavaStream();
            case PYTHON -> clickPythonStream();
            case C_SHARP -> clickCSharpStream();
            case AUTOMATED_MANUAL_TESTING -> clickAutomationManualTestingStream();
            case MGMT -> clickManagementStream();
            case UX_PRODUCT -> clickUxProductStream();
        }
    }

    public boolean isMockInterviewTitleDisplayed() {
        return mockInterviewTitle.isDisplayed();
    }

    public void clickMockInterviewButton() {
        mockInterviewButton.click();
    }

    public void clickScheduleInterviewButton() {
        scheduleInterviewButton.click();
    }

    public void clickPracticeHistoryButton(){ practiceHistoryButton.click(); }

    public void clickInterviewFAQButton() {
        interviewFAQButton.click();
    }

    // Dropdowns
    public void clickInterviewTypeDropdown() {
        interviewTypeDropdown.click();
    }

    public void clickChooseLevelButton() {
        chooseLevelDropdown.click();
    }

    public void clickStreamDropdown() {
        streamButton.click();
    }

    // Dropdown Items
    public void clickBehavioralInterviewType() {
        behavioralInterviewType.click();
    }

    public void clickDeveloperInterviewType() {
        developerInterviewType.click();
    }

    public void clickQaInterviewType() {
        qaInterviewType.click();
    }

    public void clickBaInterviewType() {
        baInterviewType.click();
    }

    public void clickPoInterviewType() {
        poInterviewType.click();
    }

    public void clickBeginnerLevel() {
        beginnerLevel.click();
    }

    public void clickIntermediateLevel() {
        intermediateLevel.click();
    }

    public void clickAdvancedLevel() {
        advancedLevel.click();
    }

    public void clickJavaStream() {
        javaStream.click();
    }

    public void clickPythonStream() {
        pythonStream.click();
    }

    public void clickCSharpStream() {
        cSharpStream.click();
    }

    public void clickAutomationManualTestingStream() {
        automationManualTestingStream.click();
    }

    public void clickManagementStream() {
        mgmtStream.click();
    }

    public void clickUxProductStream() {
        uxProductStream.click();
    }

    public void clickShowQuestionsButton() {
        showQuestionsButton.click();
    }

    public void enterAnswer(String answer) {
        answerTextArea.sendKeys(answer);
    }

    public void clickPreviousButton() {
        previousButton.click();
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isFeedbackTitleValid(String title) {
        return feedbackTitle.getText().equals(title);
    }

    public boolean isFeedbackTextAreaValid() {
        for (int i = 1; i <= 3; i++) {
            if (!feedbackTextArea.getText().contains(String.valueOf(i)))
                return false;
        }
        return true;
    }

    public boolean isPracticeHistoryTablePresent(){
        return practiceHistoryTable.isDisplayed();
    }

    public boolean areFieldsTypeLevelAndPerformancePresent(){
        return typeFieldPracticeHistoryTable.isDisplayed()
                && levelFieldPracticeHistoryTable.isDisplayed()
                && performanceFieldPracticeHistoryTable.isDisplayed();
    }

    public void clickViewPracticeButton(){
        if (viewDetailsInPracticeHistoryButton.isDisplayed())
            viewDetailsInPracticeHistoryButton.click();
    }

    public boolean areSessionDetailsPresent(){
        return viewQuestionsInSessionDetails.isDisplayed()
                && viewAnswersInSessionDetails.isDisplayed()
                && viewFeedbackInSessionDetails.isDisplayed();
    }

    public String getUsernameFromUrl() {
        String currentURL =driver.getCurrentUrl();
        return currentURL.substring(currentURL.lastIndexOf("=")+1);

    }

    public String getUsernameUI() {
        return welcomeMessage.getText().substring(9);
    }
}
