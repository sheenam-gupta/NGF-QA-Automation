package com.fdmgroup.Hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.Utilities.BrowserUtilities;
import com.fdmgroup.Utilities.DriverUtilities;
import com.fdmgroup.Utilities.RestAssuredUtilities;
import com.fdmgroup.data.PageURLs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;


public class Hooks extends BrowserUtilities {
	public static RestAssuredUtilities restAssuredUtilities;
	public static ResponseOptions<Response> response;
	 

	@Before
	public void setUp() {
	    if (driver == null) {
	        driverUtilities = getInstance();
	        driver = driverUtilities.getDriver();
	        js = driverUtilities.getJsExecutor();
	        BrowserUtilities.maximizeWindow();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        restAssuredUtilities = RestAssuredUtilities.getInstance();
	    }
	    driver.get(PageURLs.HomePage);
	}

	public WebDriver getDriver() {
        return driver;
    }
/*
	@After
	public static void resetDriverAfterTestRuns() {
		driverUtilities.resetDriver();
		if (restAssuredUtilities != null) {
            restAssuredUtilities.resetUtilities();
		}

	}
	*/
	
	
	    
	@After
	public void resetDriverAfterTestRuns() {
	    if (driver != null) {
	        System.out.println("Resetting WebDriver...");
	        driver.quit(); // Ensure the driver quits here
	        driver = null;  // Reset to null to avoid any further usage
	    }
	    if (driverUtilities != null) {
	        driverUtilities.resetDriver();
	    }
	    if (restAssuredUtilities != null) {
	        restAssuredUtilities.resetUtilities();
	    }
	}
	
	@AfterStep
	public static void screenshotAndWaitAfterStep(Scenario sc) throws IOException {
		BrowserUtilities.sleep(0.5);
	
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		byte[] screenshot = scrShot.getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshot, "image/png", "Test step is finished");
	}


	/* 
	@AfterAll
	public static void tearDown() {
		driver.quit();
	}
*/
	
	  
	@Given("I perform authentication operation for {string} with body")
	public void i_perform_authentication_operation_for_with_body(String uri, DataTable table) {
		var data = table.asMaps();

		HashMap<String, String> body = new HashMap<>();
		for (Map<String, String> items : data) {
			body.put("username", items.get("username"));
			body.put("password", items.get("password"));
		}

		Hooks.restAssuredUtilities.setMethod("POST");
		Hooks.restAssuredUtilities.setUrl(uri);

		String token = Hooks.restAssuredUtilities.authenticate(body);
		Hooks.restAssuredUtilities.setToken(token);
	}

	

	

}
