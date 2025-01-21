package com.fdmgroup.onboardingnavigator.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;


public class OnboardingPage {
	
	@FindBy(xpath = "//*[text()='Onboarding Navigator']")
	private WebElement onboardingNavigator;

    @FindBy(xpath = "//h1[contains(text(), 'NGF Onboarding Navigator')]")
    private WebElement onboardingPageWelcomeText;

    @FindBy(xpath = "//a[@class='link1']")
    private WebElement techSetupButton;

    @FindBy(xpath = "//h1[contains(text(),'NGF')]")
    private WebElement homeTitle;

    @FindBy(xpath = "//a[@href='./git.html']")
    private WebElement gitButton;

    @FindBy(xpath = "//a[@href='https://git-scm.com/downloads']")
    private WebElement gitInstallationLink;

    @FindBy(xpath = "//a[@href='https://git.fdmgroup.com/nextgenforge']")
    private WebElement NGFRepositoryLink;

    @FindBy(xpath = "//a[contains(text(),'Here is a video')]")
    private WebElement videoPythonScriptsLink;

    @FindBy(xpath = "//a[@href='./git-branching.html']")
    private WebElement gitBranchingStrategyLink;

    @FindBy(xpath = "//h1[@id='title']")
    private WebElement gitBranchingPageTitle;

    @FindBy(xpath = "//a[@class = 'float ' and @href='./backend.html']")
    private WebElement backEndButton;

    @FindBy(xpath = "//a[contains(text(),'Java 11')]")
    private WebElement java11Link;

    @FindBy(xpath = "//a[contains(text(),'Java 17')]")
    private WebElement java17Link;

    @FindBy(xpath = "//a[contains(text(),'STS4 IDE') and @href='https://spring.io/tools']")
    private WebElement springBootLink;

    @FindBy(xpath = "//a[contains(text(),'Download Lombok')]")
    private WebElement downloadLombokLink;

    @FindBy(xpath = "//a[contains(text(),'Install Lombok')]")
    private WebElement installLombokLink;

    @FindBy(xpath = "//a[contains(text(),'MvnRepository')]")
    private WebElement mavenRepositoryLink;

    @FindBy(xpath = "(//details)[3]")
    private WebElement lombokSetupNote;

    @FindBy(xpath = "//a[@href = 'https://www.baeldung.com/lombok-ide']")
    private WebElement lombokSetupLink;

    @FindBy(xpath = "//a[contains(text(),'Database setup')]")
    private WebElement databaseSetupLink;

    @FindBy(xpath = "//a[@href='./database.html']")
    private WebElement databaseButton;

    @FindBy(xpath = "//h1[contains(text(),'Database setup')]")
    private WebElement dataBasePageTitle;

    @FindBy(xpath = "//a[@href='https://www.mysql.com/products/community/']")
    private WebElement mySqlLink;

    @FindBy(xpath = "//a[@href='https://dev.mysql.com/downloads/workbench/']")
    private WebElement mySqlWorkbenchInstallationLink;

    @FindBy(xpath = "//a[contains(text(),'database script')]")
    private WebElement mySqlDatabaseScriptLink;

    @FindBy(xpath = "//a[contains(text(),'Frontend setup')]")
    private WebElement frontEndSetupLink;

    @FindBy(xpath = "//span[contains(text(),'DbScript_Version2.sql')]")
    private WebElement dbScriptTitle;

    @FindBy(xpath = "//h1[contains(text(),'NGF frontend setup')]")
    private WebElement frontEndPageTitle;

    @FindBy(xpath = "//a[contains(text(),'Frontend') and @class = 'float ']")
    private WebElement frontEndButton;

    @FindBy(xpath = "//a[contains(text(),'Visual Studio Code')]")
    private WebElement vsCodeInstallationLink;

    @FindBy(xpath = "//a[contains(text(),'NodeJS')]")
    private WebElement nodeJsInstallationLink;

    @FindBy(xpath = "//a[contains(text(),'Angular CLI')]")
    private WebElement angularCliInstallationLink;

    @FindBy(xpath = "//a[@href='./git.html#git-repo-cloning']")
    private WebElement ngfGitRepositoryCloning;

    @FindBy(xpath = "//a[@href='./running-ngf.html']")
    private WebElement runNgfProjectLink;

    @FindBy(xpath = "//a[@href='./glossary.html']")
    private WebElement glossaryButton;

    @FindBy(xpath = "//div[@class='glossary']/em")
    private WebElement glossaryWelcomeStatement;

