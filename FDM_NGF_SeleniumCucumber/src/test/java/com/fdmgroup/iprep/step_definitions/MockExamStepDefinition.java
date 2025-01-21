package com.fdmgroup.iprep.step_definitions;

import com.fdmgroup.iprep.pages.MockExamPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MockExamStepDefinition {

    private final MockExamPage mockExamPage = new MockExamPage();

    @When("User selects a subject {string} for the mock exam")
    public void user_selects_a_subject_for_the_mock_exam(String item) {
        mockExamPage.clickOnSubjectDropdown();
        mockExamPage.clickOnDropDownItem(item);
    }
    @When("User clicks on Take Mock Exam button")
    public void user_clicks_on_take_mock_exam_button() {
        mockExamPage.clickTakeMockExamButton();
    }
    @Then("User should see {int} point beside question in exam")
    public void user_should_see_point_beside_question_in_exam(Integer numPoints) {
    	mockExamPage.isPointsAppearingBesideQuestion(numPoints);
    }
    @When("User enters answer {string} for the question in mock exam")
    public void user_enters_answer_for_the_question_in_mock_exam(String optionSelected) {
        mockExamPage.clickOnRadioButtonItem(optionSelected);
    }
    @When("User clicks on the next question button in mock exam")
    public void user_clicks_on_the_next_question_button_in_mock_exam() {
        mockExamPage.clickonNextQuestionButton();
    }
    @When("User clicks on the submit answers button in mock exam")
    public void user_clicks_on_the_submit_answers_button_in_mock_exam() {
        mockExamPage.clicksubmitAnswersButton();
    }
    @Then("User should obtain a score, number of correct questions and feedback")
    public void user_should_obtain_a_score_number_of_correct_questions_and_feedback() {
        assertTrue(mockExamPage.isMockExamScorePresent());
        assertTrue(mockExamPage.areMockExamResultsDisplayed());
        assertTrue(mockExamPage.isMockExamFeedbackPresent());
    }
    @Then("User should see review and retry buttons in mock exam results page")
    public void user_should_see_review_and_retry_buttons_in_mock_exam_results_page() {
        assertTrue(mockExamPage.isReviewButtonPresent());
        assertTrue(mockExamPage.isRetryButtonPresent());
    }
    @When("User clicks Retry button in mock exam results page")
    public void user_clicks_retry_button_in_mock_exam_results_page() {
        mockExamPage.clickRetryButton();
    }
    @Then("User should see the Mock Exam page")
    public void user_is_navigated_to_mock_exam_home_page() {
        assertTrue(mockExamPage.isMockExamTitlePresent());
    }
    
    @Then("User should see {int} beside each question in exam")
    public void user_should_see_beside_each_question_in_exam(int numPoints) {
    	while(!mockExamPage.isSubmitAnswersButtonDisplayed()) {
    		user_should_see_point_beside_question_in_exam(numPoints);
    		user_enters_answer_for_the_question_in_mock_exam("d");
    		user_clicks_on_the_next_question_button_in_mock_exam();
		}
		user_enters_answer_for_the_question_in_mock_exam("d");
    }
    
    @And("Test should fail due to missing score")
    public void test_should_fail_due_to_missing_score() {
        assertEquals("Unable to see score from exam", false, true);
    }
    
    @Then("Loading animation appears with text {string}")
    public void loading_animation_appears_with_text(String string) {
    	assertTrue(mockExamPage.isLoadingDisplayed());
    }

}
