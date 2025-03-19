package com.fdmgroup.Main_Dashboard.step_definitions;

import com.fdmgroup.Main_Dashboard.pages.Footer;
import com.fdmgroup.Utilities.DriverUtilities;
import com.fdmgroup.data.Footer_Datafile;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static com.fdmgroup.data.Footer_Datafile.COPYRIGHT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FooterStepDefinition {

    private DriverUtilities driverUtilities;
    private WebDriver driver;
    private final Footer footer = new Footer();
    private final int delay = 1000;
    private final float scale = 0.5f;

    @Before
    public void setUp() {
        driverUtilities=DriverUtilities.getInstance();
        driver= driverUtilities.getDriver();
    }

    @When("User clicks on the contact us button on the footer")
    public void user_clicks_on_the_contact_us_button_on_the_footer() {
       sleep((int) scale * delay);
       footer.clickContactUsLink();
       sleep((int) scale * delay);
    }

    @Then("User should be navigated to the fdmgroup contact us page")
    public void user_should_be_navigated_to_the_fdmgroup_contact_us_page() {
        sleep((int) scale * delay * 5);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualUrl = footer.getPageURL(driver);
        assertEquals(Footer_Datafile.CONTACT_US_URL,actualUrl);
        assertTrue(actualUrl.contains(Footer_Datafile.CONTACT_US_PAGE_FDM));
    }

    @When("User clicks on the linkedin icon on the footer")
    public void user_clicks_on_the_linkedin_icon_on_the_footer() {
        sleep((int) scale * delay);
        footer.clickLinkedInLink();
        sleep((int) scale * delay);
    }
    @Then("User should be navigated to the fdmgroup linkedin page")
    public void user_should_be_navigated_to_the_fdmgroup_linkedin_page() {
        sleep((int) scale * delay * 5);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualLinkedUrl = footer.getPageURL(driver);
        assertTrue(actualLinkedUrl.contains(Footer_Datafile.LINKEDIN_PAGE_FDM));
    }

    @When("User clicks on the facebook icon on the footer")
    public void user_clicks_on_the_facebook_icon_on_the_footer() {
        sleep((int) scale * delay);
        footer.clickFacebookLink();
        sleep((int) scale * delay);
    }
    @Then("User should be navigated to the fdmgroup facebook page")
    public void user_should_be_navigated_to_the_fdmgroup_facebook_page() {
        sleep((int) scale * delay * 5);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualFacebookUrl = footer.getPageURL(driver);
        assertTrue(actualFacebookUrl.contains(Footer_Datafile.FACEBOOK_PAGE_FDM));
    }

    @When("User clicks on the x icon on the footer")
    public void user_clicks_on_the_x_icon_on_the_footer() {
        sleep((int) scale * delay);
        footer.clickTwitterLink();
        sleep((int) scale * delay);
    }

    @Then("User should be navigated to the fdmgroup x page")
    public void user_should_be_navigated_to_the_fdmgroup_x_page() {
        sleep((int) scale * delay * 5);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualXUrl = footer.getPageURL(driver);
        assertTrue(actualXUrl.contains(Footer_Datafile.X_PAGE_FDM));
    }

    @When("User clicks on the instagram icon on the footer")
    public void user_clicks_on_the_instagram_icon_on_the_footer() {
        sleep((int) scale * delay);
        footer.clickInstagramLink();
        sleep((int) scale * delay);
    }
    @Then("User should be navigated to the instagram page")
    public void user_should_be_navigated_to_the_instagram_page() {
        sleep((int) scale * delay * 5);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualInstagramUrl = footer.getPageURL(driver);
        assertTrue(actualInstagramUrl.contains(Footer_Datafile.INSTAGRAM_PAGE_FDM));
    }

    @When("User clicks on the tiktok icon on the footer")
    public void user_clicks_on_the_tiktok_icon_on_the_footer() {
        sleep((int) scale * delay);
        footer.clickTikTokLink();
    }
    @Then("User should be navigated to the tiktok page")
    public void user_should_be_navigated_to_the_tiktok_page() {
        sleep((int) scale * delay * 5);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        String actualTiktokUrl = footer.getPageURL(driver);
        assertTrue(actualTiktokUrl.contains(Footer_Datafile.TIKTOK_PAGE_FDM));
    }

    @Then("User should see copyright statements on the main page")
    public void user_should_see_copyright_statements_on_the_main_page() {
        sleep(scale);
        assertTrue(footer.isCopyRightTextCorrect(COPYRIGHT));
    }

        private void sleep(float scale) {
        try {
            Thread.sleep((int) (scale * delay));

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
