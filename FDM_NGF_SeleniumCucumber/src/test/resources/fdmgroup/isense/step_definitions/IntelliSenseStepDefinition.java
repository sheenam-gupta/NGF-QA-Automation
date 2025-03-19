package com.fdmgroup.isense.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.data.Intellisense_DataFile;
import com.fdmgroup.iprep.pages.IprepPageOne;
import com.fdmgroup.isense.pages.CodeAssistantPage;
import com.fdmgroup.isense.pages.IntelliSensePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.fdmgroup.Main_Dashboard.pages.HomePage.getColorDarkModeOn;
import static com.fdmgroup.data.Main_DataFile.BACKGROUND_COLOR_DK_MD;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntelliSenseStepDefinition {
    private final HomePage homePage = new HomePage();
    private final IntelliSensePage intelliSensePage = new IntelliSensePage();
    private final CodeAssistantPage codeAssistantPage = new CodeAssistantPage();

    @When("User navigates to Intellisense page")
    public void user_navigates_to_intellisense_page() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.clickExploreIntellisenseButton();
    }
    @When("User clicks on Explore Code Assistant")
    public void user_clicks_on_explore_code_assistant() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        intelliSensePage.clickExploreCodeAssistantButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        intelliSensePage.clickLaunchButton();
    }
    @Then("User should see the Code Assistant page")
    public void user_should_see_the_code_assistant_page() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(Intellisense_DataFile.codeAssistantTitle, codeAssistantPage.getCodeAssistantTitle());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("User enters a prompt in the input box {string}")
    public void user_enters_a_prompt_in_the_input_box(String prompt) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        codeAssistantPage.enterRequest(prompt);
        codeAssistantPage.clickSubmitButton();
    }

    @Then("User should see the response box be dynamically created")
    public void user_should_see_the_response_box_be_dynamically_created() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(codeAssistantPage.isFeedbackContainerDisplayed());
    }

    @Then("User should see the response be relevant to the prompt {string}")
    public void user_should_see_the_response_be_relevant_to_the_prompt(String response) {
        assertTrue(codeAssistantPage.getFeedback().contains(response));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Dark mode is enabled for Intellisense submodule page")
    public void dark_mode_is_enabled_for_intellisense_submodule_page() {
        assertTrue(HomePage.isDarkModeIconEnabled());
        assertTrue(intelliSensePage.isISenseTextDisplayed());
    }

}
