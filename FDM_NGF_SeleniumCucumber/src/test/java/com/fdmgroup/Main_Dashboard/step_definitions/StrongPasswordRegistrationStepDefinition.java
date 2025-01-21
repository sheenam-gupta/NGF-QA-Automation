package com.fdmgroup.Main_Dashboard.step_definitions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Main_Dashboard.pages.RegistrationPage;
import com.fdmgroup.Utilities.BrowserUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StrongPasswordRegistrationStepDefinition  extends BrowserUtilities {
    private HomePage homePage = new HomePage();
    private RegistrationPage registrationPage = new RegistrationPage();

    @When("User navigates to the registration page")
    public void user_navigates_to_the_registration_page() {
        homePage.clickRegisterButton();
    }

    @When("User is able to see the suggest password button")
    public void user_is_able_to_see_the_suggest_password_button() {
        RegistrationPage.suggestPasswordButton(driver).isDisplayed();   
    }

    @Then("User is able to click the button")
    public void user_is_able_to_click_the_button() {
       BrowserUtilities.clickingButton(RegistrationPage.suggestPasswordButton(driver));
    }

    @When("User is able to see a suggest password")
    public void user_is_able_to_see_a_suggest_password() {
        RegistrationPage.suggestedPassword(driver).isDisplayed();
    }

    @Then("user is able to verify it is at least eight characters, mix of upper case and lowercase, and at least one numeric and one special character")
    public void user_is_able_to_verify_it_is_at_least_eight_characters_mix_of_upper_case_and_lowercase_and_at_least_one_numeric_and_one_special_character() {

        WebElement passwordElement = RegistrationPage.suggestedPassword(driver);
        String password = passwordElement.getText();

        Assert.assertTrue("Password should be at least 8 characters long.", password.length() >= 8);

        Assert.assertTrue("Password should contain at least one uppercase letter.", Pattern.compile("[A-Z]").matcher(password).find());
        Assert.assertTrue("Password should contain at least one lowercase letter.", Pattern.compile("[a-z]").matcher(password).find());

        Assert.assertTrue("Password should contain at least one numeric character.", Pattern.compile("\\d").matcher(password).find());

        Assert.assertTrue("Password should contain at least one special character.", Pattern.compile("[^a-zA-Z0-9]").matcher(password).find());
    }
}


