package com.fdmgroup.Main_Dashboard.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

public class PreferencePage extends BrowserUtilities {

	@FindBy(xpath = "//input[@type='checkbox' and @role='switch']")
	private static WebElement darkModeSwitch;

	@FindBy(xpath = "//h2[contains(text(),'NGF App Account Preferences')]")
	private static WebElement preferencePage;

	@FindBy(xpath = "//h6[contains(text(),'Contact Email')]")
	private static WebElement contactEmailHeading;

	@FindBy(xpath = "//h6[contains(text(),'Password')]")
	private static WebElement changePasswordHeading;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private static WebElement logoutBtn;
	
	@FindBy(xpath = "//*[@class='bi bi-gear h4']")
	private static WebElement settingIcon;

	static Actions action;
	WebDriverWait wait;

	public PreferencePage() {
		PageFactory.initElements(driver, this);
		setExplicitWait(10);
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		maximizeWindow();
	}

	public void darkModeSwitchExists() {
		action.moveToElement(preferencePage).perform();
		darkModeSwitch.isDisplayed();
	}

	public void clickDarkMode() {
		darkModeSwitch.click();
	}

	public void prefernecePageIsDisplayed() {
		preferencePage.isDisplayed();
	}

	public void contactEmailHeadingIsDisplayed() {
		contactEmailHeading.isDisplayed();
	}

	public void changePasswordIsDisplayed() {
		changePasswordHeading.isDisplayed();
	}
	
	public void clickLogoutButton()
	{
		logoutBtn.click();
	}
	
	public void hoverSettingIcon()
	{
		action.moveToElement(settingIcon).perform();
	}

}
