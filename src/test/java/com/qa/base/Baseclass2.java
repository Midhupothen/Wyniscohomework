package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Baseclass2 {
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
 
  public void setup(String br){
		if (br.equals("chrome")){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("---headless");
			WebDriverManager.chromeDriver().setup();
			driver =new ChromeDriver(options);
		}
  }
}
