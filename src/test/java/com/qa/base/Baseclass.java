package com.qa.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utilities.AppConfigurations;

public class Baseclass {
public WebDriver driver;
	
	public WebDriver initializeDriver() throws NumberFormatException, InterruptedException, IOException {

		String browser =AppConfigurations.getProperty("Browser");

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",AppConfigurations.getProperty("ChromeDriverpath") );
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get(AppConfigurations.getProperty("AppUrl"));

			Thread.sleep(3005);

			driver.manage().window().maximize();

		}

		return driver;

	}

public void closeDriver() {
		driver.close();

	}

	public void closeAllDriver() {
		driver.quit();

	}
}


