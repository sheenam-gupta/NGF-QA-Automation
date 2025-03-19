package com.fdmgroup.resrev.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.HomePage;
import com.fdmgroup.iprep.pages.IprepPageOne;
import com.fdmgroup.resrev.pages.ResRevPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.fdmgroup.Main_Dashboard.pages.HomePage.getColorDarkModeOn;
import static com.fdmgroup.data.Main_DataFile.BACKGROUND_COLOR_DK_MD;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResRevStepDefinition {

    private final ResRevPage resRevPage = new ResRevPage();
    private final HomePage homePage = new HomePage();
    private final int delay = 1000;
    private final float scale = 1.0f;

    @When("User clicks explores Keyword matching button")
    public void user_clicks_explores_keyword_matching_button() {
        resRevPage.clickKeywordMatchingButton();
        sleep(scale);
    }

    @Then("Dark mode is enabled for ResRev submodule page")
    public void dark_mode_is_enabled_for_res_rev_submodule_page() {
        assertTrue(HomePage.isDarkModeIconEnabled());
        ResRevPage resRevPage = new ResRevPage();
        assertTrue(resRevPage.isResRevTextDisplayed());
    }

    @When("User clicks explore Sample Resume button")
    public void user_clicks_explore_sample_resume_button() {
        resRevPage.clickSampleResumeButton();
        sleep(scale);
    }

    @Then("Dark mode is on and dark mode icon is enabled for ResRev Pages")
    public void dark_mode_is_on_dark_mode_icon_is_enabled_for_resrev_pages() {
        assertTrue(resRevPage.isDarkModeIconEnabled());
        assertEquals(BACKGROUND_COLOR_DK_MD,getColorDarkModeOn());
    }

    private void sleep(float scale) {
        try {
            Thread.sleep((int) (scale * delay));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("User navigates to Sample Resume")
    public void user_navigates_to_Sample_Resume() {
        homePage.clickPage2Button();
        homePage.clickExploreResRevButton();
        resRevPage.clickSampleResumeButton();
        resRevPage.isClickToDownloadPresent();     
    }
    
    @Then("User validates download feature works as intended")
    public void user_validates_download_feature_works_as_intended() throws IOException {
    	
    	resRevPage.clickDownloadResumeButton();
    	resRevPage.validateAlertMessage();
    	// Define the expected file name and path
        String expectedFileName = "FDM-SoftwareEngineering.docx";
        Path downloadPath = Paths.get("/Users/besiratmelaku/Downloads/", expectedFileName);
        
        // Wait for the file to be downloaded
        sleep(scale);

        // Check if the file exists
        if (Files.exists(downloadPath)) {
            System.out.println("File downloaded successfully: " + expectedFileName);
        } else {
            System.out.println("File download failed: " + expectedFileName);
        }   		
    }
}
    
    
