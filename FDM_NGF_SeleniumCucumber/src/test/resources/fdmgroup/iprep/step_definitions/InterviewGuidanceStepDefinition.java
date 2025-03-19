package com.fdmgroup.iprep.step_definitions;

import com.fdmgroup.iprep.pages.InterviewGuidancePage;
import com.fdmgroup.iprep.pages.InterviewTipsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class InterviewGuidanceStepDefinition {

    private final InterviewGuidancePage interviewGuidancePage = new InterviewGuidancePage();
    private final InterviewTipsPage interviewTipsPage = new InterviewTipsPage();
    private final int delay = 1000;
    private final float scale = 0.5f;

    @When("User clicks the Interview Tips button")
    public void user_clicks_the_interview_tips_button() {
        sleep(scale);
        interviewGuidancePage.clickInterviewTipsButton();
    }
    @Then("User should be able to see the Interview Tips page")
    public void user_should_be_able_to_see_the_interview_tips_page() {
        sleep(scale);
        assertTrue(interviewTipsPage.isOnInterviewTipsPage());
    }

    @Given("User clicks the Networking Tips button")
    public void user_clicks_the_networking_tips_button() {
        sleep(scale);
        interviewGuidancePage.clickNetworkingTipsButton();
    }

    private void sleep(float scale) {
        try {
            Thread.sleep((int) (delay * scale));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
