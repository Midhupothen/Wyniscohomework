package com.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Test2wynisco extends Baseclass{
public WebDriver driver;
  @Test(priority=1)
  public void textform() throws InterruptedException {
	  Test1wynisco objform =new Test1wynisco();
	  objform.setup();
	  Thread.sleep(9000);
  }
	  @Test(priority=2)
	  public void form(){
	  WebElement firstNameTextBox=driver.findElement(By.xpath ("//input[@id='First_Name']"));
	  firstNameTextBox.sendKeys("Test");
	

	  WebElement lastnameTextBox=driver.findElement(By.xpath("//input[@id ='Last_Name']"));
		lastnameTextBox.sendKeys("test1");

		WebElement emailTextBox= driver.findElement(By.xpath("//input[@id='Email']"));
		emailTextBox.sendKeys("test@gmail.com");

		WebElement mobileTextBox =driver.findElement(By.xpath("//input[@id='Mobile']"));
		mobileTextBox.sendKeys("12345");
		
		WebElement dropdownbutton=driver.findElement(By.xpath("//select[@id='LEADCF9']"));
		Select objselect = new Select(dropdownbutton);
		objselect.selectByVisibleText("Quality Assurance");
		
		
		WebElement dropdownbuttoncountry =driver.findElement(By.xpath("//select[@id='LEADCF14']"));
		Select objselect1 =new Select(dropdownbuttoncountry);
		objselect1.selectByVisibleText("United States (USA)");
		

		WebElement submitbutton =driver.findElement(By.xpath("//input[@id='formsubmit']"));
	submitbutton.click();
		//@FindBy(xpath="//input[@type='reset']")
		//WebElement resetButton;

		
  }
}