    @FindBy(xpath = "//h1[contains(text(),'Git setup')]")
    private WebElement gitRepoPageTitle;

    @FindBy(xpath = "//h1[@class='title']")
    private WebElement runningNgfPageTitle;

    private Actions action;
    private WebDriverWait wait;
    private WebDriver driver;


    public OnboardingPage(){
        this.driver = BrowserUtilities.driver;
        PageFactory.initElements(driver, this);

        BrowserUtilities.maximizeWindow();
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isOnboardingPageWelcomeTextAccurate (String textvalue){    	
        return onboardingPageWelcomeText.getText().contains(textvalue);
    }

    public void clickTechSetupButtonButton(){
        techSetupButton.click();
        
    }

    public void clickGitButton(){
        gitButton.click();
    }

    public void clickGitInstallationLink(){
        action.moveToElement(gitInstallationLink).click().perform();
    }

    public String getPageURL(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    public void clickNgfAppRepositoryLink(){
        action.moveToElement(NGFRepositoryLink).click().perform();
    }

    public void clickPythonScriptsVideo(){
        action.moveToElement(videoPythonScriptsLink).click().perform();
    }

    public void clickGitBranchingStrategyLink(){
        action.moveToElement(gitBranchingStrategyLink).click().perform();
    }

    public boolean isGitBranchingTitlePageCorrect(String title){
        return gitBranchingPageTitle.getText().contains(title);
    }

    public void clickBackEndButton(){
        action.moveToElement(backEndButton).click().perform();
    }

    public void clickJava11InstallationLink(){
        action.moveToElement(java11Link).click().perform();
    }

    public void clickJava17InstallationLink(){
        action.moveToElement(java17Link).click().perform();
    }

    public void clickSpringBootInstallationLink(){
        action.moveToElement(springBootLink).click().perform();
    }

    public void clickDownloadLombokLink(){
        downloadLombokLink.click();
    }

    public void clickInstallLombokLink(){
        installLombokLink.click();
    }

    public void clickMvnRepositoryLink(){
        action.moveToElement(mavenRepositoryLink).click().perform();
    }

    public void clickNoteDetailsLombokArticle(){
        action.moveToElement(lombokSetupNote).click().perform();
    }

    public void clickSetUpLombokLink(){
        action.moveToElement(lombokSetupLink).click().perform();
    }

    public void clickDatabaseSetupLink(){
        action.moveToElement(databaseSetupLink).click().perform();
    }

    public boolean isDataBasePageTitleCorrect(String title){
        return dataBasePageTitle.getText().contains(title);
    }

    public void clickDataBaseButton(){
        action.moveToElement(databaseButton).click().perform();
    }

    public void clickInstallMySqlLink(){
        action.moveToElement(mySqlLink).click().perform();
    }

    public void clickInstallMySqlWorkBenchLink(){
        action.moveToElement(mySqlWorkbenchInstallationLink).click().perform();
    }

    public void clickDatabaseScriptLink(){
        action.moveToElement(mySqlDatabaseScriptLink).click().perform();
    }

    public void clickFrontEndSetupLink(){
        action.moveToElement(frontEndSetupLink).click().perform();
    }

    public boolean isFrontendPageTitleCorrect(String title){
        return frontEndPageTitle.getText().contains(title);
    }

    public void clickOnboardingFrontEndButton(){
        action.moveToElement(frontEndButton).click().perform();
    }

    public void clickVSCodeInstallationLink(){
        action.moveToElement(vsCodeInstallationLink).click().perform();
    }

    public void clickNodeJsInstallationLink(){
        action.moveToElement(nodeJsInstallationLink).click().perform();
    }

    public void clickAngularCliInstallationLink(){
        action.moveToElement(angularCliInstallationLink).click().perform();
    }

    public void clickNgfGitRepositoryLink(){
        action.moveToElement(ngfGitRepositoryCloning).click().perform();
    }

    public void clickRunNgfProjectLink(){
        action.moveToElement(runNgfProjectLink).click().perform();
    }

    public boolean isGitPageTitleCorrect(String title){
        return gitRepoPageTitle.getText().contains(title);
    }

    public boolean isRunningNgfPageTitleCorrect(String title){
        return runningNgfPageTitle.getText().contains(title);
    }

    public void clickGlossaryButton(){
        action.moveToElement(glossaryButton).click().perform();
    }

    public boolean isGlossaryPageCorrect(String statement){
        return glossaryWelcomeStatement.getText().contains(statement);
    }

    public String getTitlePage(){
    	onboardingNavigator.click();
    	techSetupButton.click();
        return homeTitle.getText();
    }

}
