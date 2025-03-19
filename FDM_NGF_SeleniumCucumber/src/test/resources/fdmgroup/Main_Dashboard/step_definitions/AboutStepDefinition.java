package com.fdmgroup.Main_Dashboard.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

import com.fdmgroup.Main_Dashboard.pages.AboutPage;
import com.fdmgroup.Main_Dashboard.pages.HomePage;

public class AboutStepDefinition {

    private final AboutPage aboutPage = new AboutPage();
    private final HomePage homePage = new HomePage();
    //private final Header header = new Header();
    private final int delay = 1000;
    private float scale = 0.5f;

    @When("User navigates to the about page")
    public void user_navigates_to_the_about_page() {
        aboutPage.clickAboutButton();
        sleep(scale);
    }

    @Then("User should see our vision statements on the about page")
    public void user_should_see_our_vision_statements_on_the_about_page() {

        sleep(scale);
        assertTrue(aboutPage.isVisionTitleCorrect("Our Vision"));
        sleep(scale);
        //assertTrue(aboutPage.productVisionStatementContains(VISION_2));
        //sleep(scale);
        //assertTrue(aboutPage.productVisionStatementContains(VISION_3));
        //sleep(scale);
        //assertTrue(aboutPage.productVisionStatementContains(VISION_4));
    }

    @Then("User should see our mission statements on the about page")
    public void user_should_see_our_mission_statements_on_the_about_page() {


        sleep(scale);
        //assertTrue(aboutPage.productMissionStatementContains(MISSION_1));
        sleep(scale);
        //assertTrue(aboutPage.productMissionStatementContains(MISSION_2));
        sleep(scale);
        //assertTrue(aboutPage.productMissionStatementContains(MISSION_3));
        sleep(scale);
        //assertTrue(aboutPage.productMissionStatementContains(MISSION_4));


    }

    private void sleep(float scale) {
        try {
            Thread.sleep((int) (scale * delay));

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
