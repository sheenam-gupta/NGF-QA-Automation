package com.fdmgroup.Main_Dashboard.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.Header;
import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.Main_Dashboard.pages.LoginPage;
import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.Utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.fdmgroup.Main_Dashboard.pages.HomePage.getColorDarkModeOn;
import static com.fdmgroup.data.Main_DataFile.BACKGROUND_COLOR_DK_MD;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeStepDefinition extends BrowserUtilities {
    private final int delay = 1000;
    private final HomePage homePage = new HomePage();
    private final LoginPage loginPage = new LoginPage();
    private final float scale = 2.0f;

    @When("User navigates to IPrep Module")
    public void user_navigates_to_i_prep_module() {
        sleep((int) scale * delay);
        homePage.clickExploreIPrepButton();
        sleep((int) scale * delay);
    }

    @When("User clicks explore ResRev button")
    public void user_clicks_explore_res_rev_button() {
        sleep((int) scale * delay);
        homePage.clickPage2Button();
        homePage.clickExploreResRevButton();
        sleep((int) scale * delay);
    }

    @When("User clicks explore InsureTech button")
    public void user_clicks_explore_insure_tech_button() {
        sleep((int) scale * delay);
        homePage.clickPage2Button();
        homePage.clickExploreInsureTechButton();
        sleep((int) scale * delay);
    }

    @When("User clicks explore InsightVision button")
    public void user_clicks_explore_insight_vision_button() {
        sleep((int) scale * delay);
        homePage.clickPage2Button();
        homePage.clickExploreInsightVisionButton();
        sleep((int) scale * delay);
    }

    @Given("User is on the home page and not logged in")
    public void user_is_on_the_home_page_and_not_logged_in() {
        sleep((int) scale * delay);
        if (homePage.isLogoutButtonPresent()) {
            homePage.clickLogoutButton();
        }
        sleep((int) scale * delay);
        assertTrue(homePage.isRegisterButtonPresent());
    }

    @Given("User navigates to register page")
    public void user_navigates_to_register_page() {
        sleep((int) scale * delay);
        homePage.clickRegisterButton();
    }

    @When("User clicks on Home button")
    public void user_clicks_on_home_button() {
        homePage.clickHomeButton();
    }

    @Then("User is navigated to the NGF home page")
    public void user_is_navigated_to_the_ngf_home_page() {
        assertEquals(loginPage.getCurrentURL(), ConfigurationReader.getProperty("config", "homePageURL"));
    }

    @When("User goes back to Master Dashboard")
    public void user_goes_back_to_master_dashboard() {
        BrowserUtilities.clickingButton(Header.findMasterDashBoardButton(driver));
    }

    @When("User toggles dark mode button on")
    public void user_toggles_dark_mode_button_on() {
        homePage.clickDarkModeCheckBox();
    }
    @Then("Dark mode is on and dark mode icon is enabled")
    public void user_dark_mode_is_on_and_dark_mode_icon_is_enabled() {
        assertTrue(HomePage.isDarkModeIconEnabled());
        assertEquals(BACKGROUND_COLOR_DK_MD,getColorDarkModeOn());
    }

        private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
