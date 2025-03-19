package com.fdmgroup.Main_Dashboard.step_definitions;

import org.openqa.selenium.bidi.module.Browser;

import com.fdmgroup.Main_Dashboard.pages.CommunitySpacePage;
import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.data.PageURLs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommunitySpaceSuggestionsTableDisplay extends BrowserUtilities {

    
    @When("User navigates to the Community Space Module")
public void user_navigates_to_the_community_space_module() {
  BrowserUtilities.clickingButton(HomePage.communitySpaceButton(driver));


    
}
@Then("User should be navigated to the Community Space Module page")
public void user_should_be_navigated_to_the_community_space_module_page() {
   
    BrowserUtilities.verificationOfPage(PageURLs.CommunitySpacePage);
}

@When("User clicks the Submit a Suggestion button")
public void user_clicks_the_submit_a_suggestion_button() {
   BrowserUtilities.clickingButton(CommunitySpacePage.submitSuggestionButton(driver));
    
}
@Then("User should see the Submit a Suggestion form")
public void user_should_see_the_submit_a_suggestion_form() {
   
    CommunitySpacePage.suggestionRelatedtoModuleOption(driver).isDisplayed();
}

@When("User selects {string} to module dropdown")
public void user_selects_suggestion_related_to_module_dropdown(String suggestionRelated) {
    BrowserUtilities.selectDropDownValue(CommunitySpacePage.suggestionRelatedtoModuleOption(driver), suggestionRelated);
    
}
@When("User select {string} from the module dropdown")
public void user_select_module_from_the_module_dropdown(String module) {
    BrowserUtilities.selectDropDownValue(CommunitySpacePage.selectModule(driver), module);
    
}
@When("User selects {string} from the sub-module dropdown")
public void user_selects_sub_module_from_the_sub_module_dropdown(String subModule) {
    BrowserUtilities.selectDropDownValue(CommunitySpacePage.selectSubModule(driver), subModule);
    
}
@When("User enters {string} in the suggestion text box")
public void user_enters_suggestion_in_the_suggestion_text_box(String suggestion) {
    CommunitySpacePage.enterSuggestion(driver).sendKeys(suggestion);
    
}
@When("User enters {string} in the user details text box")
public void user_enters_user_details_in_the_user_details_text_box(String userDetails) {
    
    CommunitySpacePage.enterUserDetails(driver).sendKeys(userDetails);
}
@When("User enters {string} in the email text box")
public void user_enters_email_in_the_email_text_box(String email) {
    
    CommunitySpacePage.enterEmailAddress(driver).sendKeys(email);
}
@When("User selects {string} from the domain dropdown")
public void user_selects_domain_from_the_domain_dropdown(String domain) {
    
    BrowserUtilities.selectDropDownValue(CommunitySpacePage.selectDomain(driver), domain);
}
@Then("User clicks the Submit button")
public void user_clicks_the_submit_button() {
    BrowserUtilities.clickingButton(CommunitySpacePage.submitButton(driver));
    
    
}

@Then("User clicks the ok button in the alert box")
public void user_clicks_the_ok_button_in_the_alert_box() {
    BrowserUtilities.sleep(5);
    driver.switchTo().alert().accept();
    BrowserUtilities.sleep(5);
}

@When("User clicks View all Suggestions button")
public void user_clicks_view_all_suggestions_button() {
    
    BrowserUtilities.clickingButton(CommunitySpacePage.clickViewAllSuggestionsButton(driver));
}

@When("User should see the Title displayed")
public void user_should_see_the_title_displayed() {
    CommunitySpacePage.suggestionsTableTitle(driver).isDisplayed();
    
}
@When("User should see the Description comment displayed")
public void user_should_see_the_description_comment_displayed() {
    
    CommunitySpacePage.suggestionsTableDescription(driver).isDisplayed();
}
@When("User should see the Category comment displayed")
public void user_should_see_the_category_comment_displayed() {
    CommunitySpacePage.suggestionsTableCategory(driver).isDisplayed();
    
}
@When("User should see the Tags comment displayed")
public void user_should_see_the_tags_comment_displayed() {
    CommunitySpacePage.suggestionsTableTags(driver).isDisplayed();
    
}




}
