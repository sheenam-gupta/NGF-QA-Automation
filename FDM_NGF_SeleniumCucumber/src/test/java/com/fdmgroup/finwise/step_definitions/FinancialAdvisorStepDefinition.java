package com.fdmgroup.finwise.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.finwise.pages.FinancialAdvisorHomePage;
import com.fdmgroup.finwise.pages.FinwisePageOne;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.fdmgroup.Main_Dashboard.pages.HomePage.getColorDarkModeOn;
import static com.fdmgroup.data.Main_DataFile.BACKGROUND_COLOR_DK_MD;
import static org.junit.Assert.*;

public class FinancialAdvisorStepDefinition {
	private final HomePage homePage = new HomePage();
	private final FinwisePageOne finwisePageOne = new FinwisePageOne();
	private final FinancialAdvisorHomePage financialAdvisorHomePage = new FinancialAdvisorHomePage();
	private final int delay = 1000;
	private final float scale = 3.0f;

	@When("User click on Finwise Module")
	public void user_click_on_finwise_module() {
		homePage.clickExploreFinwiseButton();
		sleep(scale);
	}

	@When("User click on Explore Financial Advisor button")
	public void user_click_on_explore_financial_advisor_button() {
		finwisePageOne.clickExploreFinancialAdvisorButton();
		sleep(scale);
	}

	@When("User click on launch button")
	public void user_click_on_launch_button() {
		finwisePageOne.clickLaunchButton();
		sleep(scale);
	}

	@Then("User should be navigated to Financial advisor submodule page")
	public void user_should_be_navigated_to_financial_advisor_submodule_page() {
		financialAdvisorHomePage.isFinancialAdvisorHomepage();
		sleep(scale);
	}

	@When("User select Personal financial Advice option from Financial Advice dropdown")
	public void user_select_personal_financial_advice_option_from_financial_advice_dropdown() {
		financialAdvisorHomePage.clickOnFinancialAdvisorButton();
		financialAdvisorHomePage.clickOnPersonalFinancialAdvisorOption();
	}

	@When("User click on Student loan Repayment option")
	public void user_click_on_student_loan_repayment_option() {
		financialAdvisorHomePage.clickOnStudentLoanRepaymentRadioButton();
		sleep(scale);
	}

	@When("User enter loan amount {string}")
	public void user_enter_loan_amount(String loan_amount) {
	    financialAdvisorHomePage.enterLoanAmount(loan_amount);
	    sleep(scale);
	}
	@When("User enter location {string}")
	public void user_enter_location_location_filed(String location) {
	    financialAdvisorHomePage.enterLocation(location);
	    sleep(scale);
	}

	@When("User enter interest rate{string}")
	public void user_enter_interest_rate(String interest_rate) {
	    financialAdvisorHomePage.enterInterestRate(interest_rate);
	    sleep(scale);
	}

	@When("User enter monthly payment{string}")
	public void user_enter_monthly_payment(String monthly_payment) {
	    financialAdvisorHomePage.enterMonthlyPayment(monthly_payment);
	    sleep(scale);
	}

	@When("User clicks on submit button for Financial Advisor")
	public void user_click_on_submit_button() {
		financialAdvisorHomePage.clickSubmitButton();
		sleep(scale);
	}

	@Then("User should get personal advice for student loan repayment")
	public void user_should_get_personal_advice_for_student_loan_repayment() {
		sleep(4.0f);
		assertTrue(financialAdvisorHomePage.isAssistantLabelPresent());
	}
	
	@Then("User should not be able click on submit button for Financial Advisor")
	public void user_should_not_be_able_click_on_submit_button() {
	    assertFalse(financialAdvisorHomePage.isSubmitButtonEnabled());
	}

	@When("User select Retirement Savings Analysis option from the Personal Finance Advice dropdown")
	public void user_select_retirement_savings_analysis_option_from_the_personal_finance_advice_dropdown() {
		sleep(0.5f);
		financialAdvisorHomePage.clickOnRetirementSavingsAnalysisRadioButton();
	}
	@When("User enters current savings amount for the Retirement Savings Analysis {string}")
	public void user_enters_current_savings_amount_for_the_retirement_savings_analysis(String currentSavings) {
		sleep(0.5f);
		financialAdvisorHomePage.enterRetirementSavingsAnalysisCurrentSavings(currentSavings);
	}
	@When("User enters years until retirement for the Retirement Savings Analysis {string}")
	public void user_enters_years_until_retirement_for_the_retirement_savings_analysis(String yearsUntilRetirement) {
		sleep(0.5f);
		financialAdvisorHomePage.enterRetirementSavingsAnalysisYearsUntilRetirement(yearsUntilRetirement);
	}
	@When("User enters annual return rate for the Retirement Savings Analysis {string}")
	public void user_enters_annual_return_rate_for_the_retirement_savings_analysis(String annualReturnRate) {
		sleep(0.5f);
		financialAdvisorHomePage.enterRetirementSavingsAnalysisAnnualReturnRate(annualReturnRate);
	}
	@When("User enters amount saved at retirement for the Retirement Savings Analysis {string}")
	public void user_enters_amount_saved_at_retirement_for_the_retirement_savings_analysis(String savedAtRetirement) {
		sleep(0.5f);
		financialAdvisorHomePage.enterRetirementSavingsAnalysisSavedAtRetirement(savedAtRetirement);
	}

