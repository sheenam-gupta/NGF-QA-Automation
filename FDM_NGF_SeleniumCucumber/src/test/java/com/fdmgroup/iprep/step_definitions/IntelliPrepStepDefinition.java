package com.fdmgroup.iprep.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.Header;
import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.iprep.pages.IprepPageOne;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.fdmgroup.Main_Dashboard.pages.HomePage.getColorDarkModeOn;
import static com.fdmgroup.data.Main_DataFile.BACKGROUND_COLOR_DK_MD;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntelliPrepStepDefinition {

    private final IprepPageOne iprepPageOne = new IprepPageOne();
    private final int delay = 1000;
    private final float scale = 2.0f;
    @When("User navigates to the Interview Guidance page")
    public void user_navigates_to_the_interview_guidance_page() {
        sleep(scale);
        iprepPageOne.clickExploreInterviewTipsButton();
        sleep(scale);
        iprepPageOne.clickLaunchButton();
    }

    @When("User navigates to the simulate interview page")
    public void user_navigates_to_the_simulate_interview_page() {
        iprepPageOne.clickExploreSimulateInterviewButton();
        sleep(scale);
        iprepPageOne.clickLaunchButton();
    }

    @When("User navigates to Mock Exam page")
    public void user_navigates_to_the_mock_exam_page() {
        iprepPageOne.clickExploreMockExamButton();
        sleep(scale);
        iprepPageOne.clickLaunchButton();
    }

    @Then("Dark mode is enabled for IPrep submodule page")
    public void dark_mode_is_enabled_for_i_prep_submodule_page() {
        assertTrue(HomePage.isDarkModeIconEnabled());
        IprepPageOne iprepPage = new IprepPageOne();
        assertTrue(iprepPage.isIprepTextDisplayed());
    }

    @Then("Dark mode is on and dark mode icon is enabled for IPrep submodule page")
    public void dark_mode_is_on_dark_mode_icon_i_enabled_for_i_prep_submodule_page() {
        assertTrue(iprepPageOne.isDarkModeIconEnabled());
        assertEquals(BACKGROUND_COLOR_DK_MD,getColorDarkModeOn());
    }

    private void sleep(float scale) {
        try {
            Thread.sleep((int) (delay * scale));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
