package com.fdmgroup.Main_Dashboard.pages;

import static com.fdmgroup.data.Main_DataFile.USERNAME;
import static com.fdmgroup.data.Register_DataFile.SECURITY_QUESTION_1;
import static com.fdmgroup.data.Register_DataFile.SECURITY_QUESTION_2;
import static com.fdmgroup.data.Register_DataFile.SECURITY_QUESTION_3;
import static com.fdmgroup.data.Register_DataFile.SECURITY_QUESTION_4;
import static com.fdmgroup.data.Register_DataFile.SECURITY_QUESTION_5;
import static com.fdmgroup.data.Register_DataFile.SECURITY_QUESTION_6;

import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

public class RegistrationPage extends BrowserUtilities {

	@FindBy(id = "fullName")
	private WebElement fullNameInput;

	@FindBy(id = "email")
	private WebElement emailInput;

	@FindBy(id = "dob")
	private WebElement dobInput;

	@FindBy(id = "username")
	private WebElement usernameInput;

	@FindBy(id = "password")
	private WebElement passwordInput;
	@FindBy(id = "confirmPassword")
	private WebElement confirmPasswordInput;
	@FindBy(xpath = "//div/span[2]")
	private WebElement suggestedPasswordInput;
	@FindBy(xpath = "/html/body/app-root/div/div[2]/app-register/div/form/div[2]/div[2]/div/div/div[1]")
	private WebElement passwordValidationMessage1;
	@FindBy(xpath = "/html/body/app-root/div/div[2]/app-register/div/form/div[2]/div[2]/div/div/div[2]")
	private WebElement passwordValidationMessage2;

	@FindBy(id = "securityQuestion")
	private WebElement securityQuestionInput;

	@FindBy(id = "securityAnswer")
	private WebElement securityAnswerInput;

	@FindBy(id = "agreeToTerms")
	private WebElement agreeToTermsCheckbox;

	@FindBy(xpath = "//button[contains(text(), 'Create NGF ID!')]")
	private WebElement createAccountButton;
	@FindBy(tagName = "body")
	private WebElement bodyElement;

	@FindBy(xpath = "//a[@data-bs-target='#exampleModal']")
	private WebElement termsConditionsPrivacyPoliciesLink;

	@FindBy(xpath = "//h1[contains(text(), 'Terms and Conditions')]")
	private WebElement termsAndConditionsHeader;

	@FindBy(xpath = "//div[contains(@class, 'modal-body')]")
	private WebElement termsAndConditionsBody;

	@FindBy(xpath = "//div[contains(@class, 'modal-body')]//i")
	private WebElement termsAndConditionsBodyBottomText;

	@FindBy(xpath = "//input[@id='dob']//following-sibling::div[contains(@class, 'invalid-feedback')]")
	private WebElement invalidDateOfBirthFeedback;

	@FindBy(xpath = "//input[@id='username']//following-sibling::div[contains(@class, 'invalid-feedback')]")
	private WebElement invalidUsernameFeedback;

	@FindBy(xpath = "//select[@id='securityQuestion']")
	private WebElement securityQuestionDropdown;
	private List<String> securityQuestions;

	public static WebElement suggestPasswordButton(WebDriver driver) {
		return driver.findElement(By.xpath("//span[normalize-space(text())='Suggested Password:']"));
	}

	public static WebElement suggestedPassword(WebDriver driver) {
		return driver.findElement(By.xpath("//span[@title='Copy suggested password']"));

	}

