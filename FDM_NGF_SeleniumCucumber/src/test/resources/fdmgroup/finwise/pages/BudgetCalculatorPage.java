package com.fdmgroup.finwise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;

import java.time.Duration;

import static com.fdmgroup.data.FinWise_DataFile.*;

public class BudgetCalculatorPage {

    @FindBy(xpath = "//button[contains(text(),'Create Budget')]")
    private WebElement startButton;

    @FindBy(xpath = "//select[@name='dropdown']")
    private WebElement dropdown;

    @FindBy(xpath = "//input[@name='response']")
    private WebElement response;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//option[@value='Currently working for myself, self-employed']")
    private WebElement selfEmployedOption;

    @FindBy(xpath = "//option[@value='Currently working full-time, employed']")
    private WebElement fullTimeEmployedOption;

    @FindBy(xpath = "//option[@value='Currently working part-time, employed']")
    private WebElement partTimeEmployedOption;

    @FindBy(xpath = "//option[@value='Currently open to opportunities, unemployed']")
    private WebElement openToOpportunitiesOption;

    @FindBy(xpath = "//option[@value='Currently retired']")
    private WebElement retiredOption;

    @FindBy(xpath = "/html/body/app-root/main/app-income/div/div[2]/button[2]")
    private WebElement resetButton;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    private WebElement nextButton;
    // Added all the elements for the new budget calculator under here not deleting anything above just to make sure nothing is breaking
    
    //income details elements
    
    @FindBy(xpath = "//input[@id='workHours']")
    private WebElement hours;
    @FindBy(xpath = "//input[@id='hourlyPay']")
    private WebElement pay;
    @FindBy(xpath = "//input[@id='otherIncome']")
    private WebElement otherIncome;
    @FindBy(xpath ="/html/body/app-root/main/app-income/div/div[2]/button[2]")
    private WebElement incresetBtn;
    @FindBy(xpath = "//button[text()=' Expenses ']")
    private WebElement incexpenseBtn;
    
    //Expenses and Debts
    @FindBy(xpath = "//input[@id='housingCost']")
    private WebElement rentHousing;
    @FindBy(xpath = "//input[@id='monthlyGroceries']")
    private WebElement groceries;
    @FindBy(xpath = "//input[@id='transportCostMonthly']")
    private WebElement transportation;
    @FindBy(xpath = "//input[@id='monthlySubs']")
    private WebElement subscription;
    @FindBy(xpath = "//input[@id='monthlyLoanDebts']")
    private WebElement debts;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    private WebElement expenseBackBtn;
    @FindBy(xpath = "//button[@class='btn btn-danger']")
    private WebElement expenseResetBtn;
   
    
    
    //Savings and Goals
    @FindBy(xpath = "//button[@class='btn btn-nav']")
    private WebElement savingsgoalBtn;
    @FindBy(xpath = "//input[@id='monthlySavings']")
    private WebElement savings;
    @FindBy(xpath = "//input[@id='targetSavings']")
    private WebElement target_Savings;
    @FindBy(xpath = "/html/body/app-root/main/app-savings/div/div[2]/button[3]")
    private WebElement calculateBtn;
    
    
    //Summary
    @FindBy(xpath = "/html/body/app-root/main/app-summary/div/div[2]/section[1]/ul/li[3]")
    private WebElement summaryTotalincome;
    @FindBy(xpath = "/html/body/app-root/main/app-summary/div/div[2]/section[2]/ul/li[6]")
    private WebElement summaryTotalexpense;
    @FindBy(xpath = "/html/body/app-root/main/app-summary/div/div[2]/section[3]/ul/li[1]")
    private WebElement currentSavings;
    @FindBy(xpath = "/html/body/app-root/main/app-summary/div/div[2]/section[3]/ul/li[2]")
    private WebElement targetSavings;
    
    @FindBy(xpath = "//section[@class='recommendations']/p[2]")
    private WebElement recommendations;
    ///html/body/app-root/main/app-summary/div/div[2]/section[5]/p[2]
    
    
    

    private WebDriverWait wait;
    private Actions action;
    private final int delay = 500;
    private WebDriver driver;

