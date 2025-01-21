package com.fdmgroup.Main_Dashboard.step_definitions;

import com.fdmgroup.Hooks.Hooks;
import com.fdmgroup.Main_Dashboard.pages.Footer;
import com.fdmgroup.Utilities.BrowserUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VirtualNetworkEventsStepDefinition extends BrowserUtilities {

    

    @When("User clicks on the virtual networking events button in the footer")
public void user_clicks_on_the_virtual_networking_events_button_in_the_footer() {
    Hooks.clickingButton(Footer.VirtualNetworkEvents(driver));
}
@Then("User should be navigated to the virtual networking events page")
public void user_should_be_navigated_to_the_virtual_networking_events_page() {
    // BrowserUtilities.verificationOfPage(PageURLs.VirtualNetworkingEvents);

    // Unable to be used because it will asked you to log into your FDM microsoft teams account that requires two factor authentication. 
    // I will leave this here context for future reference.
    // This step definition will remain as is in order to show the functionality of the test. 
}

    
}
