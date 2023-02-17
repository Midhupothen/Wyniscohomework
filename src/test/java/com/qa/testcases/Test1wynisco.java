package com.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Test1wynisco extends Baseclass {
  @Test
  public void setup() throws InterruptedException{
	  
WebElement morebutton = driver.findElement(By.xpath("//a[@class='more-link wsite-menu-item']"));
morebutton.click();
						 
	
	WebElement applybutton =driver.findElement(By.xpath("(//a[@href='/apply.html'])[2]"));
		//@FindBy(xpath = "//li[@id='pg811271640933592749' and @class='wsite-menu-item-wrap      wsite-nav-10']/child::a[@href='/apply.html']")
						 //li[@id='pg811271640933592749' and @class='wsite-menu-item-wrap       wsite-nav-10' ]/child::a[@href='/apply.html']  
	Thread.sleep(6000);
	applybutton.click();
	

	  
  }
}
