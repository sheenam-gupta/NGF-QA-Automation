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

public class Header extends BrowserUtilities {

    @FindBy(xpath = "//html//body//app-root//header//div//p")
    private WebElement headerModuleTile;

    @FindBy(xpath = "//button[contains(@class, 'back-button')]")
    private static WebElement masterDashboardButton;

    @FindBy(xpath = "//ul[@class='menu-items']/li[1]/a[contains(text(), 'Home')]")
    private WebElement homeButton;

    @FindBy(xpath = "//ul[@class='menu-items']/li/a[contains(text(), 'About')]")
    private WebElement aboutButton;

    @FindBy(xpath = "//ul[@class='menu-items']/li/a[contains(text(), 'Community Space')]")
    private WebElement communitySpaceButton;

    @FindBy(xpath = "//ul[@class='menu-items']/li/a[contains(text(), 'Register')]")
    private WebElement registerButton;

    @FindBy(xpath = "//ul[@class='menu-items']/li/a[contains(text(), 'Login')]")
    private WebElement loginButton;


    @FindBy(xpath = "//a[contains(text(), 'Logout')]")
    private WebElement logoutButton;

    @FindBy(xpath = "//span[contains(@class, 'tns')]")
    private WebElement mainDashboardHeaderTitle; // Expected title: "Welcome to our POD: Next Gen Forge"

    @FindBy(xpath = "//a[@href='/faq']")
    private WebElement faqButton; // used in iprep simulate interview module

    @FindBy(xpath="//a[contains(text(),'Onboarding Navigator')]")
    public static WebElement onboardingNavigator;

    public static WebElement  onboardingNavigator(WebDriver driver){
        return driver.findElement(By.xpath("//a[contains(text(),'Onboarding Navigator')]"));
    }

    public static WebElement loginButton(WebDriver driver){
        return driver.findElement(By.xpath("//a[normalize-space(text())='Login']"));

    }

    public static WebElement logoutButton(WebDriver driver) {
        return driver.findElement(By.xpath("//a[normalize-space(text())='Logout']"));
    }

    public static WebElement findMasterDashBoardButton(WebDriver driver){
        return driver.findElement(By.xpath("//button[contains(@class, 'back-button')]"));
    }

    private Actions action;
    private WebDriverWait wait;

    public Header() {
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        maximizeWindow();
    }

    public boolean isModuleNameCorrect(String text) {
        return headerModuleTile.getText().contains(text);
    }

    public boolean isMainDashboardHeaderTitleCorrect(String text) {
        return mainDashboardHeaderTitle.getText().contains(text);
    }

    public void clickMasterDashboardButton() {
        action.moveToElement(masterDashboardButton).click().perform();
    }

    public void clickHomeButton() {
        action.moveToElement(homeButton).click().perform();
    }

    public  void clickOnboardingNavigatorButton(){
        action.moveToElement(onboardingNavigator).click().perform();
    }

    public void clickAboutButton() {
        action.moveToElement(aboutButton).click().perform();
    }

    public void clickLoginButton() {
        action.moveToElement(loginButton).click().perform();
    }

    public void clickLogoutButton() {
        action.moveToElement(logoutButton).click().perform();
    }

    public void clickRegisterButton() {
        action.moveToElement(registerButton).click().perform();
    }

    public void clickFaqButton() {
        action.moveToElement(faqButton).click().perform();
    }


}