    public BudgetCalculatorPage() {
        this.driver = BrowserUtilities.driver;
        PageFactory.initElements(driver, this);
        BrowserUtilities.maximizeWindow();
        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickStartButton() {
        action.moveToElement(startButton).click().perform();
    }

    public void selectEmploymentStatus(String employmentStatus) {
        clickDropdown();
        switch (employmentStatus) {
            case SELF_EMPLOYED -> selectSelfEmployedOption();
            case FULL_TIME -> selectFullTimeEmployedOption();
            case PART_TIME -> selectPartTimeEmployedOption();
            case UNEMPLOYED -> selectOpenToOpportunitiesOption();
            case RETIRED -> selectRetiredOption();
        }
    }

    public void clickDropdown() {
        dropdown.click();
    }

    public void selectSelfEmployedOption() {

        selfEmployedOption.click();
    }

    public void selectFullTimeEmployedOption() {
        fullTimeEmployedOption.click();
    }

    public void selectPartTimeEmployedOption() {
        partTimeEmployedOption.click();
    }

    public void selectOpenToOpportunitiesOption() {
        openToOpportunitiesOption.click();
    }

    public void selectRetiredOption() {
        retiredOption.click();
    }

    public void enterResponse(String responseText) {
        response.sendKeys(responseText);
    }

    public void enterPhoneNumber(String phoneNumberText) {
        phoneNumber.sendKeys(phoneNumberText);
    }

    public void enterEmail(String emailText) {
        email.sendKeys(emailText);
    }

    public void clickResetButton() {
        action.moveToElement(resetButton).click().perform();
    
    }

    public void clickNextButton() {
        action.moveToElement(nextButton).click().perform();
    }
    
    
    //New methods for the budget calculator new implementation
    public void enterHour(String hour)
    {
    	hours.clear();
    	hours.sendKeys(hour);
    }

    public void enterPay(String p)
    {
    	pay.clear();
    	pay.sendKeys(p);
    }
    
    public void enterotherIncome(String in)
    {
    	otherIncome.clear();
    	otherIncome.sendKeys(in);
    }
    
    public void enterRentOrHousing(String rent)
    {
    	rentHousing.clear();
    	rentHousing.sendKeys(rent);
    }
    
    public void enterTransportation(String transport)
    {
    	transportation.clear();
    	transportation.sendKeys(transport);
    }
    
    public void enterGroceries(String transport)
    {
    	groceries.clear();
    	groceries.sendKeys(transport);
    }
    
    public void enterSubscription(String sub)
    {
    	subscription.clear();
    	subscription.sendKeys(sub);
    }
    
    public void enterDebts(String deb)
    {
    	debts.clear();
    	debts.sendKeys(deb);
    }
    
    public void enterSavings(String s)
    {
    	savings.clear();
    	savings.sendKeys(s);
    }
    
    public void enterTargetsavings(String s)
    {
    	target_Savings.clear();
    	target_Savings.sendKeys(s);
    }
    
    public void clickIncomeResetBtn()
    {
    
    	incresetBtn.click();
    
    }
    
    public void clickIncomeExpenseBtn()
    {
    	incexpenseBtn.click();
    }
    
    public String getPay()
    {
    	return pay.getAttribute("value");
    }
    
    public String getHours()
    {
      return hours.getAttribute("value");
    }
    
    public String getOtherIncome()
    {
    	return otherIncome.getAttribute("value");
    }
    
    public boolean checkIncomeSetToBlank()
    {
    	if(getPay().equalsIgnoreCase("7.25") && getHours().equalsIgnoreCase("0") && getOtherIncome().equalsIgnoreCase("0"))
    	{	
    		return true;
    	}
    	else
    	{
    		System.out.println(getPay());
    		System.out.println(getHours());
    		System.out.println(getOtherIncome());
    		return false;
    	}
    }
    
    public void clickExpenseBackBtn()
    {
    	expenseBackBtn.click();
    }
    
    public void clickExpenseresetBtn()
    {
    	
    	expenseResetBtn.click();
    }
    
    public String getRentHousing()
    {
    	return rentHousing.getAttribute("value");
    }
    
    public String getGroceries()
    {
    	return groceries.getAttribute("value");
    }
    
    public String getTransportation()
    {
    	return transportation.getAttribute("value");
    }
    
    public String getSubscription()
    {
    	return subscription.getAttribute("value");
    }
    
    public String getDebts()
    {
    	return debts.getAttribute("value");
    }
    
    public String getSummaryTotalIncome()
    {
    	return summaryTotalincome.getText();
    }
    
    public String getSummaryTotalExpense()
    {
    	return summaryTotalexpense.getText();
    }
    
    public String getsummarySavings()
    {
    	return currentSavings.getText();
    }
    
    public String getsummaryTargetSavings()
    {
    	return targetSavings.getText();
    }
    
    public boolean checkExpenseBlank()
    {
    	
    	if(getRentHousing().equalsIgnoreCase("0") && getTransportation().equalsIgnoreCase("0") && getSubscription().equalsIgnoreCase("0") && getDebts().equalsIgnoreCase("0") && getGroceries().equalsIgnoreCase("0"))
    	{
    		return true;
    	}
    	else
    	{
    		
    		return false;
    	}
    }
    
    public void clickSavingsandGoals()
    {
    	savingsgoalBtn.click();
    }
    
    public void clickCalculateBtn()
    {
    	calculateBtn.click();
    }
    
    public String checkTotalIncome()
    {
    	return getSummaryTotalIncome();
    }
    
    public String checkTotalExpense()
    {
    	return getSummaryTotalExpense();
    }
    
   

    public String getRecommendation()
    {
    	return recommendations.getText();
    }
    

    
    
    private void sleep(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
