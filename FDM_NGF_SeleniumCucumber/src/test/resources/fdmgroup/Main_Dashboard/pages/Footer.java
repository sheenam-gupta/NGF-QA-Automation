package com.fdmgroup.Main_Dashboard.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;

public class Footer extends BrowserUtilities {

    @FindBy(xpath = "//a[contains(@href, 'contact')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//a[contains(@href, 'linkedin')]")
    private WebElement linkedInLink;

    @FindBy(xpath = "//a[contains(@href, 'facebook')]")
    private WebElement facebookLink;

    @FindBy(xpath = "//a[contains(@href, 'twitter')]")
    private WebElement twitterLink;

    @FindBy(xpath = "//a[contains(@href, 'instagram')]")
    private WebElement instagramLink;

    //@FindBy(xpath = "//a[contains(@href, 'tiktok')]")
    @FindBy(xpath = "//div[contains(@class, 'socialLinks')]/a[6]")
    private WebElement tikTokLink;

    @FindBy(xpath = "//footer[contains(text(), 'All Rights')]")
    private WebElement copyRightText;

    public static WebElement VirtualNetworkEvents(WebDriver driver) {
        return driver.findElement(By.xpath("//a[normalize-space(text())='FDM Engage']"));
    }

    private Actions action;
    private WebDriverWait wait;

    public Footer() {
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        maximizeWindow();
    }

    public void clickContactUsLink() {
        action.moveToElement(contactUsLink).click().perform();
    }

    public void clickLinkedInLink() {
        action.moveToElement(linkedInLink).click().perform();
    }

    public void clickFacebookLink() {
        action.moveToElement(facebookLink).click().perform();
    }

    public void clickTwitterLink() {
        action.moveToElement(twitterLink).click().perform();
    }

    public void clickInstagramLink() {
        action.moveToElement(instagramLink).click().perform();
    }

    public void clickTikTokLink() {
        action.moveToElement(tikTokLink).click().perform();
    }
    
    public boolean isCopyRightTextCorrect(String text) {
        return copyRightText.getText().contains(text);
    }

    public String getPageURL(WebDriver driver) {
        return driver.getCurrentUrl();
    }


}
