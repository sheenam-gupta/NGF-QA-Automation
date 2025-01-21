package com.fdmgroup.Main_Dashboard.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;
import java.util.List;

import static com.fdmgroup.data.CommunitySpace_DataFile.*;

public class CommunitySpacePage {
    @FindBy(xpath = "//h3[contains(text(), 'Community Space')]")
    private WebElement communitySpaceIntroText;

    @FindBy(xpath = "//ul[@class='menu-items']/li/a[contains(text(), 'Community Space')]")
    private WebElement communitySpaceButton;

    @FindBy(xpath = "//button[contains(text(),'Submit A Suggestion')]")
    private WebElement submitSuggestionButton;

    public static WebElement submitSuggestionButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[contains(text(),'Submit A Suggestion')]"));
    }

    

    @FindBy(xpath = "//button[contains(text(),'Discard My Suggestion')]")
    private WebElement discardSuggestionButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']")
    private WebElement suggestionForm;

    @FindBy(xpath = "//select[@id='isModuleRelated']")
    private WebElement suggestionRelatedtoModuleOption;

    public static WebElement suggestionRelatedtoModuleOption(WebDriver driver) {
        return driver.findElement(By.xpath("//select[@id='isModuleRelated']"));
    }

    @FindBy(xpath = "//option[@value='Yes']")
    private WebElement optionYes;

    @FindBy(xpath = "//option[@value='No']")
    private WebElement optionNo;

    @FindBy(xpath = "//select[@id = 'selectedModule']")
    private WebElement selectAModule;

    public static WebElement selectModule(WebDriver driver) {
        return driver.findElement(By.xpath("//select[@id = 'selectedModule']"));
    }

    @FindBy(xpath = "//select[@id = 'selectedSubModule']")
    private WebElement selectASubModule;

    public static WebElement selectSubModule(WebDriver driver) {
        return driver.findElement(By.xpath("//select[@id = 'selectedSubModule']"));
    }

    @FindBy(xpath = "//option[@value='IPrep']")
    private WebElement optionIPrep;

    @FindBy(xpath = "//option[@value='Finwise']")
    private WebElement optionFinwise;

    @FindBy(xpath = "//option[@value='Intellisense']")
    private WebElement optionIntellisense;

    @FindBy(xpath = "//option[@value='ResRev']")
    private WebElement optionResRev;

    @FindBy(xpath = "//option[@value='InsureTech']")
    private WebElement optionInsureTech;

    @FindBy(xpath = "//select[@id='selectedModule']/option[@value='New Module']")
    private WebElement optionNewModule;

    @FindBy(xpath = "//select[@id='selectedSubModule']/option[@value='New Module']")
    private WebElement optionNewSubModule;

    @FindBy(xpath = "//option[@value='Mock Exam']")
    private WebElement optionMockExam;

    @FindBy(xpath = "//option[@value='Interview Tips']")
    private WebElement optionInterViewTips;

    @FindBy(xpath = "//option[@value='Simulate Interview']")
    private WebElement optionSimulateInterview;

    @FindBy(xpath = "//option[@value='Financial Advisor']")
    private WebElement optionFinancialAdvisor;

    @FindBy(xpath = "//option[@value='Budget Calculator']")
    private WebElement optionBudgetCalculator;

    @FindBy(xpath = "//option[@value='Mortgage Advisor']")
    private WebElement optionMortgageAdvisor;

    @FindBy(xpath = "//option[@value='Code Assistant']")
    private WebElement optionCodeAssistant;

    @FindBy(xpath = "//option[@value='Error Handling']")
    private WebElement optionErrorHandling;

    @FindBy(xpath = "//option[@value='Code Optimization']")
    private WebElement optionCodeOptimization;

    @FindBy(xpath = "//option[@value='Sample Resume']")
    private WebElement optionSampleResume;

    @FindBy(xpath = "//option[@value='Keyword Matching']")
    private WebElement optionKeywordMatching;

    @FindBy(xpath = "//option[@value='AI Risk Assessor']")
    private WebElement optionAIRiskAssessor;

    @FindBy(xpath = "//option[@value='Insurance Advisor']")
    private WebElement optionInsuranceAdvisor;

    @FindBy(xpath = "//textarea[@id = 'suggestion']")
    private WebElement suggestion;

    public static WebElement enterSuggestion(WebDriver driver) {
        return driver.findElement(By.xpath("//textarea[@id = 'suggestion']"));
    }

    @FindBy(xpath = "//input[@id = 'userDetails']")
    private WebElement userDetails;

    public static WebElement enterUserDetails(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@id = 'userDetails']"));
    }

    @FindBy(xpath = "//input[@id = 'emailLocalPart']")
    private WebElement email;

    public static WebElement enterEmailAddress(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@id = 'emailLocalPart']"));
    }

    public static WebElement selectDomain(WebDriver driver){
        return driver.findElement(By.xpath("//select[@id='emailDomain']"));
    }

    public static WebElement clickViewAllSuggestionsButton(WebDriver driver){
        return driver.findElement(By.xpath("//button[normalize-space(text())='View all Suggestions']"));
    }
  

    @FindBy(xpath = "//tr[@class='ng-star-inserted']")
    private List<WebElement> suggestionsSubmitted;

    @FindBy(xpath = "//table[@class='suggestions-table']/thead/tr/th[contains(text(),'Title')]")
    private WebElement suggestionsTableTitle;

    public static WebElement suggestionsTableTitle(WebDriver driver) {
        return driver.findElement(By.xpath("//table[@class='suggestions-table']/thead/tr/th[contains(text(),'Title')]"));
    }

    @FindBy(xpath = "//table[@class='suggestions-table']/thead/tr/th[contains(text(),'Description')]")
    private WebElement suggestionsTableDescription;

    public static WebElement suggestionsTableDescription(WebDriver driver) {
        return driver.findElement(By.xpath("//table[@class='suggestions-table']/thead/tr/th[contains(text(),'Description')]"));
    }

    @FindBy(xpath = "//table[@class='suggestions-table']/thead/tr/th[contains(text(),'Category')]")
    private WebElement suggestionsTableCategory;

    public static WebElement suggestionsTableCategory(WebDriver driver) {
        return driver.findElement(By.xpath("//table[@class='suggestions-table']/thead/tr/th[contains(text(),'Category')]"));
    }

    @FindBy(xpath = "//table[@class='suggestions-table']/thead/tr/th[contains(text(),'Tags')]")
    private WebElement suggestionsTableTags;

    public static WebElement suggestionsTableTags(WebDriver driver) {
        return driver.findElement(By.xpath("//table[@class='suggestions-table']/thead/tr/th[contains(text(),'Tags')]"));
    }

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;


    public static WebElement submitButton(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@type='submit']"));
    }

    private Actions action;
    private WebDriverWait wait;
    private WebDriver driver;

    public CommunitySpacePage(){
        this.driver = BrowserUtilities.driver;
        PageFactory.initElements(driver, this);

        BrowserUtilities.maximizeWindow();
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clickCommunitySpaceButton (){
        action.moveToElement(communitySpaceButton).click().perform();
    }
    public boolean isCommunitySpaceIntroTextPresent (){
        return communitySpaceIntroText.isDisplayed();
    }
    public boolean isCommunitySpaceIntroTextAccurate (String textvalue){
        return communitySpaceIntroText.getText().contains(textvalue);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public void clickdiscardMySuggestionButton(){
        discardSuggestionButton.click();
    }

    public boolean isSuggestionFormDisplayed() {
        return suggestionForm.isDisplayed();
    }

    public boolean isSubmitSuggestionButtonDisplayed() {
        return submitSuggestionButton.isDisplayed();
    }

    public void clickDropDownRelatedtoModule() {
        suggestionRelatedtoModuleOption.click();
    }

    public void selectDropdownTitle(String title) {
        switch(title) {
            case IDEA_MODULE_RELATED -> clickDropDownRelatedtoModule();
            case MODULE_SELECTION -> clickModule();
            case SUBMODULE_SELECTION -> clickSubModule();
        }
    }

    public void selectDropdownItem(String dropdownItem) {
        switch(dropdownItem) {
            case YES_OPTION -> selectYes();
            case NO_OPTION -> selectNo();
            case IPREP -> selectIprepModule();
            case FINWISE -> selectFinWiseModule();
            case INTELLISENSE -> selectIntellisenseModule();
            case RESREV -> selectResRevModule();
            case INSURETECH -> selectInsureTechModule();
            case NEW_MODULE -> selectNewModule();
            case MOCK_EXAM -> selectMockExamSubModule();
            case INTERVIEW_TIPS -> selectInterviewTipsSubModule();
            case SIMULATE_INTERVIEW -> selectSimulateInterviewSubModule();
            case FINANCIAL_ADVISOR -> selectFinancialAdvisorSubModule();
            case BUDGET_CALCULATOR -> selectBudgetCalculatorSubModule();
            case MORTGAGE_ADVISOR -> selectMortgageAdvisorSubModule();
            case CODE_ASSISTANCE -> selectCodeAssistanceSubModule();
            case ERROR_HANDLING -> selectErrorHandlingSubModule();
            case CODE_OPTIMIZATION -> selectCodeOptimizationSubModule();
            case SAMPLE_RESUME -> selectSampleResumeSubModule();
            case KEYWORD_MATCHING -> selectKeyWordMatchingSubModule();
            case AI_RISK_ASSESSOR -> selectAiRiskAssessorSubModule();
            case INSURANCE_ADVISOR -> selectInsuranceAdvisorSubModule();
            case NEW_SUBMODULE -> selectNewSubModule();
        }
    }


    private void selectNewSubModule() {
        optionNewSubModule.click();
    }

    private void selectInsuranceAdvisorSubModule() {
        optionInsuranceAdvisor.click();
    }

    private void selectAiRiskAssessorSubModule() {
        System.out.println("AiRiskAssesor");
        optionAIRiskAssessor.click();
    }

    private void selectKeyWordMatchingSubModule() {
        optionKeywordMatching.click();
    }

    private void selectSampleResumeSubModule() {
        optionSampleResume.click();
    }

    private void selectCodeOptimizationSubModule() {
        optionCodeOptimization.click();
    }

    private void selectErrorHandlingSubModule() {
        optionErrorHandling.click();
    }

    private void selectCodeAssistanceSubModule() {
        optionCodeAssistant.click();
    }

    private void selectBudgetCalculatorSubModule() {
        optionBudgetCalculator.click();
    }

    private void selectMortgageAdvisorSubModule() {
        optionMortgageAdvisor.click();
    }

    private void selectFinancialAdvisorSubModule() {
        optionFinancialAdvisor.click();
    }

    private void selectSimulateInterviewSubModule() {
        optionSimulateInterview.click();
    }

    private void selectInterviewTipsSubModule() {
        optionInterViewTips.click();
    }

    private void selectMockExamSubModule() {
        optionMockExam.click();
    }

    private void selectNewModule() {
        optionNewModule.click();
    }

    private void selectInsureTechModule() {
        optionInsureTech.click();
    }

    private void selectResRevModule() {
        optionResRev.click();
    }

    private void selectIntellisenseModule() {
        optionIntellisense.click();
    }

    private void selectFinWiseModule() {
        optionFinwise.click();
    }

    private void selectIprepModule() {
        optionIPrep.click();
    }

    private void selectNo() {
        optionNo.click();
    }

    private void selectYes() {
        optionYes.click();
    }

    public void clickModule() {
        selectAModule.click();
    }

    public void clickSubModule() {
        action.moveToElement(selectASubModule).click().perform();
    }

    public void enterSuggestion(String suggestion) {
        action.moveToElement(this.suggestion).click().sendKeys(suggestion).perform();
    }

    public void enterEmailAddress(String email) {
        action.moveToElement(this.email).click().sendKeys(email).perform();
    }

    public boolean isAlertPresent() {
        try{
            driver.switchTo().alert();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public String fetchResultFromAlert(){
        return driver.switchTo().alert().getText();
    }

    public void clickOnAlert(){
        driver.switchTo().alert().accept();
    }

    public boolean isListOfSuggestionsPresent() {
        int size = suggestionsSubmitted.size();
        return size >= 1;
        //return !driver.findElements((By) suggestionsSubmitted).isEmpty();
    }

    public boolean areSuggestionsTableFieldsPresent() {
        return suggestionsTableTitle.isDisplayed() || suggestionsTableDescription.isDisplayed()|| suggestionsTableCategory.isDisplayed() ||suggestionsTableTags.isDisplayed();
    }

    public void clickSubmitASuggestionbutton() {
        submitSuggestionButton.click();
    }

    public boolean isSuggestionFilteredCorrectly(String idea) {
        String result =fetchResultFromAlert();
        clickOnAlert();
        driver.switchTo().defaultContent();
        if (result.contains("Success")){
            for(WebElement item: suggestionsSubmitted){
                String text = item.findElement(By.xpath("(.//td)[2]")).getText();
                if(text.equals(idea))
                    return true;
            }
        } else if (result.contains("Error")){
            WebElement lastElement = suggestionsSubmitted.get(suggestionsSubmitted.size() - 1);
            String lastTextAdded = lastElement.findElement(By.xpath("(.//td)[2]")).getText();
            return !lastTextAdded.equals(idea);
        }
        return false;
    }
}
