package com.fdmgroup.onboardingnavigator.step_defintions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.Main_Dashboard.pages.Header;
import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.data.Glossary;
import com.fdmgroup.data.PageURLs;
import com.fdmgroup.finwise.pages.MortgageAdvisorPage;
import com.fdmgroup.onboardingnavigator.pages.GlossaryPage;
import com.fdmgroup.onboardingnavigator.pages.HomeOnboardingNavigatorPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GlossaryPageStepDefinition extends BrowserUtilities {

   

    @When("User clicks on the onboarding navigator button")
    public void user_clicks_on_the_onboarding_navigator_button() throws InterruptedException {
        BrowserUtilities.clickingButton(Header.onboardingNavigator(driver));
    }

    @Then("User should navigate to the onboarding navigator dashboard")
    public void user_should_navigate_to_the_onboarding_navigator_dashboard() throws InterruptedException {
        BrowserUtilities.verificationOfPage(PageURLs.OnboardingNavigator);
    }

    @When("User clicks on the Glossary button")
    public void user_clicks_on_the_glossary_button() {
        BrowserUtilities.clickingButton(HomeOnboardingNavigatorPage.glossaryLink);
     
    }


    @Then("User should be navigated to the glossary page")
    public void user_should_be_navigated_to_the_glossary_page() {
        BrowserUtilities.verificationOfPage(PageURLs.GlossaryPage);
    }

    @Then("verify user sees the welcome message")
    public void verify_user_sees_the_welcome_message() {
        assertEquals(GlossaryPage.welcomeMessage(driver).getText(), Glossary.WelcomeMessage);
    }

    @When("User clicks on the {string} dropdown")
    public void user_clicks_on_the_dropdown(String term) throws InterruptedException {
        BrowserUtilities.selectDropDownValues(GlossaryPage.glossaryTermDropdown(driver), term);

    }

    @Then("User should see the definition of the {string} in the glossary page")
    public void user_should_see_the_definition_of_the_in_the_glossary_page(String definition) {
        assertEquals(definition, GlossaryPage.definitionBox(driver).getText());
    }

}
