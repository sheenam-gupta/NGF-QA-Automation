package com.fdmgroup.isense.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;

public class CodeAssistantPage extends BrowserUtilities {

    @FindBy(xpath = "//p[contains(text(),'Code Assistant')]")
    private WebElement codeAssistantTitle;

    @FindBy(xpath = "//textarea[@name='request']")
    private WebElement requestTextArea;

    @FindBy(xpath = "//textarea[@name='codeSnippet']")
    private WebElement codeSnippetTextArea;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton; // "Receive Feedback" button

    @FindBy(xpath = "//div[@class='answer-container ng-star-inserted']")
    private WebElement feedbackContainer;

    Actions action;
    WebDriverWait wait;

    public CodeAssistantPage() {
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        maximizeWindow();
    }

    public String getCodeAssistantTitle() {
        return codeAssistantTitle.getText();
    }

    public void enterRequest(String request) {
        requestTextArea.clear();
        requestTextArea.sendKeys(request);
    }

    public void enterCodeSnippet(String codeSnippet) {
        codeSnippetTextArea.clear();
        codeSnippetTextArea.sendKeys(codeSnippet);
    }

    public void clickSubmitButton() {
    	action.moveToElement(submitButton).click().perform();
    }

    public boolean isFeedbackContainerDisplayed() {
        return feedbackContainer.isDisplayed();
    }

    public String getFeedback() {
        return feedbackContainer.getText();
    }

}
