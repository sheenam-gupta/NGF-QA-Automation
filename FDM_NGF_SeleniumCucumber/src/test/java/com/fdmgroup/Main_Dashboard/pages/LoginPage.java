package com.fdmgroup.Main_Dashboard.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

public class LoginPage extends BrowserUtilities {

	@FindBy(id = "username")
	private static WebElement usernameTextbox;

	@FindBy(id = "password")
	private static WebElement passwordTextbox;

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;

	public static WebElement usernameTextbox(WebDriver driver) {
		return driver.findElement(By.id("username"));
	}

	public static WebElement passwordTextbox(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}

	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Login']"));
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	Actions action = new Actions(driver);

	public LoginPage() {
		PageFactory.initElements(driver, this);
		setExplicitWait(10);
	}

	public void enterUsername(String username) {
		usernameTextbox.clear();
		usernameTextbox.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordTextbox.clear();
		passwordTextbox.sendKeys(password);
	}

	public void clickLoginButton() {
		action.moveToElement(loginButton).click().perform();
	}

	public String getErrorMessageForLogin() {
		waitForPresenceOfElementLocated(By.xpath("//div[text()=' Invalid Credentials ']"));
		WebElement resultMessage = driver.findElement(By.xpath("//div[text()=' Invalid Credentials ']"));
		return resultMessage.getText();
	}
}
