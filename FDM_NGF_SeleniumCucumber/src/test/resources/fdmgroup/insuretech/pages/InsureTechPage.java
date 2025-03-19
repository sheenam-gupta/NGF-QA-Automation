package com.fdmgroup.insuretech.pages;

import com.fdmgroup.data.InsureTech_Datafile;
import com.fdmgroup.data.Intellisense_DataFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;

public class InsureTechPage {

    @FindBy(xpath = "//p[@class = 'ng-tns-c2513308011-1 ng-star-inserted']")
    private WebElement descriptionText;

    @FindBy(xpath = "//a[contains(text(), 'AI Risk Assessor')]")
    private WebElement aiRiskAssessorButton;

    @FindBy(xpath = "//a[contains(text(), 'Launch')]")
    private WebElement launchButton;

    @FindBy(xpath = "//label[@class='form-check-label']/i[@class='bi bi-moon']")
    private static WebElement darkModeIcon;

    private Actions action;
    private WebDriverWait wait;
    private WebDriver driver;

    public InsureTechPage() {
        this.driver = BrowserUtilities.driver;
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        BrowserUtilities.maximizeWindow();
    }

    public void clickAiRiskAssessorButton() {
        action.moveToElement(aiRiskAssessorButton).click().perform();
        action.moveToElement(launchButton).click().perform();
    }

    public boolean isInsureTechTextDisplayed() {
        return descriptionText.getText().contains(InsureTech_Datafile.INSURETECH_TEXT);
    }

    public boolean isDarkModeIconEnabled() {
        return darkModeIcon.isDisplayed();
    }

}
