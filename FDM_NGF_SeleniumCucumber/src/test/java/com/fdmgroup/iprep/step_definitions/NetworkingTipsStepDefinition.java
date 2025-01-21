package com.fdmgroup.iprep.step_definitions;

import com.fdmgroup.iprep.pages.NetworkingTipsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.fdmgroup.data.IPrep_Datafile.*;
import static org.junit.Assert.assertTrue;

public class NetworkingTipsStepDefinition {
    private final NetworkingTipsPage networkingTipsPage = new NetworkingTipsPage();
    private final int delay = 1000;
    private final float scale = 0.1f;
    @When("User clicks on subject dropdown and selects {string} from Networking Tips page")
    public void user_clicks_on_subject_dropdown_and_selects_from_networking_tips_page(String subject) {
        networkingTipsPage.clickOnDropdown(SUBJECT);
        sleep(scale);
        networkingTipsPage.clickOnDropDownItem(subject);
        sleep(scale);
    }
    @When("User clicks on role dropdown and selects {string} from Networking Tips page")
    public void user_clicks_on_role_dropdown_and_selects_from_networking_tips_page(String role) {
        networkingTipsPage.clickOnDropdown(ROLE);
        sleep(scale);
        networkingTipsPage.clickOnDropDownItem(role);
        sleep(scale);
    }
    @When("User clicks edit button in the Networking Tips page")
    public void user_clicks_edit_button_in_the_networking_tips_page() {
        networkingTipsPage.clickEditButton();
        sleep(scale);
    }
    @When("User writes their prompt {string} in the Networking Tips page")
    public void user_writes_their_prompt_in_the_networking_tips_page(String prompt) {
        networkingTipsPage.enterText(prompt);
        sleep(scale);
    }
    @When("User clicks start button in the Networking Tips page")
    public void user_clicks_start_button_in_the_networking_tips_page() {
        networkingTipsPage.clickStartButton();
        sleep(5.0f);
    }
    @Then("User should see the assistant web element appear on the response box for the Networking Tips page")
    public void user_should_see_the_assistant_web_element_appear_on_the_response_box_for_the_networking_tips_page() {
        networkingTipsPage.isAssistantLabelPresent();
        sleep(scale);
    }
    @Then("User should see the api response from their prompt {string} for the Networking Tips page")
    public void user_should_see_the_api_response_from_their_prompt_for_the_networking_tips_page(String response) {
        assertTrue(networkingTipsPage.getAssistantText().contains(response));
        sleep(scale);
    }
    private void sleep(float scale) {
        try {
            Thread.sleep((int) (delay * scale));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
