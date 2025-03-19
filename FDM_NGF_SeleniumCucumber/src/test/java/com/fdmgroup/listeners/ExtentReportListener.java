package com.fdmgroup.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ExtentReportListener {

	private static ExtentReports extent;
	private static ExtentTest test;
	// private static WebDriver driver; // WebDriver instance

	static {
		// Set up ExtentReports with HTML output
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Reports/Sprint20/Sprint20_cucumber.html");
		// ExtentHtmlReporter htmlReporter = new
		// ExtentHtmlReporter("Reports/Sprint20/Sprint20_cucumber.html");
		extent = new ExtentReports();
		// extent.attachReporter(htmlReporter);
		extent.attachReporter(htmlReporter);

	}

	@Before
	public void beforeScenario(Scenario scenario) {
		test = extent.createTest(scenario.getName());
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			test.fail("Scenario failed");
		} else {
			test.pass("Scenario passed");
		}
		extent.flush();
	}

	/*
	 * public static void createTest(String scenarioName) { // Create a new test for
	 * each scenario test = extent.createTest(scenarioName); }
	 */
}
