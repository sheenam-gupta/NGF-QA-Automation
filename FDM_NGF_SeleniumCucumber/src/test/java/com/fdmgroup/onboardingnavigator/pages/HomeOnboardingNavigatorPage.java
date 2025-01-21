package com.fdmgroup.onboardingnavigator.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

public class HomeOnboardingNavigatorPage {

	private WebDriver driver;
	private Actions action;
	private WebDriverWait wait;

	@FindBy(xpath = "//*[text()='Onboarding Navigator']")
	private WebElement onboardingNavigator;
	
	@FindBy(xpath = "//a[contains(text(),'NGF members spreadsheet')]")
	private WebElement ngfMemberSheetLink;

	@FindBy(xpath = "//a[contains(text(),'Glossary')]")
	public static WebElement glossaryLink;

	@FindBy(xpath = "//a[text()='Git']")
	private WebElement gitSetupLink;

	@FindBy(xpath = "//*[text()='Developer Glossary']")
	private WebElement glossaryTitle;

	@FindBy(xpath = "//h1[contains(text(),'Git setup')]")
	private WebElement getSetupTitle;


	
	@FindBy(xpath = "//a[@class='link1']")
	private WebElement techSetupButton;
	
	@FindBy(xpath = "//a[@class='link3']")
	private WebElement trainingChecklist;
	
	
	public HomeOnboardingNavigatorPage() {
		this.driver = BrowserUtilities.driver;
		PageFactory.initElements(driver, this);

		BrowserUtilities.maximizeWindow();
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void clickOnboardingMenuButton() {
		onboardingNavigator.click();
	}
	
	public boolean isNgfMemberSheetLinkAble() {
		return ngfMemberSheetLink.isEnabled();
	}

	public void clickGlossaryTabButton() {
		glossaryLink.click();
	}

	public boolean isGlossaryTabOpens(String textvalue) {
		
		return glossaryTitle.getText().contains(textvalue);
	}

	public void clickGitSetupTabButton() {
		gitSetupLink.click();
	}

	public boolean isGitSetupTabOpens(String textvalue) {
		return getSetupTitle.getText().contains(textvalue);
	}
	
	public void verifyTechSetupButton() {
		techSetupButton.isEnabled();
	}
	
	public void verifyTrainingChecklistButton() {
		trainingChecklist.isEnabled();
	}
	
	public void verifyGlossaryButton() {
		trainingChecklist.isEnabled();
	}
	
}
