package com.fdmgroup.finwise.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.finwise.pages.BudgetCalculatorPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BudgetCalculatorStepDefinition {

    private final BudgetCalculatorPage budgetCalculatorPage = new BudgetCalculatorPage();
    private final int delay = 1000;
    private final float scale = 0.1f;
    private Integer totalIncome,totalExpense;

    @When("User clicks start from the budget calculator welcome page")
    public void user_clicks_start_from_the_budget_calculator_welcome_page() {
        sleep(scale);
        budgetCalculatorPage.clickStartButton();
        sleep(scale);
    }

    @When("User selects on employment status for budget calculator {string}")
    public void user_selects_on_employment_status_for_budget_calculator(String employmentStatus) {
        budgetCalculatorPage.selectEmploymentStatus(employmentStatus);
        sleep(scale);
    }
    @When("User enters response for budget calculator {string}")
    public void user_enters_response_for_budget_calculator(String response) {
        budgetCalculatorPage.enterResponse(response);
        sleep(scale);
    }
    @When("User enters phone number for budget calculator {string}")
    public void user_enters_phone_number_for_budget_calculator(String phoneNumber) {
        budgetCalculatorPage.enterPhoneNumber(phoneNumber);
        sleep(scale);
    }
    @When("User enters email for budget calculator {string}")
    public void user_enters_email_for_budget_calculator(String email) {
        budgetCalculatorPage.enterEmail(email);
        sleep(scale);
    }
    @Then("User clicks on next button from the budget calculator")
    public void user_clicks_on_next_button_from_the_budget_calculator() {
        budgetCalculatorPage.clickNextButton();
        sleep(scale);
    }
    @Then("User click on reset button from the budget calculator")
    public void user_click_on_reset_button_from_the_budget_calculator() {
        budgetCalculatorPage.clickResetButton();
        sleep(scale);
    }
    
    @When("User enters the Income details {string} {string} {string}")
    public void user_enters_the_income_details(String string, String string2, String string3) {
       budgetCalculatorPage.enterHour(string);
       budgetCalculatorPage.enterPay(string2);
       budgetCalculatorPage.enterotherIncome(string3);
    }

    @When("User click on reset button in the income page")
    public void user_click_on_reset_button_in_the_income_page() {
        budgetCalculatorPage.clickIncomeResetBtn();
        
    }

    @Then("Income details set to blank")
    public void income_details_set_to_blank() {
    	
    	assertTrue(budgetCalculatorPage.checkIncomeSetToBlank());   	   
       
    }

    @When("User Click Expenses_button")
    public void user_click_expenses_button() {
    	budgetCalculatorPage.clickIncomeExpenseBtn();
    }

    @When("User clicks on Back button in Expense page")
    public void user_clicks_on_back_button_in_expense_page() {
    	budgetCalculatorPage.clickExpenseBackBtn();
    }

    @Then("User able to see the details entered for Income {string} {string} {string}")
    public void user_able_to_see_the_details_entered_for_income(String string, String string2, String string3) {
        assertEquals(budgetCalculatorPage.getHours(),string);
        assertEquals(budgetCalculatorPage.getPay(),string2);
        assertEquals(budgetCalculatorPage.getOtherIncome(),string3);
    }

  

    @When("User enters Expense details {string} {string} {string} {string} {string}")
    public void user_enters_expense_details(String string, String string2, String string3, String string4, String string5) {
     budgetCalculatorPage.enterRentOrHousing(string);
     budgetCalculatorPage.enterGroceries(string2);
     budgetCalculatorPage.enterTransportation(string3);
     budgetCalculatorPage.enterSubscription(string4);
     budgetCalculatorPage.enterDebts(string5);
     
    }

    @When("User click on Reset button in Expense page")
    public void user_click_on_reset_button_in_expense_page() {
    	budgetCalculatorPage.clickExpenseresetBtn();
    }

    @Then("Expense details set to blank")
    public void expense_details_set_to_blank() {
    	assertTrue(budgetCalculatorPage.checkExpenseBlank());
    }


    @When("User click on Back button in Savings and expense page")
    public void user_click_on_back_button_in_savings_and_expense_page() {
    	budgetCalculatorPage.clickExpenseBackBtn();
    }

    @Then("user able to see the details entered for expense {string} {string} {string} {string} {string}")
    public void user_able_to_see_the_details_entered_for_expense(String string, String string2, String string3, String string4, String string5) {
       assertEquals(budgetCalculatorPage.getRentHousing(),string);
       assertEquals(budgetCalculatorPage.getGroceries(),string2);
       assertEquals(budgetCalculatorPage.getTransportation(),string3);
       assertEquals(budgetCalculatorPage.getSubscription(),string4);
       assertEquals(budgetCalculatorPage.getDebts(),string5);
       
    }

    @Then("click on Savings and Goals")
    public void click_on_savings_and_goals() {
    	budgetCalculatorPage.clickSavingsandGoals();
    }

    @When("User enters savings and goals details {string} {string}")
    public void user_enters_savings_and_goals_details(String string, String string2) {
    	budgetCalculatorPage.enterSavings(string);
    	budgetCalculatorPage.enterTargetsavings(string2);
    }

    @When("User click calculate button")
    public void user_click_calculate_button() {
    	budgetCalculatorPage.clickCalculateBtn();
    }

    @Then("User able to see the summary page with Monthly total income {string} {string} {string}")
    public void user_able_to_see_the_summary_page_with_monthly_total_income(String string, String string2, String string3) {
    	String sum=budgetCalculatorPage.checkTotalIncome();
    	totalIncome=(Integer.parseInt(string)*Integer.parseInt(string2)*4)+Integer.parseInt(string3);
    	sum=sum.replaceAll("[-+.^:,$]","");
    	//System.out.println(total);
    	//System.out.println(sum);
    	assertTrue(sum.contains(totalIncome.toString()));
    }

    @Then("user should be able to see Monthly total expense {string} {string} {string} {string} {string}")
    public void user_should_be_able_to_see_monthly_total_expense(String string, String string2, String string3, String string4, String string5) {
        String sum=budgetCalculatorPage.checkTotalExpense();
        totalExpense=Integer.parseInt(string)+Integer.parseInt(string2)+Integer.parseInt(string3)+Integer.parseInt(string4)+Integer.parseInt(string5);
    	sum=sum.replaceAll("[-+.^:,$]","");
    	//System.out.println(total);
    	//System.out.println(sum);
        assertTrue(sum.contains(totalExpense.toString()));
    }

    @Then("user should be able to see savings and goals {string} {string}")
    public void user_should_be_able_to_see_savings_and_goals(String string, String string2) {
    	String savings=budgetCalculatorPage.getsummarySavings().replaceAll("[-+.^:,$]","");
    	String target=budgetCalculatorPage.getsummaryTargetSavings().replaceAll("[-+.^:,$]","");
    	assertTrue(budgetCalculatorPage.getsummarySavings().contains(string));
    	assertTrue(budgetCalculatorPage.getsummaryTargetSavings().contains(string2));
      
    }

    

   
    @Then("user should be able to see recommendations {string} {string}")
    public void user_should_be_able_to_see_recommendations(String string, String string2) {
    	Integer goal=Integer.parseInt(string2)-Integer.parseInt(string);
    	Integer disposable_income=totalIncome-totalExpense-Integer.parseInt(string);
    	if(goal<disposable_income)
    	{
    		System.out.println(budgetCalculatorPage.getRecommendation());
    		assertTrue(budgetCalculatorPage.getRecommendation().contains("You can set aside an additional"));
    	}
    	else
    	{
    		System.out.println(budgetCalculatorPage.getRecommendation());
    		assertTrue(budgetCalculatorPage.getRecommendation().contains("You cannot set aside an additional"));
    	}
    	
    }




    private void sleep(float scale) {
        try {
            Thread.sleep((int) (scale * delay));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
