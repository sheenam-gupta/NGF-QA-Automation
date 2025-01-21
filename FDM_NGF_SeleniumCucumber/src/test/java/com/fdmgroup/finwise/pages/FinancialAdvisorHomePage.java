package com.fdmgroup.finwise.pages;

import static org.junit.Assert.assertEquals;


import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.data.FinWise_DataFile;

public class FinancialAdvisorHomePage extends BrowserUtilities {

	@FindBy(xpath = "//label[@class='form-check-label']/i[@class='bi bi-moon']")
	private static WebElement darkModeIcon;

	@FindBy(xpath = "//p[contains(text(),'Financial Advisor')]")
	private WebElement financialAdvisorTitle;

	@FindBy(xpath = "//button[contains(text(),'Financial Advice')]")
	private WebElement financialAdvisorButton;

	@FindBy(xpath = "//button[contains(text(),'Personal Finance Advice')]")
	private WebElement personalFinancialAdviceOption;

	@FindBy(xpath = "//button[contains(text(),'Business Finance Advice')]")
	private WebElement businessFinancialAdviceOption;

	@FindBy(xpath = "//input[contains(@id,'mat-radio-2')]")
	private WebElement StudentLoanRepaymentRadioButton;

	@FindBy(xpath = "//mat-radio-button[@ng-reflect-value='Retirement Planning Advisory']")
	private WebElement retirementPlanningAdvisoryRadioButton;

	@FindBy(xpath = "//mat-radio-button[@ng-reflect-value='Retirement Savings Analysis']")
	private WebElement retirementSavingsAnalysisRadioButton;

	@FindBy(xpath = "//mat-radio-button[@ng-reflect-value='Credit Card Debt Calculator']")
	private WebElement creditCardDebtCalculatorRadioButton;

	@FindBy(xpath = "//input[@id='mat-input-0']")
	private WebElement loanAmount;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	private WebElement interestRate;

	@FindBy(xpath = "//input[@id='mat-input-2']")
	private WebElement monthlyPayment;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	private WebElement submitButton;

	@FindBy(xpath = "//p[contains(text(),'Assistant')]")
	private WebElement AssistantLabel;

	@FindBy(xpath = "//input[@name='currentSavings']")
	private WebElement retirementSavingsAnalysisCurrentSavings;

	@FindBy(xpath = "//input[@name='yearsUntilRetirement']")
	private WebElement retirementSavingsAnalysisYearsUntilRetirement;

	@FindBy(xpath = "//input[@name='annualReturnRate']")
	private WebElement retirementSavingsAnalysisAnnualReturnRate;

	@FindBy(xpath = "//input[@name='savedAtRetirement']")
	private WebElement retirementSavingsAnalysisSavedAtRetirement;

	@FindBy(xpath = "//input[@ng-reflect-name='creditCardBalance']")
	private WebElement creditCardBalance;

	@FindBy(xpath = "//input[@ng-reflect-name='creditInterestRate']")
	private WebElement creditInterestRate;

	@FindBy(xpath = "//input[@ng-reflect-name='paymentPerMonth']")
	private WebElement paymentPerMonth;

	@FindBy(xpath = "//input[@ng-reflect-name='location']")
	private WebElement location;

	@FindBy(xpath = "//input[@name='profit']")
	private WebElement profit;

	@FindBy(xpath = "//input[@name='expenses']")
	private WebElement expenses;

	@FindBy(xpath = "//input[@name='interestRate']")
	private WebElement interestRateBusiness;

	@FindBy(xpath = "//input[@name='cashFlow']")
	private WebElement cashFlow;

	@FindBy(xpath = "//app-chat-container//div[2]//p[2]")
	private WebElement chatAssistantResult;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	Actions action = new Actions(driver);

	public FinancialAdvisorHomePage() {
		PageFactory.initElements(driver, this);
		maximizeWindow();
	}

	public void isFinancialAdvisorHomepage() {
		assertEquals(FinWise_DataFile.FINANCIAL_ADVISOR, financialAdvisorTitle.getText());
	}

	public void clickOnFinancialAdvisorButton() {
		action.moveToElement(financialAdvisorButton).click().perform();
	}

	public void clickOnPersonalFinancialAdvisorOption() {
		action.moveToElement(personalFinancialAdviceOption).click().perform();
	}