	@When("User enters location for Retirement Savings Analysis {string}")
	public void user_enters_location_for_retirement_savings_analysis(String string) {
		sleep(0.5f);
		financialAdvisorHomePage.enterLocation(string);
	}

	@Then("User should see the Retirement Savings Analysis results {string}")
	public void user_should_see_the_retirement_savings_analysis_results(String monthlySavingsNeeded) {
		sleep(4.0f);
		assertTrue(financialAdvisorHomePage.isRetirementSavingsAnalysisResultPresent());
		assertTrue(financialAdvisorHomePage.isRetirementSavingsAnalysisResultValid(monthlySavingsNeeded));
	}
	@When("User select Credit Card Debt Calculator option from the Personal Finance Advice dropdown")
	public void user_select_credit_card_debt_calculator_option_from_the_personal_finance_advice_dropdown() {
		sleep(0.5f);
		financialAdvisorHomePage.clickOnCreditCardDebtCalculatorRadioButton();
	}
	@When("User enters the credit card balance for the Credit Card Debt Calculator {string}")
	public void user_enters_the_credit_card_balance_for_the_credit_card_debt_calculator(String creditCardBalance) {
		sleep(0.5f);
		financialAdvisorHomePage.enterCreditCardBalance(creditCardBalance);
	}
	@When("User enters the interest rate for the Credit Card Debt Calculator {string}")
	public void user_enters_the_interest_rate_for_the_credit_card_debt_calculator(String interestRate) {
		sleep(0.5f);
		financialAdvisorHomePage.enterInterestRate(interestRate);
	}
	@When("User enters the monthly payment for the Credit Card Debt Calculator {string}")
	public void user_enters_the_monthly_payment_for_the_credit_card_debt_calculator(String paymentsPerMonth) {
		sleep(0.5f);
		financialAdvisorHomePage.enterMonthlyPayment(paymentsPerMonth);
	}
	@When("User enters the location for the Credit Card Debt Calculator {string}")
	public void user_enters_the_location_for_the_credit_card_debt_calculator(String location) {
		sleep(0.5f);
		financialAdvisorHomePage.enterLocation(location);
	}
	@Then("User should see the Credit Card Debt Calculator results {string}")
	public void user_should_see_the_credit_card_debt_calculator_results(String result) {
		sleep(4.0f);
		assertTrue(financialAdvisorHomePage.isAssistantLabelPresent());
		assertTrue(financialAdvisorHomePage.isCreditCardDebtCalculatorResultValid(result));
	}
	@When("User select Business financial Advice option from Financial Advice dropdown")
	public void user_select_business_financial_advice_option_from_financial_advice_dropdown() {
		sleep(0.5f);
		financialAdvisorHomePage.clickOnFinancialAdvisorButton();
		sleep(0.5f);
		financialAdvisorHomePage.clickOnBusinessFinancialAdvisorOption();
	}
	@When("User enters profit for Business Financial Advice{string}")
	public void user_enters_profit_for_business_financial_advice(String profit) {
		sleep(0.5f);
		financialAdvisorHomePage.enterProfit(profit);
	}
	@When("User enters expenses for Business Financial Advice{string}")
	public void user_enters_expenses_for_business_financial_advice(String expenses) {
		sleep(0.5f);
		financialAdvisorHomePage.enterExpenses(expenses);
	}
	@When("User enters interest rate for Business Financial Advice{string}")
	public void user_enters_interest_rate_for_business_financial_advice(String interestRate) {
		sleep(0.5f);
		financialAdvisorHomePage.enterInterestRateBusiness(interestRate);
	}
	@When("User enters cash flow for Business Financial Advice{string}")
	public void user_enters_cash_flow_for_business_financial_advice(String cashFlow) {
		sleep(0.5f);
		financialAdvisorHomePage.enterCashFlow(cashFlow);
	}
	@Then("User should see assistant label be present for the Financial Advisor")
	public void user_should_see_assistant_label_be_present_for_the_financial_advisor() {
		sleep(4.0f);
		assertTrue(financialAdvisorHomePage.isAssistantLabelPresent());
	}

	@Then("Dark mode is on and dark mode icon is enabled for Finwise Module")
	public void user_dark_mode_is_on_and_dark_mode_icon_is_enabled_for_financial_advisor_page() {
		assertTrue(financialAdvisorHomePage.isDarkModeIconEnabled());
		assertEquals(BACKGROUND_COLOR_DK_MD,getColorDarkModeOn());
	}


	private void sleep(float scale) {
		try {
			Thread.sleep((int) (scale * delay));
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
