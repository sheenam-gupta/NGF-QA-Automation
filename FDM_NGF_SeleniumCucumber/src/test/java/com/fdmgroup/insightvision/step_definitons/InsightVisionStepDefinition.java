package com.fdmgroup.insightvision.step_definitons;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.insightvision.pages.InsightVisionPage;
import com.fdmgroup.iprep.pages.IprepPageOne;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.fdmgroup.Main_Dashboard.pages.HomePage.getColorDarkModeOn;
import static com.fdmgroup.data.Main_DataFile.BACKGROUND_COLOR_DK_MD;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InsightVisionStepDefinition {

    InsightVisionPage iVisionPage = new InsightVisionPage();

    @When("User clicks explore Data Visualization button")
    public void user_clicks_explore_data_visualization_button() {
        iVisionPage.clickDataVisualizationButton();
    }

    @Then("Dark mode is enabled for InsightVision submodule page")
    public void dark_mode_is_enabled_for_insight_vision_submodule_page() {
        assertTrue(HomePage.isDarkModeIconEnabled());
        assertTrue(iVisionPage.isInsightVisionTextDisplayed());
    }

    @Then("Dark mode is on and dark mode icon is enabled for InsightVision pages")
    public void dark_mode_is_on_dark_mode_icon_is_enabled_for_insightvision_pages() {
        assertTrue(iVisionPage.isDarkModeIconEnabled());
        assertEquals(BACKGROUND_COLOR_DK_MD,getColorDarkModeOn());
    }
}
