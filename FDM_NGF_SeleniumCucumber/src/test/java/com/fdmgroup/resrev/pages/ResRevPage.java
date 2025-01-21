package com.fdmgroup.resrev.pages;

import com.fdmgroup.data.Intellisense_DataFile;
import com.fdmgroup.data.ResRev_DataFile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;

public class ResRevPage {

    @FindBy(xpath = "//p[@class = 'ng-tns-c2513308011-1 ng-star-inserted']")
    private WebElement descriptionText;

    @FindBy(xpath = "//a[contains(text(), 'Sample Resume')]")
    private WebElement sampleResumeButton;

    @FindBy(xpath = "//a[contains(text(), 'Keyword Matching')]")
    private WebElement keywordMatchingButton;

    @FindBy(xpath = "//a[contains(text(), 'Launch')]")
    private WebElement launchButton;
    
    @FindBy(xpath = "(//a[text()='Click to Download'])[1]")
    private WebElement clickToDownloadButton;

    @FindBy(xpath = "//label[@class='form-check-label']/i[@class='bi bi-moon']")
    private static WebElement darkModeIcon;

    private Actions action;
    private WebDriverWait wait;
    private WebDriver driver;

    public ResRevPage() {
        this.driver = BrowserUtilities.driver;
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        BrowserUtilities.maximizeWindow();
    }

    public void clickKeywordMatchingButton() {
        action.moveToElement(keywordMatchingButton).click().perform();
        action.moveToElement(launchButton).click().perform();
    }

    public boolean isResRevTextDisplayed() {
        return descriptionText.getText().contains(ResRev_DataFile.RESREV_TEXT);
    }

    public void clickSampleResumeButton() {
        action.moveToElement(sampleResumeButton).click().perform();
        action.moveToElement(launchButton).click().perform();
    }

    public boolean isDarkModeIconEnabled() {
        return darkModeIcon.isDisplayed();
    }
    
    public boolean isClickToDownloadPresent() {
		return clickToDownloadButton.isDisplayed();
	}
    
    public void clickDownloadResumeButton() {
        action.moveToElement(clickToDownloadButton).click().perform();
    }
    
    public void validateAlertMessage() {
    	
    	try {
            // Wait for the alert to be present
    		
    		// Explicitly wait for the alert to be present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());
           
            Alert alert = driver.switchTo().alert(); // Switch to the alert
            String alertText = alert.getText(); // Get alert text

            // Validate the alert text
            if (alertText.equals("File Successfully Downloaded: FDM-Software Engineering.docx")) {
                System.out.println("Alert text is correct: " + alertText);
            } else {
                System.out.println("Unexpected alert text: " + alertText);
            }

            alert.accept();

        } catch (NoAlertPresentException e) {
            System.out.println("No alert was present.");
        }
    }
         
    
}