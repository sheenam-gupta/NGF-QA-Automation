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
import static com.fdmgroup.data.IPrep_Datafile.EXPERIENCED;

abstract class Interview {
    @FindBy(xpath = "//app-dropdown-button[@name='Subject']")
    protected WebElement subjectDropdown;

    @FindBy(xpath = "//app-dropdown-button[@name='Role']")
    protected WebElement roleDropdown;

    @FindBy(xpath = "//app-dropdown-button[@name='Level']")
    protected WebElement levelDropdown;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    protected WebElement editButton;

    @FindBy(xpath = "//div[@class='text-box editable']")
    protected WebElement editTextBox;

    @FindBy(xpath = "//button[contains(text(),'Start')]")
    protected WebElement startButton;

    @FindBy(xpath = "//button[contains(text(),'Development')]")
    protected WebElement developmentButton;
    @FindBy(xpath = "//button[contains(text(),'Frontend')]")
    protected WebElement frontendButton;
    @FindBy(xpath = "//button[contains(text(),'Backend')]")
    protected WebElement backendButton;
    @FindBy(xpath = "//button[contains(text(),'Full Stack')]")
    protected WebElement fullStackButton;
    @FindBy(xpath = "//button[contains(text(),'RPA')]")
    protected WebElement rpaButton;

    @FindBy(xpath = "//button[contains(text(),'Quality Assurance')]")
    protected WebElement qualityAssuranceButton;
    @FindBy(xpath = "//button[contains(text(),'Manual Testing')]")
    protected WebElement manualTestingButton;
    @FindBy(xpath = "//button[contains(text(),'QA Analyst')]")
    protected WebElement qaAnalystButton;
    @FindBy(xpath = "//button[contains(text(),'QA Engineer')]")
    protected WebElement qaEngineerButton;
    @FindBy(xpath = "//button[contains(text(),'SDET')]")
    protected WebElement sdetButton;

    @FindBy(xpath = "//button[contains(text(),'Data Engineering')]")
    protected WebElement dataEngineeringButton;
    @FindBy(xpath = "//button[contains(text(),'Data Analyst')]")
    protected WebElement dataAnalystButton;
    @FindBy(xpath = "//button[contains(text(),'Data Engineer')]")
    protected WebElement dataEngineerButton;
    @FindBy(xpath = "//button[contains(text(),'AI Engineer')]")
    protected WebElement aiEngineerButton;
    @FindBy(xpath = "//button[contains(text(),'ML Engineer')]")
    protected WebElement mlEngineerButton;

    @FindBy(xpath = "//button[contains(text(),'BA/PM')]")
    protected WebElement ba_PmButton;
    @FindBy(xpath = "//button[contains(text(),'Product Owner')]")
    protected WebElement productOwnerButton;
    @FindBy(xpath = "//button[contains(text(),'Scrum Master')]")
    protected WebElement scrumMasterButton;
    @FindBy(xpath = "//button[contains(text(),'Business Analyst')]")
    protected WebElement businessAnalystButton;
    @FindBy(xpath = "//button[contains(text(),'Systems Analyst')]")
    protected WebElement systemsAnalystButton;

    @FindBy(xpath = "//button[contains(text(),'Dev Ops')]")
    protected WebElement devOpsButton;
    @FindBy(xpath = "//button[contains(text(),'Dev Ops Engineer')]")
    protected WebElement devopsEngineerButton;
    @FindBy(xpath = "//button[contains(text(),'Cloud Engineer')]")
    protected WebElement cloudEngineerButton;
    @FindBy(xpath = "//button[contains(text(),'Release Engineer')]")
    protected WebElement releaseEngineerButton;
    @FindBy(xpath = "//button[contains(text(),'DevOps Architect')]")
    protected WebElement devopsArchitectButton;

