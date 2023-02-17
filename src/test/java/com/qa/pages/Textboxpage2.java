package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Textboxpage2 {
	public WebDriver driver;
	//page object Repository
	// Elements to launch main page

		@FindBy(xpath = "//a[@class='more-link wsite-menu-item']")
						 
		WebElement moreButton;
		@FindBy(xpath ="(//a[@href='/apply.html'])[2]")
		//@FindBy(xpath = "//li[@id='pg811271640933592749' and @class='wsite-menu-item-wrap      wsite-nav-10']/child::a[@href='/apply.html']")
						 //li[@id='pg811271640933592749' and @class='wsite-menu-item-wrap       wsite-nav-10' ]/child::a[@href='/apply.html']   
		WebElement applyButton;

		// Elements to submit form

		@FindBy(xpath = "//input[@id='First_Name']")
		WebElement firstNameTextBox;

		@FindBy(xpath = "//input[@id ='Last_Name']")
		WebElement lastnameTextBox;

		@FindBy(xpath = "//input[@id='Email']")
		WebElement emailTextBox;

		@FindBy(xpath = "//input[@id='Mobile']")
		WebElement mobileTextBox;
		@FindBy(xpath ="//select[@id='LEADCF9']")
		WebElement dropdownbutton;
		@FindBy(xpath="//select[@id='LEADCF14']")
		WebElement dropdownbuttoncountry;

		@FindBy(xpath="//input[@id='formsubmit']")
		WebElement submitButton;
		@FindBy(xpath="//input[@type='reset']")
		WebElement resetButton;

		
		// Page class constructor

		public Textboxpage2(WebDriver driver) {

			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			

		}
		// Operation#1
		public void launchTextBoxPage() {
			try{
				Thread.sleep(9000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			moreButton.click();
			try{
				Thread.sleep(9000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}

			applyButton.click();
			}
		// Operation #2
				public void submitStudentData(String firstName, String lastname, String email) {
					
					firstNameTextBox.sendKeys(firstName);
					lastnameTextBox.sendKeys(lastname);
					emailTextBox.sendKeys(email);
				}
					
					//operation3
					public void submitdata2(String mobile){
						Select objselect = new Select(dropdownbutton);
						Select objselect1 =new Select(dropdownbuttoncountry);
						mobileTextBox.sendKeys(mobile);
					
					objselect.selectByVisibleText("Quality Assurance");
					objselect1.selectByVisibleText("United States (USA)");
					
					submitButton.click();
					try {Thread.sleep(5000);} 
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
		

}



