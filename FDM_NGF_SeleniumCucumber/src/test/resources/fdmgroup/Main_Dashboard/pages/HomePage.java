package com.fdmgroup.Main_Dashboard.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class HomePage extends BrowserUtilities {

	@FindBy(xpath = "//body")
	private static WebElement body;

	@FindBy(xpath = "//ul[@class='menu-items']/li[1]/a[contains(text(), 'Home')]")
	private WebElement homeButton;

	@FindBy(xpath = "//ul[@class='menu-items']/li/a[contains(text(), 'About')]")
	private WebElement aboutButton;

	@FindBy(xpath = "//ul[@class='menu-items']/li/a[contains(text(), 'Community Space')]")
	public static WebElement communitySpaceButton;

	public static WebElement communitySpaceButton(WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@class='menu-items']/li/a[contains(text(), 'Community Space')]"));
	}

	@FindBy(xpath = "//ul[@class='menu-items']/li/a[contains(text(), 'Register')]")
	private WebElement registerButton;

	@FindBy(xpath = "//ul[@class='menu-items']/li/a[contains(text(), 'Login')]")
	private WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(), 'Logout')]")
	private WebElement logoutButton;

	@FindBy(xpath = "//a[contains(text(), 'Finwise')]")
	private WebElement exploreFinwiseButton;

	@FindBy(xpath = "//a[contains(text(), 'IPrep')]")
	private WebElement exploreIPrepButton;

	@FindBy(xpath = "//a[contains(text(), 'Intellisense')]")
	private WebElement exploreIntellisenseButton;

	@FindBy(xpath = "//a[contains(text(), 'ResRev')]")
	private WebElement exploreResRevButton;
	@FindBy(xpath = "//a[contains(text(), 'Mindful')]")
	private WebElement exploreMindfulMotionButton;

	@FindBy(xpath = "//a[contains(text(), 'InsureTech')]")
	private WebElement exploreInsureTechButton;

	@FindBy(xpath = "//a[contains(text(), 'InsightVision')]")
	private WebElement exploreInsightVisionButton;

	@FindBy(xpath = "//button[text()=' 1 ']")
	private WebElement page1Button;

	@FindBy(xpath = "//button[text()=' 2 ']")
	private WebElement page2Button;

	@FindBy(xpath = "//button[text()=' 3 ']")
	private WebElement page3Button;

	@FindBy(xpath = "//div[@class = 'form-check form-switch theme-toggle']/input[@type = 'checkbox']")
	private WebElement darkModeButton;

	@FindBy(xpath = "//label[@class='form-check-label ng-star-inserted']/i[@class='bi bi-moon']")
	private static WebElement darkModeIcon;

	@FindBy(xpath = "//app-floating-button[@ng-reflect-icon='bi bi-calendar-fill']//div[@class='custom-btn']")
	public static WebElement taskManagerButton;

	@FindBy(xpath = "//*[@class='bi bi-gear h4']")
	private WebElement settingGearIcon;

	@FindBy(xpath = "//a[contains(text(),'Preference')]")
	private WebElement preferenceMenu;

	public static WebElement welcomeMessage(WebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Welcome')]")));
	}

	public static WebElement resCraftModule(WebDriver driver) {
		return driver.findElement(By.xpath("//a[normalize-space(text())='Explore ResCraft']"));
	}

	public static WebElement iPrepModule(WebDriver driver) {
		return driver.findElement(By.xpath("//a[normalize-space(text())='Explore IPrep']"));
	}

	public static WebElement leftArrow(WebDriver driver) {
		return driver.findElement(By.xpath("//button[normalize-space(text())='←']"));
	}

	public static WebElement rightArrow(WebDriver driver) {
		return driver.findElement(By.xpath("//button[normalize-space(text())='→']"));
	}

	static Actions action;
	WebDriverWait wait;

	public HomePage() {
		PageFactory.initElements(driver, this);
		setExplicitWait(10);
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		maximizeWindow();
	}

	public void clickHomeButton() {
		action.moveToElement(homeButton).click().perform();
	}

	public void clickAboutButton() {
		action.moveToElement(aboutButton).click().perform();
	}

	public void clickRegisterButton() {
		action.moveToElement(registerButton).click().perform();
	}

	public void clickLoginButton() {
		action.moveToElement(loginButton).click().perform();
	}

	public void clickLogoutButton() {
		action.moveToElement(logoutButton).click().perform();
	}

	public boolean isLogoutButtonPresent() {
		return logoutButton.isDisplayed();
	}

	public void clickExploreFinwiseButton() {
		action.moveToElement(exploreFinwiseButton).click().perform();
	}

	public void clickExploreIPrepButton() {
		action.moveToElement(exploreIPrepButton).click().perform();
	}

	public void clickExploreIntellisenseButton() {
		action.moveToElement(exploreIntellisenseButton).click().perform();

	}

	public void clickExploreResRevButton() {
		exploreResRevButton.click();
	}
	public void clickExploreMindfulMotionButton() {
		exploreMindfulMotionButton.click();
	}

	public void clickExploreInsureTechButton() {
		action.moveToElement(exploreInsureTechButton).click().perform();
	}

	public void clickPage1Button() {
		action.moveToElement(page1Button).click().perform();

	}

	public void clickPage2Button() {
		action.moveToElement(page2Button).click().perform();

	}

	public void clickPage3Button() {
		action.moveToElement(page3Button).click().perform();

	}

	public String getUsername() {
		waitForPresenceOfElementLocated(By.tagName("h3"));
		WebElement h3Element = driver.findElement(By.tagName("h3"));
		return h3Element.getText().split(", ")[1];
	}

	public boolean isRegisterButtonPresent() {
		return registerButton.isDisplayed();
	}

	public void clickDarkModeCheckBox() {
		action.moveToElement(darkModeButton).click().perform();
	}

	public static boolean isDarkModeIconEnabled() {
		return darkModeIcon.isDisplayed();
	}

	public void clickExploreInsightVisionButton() {
		action.moveToElement(exploreInsightVisionButton).click().perform();
	}

	public static String getColorDarkModeOn() {
		String rgbaActualColor = body.getCssValue("background-color");
		String hex = Color.fromString(rgbaActualColor).asHex();

		return hex;
	}

	public void clickTaskManagerButton() {
		action.moveToElement(taskManagerButton).click().perform();
	}

	public void hoverSettingGearIcon() {
		action.moveToElement(settingGearIcon).perform();
	}
	
	public void clickPreferenceTab()
	{
		preferenceMenu.click();
	}
	
}