	public void clickOnBusinessFinancialAdvisorOption() {
		action.moveToElement(businessFinancialAdviceOption).click().perform();
	}

	public void clickOnStudentLoanRepaymentRadioButton() {
		action.moveToElement(StudentLoanRepaymentRadioButton).click().perform();
	}

	public void clickOnRetirementPlanningAdvisoryRadioButton() {
		action.moveToElement(retirementPlanningAdvisoryRadioButton).click().perform();
	}

	public void clickOnRetirementSavingsAnalysisRadioButton() {
		action.moveToElement(retirementSavingsAnalysisRadioButton).click().perform();
	}

	public void clickOnCreditCardDebtCalculatorRadioButton() {
		action.moveToElement(creditCardDebtCalculatorRadioButton).click().perform();
	}

	public void enterLoanAmount(String loanamount) {
		action.moveToElement(loanAmount).click().sendKeys(loanamount).build().perform();

	}
	public void enterLocation(String location) {
		action.moveToElement(this.location).click().sendKeys(location).build().perform();

	}

	public void enterInterestRate(String interest_rate) {
		action.moveToElement(interestRate).click().sendKeys(interest_rate).perform();
	}

	public void enterMonthlyPayment(String monthly_payment) {
		action.moveToElement(monthlyPayment).click().sendKeys(monthly_payment).perform();

	}

	public void clickSubmitButton() {
		action.moveToElement(submitButton).click().perform();
	}

	public boolean isAssistantLabelPresent() {
		return AssistantLabel.isDisplayed();
	}
	public boolean isSubmitButtonEnabled() {
		return submitButton.isEnabled();
	}

	public void enterRetirementSavingsAnalysisCurrentSavings(String currentSavings) {
		action.moveToElement(retirementSavingsAnalysisCurrentSavings).click().sendKeys(currentSavings).build().perform();
	}

	public void enterRetirementSavingsAnalysisYearsUntilRetirement(String yearsUntilRetirement) {
		action.moveToElement(retirementSavingsAnalysisYearsUntilRetirement).click().sendKeys(yearsUntilRetirement).build().perform();
	}

	public void enterRetirementSavingsAnalysisAnnualReturnRate(String annualReturnRate) {
		action.moveToElement(retirementSavingsAnalysisAnnualReturnRate).click().sendKeys(annualReturnRate).build().perform();
	}

	public void enterRetirementSavingsAnalysisSavedAtRetirement(String savedAtRetirement) {
		action.moveToElement(retirementSavingsAnalysisSavedAtRetirement).click().sendKeys(savedAtRetirement).build().perform();
	}

	public boolean isRetirementSavingsAnalysisResultPresent() {
		return chatAssistantResult.isDisplayed();
	}

	public void enterCreditCardBalance(String creditCardBalance) {
		action.moveToElement(this.creditCardBalance).click().sendKeys(creditCardBalance).build().perform();
	}

	public void enterCreditInterestRate(String creditInterestRate) {
		action.moveToElement(this.creditInterestRate).click().sendKeys(creditInterestRate).build().perform();
	}

	public void enterPaymentPerMonth(String paymentPerMonth) {
		action.moveToElement(this.paymentPerMonth).click().sendKeys(paymentPerMonth).build().perform();
	}

	public boolean isRetirementSavingsAnalysisResultValid(String result) {
		String[] texts = chatAssistantResult.getText().split("//s+");
		String monthlySavings = texts[texts.length - 1];
		monthlySavings = monthlySavings.substring(1);
		return monthlySavings.contains(result);
	}

	public boolean isCreditCardDebtCalculatorResultValid(String result) {
		return chatAssistantResult.getText().contains(result + " months");
	}

	public void enterProfit(String profit) {
		action.moveToElement(this.profit).click().sendKeys(profit).build().perform();
	}

	public void enterExpenses(String expenses) {
		action.moveToElement(this.expenses).click().sendKeys(expenses).build().perform();
	}

	public void enterInterestRateBusiness(String interestRateBusiness) {
		action.moveToElement(this.interestRateBusiness).click().sendKeys(interestRateBusiness).build().perform();
	}

	public void enterCashFlow(String cashFlow) {
		action.moveToElement(this.cashFlow).click().sendKeys(cashFlow).build().perform();
	}

    public boolean isDarkModeIconEnabled() {
		return darkModeIcon.isDisplayed();
    }
}
