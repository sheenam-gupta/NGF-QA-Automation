package com.fdmgroup.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtilities extends ExcelUtilities {
	private static DriverUtilities driverUtilities;
	private WebDriver driver;
	protected JavascriptExecutor js;

	protected DriverUtilities() {
		super();
	}

	public void resetDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
			driverUtilities = null;
		}
	}
	public JavascriptExecutor getJsExecutor() {
		return js;
	}
	public static DriverUtilities getInstance() {
		if (driverUtilities == null) {
			driverUtilities = new DriverUtilities();
		}
		return driverUtilities;
	}

	public WebDriver getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}

    private void createDriver() {
        String driverName = ConfigurationReader.getProperty("config", "chromeBrowser");
        System.out.println(ConfigurationReader.getProperty("config", "chromeBrowser"));

        switch (driverName) {
		case "google chrome":
			this.driver = new ChromeDriver();
			break;
		case "firefox":
			this.driver = new FirefoxDriver();
			break;
		case "msedge":
			this.driver = new EdgeDriver();
			break;

		default:
			System.out.println("Browser name is invalid!!");
			break;

		}

	}
}
