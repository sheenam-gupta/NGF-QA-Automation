package com.fdmgroup.onboardingnavigator.step_defintions;

import com.fdmgroup.onboardingnavigator.pages.HomeOnboardingNavigatorPage;

import static com.fdmgroup.data.OnboardingNavigator_DataFile.ONBOARDING_TITLE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.Utilities.DriverUtilities;
import com.fdmgroup.data.OnboardingNavigator_DataFile;
import com.fdmgroup.onboardingnavigator.pages.OnboardingPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class OnboardingStepDefinition {

	private DriverUtilities driverUtilities;
	private WebDriver driver;
	private final OnboardingPage onboardingPage = new OnboardingPage();
	private final int delay = 1000;
	private final float scale = 0.3f;
	private final HomeOnboardingNavigatorPage homeOnboardingNavigatorPage = new HomeOnboardingNavigatorPage();



	@Given("User is on the ngf onboarding navigator page")
	public void user_is_on_the_ngf_onboarding_navigator_page() {
		sleep(scale);
		homeOnboardingNavigatorPage.clickOnboardingMenuButton();
		assertTrue(onboardingPage.isOnboardingPageWelcomeTextAccurate(ONBOARDING_TITLE));
	}

	@When("User clicks on the Tech setup link")
	public void user_clicks_on_the_tech_setup_link() {
		sleep(scale);
		onboardingPage.clickTechSetupButtonButton();

	}

	@When("User clicks on ngf members spreadsheet and see new tab open")
	public void user_clicks_on_ngf_members_spreadsheet_and_see_new_tab_open() {
		assertTrue(homeOnboardingNavigatorPage.isNgfMemberSheetLinkAble());
	}
	@When("User clicks git setup and see details")
	public void user_clicks_git_setup_and_see_details() {
		
		homeOnboardingNavigatorPage.clickGitSetupTabButton();
		assertTrue(homeOnboardingNavigatorPage.isGitSetupTabOpens(OnboardingNavigator_DataFile.GIT_SETUP_TITLE));
	}
	@Then("User clicks glossary and see summary")
	public void user_clicks_glossary_and_see_summary() {
		//sleep(scale);
		homeOnboardingNavigatorPage.clickGlossaryTabButton();
		assertTrue(homeOnboardingNavigatorPage.isGlossaryTabOpens(OnboardingNavigator_DataFile.GLOSSORY_TITLE));
	}
	
	
	
	@Given("User is on the onboarding home page submodule")
	public void user_is_on_the_onboarding_home_page_submodule() {
		//driver.navigate().to("http://localhost:4209/assets/html/index.html");
		assertEquals(onboardingPage.getTitlePage(), OnboardingNavigator_DataFile.ONBOARDING_HOME_TITLE);
	}

	@When("User navigates to git page")
	public void user_navigates_to_git_page() {
		onboardingPage.clickGitButton();
	}

	@When("User clicks on the install Git link")
	public void user_clicks_on_the_install_git_link() {
		onboardingPage.clickGitInstallationLink();
	}

	@Then("User should be navigated to git downloads website")
	public void user_should_be_navigated_to_git_downloads_website() {
		sleep((int) scale * delay * 5);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String actualGitUrl = onboardingPage.getPageURL(driver);
		assertTrue(actualGitUrl.contains(OnboardingNavigator_DataFile.GIT_DOWNLOAD_URL));
		driver.close();
	}

	@Then("User clicks on the NGF apps repositories link")
	public void user_clicks_on_the_ngf_apps_repositories_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickNgfAppRepositoryLink();
	}

	@Then("User should be navigated to NGF Git Repository website")
	public void user_should_be_navigated_to_ngf_git_repository_website() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String actualGitLabUrl = onboardingPage.getPageURL(driver);
		assertTrue(actualGitLabUrl.contains(OnboardingNavigator_DataFile.GIT_FDM_PAGE));
		driver.close();
	}

	@Then("User navigates to python scripts video")
	public void user_navigates_to_python_scripts_video() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickPythonScriptsVideo();
		sleep(0.5f);
	}

	@Then("User should be navigated to the python scripts video fdm page")
	public void user_should_be_navigated_to_the_python_scripts_video_fdm_page() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String actualUrl = onboardingPage.getPageURL(driver);
		assertTrue(actualUrl.contains(OnboardingNavigator_DataFile.FDM_GROUP));
		driver.close();
	}

	@Then("User clicks on the Git Branching Strategy Link")
	public void user_clicks_on_the_git_branching_strategy_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickGitBranchingStrategyLink();
	}

	@Then("User should be navigated to the Git Branching Page")
	public void user_should_be_navigated_to_the_git_branching_page() {
		assertTrue(onboardingPage.isGitBranchingTitlePageCorrect(OnboardingNavigator_DataFile.GIT_STRATEGY_PAGE_TITLE));
	}

	@When("User Navigates to BackEnd page")
	public void user_navigates_to_back_end_page() {
		onboardingPage.clickBackEndButton();
	}

	@When("User clicks on the Java11 installation link")
	public void user_clicks_on_the_java11_installation_link() {
		onboardingPage.clickJava11InstallationLink();
	}

	@Then("User navigates to Java11 installation page")
	public void user_navigates_to_java11_installation_page() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String actualJavaUrl = onboardingPage.getPageURL(driver);
		assertTrue(actualJavaUrl.contains(OnboardingNavigator_DataFile.JAVA_11_17_LINK));
		driver.close();
	}

	@When("User clicks on the Java17 installation link")
	public void user_clicks_on_the_java17_installation_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickJava17InstallationLink();

	}

	@Then("User navigates to Java17 installation page")
	public void user_navigates_to_java17_installation_page() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String actualJavaUrl = onboardingPage.getPageURL(driver);
		assertTrue(actualJavaUrl.contains(OnboardingNavigator_DataFile.JAVA_11_17_LINK));
		driver.close();
	}

	@Then("User clicks on the IDE Installation")
	public void user_clicks_on_the_ide_installation() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickSpringBootInstallationLink();
		sleep(scale);
	}

	@Then("User navigates to the STS4 IDE page")
	public void user_navigates_to_the_sts4_ide_page() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String actualSpringBootUrl = onboardingPage.getPageURL(driver);
		assertTrue(actualSpringBootUrl.contains(OnboardingNavigator_DataFile.SPRINGBOOT_URL));
		driver.close();
	}

	@Then("User clicks on the Download Lombok page")
	public void user_clicks_on_the_download_lombok_page() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickDownloadLombokLink();
	}

	@Then("User navigates to the Lombok downloads website")
	public void user_navigates_to_the_lombok_downloads_website() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String actualLombokDownloadUrl = onboardingPage.getPageURL(driver);
		assertTrue(actualLombokDownloadUrl.contains(OnboardingNavigator_DataFile.LOMBOK_LINKS));
		driver.close();
	}

	@Then("User clicks on Install Lombok")
	public void user_clicks_on_install_lombok() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickInstallLombokLink();
	}

	@Then("User navigates to the installation instructions Lombok website")
	public void user_navigates_to_the_installation_instructions_lombok_website() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String actualLombokInstallationUrl = onboardingPage.getPageURL(driver);
		assertTrue(actualLombokInstallationUrl.contains(OnboardingNavigator_DataFile.LOMBOK_LINKS));
		driver.close();
	}

	@Then("User clicks on the Maven Repository Link")
	public void user_clicks_on_the_maven_repository_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickMvnRepositoryLink();
	}

	@Then("User navigates to the Maven Repository Website")
	public void user_navigates_to_the_maven_repository_website() {
		sleep(0.5f);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String actualMvnRepositoryUrl = onboardingPage.getPageURL(driver);
		assertTrue(actualMvnRepositoryUrl.contains(OnboardingNavigator_DataFile.MVN_REPOSITORY));
		driver.close();
	}

	@Then("User clicks on the Setting up Lombok Link")
	public void user_clicks_on_the_setting_up_lombok_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickNoteDetailsLombokArticle();
		onboardingPage.clickSetUpLombokLink();
	}

	@Then("User navigates to the Lombok IDE Setup Website")
	public void user_navigates_to_the_lombok_ide_setup_website() {
		sleep(0.5f);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		String actualUrl = onboardingPage.getPageURL(driver);
		assertTrue(actualUrl.contains(OnboardingNavigator_DataFile.LOMBOK_SETUP_LINK));
		driver.navigate().back();
	}

	@Then("User clicks on the Setup database link")
	public void user_clicks_on_the_setup_database_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickDatabaseSetupLink();
	}

	@Then("User navigates to the Database page")
	public void user_navigates_to_the_database_page() {
		assertTrue(onboardingPage.isDataBasePageTitleCorrect(OnboardingNavigator_DataFile.DATABASE_PAGE));
	}

	@When("User clicks on the Onboarding Database page button")
	public void user_clicks_on_the_onboarding_database_page_button() {
		onboardingPage.clickDataBaseButton();
	}

	@When("User clicks on the Install MySQL link")
	public void user_clicks_on_the_install_my_sql_link() {
		onboardingPage.clickInstallMySqlLink();
	}

	@Then("User navigates to the MySQL installation website")
	public void user_navigates_to_the_my_sql_installation_website() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String mySqlUrl = onboardingPage.getPageURL(driver);
		assertTrue(mySqlUrl.contains(OnboardingNavigator_DataFile.MYSQL_PAGE));
		driver.close();
	}

	@Then("User clicks on the MySQL workbench link")
	public void user_clicks_on_the_my_sql_workbench_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickInstallMySqlWorkBenchLink();
	}

	@Then("User navigates to the MySQL workbench website")
	public void user_navigates_to_the_my_sql_workbench_website() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String mySqlWorkBenchUrl = onboardingPage.getPageURL(driver);
		assertTrue(mySqlWorkBenchUrl.contains(OnboardingNavigator_DataFile.MYSQL_WORKBENCH));
		driver.close();
	}

	@Then("User clicks on the NGF FDM database script link")
	public void user_clicks_on_the_ngf_fdm_database_script_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickDatabaseScriptLink();
	}

	@Then("User navigates to the NGF FDM database script link")
	public void user_navigates_to_the_ngf_fdm_database_script_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String dbScriptUrl = onboardingPage.getPageURL(driver);
		assertTrue(dbScriptUrl.contains(OnboardingNavigator_DataFile.FDM_GROUP));
		driver.close();
	}

	@Then("User clicks on the FrontEnd setup Page")
	public void user_clicks_on_the_front_end_setup_page() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickFrontEndSetupLink();
	}

	@Then("User navigates to the FrontEnd Page")
	public void user_navigates_to_the_front_end_page() {
		assertTrue(onboardingPage.isFrontendPageTitleCorrect(OnboardingNavigator_DataFile.FRONTEND_PAGE_TITLE));
	}

	@When("User navigates to the NGF Onboarding FrontEnd page")
	public void user_navigates_to_the_ngf_onboarding_front_end_page() {
		onboardingPage.clickOnboardingFrontEndButton();
	}

	@When("User clicks on the VS Code Installation link")
	public void user_clicks_on_the_vs_code_installation_link() {
		onboardingPage.clickVSCodeInstallationLink();
	}

	@Then("User navigates to the VS Code Installation page")
	public void user_navigates_to_the_vs_code_installation_page() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String vsCodeUrl = onboardingPage.getPageURL(driver);
		assertTrue(vsCodeUrl.contains(OnboardingNavigator_DataFile.VSCODE_LINK));
		driver.close();
	}

	@Then("User clicks on the NodeJS Installation Link")
	public void user_clicks_on_the_node_js_installation_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickNodeJsInstallationLink();
		sleep(0.5f);
	}

	@Then("User navigates to the NodeJS Installation page")
	public void user_navigates_to_the_node_js_installation_page() {
		sleep(scale);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String nodeJsUrl = onboardingPage.getPageURL(driver);
		assertTrue(nodeJsUrl.contains(OnboardingNavigator_DataFile.NODEJS_LINK));
		driver.close();
	}

	@Then("User clicks on the Angular CLI installation link")
	public void user_clicks_on_the_angular_cli_installation_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickAngularCliInstallationLink();
	}

	@Then("User navigates to the Angular CLI Installation Page")
	public void user_navigates_to_the_angular_cli_installation_page() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String angularUrl = onboardingPage.getPageURL(driver);
		assertTrue(angularUrl.contains(OnboardingNavigator_DataFile.ANGULAR_LINK));
		driver.close();
	}

	@Then("User clicks on the NGF git repository cloning link")
	public void user_clicks_on_the_ngf_git_repository_cloning_link() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		onboardingPage.clickNgfGitRepositoryLink();
	}

	@Then("User navigates to the Onboarding Git Page")
	public void user_navigates_to_the_onboarding_git_page() {
		assertTrue(onboardingPage.isGitPageTitleCorrect(OnboardingNavigator_DataFile.GIT_SETUP_TITLE));
	}

	@Then("User clicks on the Running the NGF Project link")
	public void user_clicks_on_the_running_the_ngf_project_link() {
		driver.navigate().back();
		onboardingPage.clickRunNgfProjectLink();
	}

	@Then("User navigates to the running NGF Page")
	public void user_navigates_to_the_running_ngf_page() {
		onboardingPage.isRunningNgfPageTitleCorrect(OnboardingNavigator_DataFile.RUN_NGF_PAGE_TITLE);
	}

	@When("User navigates to the NGF Onboarding Glossary Page")
	public void user_navigates_to_the_ngf_onboarding_glossary_page() {
		onboardingPage.clickGlossaryButton();
	}

	@Then("User is able to see the Onboarding Page Glossary List")
	public void user_is_able_to_see_the_onboarding_page_glossary_list() {
		assertTrue(onboardingPage.isGlossaryPageCorrect(OnboardingNavigator_DataFile.GLOSSARY_PAGE_STATEMENT));
	}
	
	@Given("User is on the ngf onboarding navigator page and verify")
	public void user_is_on_the_ngf_onboarding_navigator_page_and_verify() {
		homeOnboardingNavigatorPage.clickOnboardingMenuButton();
	//	assertTrue(onboardingPage.isOnboardingPageWelcomeTextAccurate(ONBOARDING_TITLE));
	}
	@When("User clicks on the Tech setup link and verify the link")
	public void user_clicks_on_the_tech_setup_link_and_verify_the_link() {
		homeOnboardingNavigatorPage.verifyTechSetupButton();
	}

	@When("User clicks on training checklist and verify the link")
	public void user_clicks_on_training_checklist_and_verify_the_link() {
	  homeOnboardingNavigatorPage.verifyTrainingChecklistButton();
	}

	@Then("User clicks the glossary and verify the link")
	public void user_clicks_the_glossary_and_verify_the_link() {
	    homeOnboardingNavigatorPage.verifyGlossaryButton();
	}

	private void sleep(float scale) {
		try {
			Thread.sleep((int) (scale * delay));

		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
