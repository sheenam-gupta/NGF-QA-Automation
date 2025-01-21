package com.fdmgroup.finwise.pages;

import java.time.Duration;

import com.fdmgroup.data.FinWise_DataFile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

public class FinwisePageOne extends BrowserUtilities {

    @FindBy(xpath = "//p[@class = 'ng-tns-c2513308011-1 ng-star-inserted']")
    private WebElement descriptionText;

	@FindBy(xpath = "//a[text()='Explore Finwise']")
    private WebElement exploreFinwiseButton;
	
    @FindBy(xpath = "//a[contains(text(), 'Financial Advisor')]")
    private WebElement exploreFinancialAdvisorButton;

    @FindBy(xpath = "//a[contains(text(), 'Insurance Advisor')]")
    private WebElement exploreInsuranceAdvisorButton;

    @FindBy(xpath = "//a[contains(text(), 'Budget Calculator')]")
    private WebElement exploreBudgetCalculatorButton;
    
    @FindBy(xpath = "//a[text()='Explore Mortgage Advisor']")
    private WebElement exploreMortgageAdvisorButton;
    
    @FindBy(xpath = "//a[contains(text(),'Launch')]")
    private WebElement launchButton;

    Actions action;
    WebDriverWait wait;
    
    public FinwisePageOne() {
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        maximizeWindow();
    }
    public void clickExploreFinwiseButton() {
    	action.moveToElement(exploreFinwiseButton).click().perform();
    }
    
    public void clickExploreFinancialAdvisorButton() {
    	action.moveToElement(exploreFinancialAdvisorButton).click().perform();
    }

    public void clickExploreInsuranceAdvisorButton() {
    	action.moveToElement(exploreInsuranceAdvisorButton).click().perform();
    }

    public void clickExploreBudgetCalculatorButton() {
    	action.moveToElement(exploreBudgetCalculatorButton).click().perform();
    }
    public void clickExploreMortgageAdvisorButton() {
    	action.moveToElement(exploreMortgageAdvisorButton).click().perform();
    }
    public void clickLaunchButton() {
    	action.moveToElement(launchButton).click().perform();
    }

    public boolean isFinBotTextDisplayed(){
        return descriptionText.getText().contains(FinWise_DataFile.FINBOT);
    }
    
}