    @FindBy(xpath = "//button[contains(text(),'Tech Ops')]")
    protected WebElement techOpsButton;
    @FindBy(xpath = "//button[contains(text(),'Systems Admin')]")
    protected WebElement systemsAdminButton;
    @FindBy(xpath = "//button[contains(text(),'Database Admin')]")
    protected WebElement databaseAdminButton;
    @FindBy(xpath = "//button[contains(text(),'Network Admin')]")
    protected WebElement networkAdminButton;
    @FindBy(xpath = "//button[contains(text(),'IT Operations Analyst')]")
    protected WebElement itOperationsAnalystButton;

    @FindBy(xpath = "//button[contains(text(),'Fresher')]")
    protected WebElement fresherButton;

    @FindBy(xpath = "//button[contains(text(),'Intermediate')]")
    protected WebElement intermediateButton;

    @FindBy(xpath = "//button[contains(text(),'Experienced')]")
    protected WebElement experiencedButton;

    @FindBy(xpath = "//p[contains(text(),'Assistant')]")
    protected WebElement assistantWebElement;

    @FindBy(xpath = "//div[@class='content-container']")
    protected WebElement contentContainer;

    protected Actions action;
    protected WebDriverWait wait;
    protected final int delay = 1000;
    protected WebDriver driver;

    public Interview() {
        driver = BrowserUtilities.driver;
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        BrowserUtilities.maximizeWindow();
    }

    public void clickOnDropdown(String dropdown) {
        switch (dropdown) {
            case SUBJECT -> clickSubjectDropdown();
            case ROLE -> clickRoleDropdown();
            case LEVEL -> clickLevelDropdown();
        }
    }

    public void clickOnDropDownItem(String item) {
        switch (item) {
            case DEVELOPMENT -> clickDevelopmentButton();
            case FRONTEND -> clickFrontendButton();
            case BACKEND -> clickBackendButton();
            case FULL_STACK -> clickFullStackButton();
            case RPA -> clickRpaButton();
            case QUALITY_ASSURANCE -> clickQualityAssuranceButton();
            case MANUAL_TESTING -> clickManualTestingButton();
            case QA_ANALYST -> clickQaAnalystButton();
            case QA_ENGINEER -> clickQaEngineerButton();
            case SDET -> clickSdetButton();
            case DATA_ENGINEERING -> clickDataEngineeringButton();
            case DATA_ANALYST -> clickDataAnalystButton();
            case DATA_ENGINEER -> clickDataEngineerButton();
            case AI_ENGINEER -> clickAiEngineerButton();
            case ML_ENGINEER -> clickMlEngineerButton();
            case BA_PM -> clickBusinessAnalystButton();
            case PRODUCT_OWNER -> clickProductOwnerButton();
            case SCRUM_MASTER -> clickScrumMasterButton();
            case BUSINESS_ANALYST -> clickBusiness_AnalystButton();
            case SYSTEMS_ANALYST -> clickSystemsAnalystButton();
            case DEV_OPS -> clickDevOpsButton();
            case DEVOPS_ENGINEER -> clickDevopsEngineerButton();
            case CLOUD_ENGINEER -> clickCloudEngineerButton();
            case RELEASE_ENGINEER -> clickReleaseEngineerButton();
            case DEVOPS_ARCHITECT -> clickDevopsArchitectButton();
            case TECH_OPS -> clickTechOpsButton();
            case SYSTEMS_ADMIN -> clickSystemsAdminButton();
            case DATABASE_ADMIN -> clickDatabaseAdminButton();
            case NETWORK_ADMIN -> clickNetworkAdminButton();
            case IT_OPERATIONS_ANALYST -> clickItOperationsAnalystButton();
            case FRESHER -> clickFresherButton();
            case INTERMEDIATE -> clickIntermediateButton();
            case EXPERIENCED -> clickExperiencedButton();
        }
    }

    protected void clickManualTestingButton() {
        action.moveToElement(manualTestingButton).click().perform();
    }

    protected void clickQaAnalystButton() {
        action.moveToElement(qaAnalystButton).click().perform();
    }

    protected void clickQaEngineerButton() {
        action.moveToElement(qaEngineerButton).click().perform();
    }

    protected void clickSdetButton() {
        action.moveToElement(sdetButton).click().perform();
    }

