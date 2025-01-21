package com.fdmgroup.Main_Dashboard.step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Main_Dashboard.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationFormRefinementStepDefination {
    private HomePage homePage = new HomePage();
    private RegistrationPage registrationPage = new RegistrationPage();
    

    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
  
        homePage.clickRegisterButton();
    }

    @When("User enters all required details")
    public void user_enters_all_required_details() throws InterruptedException {
        registrationPage.enterFullName("rbugje");
        registrationPage.enterEmail("johnan");
        registrationPage.enterDob("1990-01-11");
        registrationPage.enterUsername("rbugje");
        registrationPage.enterPassword("Password@123");
        registrationPage.enterConfirmPassword("Password@123");
        registrationPage.enterSecurityQuestion(2);
        registrationPage.enterSecurityAnswer("street");
        Thread.sleep(1000);
    }

    @When("User clicks the {string} button without accepting the terms and conditions")
    public void user_clicks_the_button_without_accepting_the_terms_and_conditions(String button) {
    	try {
            // Click the "Create NGF ID!" or the respective button
            registrationPage.clickCreateAccountButton(); // Adjust to your actual button click method

          
            String alertMessage = registrationPage.handleAlert(); // Get the text from the alert

            // Expected message when the terms are not accepted
            String expectedMessage = "You must agree to the terms and conditions."; // Adjust this as per your UI

            // Assert the alert message
            assertEquals("Alert message is not as expected", expectedMessage, alertMessage);

           
        } catch (UnhandledAlertException e) {
            // If alert is present and unexpected, handle it accordingly
            System.out.println("Unexpected alert: " + e.getMessage());
            throw e; // Re-throw the exception if you want the test to fail
        }
    }

 

  
}
