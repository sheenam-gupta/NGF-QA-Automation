package com.fdmgroup.MindfulMotion.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.Utilities.BrowserUtilities;

public class MindfulMotionPage extends BrowserUtilities {
	
	@FindBy(id = "prompt")
	private WebElement bodyPartInput;
	
	@FindBy(xpath = "//button[contains(text(), 'Submit')]")
	private WebElement submitButton;
	
	Actions action = new Actions(driver);
	
	public MindfulMotionPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterBodyPartName(String bodyPart) {
		bodyPartInput.sendKeys(bodyPart);
	}
	public void clickSubmitButton() {
		action.moveToElement(submitButton).click().perform();
	}

}
