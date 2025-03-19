package com.fdmgroup.iprep.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;

public class InterviewGuidancePage extends BrowserUtilities {

    @FindBy(xpath = "//a[contains(text(), 'Interview Tips')]")
    private WebElement interviewTipsButton;

    @FindBy(xpath = "//a[contains(text(), 'Networking Tips')]")
    private WebElement networkingTipsButton;

    Actions action;
    WebDriverWait wait;

    public InterviewGuidancePage() {
        PageFactory.initElements(driver, this);
        maximizeWindow();
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickInterviewTipsButton() {
        action.moveToElement(interviewTipsButton).click().perform();
    }

    public void clickNetworkingTipsButton() {
        action.moveToElement(networkingTipsButton).click().perform();
    }
}
