package com.fdmgroup.finwise.pages;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.data.MortgageAdvisor_Datafile;

public class MortgageAdvisorPage extends BrowserUtilities {

	@FindBy(xpath = "//label[@class = 'form-check-label']/i[@class = 'bi bi-toggle-off']")
	private WebElement darkModeButton;

	@FindBy(xpath = "//input[@formcontrolname='loanAmount']")
	private WebElement loanAmount;

	@FindBy(xpath = "//input[@formcontrolname='city']")
	private WebElement city;

	public static List<WebElement> radioButtons(WebDriver driver) {
		return driver.findElements(By.xpath("//input[@type='radio']"));
	}

	@FindBy(xpath = "//input[@formcontrolname='amortization']")
	private WebElement amortization;

	@FindBy(xpath = "//input[@formcontrolname='downPayment']")
	private WebElement downPayment;

	@FindBy(xpath = "//input[@formcontrolname='creditScore']")
	private WebElement creditScore;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;

	@FindBy(xpath = "//input[@formcontrolname='currentRate']")
	private WebElement currentRate;

	@FindBy(xpath = "//input[@formcontrolname='bestRate']")
	private WebElement bestRate;

	@FindBy(xpath = "//input[@formcontrolname='worstRate']")
	private WebElement worstRate;

	@FindBy(xpath = "//input[@formcontrolname='qualifyingRate']")
	private WebElement qualifyingRate;

	@FindBy(xpath = "//textarea[@formcontrolname='aiAdvice']")
	private WebElement aiAdvice;

	public static List<WebElement> selectProvince(WebDriver driver) {
		return driver.findElements(By.xpath("//Select[@id='province']"));
	}

	public static List<WebElement> selectTerm(WebDriver driver) {
		return driver.findElements(By.xpath("//Select[@id='term']"));
	}

	Actions action;
	WebDriverWait wait;

	public MortgageAdvisorPage() {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		Alert alert;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		maximizeWindow();
	}

	public void enterLoanAmount(String loanAmt) {
		loanAmount.sendKeys(loanAmt);
	}

	public void enterCity(String cityName) {
		city.sendKeys(cityName);
	}

	public void enterAmortization(String amort) {
		amortization.sendKeys(amort);
	}

	public void enterdownPayment(String payment) {
		downPayment.clear();
		downPayment.sendKeys(payment);
	}

	public void enterCreditScore(String score) {
		creditScore.sendKeys(score);
	}

	public void clickSubmit(String data) {
		submit.click();
		handleUnexpectedAlert(data);
	}

	public boolean clickAlert(String data) {
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String response = alert.getText();
		alert.accept();
		return response.contentEquals(data);
	}

	private void handleUnexpectedAlert(String data) {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			String response = alert.getText();
			alert.accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean verifyCurrentRate() {
		return currentRate.getAttribute("value") != null && !currentRate.getAttribute("value").isEmpty();
	}

	public boolean verifyBestRate() {
		return bestRate.getAttribute("value") != null && !bestRate.getAttribute("value").isEmpty();
	}

	public boolean verifyWorstRate() {
		return worstRate.getAttribute("value") != null && !worstRate.getAttribute("value").isEmpty();
	}

	public boolean verifyQualifyingRate() {
		return qualifyingRate.getAttribute("value") != null && !qualifyingRate.getAttribute("value").isEmpty();
	}

	public boolean verifyAIAdvice() {
		return aiAdvice.getAttribute("value") != null && !aiAdvice.getAttribute("value").isEmpty();
	}

	public void clickDarkModeCheckBox() {
		action.moveToElement(darkModeButton).click().perform();
	}
}
