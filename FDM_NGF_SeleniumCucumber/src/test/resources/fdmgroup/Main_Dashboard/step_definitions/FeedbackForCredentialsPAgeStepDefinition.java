package com.fdmgroup.Main_Dashboard.step_definitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.Main_Dashboard.pages.Header;
import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Main_Dashboard.pages.LoginPage;
import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.data.Main_DataFile;
import com.fdmgroup.data.PageURLs;
import com.fdmgroup.data.Login.Login_data;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeedbackForCredentialsPAgeStepDefinition extends BrowserUtilities {
	LoginPage loginPage = new LoginPage();	

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
		BrowserUtilities.verificationOfPage(PageURLs.HomePage);
	}

	@When("User navigate to the log in page")
	public void user_navigates_to_the_log_in_page() {
		BrowserUtilities.clickingButton(Header.loginButton(driver));
	}

	@Then("Enter the incorrect username {string} and correct password {string} check the message")
	public void enter_the_incorrect_username_and_correct_password_check_the_message(String user, String pwd) {

		loginPage.enterUsername(user);
		loginPage.enterPassword(pwd);
		loginPage.clickLoginButton();
		assertEquals(loginPage.getErrorMessageForLogin(), Login_data.errorMessage);
	}

	@Then("Enter the correct username {string} and incorrect password {string} check the message")
	public void enter_the_correct_username_and_incorrect_password_check_the_message(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
		assertEquals(loginPage.getErrorMessageForLogin(), Login_data.errorMessage);
	}

	@Then("Enter the correct username {string} and correct password {string} check the message")
	  public void enter_the_correct_username_and_correct_password_check_the_message(String user, String pwd) {
		loginPage.enterUsername(user);
		loginPage.enterPassword(pwd);
		loginPage.clickLoginButton();
		assertEquals(HomePage.welcomeMessage(driver).getText(), Main_DataFile.WelcomeText);
	}
	
}