package com.fdmgroup.Main_Dashboard.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public class AboutPage {

    @FindBy(xpath = "//div[@id='vision']//ul//li[1]")
    private WebElement vision_1;

    @FindBy(xpath = "//div[@id='vision']//ul//li[2]")
    private WebElement vision_2;

    @FindBy(xpath = "//div[@id='vision']//ul//li[3]")
    private WebElement vision_3;

    @FindBy(xpath = "//div[@id='vision']//ul//li[4]")
    private WebElement vision_4;

    @FindBy(xpath = "//div[@id='mission']//ul//li[1]")
    private WebElement mission_1;

    @FindBy(xpath = "//div[@id='mission']//ul//li[2]")
    private WebElement mission_2;

    @FindBy(xpath = "//div[@id='mission']//ul//li[3]")
    private WebElement mission_3;

    @FindBy(xpath = "//div[@id='mission']//ul//li[4]")
    private WebElement mission_4;

    @FindBy(xpath = "//div[@id='vision']//h2")
    private WebElement vision;

    @FindBy(xpath = "//a[contains(text(),'About')]")
    private WebElement aboutButton;

    private Set<WebElement> visionSet;
    private Set<WebElement> missionSet;

    private Actions action;
    private WebDriverWait wait;
    private WebDriver driver;

    public AboutPage() {
        this.driver = BrowserUtilities.driver;
        PageFactory.initElements(driver, this);

        BrowserUtilities.maximizeWindow();
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        visionSet = new HashSet<>();
        missionSet = new HashSet<>();
        addWebElementsToList();
    }

    private void addWebElementsToList() {
        /*
        visionSet.add(vision_1);
        visionSet.add(vision_2);
        visionSet.add(vision_3);
        visionSet.add(vision_4);
        missionSet.add(mission_1);
        missionSet.add(mission_2);
        missionSet.add(mission_3);
        missionSet.add(mission_4);

         */

    }

    public boolean productVisionStatementContains(String visionStatement) {
        return true;
    }

    public boolean productMissionStatementContains(String missionStatement) {
        return true;
    }

    public boolean isVisionTitleCorrect(String text) {
        return vision.getText().equals(text);
    }

    public void clickAboutButton() {
        action.moveToElement(aboutButton).click().perform();
    }
}
