package com.fdmgroup.Utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Main_Dashboard.pages.LoginPage;
import com.fdmgroup.data.PageURLs;
import com.fdmgroup.data.Login.Login_data;

public class BrowserUtilities extends DriverUtilities {

	private WebDriverWait explicitWait;
	public static DriverUtilities driverUtilities = DriverUtilities.getInstance();
	public static WebDriver driver = driverUtilities.getDriver();
	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	private static final int delay = 4000;

	public void setExplicitWait(long seconds) {
		this.explicitWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	}

	public static void loginSteps() {
		BrowserUtilities.verificationOfPage(PageURLs.LoginPage);
		LoginPage.usernameTextbox(driver).sendKeys(Login_data.UserName);
		LoginPage.passwordTextbox(driver).sendKeys(Login_data.Password);
		BrowserUtilities.clickingButton(LoginPage.loginButton(driver));
		assertEquals(HomePage.welcomeMessage(driver).getText(), "Welcome, " + Login_data.UserName);

	}

	// Implicit Wait
	public static void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	// alertIsPresent()
	public void waitForAlertIsPresent() {
		explicitWait.until(ExpectedConditions.alertIsPresent());
	}

	// elementToBeClickable()
	public void waitForElementToBeClickable(WebElement element) {
		explicitWait.until(ExpectedConditions.elementToBeClickable(element));
	}

	// elementToBeSelected()
	public void waitForElementToBeSelected(WebElement element) {
		explicitWait.until(ExpectedConditions.elementToBeSelected(element));
	}

