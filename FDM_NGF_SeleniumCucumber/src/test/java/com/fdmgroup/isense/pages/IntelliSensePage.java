package com.fdmgroup.isense.pages;

import com.fdmgroup.data.IPrep_Datafile;
import com.fdmgroup.data.Intellisense_DataFile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;

public class IntelliSensePage extends BrowserUtilities {

    @FindBy(xpath = "//p[@class = 'ng-tns-c2513308011-1 ng-star-inserted']")
    private WebElement descriptionText;

    @FindBy(xpath = "//a[contains(text(), 'Code Assistant')]")
    private WebElement exploreCodeAssistantButton;

    @FindBy(xpath = "//a[contains(text(), 'Error Handling')]")
    private WebElement exploreErrorHandlingButton;

    @FindBy(xpath = "//a[contains(text(), 'Code Optimization')]")
    private WebElement exploreCodeOptimizationButton;

    @FindBy(xpath = "//button[contains(text(),'→')]")
    private WebElement rightArrowButton;

    @FindBy(xpath = "//button[contains(text(),'←')]")
    private WebElement leftArrowButton;

    @FindBy(xpath = "//button[contains(text(),'1')]")
    private WebElement oneButton;

    @FindBy(xpath = "//button[contains(text(),'2')]")
    private WebElement twoButton;

    @FindBy(xpath = "//button[contains(text(),'3')]")
    private WebElement threeButton;

    @FindBy(xpath = "//a[contains(text(),'Launch')]")
    private WebElement launchButton;

    Actions action;
    WebDriverWait wait;

    public IntelliSensePage() {
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        maximizeWindow();
    }

    public void clickExploreCodeAssistantButton() {
    	action.moveToElement(exploreCodeAssistantButton).click().perform();
    }

    public void clickExploreErrorHandlingButton() {
    	action.moveToElement(exploreErrorHandlingButton).click().perform();
    }

    public void clickExploreCodeOptimizationButton() {
    	action.moveToElement(exploreCodeOptimizationButton).click().perform();
    }

    public void clickRightArrowButton() {
    	action.moveToElement(rightArrowButton).click().perform();
    }

    public void clickLeftArrowButton() {
    	action.moveToElement(leftArrowButton).click().perform();
    }

    public void clickOneButton() {
    	action.moveToElement(oneButton).click().perform();
    }

    public void clickTwoButton() {
    	action.moveToElement(twoButton).click().perform();
    }

    public void clickThreeButton() {
    	action.moveToElement(threeButton).click().perform();
    }

    public void clickLaunchButton() {
    	action.moveToElement(launchButton).click().perform();
    }

    public boolean isISenseTextDisplayed() {
        return descriptionText.getText().contains(Intellisense_DataFile.INTELLISENSE_TEXT);
    }
}
