package com.fdmgroup.finwise.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.finwise.pages.FinwisePageOne;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class FinwiseStepDefinition {

    private final FinwisePageOne finwisePageOne = new FinwisePageOne();
    private final int delay = 1000;
    private final float scale = 1.0f;

    @When("User clicks on Budget Calculator")
    public void user_clicks_on_budget_calculator() {
        finwisePageOne.clickExploreBudgetCalculatorButton();
        finwisePageOne.clickLaunchButton();
        sleep(scale);
    }
    

    @When("User explores Finwise module and then launch Mortgage Advisor")
    public void user_explores_finwise_module_and_then_launch_mortgage_advisor() {
            finwisePageOne.clickExploreFinwiseButton();
            finwisePageOne.clickExploreMortgageAdvisorButton();
            finwisePageOne.clickLaunchButton();
        }

    @Then("Dark mode is enabled for Finwise submodule page")
    public void dark_mode_is_enabled_for_finwise_submodule_page() {
        assertTrue(HomePage.isDarkModeIconEnabled());
        FinwisePageOne finwisePage = new FinwisePageOne();
        assertTrue(finwisePage.isFinBotTextDisplayed());
    }


    private void sleep(float scale) {
        try {
            Thread.sleep((int) (scale * delay));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