	// textToBePresentInElement()
	public void waitForTextToBePresentInElement(WebElement element, String text) {
		explicitWait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

	// elementSelectionStateToBe()
	public void waitForElementSelectionStateToBe(WebElement element, boolean selected) {
		explicitWait.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
	}

	public void waitForFrameToBeAvailableAndSwitchToIt(String frameLocator) {
		explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	// invisibilityOfTheElementLocated()
	public void waitForInvisibilityOfTheElementLocated(By locator) {
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	// invisibilityOfElementWithText()
	public void waitForInvisibilityOfElementWithText(By locator, String text) {
		explicitWait.until(ExpectedConditions.invisibilityOfElementWithText(locator, text));
	}

	// presenceOfAllElementsLocatedBy()
	public void waitForPresenceOfAllElementsLocatedBy(By locator) {
		explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	// presenceOfElementLocated()
	public void waitForPresenceOfElementLocated(By locator) {
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	// textToBePresentInElementLocated()
	public void waitForTextToBePresentInElementLocated(By locator, String text) {
		explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
	}

	// textToBePresentInElementValue()
	public void waitForTextToBePresentInElementValue(WebElement element, String text) {
		explicitWait.until(ExpectedConditions.textToBePresentInElementValue(element, text));
	}

	// titleIs()
	public void waitForTitleIs(String title) {
		explicitWait.until(ExpectedConditions.titleIs(title));
	}

	// titleContains()
	public void waitForTitleContains(String title) {
		explicitWait.until(ExpectedConditions.titleContains(title));
	}

	// visibilityOf()
	public void waitForVisibilityOf(WebElement element) {
		explicitWait.until(ExpectedConditions.visibilityOf(element));
	}

	// visibilityOfAllElements()
	public void waitForVisibilityOfAllElements(List<WebElement> elements) {
		explicitWait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	// visibilityOfAllElementsLocatedBy()
	public void waitForVisibilityOfAllElementsLocatedBy(By locator) {
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	// visibilityOfElementLocated()
	public void waitForVisibilityOfElementLocated(By locator) {
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	// Fluent Wait visibilityOf()
	public void fluentWaitForVisibilityOf(long seconds, long pollingSeconds, WebElement element) {
		Wait<WebDriver> fluentWait;
		try {
			fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(seconds))
					.pollingEvery(Duration.ofSeconds(pollingSeconds)).ignoring(NoSuchElementException.class);
			fluentWait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Javascript Executor
	public void javascriptExecuteScript(String script) {

		js.executeScript(script);
	}

	public void javascriptExecuteScript(String script, Object arg) {
		js.executeScript(script, arg);
	}

	public void javascriptExecuteScript(String script, Objects args) {
		js.executeScript(script, args);
	}

	public void javascriptExecuteAsyncScript(String script) {
		js.executeAsyncScript(script);
	}

	public void javascriptExecuteAsyncScript(String script, Object arg) {
		js.executeAsyncScript(script, arg);
	}

	// change Windows
	public String getCurrentWindowHandle() {
		return driver.getWindowHandle();
	}

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public Set<String> getAllOpenWindowHandles() {
		return driver.getWindowHandles();
	}

	public static void openNewTab() {
		driver.switchTo().newWindow(WindowType.TAB);
		navigateToUrl(PageURLs.HomePage);

	}

	public void openNewWindow() {
		driver.switchTo().newWindow(WindowType.WINDOW);
	}

	public void changeToOriginalWindow() {
		driver.switchTo().window(getCurrentWindowHandle());
	}

	public void closeWindowOrTab() {
		driver.close();
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void minimizeWindow() {
		driver.manage().window().minimize();
	}

	// navigation
	public void driverGet(String url) {
		driver.get(url);
	}

	public static void navigateToUrl(String url) {
		driver.navigate().to(url);
	}

	public void navigateBackward() {
		driver.navigate().back();
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public void refreshBrowser() {
		driver.navigate().refresh();
	}

	public static String currentUrl() {
		return driver.getCurrentUrl();
	}

	public void hover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public String getCssValue(WebElement element, String propertyName) {
		setExplicitWait(10);
		waitForVisibilityOf(element);
		return element.getCssValue(propertyName);
	}

	// Screenshot

	public static void sleep(double scale) {
		try {
			Thread.sleep((int) (scale * 1000));

		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public static void scrollToWebElements(List<WebElement> elements) throws InterruptedException {
		for (WebElement element : elements) {
			js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, 100);", element); // Adjust -100 a
		}
	}

	public static void scrolltoTheTopOfThePage() throws InterruptedException {
		js.executeScript("window.scrollTo(0,0)");
	}

	public static void scrollToTheBottomOfThePage() throws InterruptedException {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollToWebElement(WebElement element) throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, 125);", element);
	}

	public static void selectDropDownValue(WebElement element, String value) {
		Select DropDownValue = new Select(element);
		DropDownValue.selectByVisibleText(value);

	}

	public static void selectDropDownValues(List<WebElement> elements, String values) throws InterruptedException {
		Select DropDownValue = new Select(elements.get(0));
		DropDownValue.selectByVisibleText(values);
	}

	public static void selectRadioButtonByChoice(List<WebElement> listOfRadioButtons, String choice) {
		listOfRadioButtons.stream().filter(radioButton -> radioButton.getAttribute("value").equalsIgnoreCase(choice))
				.findFirst().ifPresent(WebElement::click);
	}

	public static void verificationOfPage(String expectedPage) {
		assertEquals(expectedPage, driver.getCurrentUrl());
	}

	public static void verificationOfMessage(String expectedMessage, String string) throws InterruptedException {
		assertEquals(expectedMessage, string);

	}

	public static void verificationOfPageForUpdate(String expectedPage) throws InterruptedException {

		String actualUrl = driver.getCurrentUrl();
		assertTrue("URL does not match", actualUrl.equalsIgnoreCase(expectedPage));
	}

	public static void fakeStringInput(WebElement element) throws InterruptedException {
		element.sendKeys(com.fdmgroup.data.RandomData.randomString());
	}

	public static void fakeDateInput(WebElement element) throws InterruptedException {
		element.sendKeys(com.fdmgroup.data.RandomData.BirthDate());
	}

	public static void fakePhoneNumberInput(WebElement element) throws InterruptedException {
		element.sendKeys(com.fdmgroup.data.RandomData.MobileNumber());
	}

	public static void fakeEmailInput(WebElement element) throws InterruptedException {
		element.sendKeys(com.fdmgroup.data.RandomData.randomString());
	}

	public static void fakeStreetAddressInput(WebElement element) throws InterruptedException {
		element.sendKeys(com.fdmgroup.data.RandomData.StreetAdress());
	}

	public static void clickingButton(WebElement element) {
		element.click();
	}

	public static String fakeRandomNumber(int i, int j) {
		return String.valueOf((int) (Math.random() * (j - i + 1)));
	}

}
