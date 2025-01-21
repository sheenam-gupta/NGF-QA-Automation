package com.fdmgroup.isense.pages;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

public class TranspilerCodeConvertPage extends BrowserUtilities {

	@FindBy(xpath = "//div[@class='mat-mdc-form-field-infix ng-tns-c1205077789-0']")
	private WebElement clickPromptCodeOption;

	@FindBy(xpath = "//mat-option[@role='option']")
	private List<WebElement> chooseOptions;

	@FindBy(xpath = "//textarea[@name='request']")
	private WebElement inputLanguage;

	@FindBy(xpath = "//textarea[@name='codeSnippet']")
	private WebElement code;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement receiveFeedback;
	
	@FindBy(xpath = "//div[@class='answer-container ng-star-inserted']")
	private WebElement responseData;

	Actions action;
	WebDriverWait wait;

	public TranspilerCodeConvertPage() {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		maximizeWindow();
	}

	public void clickPromptOption() {
		clickPromptCodeOption.click();
	}

	public void chooseOption(String s) {

		for (WebElement option : chooseOptions) {
			String optionText = option.getText();
			if (optionText.equalsIgnoreCase(s)) {
				option.click();
				break;
			}
		}
	}

	public String readFile(String filePath) {
		String path = "src/test/java/com/fdmgroup/data/";
		try {
			return Files.readString(Path.of(path + filePath)).replaceAll("\\t", "\\\s");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void inputLanguageToConvertInto(String language) {
		inputLanguage.sendKeys(language);
	}

	public void enterCodeToConvert(String data) {
		String code = readFile(data);
		for (int i = 0; i < code.length(); i += 100) {
			String chunk = code.substring(i, Math.min(i + 100, code.length()));
			this.code.sendKeys(chunk);
		}
	}
	
	public void clickReceiveFeedback() {
		receiveFeedback.click();
	}
	
	public boolean getConvertedCode() {
		wait.until(ExpectedConditions.visibilityOf(responseData));
		return responseData.isDisplayed();
	}

}
