package com.fdmgroup.iprep.step_definitions;

import com.fdmgroup.iprep.pages.InterviewTipsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.fdmgroup.data.IPrep_Datafile.*;
import static org.junit.Assert.assertTrue;

public class InterviewTipsStepDefinition {

    private final InterviewTipsPage interviewTipsPage = new InterviewTipsPage();
    private final int delay = 100;
    @When("User clicks on subject dropdown and selects {string} from Interview Tips page")
    public void user_clicks_on_subject_dropdown_and_selects_from_interview_tips_page(String subject) {
        sleep(delay);
        interviewTipsPage.clickOnDropdown(SUBJECT);
        interviewTipsPage.clickOnDropDownItem(subject);
    }

    @When("User clicks on role dropdown and selects {string} from Interview Tips page")
    public void user_clicks_on_role_dropdown_and_selects_from_interview_tips_page(String role) {
        sleep(delay);
        interviewTipsPage.clickOnDropdown(ROLE);
        interviewTipsPage.clickOnDropDownItem(role);
    }
    @When("User clicks on level dropdown and selects {string} from Interview Tips page")
    public void user_clicks_on_level_dropdown_and_selects_from_interview_tips_page(String level) {
        sleep(delay);
        interviewTipsPage.clickOnDropdown(LEVEL);
        interviewTipsPage.clickOnDropDownItem(level);
    }
    @When("User clicks edit button in the Interview Tips page")
    public void user_clicks_edit_button_in_the_interview_tips_page() {
        sleep(delay);
        interviewTipsPage.clickEditButton();
    }
    @When("User writes their prompt {string} in the Interview Tips page")
    public void user_writes_their_prompt_in_the_interview_tips_page(String prompt) {
        sleep(delay);
        interviewTipsPage.enterText(prompt);
    }
    @When("User clicks start button in the Interview Tips page")
    public void user_clicks_start_button_in_the_interview_tips_page() {
        sleep(delay);
        interviewTipsPage.clickStartButton();
    }
    @Then("User should see the assistant web element appear on the response box for the Interview Tips page")
    public void user_should_see_the_assistant_web_element_appear_on_the_response_box_for_the_interview_tips_page() {
        sleep(50 * delay);
        assertTrue(interviewTipsPage.isAssistantLabelPresent());
    }
    @Then("User should see the api response from their prompt {string} for the Interview Tips page")
    public void user_should_see_the_api_response_from_their_prompt_for_the_interview_tips_page(String response) {
        sleep(20 * delay);
        assertTrue(interviewTipsPage.getAssistantText().contains(response));
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
