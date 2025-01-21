package com.fdmgroup.ResCraft_Resource_Creator.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.ResCraft_Resource_Creator.pages.ResCraft_Module;
import com.fdmgroup.Utilities.BrowserUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Basic_UI_for_Resource_Creator_Module extends BrowserUtilities {

    @When("User navigates to the Resource Creator Module")
    public void user_navigates_to_the_resource_creator_module() {
        BrowserUtilities.clickingButton(HomePage.rightArrow(driver));
        BrowserUtilities.clickingButton(HomePage.rightArrow(driver));
        BrowserUtilities.clickingButton(HomePage.resCraftModule(driver));
    }

    @Then("User should be navigated to the Resource Creator Module page")
    public void user_should_be_navigated_to_the_resource_creator_module_page() {
        ResCraft_Module.welcomeMessage(driver).isDisplayed();
        ResCraft_Module.body(driver).isDisplayed();
        ResCraft_Module.body2(driver).isDisplayed();

    }
}
