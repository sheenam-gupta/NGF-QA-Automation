package com.fdmgroup.Main_Dashboard.step_definitions;

import static com.fdmgroup.data.Main_DataFile.INVALID_PASSWORD;
import static com.fdmgroup.data.Main_DataFile.VALID_PASSWORD;
import static com.fdmgroup.data.Main_DataFile.VALID_USERNAME;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Main_Dashboard.pages.LoginPage;
import com.fdmgroup.Utilities.ConfigurationReader;
import com.fdmgroup.data.Login.Login_data;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	private final HomePage homePage = new HomePage();
	private final LoginPage loginPage = new LoginPage();
	
	private final int delay = 2000;

	@Given("User is on the home page for login")
	public void user_is_on_the_login_page() {
		homePage.navigateToUrl(ConfigurationReader.getProperty("config", "homePageURL"));
		assertEquals(loginPage.getCurrentURL(), ConfigurationReader.getProperty("config", "homePageURL"));
	}

	@When("User navigates to login page")
	public void user_clicks_login_button() {
		homePage.clickLoginButton();
	}

	@And("User enters valid username")
	public void user_enters_valid_username() {
		//loginPage.enterUsername(VALID_USERNAME);
		loginPage.enterUsername(Login_data.UserName);
		sleep(delay);
	}
	
	@And("User enters invalid username")
	public void user_enters_invalid_username() {
		loginPage.enterUsername(VALID_USERNAME);
		sleep(delay);
	}

	@And("User enters valid password")
	public void user_enters_valid_password() {
		//loginPage.enterPassword(VALID_PASSWORD);
		loginPage.enterPassword(Login_data.Password);
		sleep(delay);
	}
	
	@And("User enters invalid password")
	public void user_enters_invalid_password() {
		loginPage.enterPassword(INVALID_PASSWORD);
		sleep(delay);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginButton();
		sleep(delay);
	}

	@Then("User should be logged in and see the homepage")
	public void user_should_be_logged_in_and_see_the_homepage() throws InterruptedException {
		assertEquals(Login_data.UserName, homePage.getUsername());
	}
	
	@Then("User should see an error message for invalid credentials")
	public void user_should_see_error_message_for_invalid_login() throws InterruptedException {

		assertTrue(loginPage.getErrorMessageForLogin().contains("Invalid"));
	}

	private void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
