package com.fdmgroup.Main_Dashboard.step_definitions;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Main_Dashboard.pages.RegistrationPage;
import com.fdmgroup.Utilities.ConfigurationReader;
import com.fdmgroup.data.Register_DataFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class RegistrationStepDefinition {
	private HomePage homePage = new HomePage();
    private RegistrationPage registrationPage = new RegistrationPage();
    private final int delay = 1000;
    @Given("User is on the home page for registration")
    public void user_is_on_the_login_page() {
        homePage.navigateToUrl(ConfigurationReader.getProperty("config", "homePageURL"));
        assertEquals(registrationPage.getCurrentURL(), ConfigurationReader.getProperty("config", "homePageURL"));
    }
    @When("User navigates to registration page")
    public void user_clicks_login_button() throws InterruptedException {
        homePage.clickRegisterButton();
        Thread.sleep(delay);
    }
 
    @When("User enters full name {string} for registration")
    public void user_enters_full_name(String fullName) throws InterruptedException {
        registrationPage.enterFullName(fullName);
        Thread.sleep(delay);
    }
 
    @And("User enters email {string} for registration")
    public void user_enters_email(String email) throws InterruptedException {
        registrationPage.enterEmail(email);
        Thread.sleep(delay);
    }
 
    @And("User enters date of birth {string} for registration")
    public void user_enters_date_of_birth(String dob) throws InterruptedException {
        registrationPage.enterDob(dob);
        Thread.sleep(delay);
    }
 
    @And("User enters username {string} for registration")
    public void user_enters_username(String username) throws InterruptedException {
        registrationPage.enterUsername(username);
        Thread.sleep(delay);
    }
 
    @And("User enters password {string} for registration")
    public void user_enters_password(String password) throws InterruptedException {
        registrationPage.enterPassword(password);
        Thread.sleep(delay);
    }
    @And("User enters confirm password {string} for registration")
    public void user_enters_confirms_password(String confirmPassword) throws InterruptedException {
        registrationPage.enterConfirmPassword(confirmPassword);
        Thread.sleep(delay);
    }
 
    @And("User selects the {string} security question for registration")
    public void user_enters_security_question(String securityQuestionNumber) throws InterruptedException {
        registrationPage.enterSecurityQuestion(Integer.parseInt(securityQuestionNumber));
        Thread.sleep(delay);
    }
 
    @And("User enters security answer {string} for registration")
    public void user_enters_security_answer(String securityAnswer) throws InterruptedException {
        registrationPage.enterSecurityAnswer(securityAnswer);
        Thread.sleep(delay);
    }
 
    @And("User agrees to terms and conditions for registration")
    public void user_agrees_to_terms_and_conditions() throws InterruptedException {
        registrationPage.agreeToTerms();
        Thread.sleep(delay);
    }
 
    @And("User clicks on create account button for registration")
    public void user_clicks_on_create_account_button() throws InterruptedException {
        registrationPage.clickCreateAccountButton();
        Thread.sleep(delay);
    }
 
    @Then("User should be registered successfully")
    public void user_should_be_registered_successfully() throws InterruptedException {
        assertEquals(true, registrationPage.getResultMessage().contains("Successfully registered")); 
    }
    @Then("User should see an error message for duplicate username")
    public void user_should_see_error_message_for_duplicate_username() throws InterruptedException {
        assertEquals(true, registrationPage.getResultMessage().contains("Username")); 
    }

    @Then("User should see an error message for invalid username")
    public void user_should_see_error_message_for_short_username() throws InterruptedException {
    	registrationPage.clickBody();
        assertEquals(true, registrationPage.getErrorMessageForUsername().contains("5 characters")); 
    }
    @Then("User should see an error message for invalid fullname")
    public void user_should_see_error_message_for_short_fullName() throws InterruptedException {
    	registrationPage.clickBody();
        assertEquals(true, registrationPage.getErrorMesssageForFullName().contains("2 characters")); 
    }
    @Then("User should see an error message for invalid dob")
    public void user_should_see_error_message_for_invalid_dob() throws InterruptedException {
    	registrationPage.clickBody();
        //assertEquals(true, registrationPage.getErrorMessageForDob().contains("invalid"));
        sleep(1000);
        assertTrue(registrationPage.isInvalidDateOfBirthFeedbackPresent());
    }

    @Then("User should see an error message for short password")
    public void user_should_see_error_message_for_short_password() throws InterruptedException {
    	registrationPage.clickBody();
        assertEquals(true, registrationPage.getErrorMessageForPassword().contains("8 characters")); 
    }
    @Then("User should see an error message for incorrect confirm password")
    public void user_should_see_error_message_for_incorrect_confirm_password() throws InterruptedException {
    	registrationPage.clickBody();
        assertEquals(true, registrationPage.getErrorMessageForConfirmPassword().contains("match")); 
    }
    @Then("User should see an error message for empty security question")
    public void user_should_see_error_message_for_empty_security_question() throws InterruptedException {
    	registrationPage.clickBody();
        assertEquals(true, registrationPage.getErrorMessageForSecurityQuestion().contains("select")); 
    }
    @Then("User should see an error message for inavlid security answer")
    public void user_should_see_error_message_for_invalid_security_answer() throws InterruptedException {
    	registrationPage.clickBody();
        assertEquals(true, registrationPage.getErrorMessageForSecurityAnswer().contains("5 characters")); 
    }
    @Then("User should see an error message for unchecked terms & conditions")
    public void user_should_see_error_message_for_unchecked_terms_conditions() throws InterruptedException {
    	registrationPage.clickBody();
        assertEquals(true, registrationPage.getErrorMessageForAgreeToTerms().contains("agree"));
    }

    @When("User clicks on the terms, conditions and privacy policies link")
    public void user_clicks_on_the_terms_conditions_and_privacy_policies_link() {
        sleep(delay);
        registrationPage.clickTermsConditionsPrivacyPoliciesLink();
    }

    @Then("User should see the terms and conditions page")
    public void user_should_see_the_terms_and_conditions_page() {
        sleep(delay);
        assertTrue(registrationPage.isTermsAndConditionsHeaderDisplayed());
    }

    @Then("User should see the terms and conditions body")
    public void user_should_see_the_terms_and_conditions_body() {
        sleep(delay);
        assertTrue(registrationPage.isTermsAndConditionsBodyValid(Register_DataFile.TERMS_AND_CONDITIONS_BODY_LINE_1));
    }

    @Then("User should see the liability disclaimer")
    public void user_should_see_the_liability_disclaimer() {
        sleep(delay);
        assertTrue(registrationPage.isTermsAndConditionsBodyBottomTextValid(Register_DataFile.TERM_AND_CONDITIONS_BODY_LINE_2));
    }

    @Then("User should see the username is valid {string}")
    public void user_should_see_the_username_is_valid(String booleanInput) {
        boolean expected = Boolean.parseBoolean(booleanInput);
        assertEquals(expected, !registrationPage.isInvalidUsernameFeedbackPresent());
    }

    @When("User selects a security question")
    public void user_selects_a_security_question() {
        registrationPage.clickSecurityQuestionDropdown();
        sleep(delay);
    }
    @Then("User should see a dropdown menu containing the predefined security questions")
    public void user_should_see_a_dropdown_menu_containing_the_predefined_security_questions() {
        assertTrue(registrationPage.isSecurityQuestionDropdownContainingValidOptions());
    }
    @When("suggested password is displayed")
    public void suggested_password_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(registrationPage.isSuggestedPasswordDisplayed());
    }

    @When("suggested password meets the user password criteria")
    public void suggested_password_meets_the_user_password_criteria() 
    {
    	assertTrue(registrationPage.suggestedPasswordMeetExpectation());
    }
    

    @Then("User receives new password validation message {string} {string}")
    public void user_receives_new_password_validation_message(String string, String string2) {
        String[] message =registrationPage.getpasswordValidationMessages();
        assertEquals(message[0],string);
        assertEquals(message[1],string2);
    }


    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}