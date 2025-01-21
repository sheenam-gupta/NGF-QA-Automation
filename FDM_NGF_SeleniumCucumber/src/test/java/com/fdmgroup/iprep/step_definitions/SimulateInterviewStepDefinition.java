package com.fdmgroup.iprep.step_definitions;

import com.fdmgroup.iprep.pages.SimulateInterviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.fdmgroup.data.IPrep_Datafile.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SimulateInterviewStepDefinition {

    private final SimulateInterviewPage simulateInterviewPage = new SimulateInterviewPage();
    private int delay = 1000;
    private float scale = 1.0f;


    @Then("User should see the simulate interview page")
    public void user_should_see_the_simulate_interview_page() {
        sleep(scale);
        assertTrue(simulateInterviewPage.isMockInterviewTitleDisplayed());
    }

    @When("User selects the Mock Interview option in the simulate interview page")
    public void user_selects_the_mock_interview_option_in_the_simulate_interview_page() {
        simulateInterviewPage.clickMockInterviewButton();
        sleep(scale);
    }
    @When("User selects the interview type {string} option for simulate interview")
    public void user_selects_the_interview_type_option_for_simulate_interview(String interviewType) {
        simulateInterviewPage.clickDropdown(INTERVIEW_TYPE);
        sleep(0.5f*scale);
        simulateInterviewPage.clickDropdownItem(interviewType);
    }
    @When("User selects the choose_level {string} option for simulate interview")
    public void user_selects_the_choose_level_option_for_simulate_interview(String level) {
        simulateInterviewPage.clickDropdown(CHOOSE_LEVEL);
        sleep(0.5f*scale);
        simulateInterviewPage.clickDropdownItem(level);
    }
    @When("User selects the stream {string} option for simulate interview")
    public void user_selects_the_stream_option_for_simulate_interview(String stream) {
        simulateInterviewPage.clickDropdown(STREAM);
        sleep(0.5f*scale);
        simulateInterviewPage.clickDropdownItem(stream);
    }
    @When("User clicks on Show Questions button for simulate interview")
    public void user_clicks_on_show_questions_button_for_simulate_interview() {
        simulateInterviewPage.clickShowQuestionsButton();
        sleep(2.5f*scale);
    }
    @When("User enters their answer {string} for the question in mock interview")
    public void user_enters_their_answer_for_the_question_in_mock_interview(String answer) {
        simulateInterviewPage.enterAnswer(answer);
        sleep(1.5f*scale);
    }
    @When("User clicks on the next question button in mock interview")
    public void user_clicks_on_the_next_question_button_in_mock_interview() {
        simulateInterviewPage.clickNextButton();
        sleep(0.5f*scale);
    }
    @When("User clicks submit button in simulate interview")
    public void user_clicks_submit_button_in_simulate_interview() {
        simulateInterviewPage.clickSubmitButton();
        sleep(3.5f*scale);
    }
    @Then("User should see the feedback title of the mock interview")
    public void user_should_see_the_feedback_title_of_the_mock_interview() {
        assertTrue(simulateInterviewPage.isFeedbackTitleValid(FEEDBACK_TITLE));
    }
    @Then("User should see the feedback text of the mock interview")
    public void user_should_see_the_feedback_text_of_the_mock_interview() {
        assertTrue(simulateInterviewPage.isFeedbackTextAreaValid());
    }

    @When("User clicks on Practice History button")
    public void user_clicks_on_practice_history_button() {
        simulateInterviewPage.clickPracticeHistoryButton();
    }
    @Then("User should see the practice history table")
    public void user_should_see_the_practice_history_table() {
        assertTrue(simulateInterviewPage.isPracticeHistoryTablePresent());
    }
    @Then("User should see the date, type of session and performance summary")
    public void user_should_see_the_date_type_of_session_and_performance_summary() {
        assertTrue(simulateInterviewPage.areFieldsTypeLevelAndPerformancePresent());
    }
    @When("User clicks on the view button of the practice history table")
    public void user_clicks_on_the_view_button_of_the_practice_history_table() {
        simulateInterviewPage.clickViewPracticeButton();
    }
    @Then("A detailed feedback with questions, answers and individual feedbacks is provided.")
    public void a_detailed_feedback_with_questions_answers_and_individual_feedbacks_is_provided() {
        assertTrue(simulateInterviewPage.areSessionDetailsPresent());
    }
    @Then("A welcome message for the username is displayed")
    public void a_welcome_message_for_the_username_is_displayed() {
        String usernameUrl = simulateInterviewPage.getUsernameFromUrl();
        String usernameUI = simulateInterviewPage.getUsernameUI();
        assertEquals(usernameUrl,usernameUI);
    }

    private void sleep(float scale) {
        try {
            Thread.sleep((int) (delay * scale));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
