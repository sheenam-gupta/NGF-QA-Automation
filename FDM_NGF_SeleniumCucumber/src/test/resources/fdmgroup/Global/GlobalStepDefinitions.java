package com.fdmgroup.Global;

import com.fdmgroup.Main_Dashboard.pages.Header;
import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.data.PageURLs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class GlobalStepDefinitions extends BrowserUtilities {
     @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        BrowserUtilities.verificationOfPage(PageURLs.HomePage);
    }

    
    @When("User navigates to the log in page")
    public void user_navigates_to_the_log_in_page() {
        BrowserUtilities.clickingButton(Header.loginButton(driver));

    }

    @When("User enters their username and password and clicks the log in button")
    public void user_enters_their_username_and_password_and_clicks_the_log_in_button() {
        BrowserUtilities.loginSteps();
    }

}
