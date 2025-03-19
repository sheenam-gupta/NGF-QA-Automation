package com.fdmgroup.testrunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/Features", glue = "com.fdmgroup",
        plugin = {
            "pretty",
			"json:Reports/Sprint20/Sprint20_cucumber.json",
			"junit:Reports/Sprint20/Sprint20_cucumber.junit",
			//"html:Reports/Sprint20/Sprint20_cucumber.html"
			  //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			"com.cucumber.listener.ExtentCucumberFormatter:Reports/Sprint20/Sprint20_cucumber.html"
        }, dryRun = false, publish = true, monochrome = false,
            // Remember if you are using a logging in method, to change the log in data in the data folder under "Log In Data" 
            // and use the log in method in the browser utilities class
            //Place the necessary tag below to run the test
            // Introduce And User enters their username and password and clicks the log in button to your cucumber feature file
            tags="@RiskAssessor"
)
public class TestRunner {

}
