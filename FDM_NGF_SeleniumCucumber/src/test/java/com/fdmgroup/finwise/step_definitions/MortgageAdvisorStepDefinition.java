package com.fdmgroup.finwise.step_definitions;


import static org.junit.Assert.assertTrue;
import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.data.MortgageAdvisor_Datafile;
import com.fdmgroup.finwise.pages.MortgageAdvisorPage;
import io.cucumber.java.en.When;

public class MortgageAdvisorStepDefinition extends BrowserUtilities {
	private final MortgageAdvisorPage mortgageAdvisorPage = new MortgageAdvisorPage();

	
	@When("Enter input fields loan {string} city {string} rate type {string} Amortization {string}")
	public void enter_input_fields_loan_city_rate_type_amortization(String loan, String city, String rate, String amortization) {
		mortgageAdvisorPage.enterLoanAmount(loan);
		mortgageAdvisorPage.enterCity(city);
		BrowserUtilities.selectRadioButtonByChoice(mortgageAdvisorPage.radioButtons(driver), rate);
		mortgageAdvisorPage.enterAmortization(amortization);
		
	}

	@When("Enter other fields property type {string} down payment {string} province {string} term {string} and credit score {string}")
	public void enter_other_fields_property_type_down_payment_province_term_and_credit_score(String property, String payment, String province, String term, String score) throws InterruptedException {
		BrowserUtilities.selectRadioButtonByChoice(mortgageAdvisorPage.radioButtons(driver), property);
		mortgageAdvisorPage.enterdownPayment(payment);
		BrowserUtilities.selectDropDownValues(MortgageAdvisorPage.selectProvince(driver), province);
		String termString = String.valueOf(term); 
		BrowserUtilities.selectDropDownValues(MortgageAdvisorPage.selectTerm(driver), termString);
		mortgageAdvisorPage.enterCreditScore(score);
		mortgageAdvisorPage.clickSubmit(MortgageAdvisor_Datafile.alertMessageRates);
	}
	
	@When("verify the pop up message and verify the output fields having rates as current best worst qualifying and AI advice")
	public void verify_the_pop_up_message_and_verify_the_output_fields_having_rates_as_current_best_worst_qualifying_and_ai_advice() {
		assertTrue(mortgageAdvisorPage.clickAlert(MortgageAdvisor_Datafile.alertMessageAdvice));
		assertTrue(mortgageAdvisorPage.verifyCurrentRate());
		assertTrue(mortgageAdvisorPage.verifyBestRate());
		assertTrue(mortgageAdvisorPage.verifyWorstRate());
		assertTrue(mortgageAdvisorPage.verifyQualifyingRate());
		assertTrue(mortgageAdvisorPage.verifyAIAdvice());
	}

	@When("User toggles dark mode button on for Mortgage Advisor Page")
	public void user_toggles_dark_mode_button_on() {
		mortgageAdvisorPage.clickDarkModeCheckBox();
	}
}
