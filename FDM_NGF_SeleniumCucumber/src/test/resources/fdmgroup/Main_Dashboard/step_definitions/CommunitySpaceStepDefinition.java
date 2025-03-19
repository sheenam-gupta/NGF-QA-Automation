package com.fdmgroup.Main_Dashboard.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.CommunitySpacePage;
import com.fdmgroup.Utilities.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.fdmgroup.data.CommunitySpace_DataFile.*;
import static org.junit.Assert.*;

public class CommunitySpaceStepDefinition {
    private DriverUtilities driverUtilities;
    private WebDriver driver;
    private final CommunitySpacePage communitySpacePage = new CommunitySpacePage();
    private final int delay = 1000;
    private final float scale = 3.0f;

    @Before
    public void setUp() {
        driverUtilities=DriverUtilities.getInstance();
        driver= driverUtilities.getDriver();
    }

    @When("User clicks on the Community Space button")
    public void userClicksOnTheCommunitySpaceButton() {
        sleep(0.5F);
        communitySpacePage.clickCommunitySpaceButton();
        sleep(1F);
    }

    @Then("User should be navigated to the Community Space page")
    public void userShouldBeNavigatedToTheCommunitySpacePage() {
        assertTrue(communitySpacePage.isCommunitySpaceIntroTextPresent());
        assertTrue(communitySpacePage.isCommunitySpaceIntroTextAccurate(COMMUNITY_SPACE_INTRO_TEXT));
    }

    @When("User clicks on submit a suggestion button")
    public void user_clicks_on_submit_a_suggestion_button() {
        communitySpacePage.clickSubmitASuggestionbutton();
        sleep(scale);
    }
    @Then("User is navigated to the suggestion form")
    public void user_navigates_to_suggestion_form() {
        assertTrue(communitySpacePage.isSuggestionFormDisplayed());
    }

    @When("User clicks on discard my suggestion button")
    public void user_clicks_on_discard_my_suggestion_button() {
        communitySpacePage.clickdiscardMySuggestionButton();
    }
    @Then("User has its suggestion discarded")
    public void user_has_its_suggestion_discarded() {
        assertTrue(communitySpacePage.isSubmitSuggestionButtonDisplayed());
    }

    @When("User selects suggestion related to a module {string}")
    public void user_selects_suggestion_related_to_a_module(String isModuleRelated) {
        communitySpacePage.selectDropdownTitle(IDEA_MODULE_RELATED);
        sleep(0.3f);
        communitySpacePage.selectDropdownItem(isModuleRelated);
    }

    @When("User selects module {string} to submit idea or suggestion")
    public void user_selects_module_to_submit_idea_or_suggestion(String module) {
        communitySpacePage.selectDropdownTitle(MODULE_SELECTION);
        sleep(0.3f);
        communitySpacePage.selectDropdownItem(module);
        sleep(0.3f);
    }
    @When("User selects submodule {string} to submit idea or suggestion")
    public void user_selects_submodule_to_submit_idea_or_suggestion(String subModule) {
        communitySpacePage.selectDropdownTitle(SUBMODULE_SELECTION);
        sleep(0.3f);
        System.out.println(subModule);
        communitySpacePage.selectDropdownItem(subModule);
    }
    @When("User enters suggestion or idea {string} to submit it to the Community Space")
    public void user_enters_suggestion_or_idea_to_submit_it_to_the_community_space(String suggestion) {
        communitySpacePage.enterSuggestion(suggestion);
        sleep(0.3f);
    }
    @When("User enters email {string} for idea submission to the Community Space")
    public void user_enters_email_for_idea_submission_to_the_community_space(String email) {
        communitySpacePage.enterEmailAddress(email);
        sleep(0.3f);
    }
    @When("User clicks on the Submit button on the Community Space Page")
    public void user_clicks_on_the_submit_button_on_the_community_space_page() {
        communitySpacePage.clickSubmitButton();
    }
    @Then("Suggestion is sent to API for evaluation and relevant suggestion is added to the suggestions table {string}")
    public void suggestion_is_sent_to_api_for_evaluation_and_relevant_suggestion_is_added_to_the_suggestions_table(String idea) {
        sleep(scale);
        assertTrue(communitySpacePage.isAlertPresent());
        sleep(scale);
        assertTrue(communitySpacePage.isSuggestionFilteredCorrectly(idea));
    }

    @Then("User is able to see the fields title, description, category and tags")
    public void user_is_able_to_see_the_fields_title_description_category_and_tags() {
        assertTrue(communitySpacePage.areSuggestionsTableFieldsPresent());
    }

    @Then("User is able to see the ideas previously provided.")
    public void user_is_able_to_see_the_ideas_previously_provided() {
        assertTrue(communitySpacePage.isListOfSuggestionsPresent());
    }

    private void sleep(float scale) {
        try {
            Thread.sleep((int) (scale * delay));

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
