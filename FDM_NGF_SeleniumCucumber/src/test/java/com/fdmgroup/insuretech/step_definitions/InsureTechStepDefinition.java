package com.fdmgroup.insuretech.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.insuretech.pages.InsureTechPage;
import com.fdmgroup.iprep.pages.IprepPageOne;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.fdmgroup.Main_Dashboard.pages.HomePage.getColorDarkModeOn;
import static com.fdmgroup.data.Main_DataFile.BACKGROUND_COLOR_DK_MD;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InsureTechStepDefinition {

    private final InsureTechPage insureTechPage = new InsureTechPage();
    private final int delay = 1000;
    private final float scale = 1.0f;
    @When("User clicks explores AI Risk Assessor button")
    public void user_clicks_explores_ai_risk_assessor_button() {
        insureTechPage.clickAiRiskAssessorButton();
        sleep(scale);
    }

    @Then("Dark mode is enabled for InsureTech submodule page")
    public void dark_mode_is_enabled_for_insure_tech_submodule_page() {
        assertTrue(HomePage.isDarkModeIconEnabled());
        assertTrue(insureTechPage.isInsureTechTextDisplayed());
    }

    @Then("Dark mode is on and dark mode icon is enabled for InsureTech Pages")
    public void dark_mode_is_on_dark_mode_icon_is_enabled_for_insuretech_pages() {
        assertTrue(insureTechPage.isDarkModeIconEnabled());
        assertEquals(BACKGROUND_COLOR_DK_MD,getColorDarkModeOn());
    }

    private void sleep(float scale) {
        try {
            Thread.sleep((int) (scale * delay));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
