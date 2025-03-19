package com.fdmgroup.Main_Dashboard.step_definitions;

import org.junit.Assert;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Main_Dashboard.pages.PreferencePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PreferenceMenuStepDefination {

	HomePage home = new HomePage();
	PreferencePage preference = new PreferencePage();
	String username;

	@Given("a logged-in user with an active session")
	public void a_logged_in_user_with_an_active_session() {
		username = home.getUsername();

		Assert.assertEquals("test1", username);
	}

	@When("the user navigates to the {string} page")
	public void the_user_navigates_to_the_page(String string) throws InterruptedException {
		home.hoverSettingGearIcon();
		home.clickPreferenceTab();
		Thread.sleep(2000);
	}

	@Then("the user should see options to update {string}")
	public void the_user_should_see_options_to_update(String string) {
		// preference.clickDarkMode();
		preference.darkModeSwitchExists();
	}

	@Then("the options should reflect the user's current settings")
	public void the_options_should_reflect_the_user_s_current_settings() {
		preference.prefernecePageIsDisplayed();
	}

	@Given("placeholders for {string} and {string} are prepared")
	public void placeholders_for_and_are_prepared(String string, String string2) {
		preference.changePasswordIsDisplayed();
		preference.contactEmailHeadingIsDisplayed();
	}

	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		preference.hoverSettingIcon();
		preference.clickLogoutButton();

	}

}
