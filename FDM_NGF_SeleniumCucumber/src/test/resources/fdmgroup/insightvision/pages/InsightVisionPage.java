package com.fdmgroup.insightvision.pages;

import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.data.InsightVision_DataFile;
import com.fdmgroup.data.Intellisense_DataFile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsightVisionPage extends BrowserUtilities {

    @FindBy(xpath = "//p[@class = 'ng-tns-c2513308011-1 ng-star-inserted']")
    private WebElement descriptionText;

    @FindBy(xpath = "//a[contains(text(), 'Data Visualization')]")
    private WebElement dataVisualizationButton;

    @FindBy(xpath = "//a[contains(text(), 'Launch')]")
    private WebElement launchButton;

    @FindBy(xpath = "//label[@class='form-check-label']/i[@class='bi bi-moon']")
    private static WebElement darkModeIcon;

    private Actions action;

    public InsightVisionPage(){
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
    }

    public void clickDataVisualizationButton() {
        action.moveToElement(dataVisualizationButton).click().perform();
        action.moveToElement(launchButton).click().perform();
    }

    public boolean isInsightVisionTextDisplayed() {
        return descriptionText.getText().contains(InsightVision_DataFile.INSIGHTVISION_TEXT);

    }

    public boolean isDarkModeIconEnabled() {
        return darkModeIcon.isDisplayed();
    }
}
