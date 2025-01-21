package com.fdmgroup.Main_Dashboard.step_definitions;


import com.fdmgroup.Main_Dashboard.pages.Header;
import com.fdmgroup.Utilities.BrowserUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAuthenticationBetweenTabs extends BrowserUtilities {
    @When("User opens a new tab")
public void user_opens_a_new_tab() {
    BrowserUtilities.openNewTab();



}
@Then("User should be logged in on the new tab")
public void user_should_be_logged_in_on_the_new_tab() {
    Header.logoutButton(driver).isDisplayed();
}

}