    protected void clickDataAnalystButton() {
        action.moveToElement(dataAnalystButton).click().perform();
    }

    protected void clickDataEngineerButton() {
        action.moveToElement(dataEngineerButton).click().perform();
    }

    protected void clickAiEngineerButton() {
        action.moveToElement(aiEngineerButton).click().perform();
    }

    protected void clickMlEngineerButton() {
        action.moveToElement(mlEngineerButton).click().perform();
    }

    protected void clickProductOwnerButton() {
        action.moveToElement(productOwnerButton).click().perform();
    }

    protected void clickScrumMasterButton() {
        action.moveToElement(scrumMasterButton).click().perform();
    }

    protected void clickBusiness_AnalystButton() {
        action.moveToElement(businessAnalystButton).click().perform();
    }

    protected void clickSystemsAnalystButton() {
        action.moveToElement(systemsAnalystButton).click().perform();
    }

    protected void clickDevopsEngineerButton() {
        action.moveToElement(devopsEngineerButton).click().perform();
    }

    protected void clickCloudEngineerButton() {
        action.moveToElement(cloudEngineerButton).click().perform();
    }

    protected void clickReleaseEngineerButton() {
        action.moveToElement(releaseEngineerButton).click().perform();
    }

    protected void clickDevopsArchitectButton() {
        action.moveToElement(devopsArchitectButton).click().perform();
    }

    protected void clickSystemsAdminButton() {
        action.moveToElement(systemsAdminButton).click().perform();
    }

    protected void clickDatabaseAdminButton() {
        action.moveToElement(databaseAdminButton).click().perform();
    }

    protected void clickNetworkAdminButton() {
        action.moveToElement(networkAdminButton).click().perform();
    }

    protected void clickItOperationsAnalystButton() {
        action.moveToElement(itOperationsAnalystButton).click().perform();
    }


    public boolean isOnInterviewTipsPage() {
        return driver.getCurrentUrl().contains("interview-tips");
    }

    public void clickSubjectDropdown() {
        action.moveToElement(subjectDropdown).click().perform();
    }

    public void clickRoleDropdown() {
        action.moveToElement(roleDropdown).click().perform();
    }

    public void clickLevelDropdown() {
        action.moveToElement(levelDropdown).click().perform();
    }

    public void clickEditButton() {
        action.moveToElement(editButton).click().perform();
    }

    public void enterText(String text) {
        editTextBox.clear();
        sleep(delay);
        editTextBox.sendKeys(text);
        sleep(delay);
    }

    protected void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isAssistantLabelPresent() {
        return assistantWebElement.isDisplayed();
    }

    public String getAssistantText() {
        return contentContainer.getText();
    }

    public void clickStartButton() {
        action.moveToElement(startButton).click().perform();
    }

    public void clickDevelopmentButton() {
        action.moveToElement(developmentButton).click().perform();
    }

    public void clickQualityAssuranceButton() {
        action.moveToElement(qualityAssuranceButton).click().perform();
    }

    public void clickDataEngineeringButton() {
        action.moveToElement(dataEngineeringButton).click().perform();
    }

    public void clickBusinessAnalystButton() {
        action.moveToElement(ba_PmButton).click().perform();
    }

    public void clickDevOpsButton() {
        action.moveToElement(devOpsButton).click().perform();
    }

    public void clickTechOpsButton() {
        action.moveToElement(techOpsButton).click().perform();
    }

    public void clickFrontendButton() {
        action.moveToElement(frontendButton).click().perform();
    }

    public void clickBackendButton() {
        action.moveToElement(backendButton).click().perform();
    }

    public void clickFullStackButton() {
        action.moveToElement(fullStackButton).click().perform();
    }

    public void clickRpaButton() {
        action.moveToElement(rpaButton).click().perform();
    }

    public void clickFresherButton() {
        action.moveToElement(fresherButton).click().perform();
    }

    public void clickIntermediateButton() {
        action.moveToElement(intermediateButton).click().perform();
    }

    public void clickExperiencedButton() {
        action.moveToElement(experiencedButton).click().perform();
    }
}