	Actions action = new Actions(driver);

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
		setExplicitWait(10);
		securityQuestions = List.of(SECURITY_QUESTION_1, SECURITY_QUESTION_2, SECURITY_QUESTION_3, SECURITY_QUESTION_4,
				SECURITY_QUESTION_5, SECURITY_QUESTION_6);
	}


	public String handleAlert() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // 10 seconds wait time
	    Alert alert = null;
	    try {
	    	
	        // Wait for the alert to be present
	        alert = wait.until(ExpectedConditions.alertIsPresent());
	        String message = alert.getText();
	        System.out.println("Alert Message detected: " + message);
	     
	        alert.accept();
	 
	        driver.switchTo().defaultContent();
	        System.out.println("Driver: "+ driver.getTitle());
	        return message;  // Return the alert message
	    } catch (NoAlertPresentException e) {
	        System.out.println("No alert present.");
	        return null;  // Return null if no alert is present
	    }
	}

	public void clickBody() {
		bodyElement.click();
	}

	public void enterFullName(String fullName) {
		fullNameInput.sendKeys(fullName);
	}

	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}

	public void enterDob(String dob) {
		dobInput.sendKeys(dob);
	}

	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordInput.sendKeys(confirmPassword);
	}

	public void enterSecurityQuestion(int securityQuestionNumber) {
		Select select = new Select(securityQuestionInput);
		if (securityQuestionNumber == 0) {
			securityQuestionInput.click();
			clickBody();
		} else
			select.selectByIndex(securityQuestionNumber);
	}

	public void enterSecurityAnswer(String securityAnswer) {
		securityAnswerInput.sendKeys(securityAnswer);
	}

	public void agreeToTerms() {
		action.moveToElement(agreeToTermsCheckbox).click().perform();
	}

	public void clickTermsConditionsPrivacyPoliciesLink() {
		termsConditionsPrivacyPoliciesLink.click();
	}

	public boolean isTermsAndConditionsHeaderDisplayed() {
		return termsAndConditionsHeader.isDisplayed();
	}

	public boolean isTermsAndConditionsBodyValid(String expectedText) {
		return termsAndConditionsBody.getText().contains(expectedText);
	}

	public boolean isTermsAndConditionsBodyBottomTextValid(String expectedText) {
		return termsAndConditionsBodyBottomText.getText().equals(expectedText);
	}

	public void clickCreateAccountButton() {
		action.moveToElement(createAccountButton).click().perform();
	}

	public String getResultMessage() {
		waitForPresenceOfElementLocated(By.xpath("//div[@role='alert']"));
		WebElement resultMessage = driver.findElement(By.xpath("//div[@role='alert']"));
		return resultMessage.getText();
	}

	public String getErrorMesssageForFullName() {
		waitForPresenceOfElementLocated(
				By.xpath("//input[@id='fullName']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		WebElement resultMessage = driver.findElement(
				By.xpath("//input[@id='fullName']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		return resultMessage.getText();
	}

	public String getErrorMesssageForEmail() {
		waitForPresenceOfElementLocated(
				By.xpath("//input[@id='email']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		WebElement resultMessage = driver.findElement(
				By.xpath("//input[@id='email']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		return resultMessage.getText();
	}

	public String getErrorMessageForDob() {
		waitForPresenceOfElementLocated(
				By.xpath("//input[@id='dob']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		WebElement resultMessage = driver.findElement(
				By.xpath("//input[@id='dob']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		return resultMessage.getText();
	}

	public String getErrorMessageForUsername() {
		waitForPresenceOfElementLocated(
				By.xpath("//input[@id='username']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		WebElement resultMessage = driver.findElement(
				By.xpath("//input[@id='username']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		return resultMessage.getText();
	}

	public String getErrorMessageForPassword() {
		waitForPresenceOfElementLocated(
				By.xpath("//input[@id='password']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		WebElement resultMessage = driver.findElement(
				By.xpath("//input[@id='password']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		return resultMessage.getText();
	}

	public String getErrorMessageForConfirmPassword() {
		waitForPresenceOfElementLocated(By.xpath(
				"//input[@id='confirmPassword']/following-sibling::div[contains(@class, 'invalid-feedback')]//div[last()]"));
		WebElement resultMessage = driver.findElement(By.xpath(
				"//input[@id='confirmPassword']/following-sibling::div[contains(@class, 'invalid-feedback')]//div[last()]"));
		return resultMessage.getText();
	}

	public String getErrorMessageForSecurityQuestion() {
		waitForPresenceOfElementLocated(By.xpath(
				"//select[@id='securityQuestion']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		WebElement resultMessage = driver.findElement(By.xpath(
				"//select[@id='securityQuestion']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		return resultMessage.getText();
	}

	public String getErrorMessageForSecurityAnswer() {
		waitForPresenceOfElementLocated(
				By.xpath("//input[@id='securityAnswer']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		WebElement resultMessage = driver.findElement(
				By.xpath("//input[@id='securityAnswer']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		return resultMessage.getText();
	}

	public String getErrorMessageForAgreeToTerms() {
		waitForPresenceOfElementLocated(
				By.xpath("//input[@id='agreeToTerms']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		WebElement resultMessage = driver.findElement(
				By.xpath("//input[@id='agreeToTerms']/following-sibling::div[contains(@class, 'invalid-feedback')]"));
		return resultMessage.getText();
	}

	public boolean isInvalidDateOfBirthFeedbackPresent() {
		return invalidDateOfBirthFeedback.isDisplayed();
	}

	public boolean isInvalidUsernameFeedbackPresent() {
		return invalidUsernameFeedback.getText().contains(USERNAME);
	}

	public void clickSecurityQuestionDropdown() {
		securityQuestionDropdown.click();
	}

	public boolean isSecurityQuestionDropdownContainingValidOptions() {
		for (String question : securityQuestions) {
			if (!securityQuestionDropdown.getText().contains(question)) {
				return false;
			}
		}
		return true;
	}

	public boolean isSuggestedPasswordDisplayed() {
		return suggestedPasswordInput.isDisplayed();
	}

	public boolean suggestedPasswordMeetExpectation() {
		String pwd = suggestedPasswordInput.getText();
		System.out.println(pwd);
		if (pwd.length() >= 8) {
			Pattern letter = Pattern.compile("[a-zA-z]");
			Pattern digit = Pattern.compile("[0-9]");
			Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			// Pattern eight = Pattern.compile (".{8}");

			Matcher hasLetter = letter.matcher(pwd);
			Matcher hasDigit = digit.matcher(pwd);
			Matcher hasSpecial = special.matcher(pwd);

			return hasLetter.find() && hasDigit.find() && hasSpecial.find();
		} else
			return false;
	}

	public String[] getpasswordValidationMessages() {
		String[] message = new String[2];
		message[0] = passwordValidationMessage1.getText();
		message[1] = passwordValidationMessage2.getText();
		System.out.println(message[0]);
		System.out.println(message[1]);
		return message;

	}

}