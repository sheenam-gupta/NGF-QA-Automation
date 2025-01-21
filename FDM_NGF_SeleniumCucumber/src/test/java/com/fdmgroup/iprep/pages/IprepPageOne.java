package com.fdmgroup.iprep.pages;

import java.time.Duration;

import com.fdmgroup.data.FinWise_DataFile;
import com.fdmgroup.data.IPrep_Datafile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

public class IprepPageOne extends BrowserUtilities {

    @FindBy(xpath = "//p[@class = 'ng-tns-c2513308011-1 ng-star-inserted']")
    private WebElement descriptionText;
	
    @FindBy(xpath = "//a[contains(text(), 'Mock Exam')]")
    private WebElement exploreMockExamButton;

    @FindBy(xpath = "//a[contains(text(), 'Interview Tips')]")
    private WebElement exploreInterviewTipsButton;

    @FindBy(xpath = "//a[contains(text(), 'Simulate Interview')]")
    private WebElement exploreSimulateInterviewButton;

    @FindBy(xpath = "//a[contains(text(), 'Launch')]")
    private WebElement launchButton;

    @FindBy(xpath = "//label[@class='form-check-label']/i[@class='bi bi-moon']")
    private static WebElement darkModeIcon;

    Actions action;
    WebDriverWait wait;

    public IprepPageOne() {
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        maximizeWindow();
    }

    public void clickExploreMockExamButton() {
        action.moveToElement(exploreMockExamButton).click().perform();
    }

    public void clickExploreInterviewTipsButton() {
        action.moveToElement(exploreInterviewTipsButton).click().perform();
    }

    public void clickExploreSimulateInterviewButton() {
        action.moveToElement(exploreSimulateInterviewButton).click().perform();
    }

    public void clickLaunchButton() {
        action.moveToElement(launchButton).click().perform();
    }

    public boolean isIprepTextDisplayed() {
        return descriptionText.getText().contains(IPrep_Datafile.IPREPTEXT);
    }

    public boolean isDarkModeIconEnabled() {
        return darkModeIcon.isDisplayed();
    }
}
