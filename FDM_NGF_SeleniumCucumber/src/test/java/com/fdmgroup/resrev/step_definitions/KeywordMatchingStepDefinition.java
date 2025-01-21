package com.fdmgroup.resrev.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.resrev.pages.KeywordMatchingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class KeywordMatchingStepDefinition {

    private final KeywordMatchingPage keywordMatchingPage = new KeywordMatchingPage();
    private final HomePage homePage = new HomePage();
    private final int delay = 1000;
    private final float scale = 0.5f;

    @Then("User is on the Keyword Matching submodule")
    public void user_is_on_the_keyword_matching_submodule() {
        sleep(scale);
        assertTrue(keywordMatchingPage.isOnKeywordMatchingPage());
        sleep(scale);
    }

    @When("User clicks on I am a recruiter button for Resume Refinement")
    public void user_clicks_on_i_am_a_recruiter_button_for_resume_refinement() {
        keywordMatchingPage.clickRecruiterButton();
        sleep(scale);
    }

    @When("User clicks on I am a job seeker button for Resume Review")
    public void user_clicks_on_i_am_a_job_seeker_button_for_resume_review() {
        keywordMatchingPage.clickJobSeekerButton();
        sleep(scale);
    }

    @When("User enters job description {string} for Resume Review")
    public void user_enters_job_description_for_resume_review(String jobDescription) {
        keywordMatchingPage.enterJobDescription(jobDescription);
    }

    @When("User enters job description {string} for Resume Refinement")
    public void user_enters_job_description_for_resume_refinement(String jobDescriptionFilePath) {
        keywordMatchingPage.enterJobDescriptionInformation(jobDescriptionFilePath);
        sleep(3.0f);
    }

    @When("User enters Resume {string} for Resume Review")
    public void user_enters_resume_for_resume_review(String resumeFilePath) {
        keywordMatchingPage.enterResumeInformation(resumeFilePath);
        sleep(3.0f);
    }

    @When("User clicks receive feedback button for Resume Review")
    public void user_clicks_receive_feedback_button_for_resume_review() {
        sleep(5.0f);
        keywordMatchingPage.clickReceiveFeedbackbutton();
        sleep(8.0f);
    }

    @Then("User should see feedback provided by assistant for Resume Review")
    public void user_should_see_feedback_provided_by_assistant_for_resume_review() {
        sleep(3.0f);
        assertTrue(keywordMatchingPage.isResumeReviewResponseValid());
    }

    @When("User clicks enhance resume button for Resume Review")
    public void user_clicks_enhance_resume_button_for_resume_review() {
        keywordMatchingPage.clickEnhanceResumeButton();
        sleep(5.0f);
    }

    @Then("User receives an enhanced resume provided by assistant for Resume Review")
    public void user_receives_an_enhanced_resume_provided_by_assistant_for_resume_review() {
        assertTrue(keywordMatchingPage.isEnhancedResumeResponseValid());
    }



    @Then("User receives feedback for job applicant by assistant for Resume Refinement")
    public void user_receives_feedback_for_job_applicant_by_assistant_for_resume_refinement() {
        assertTrue(keywordMatchingPage.isResumeRefinementResponseValid());
    }


    private void sleep(float scale) {
        try {
            Thread.sleep((int) (scale * delay));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
