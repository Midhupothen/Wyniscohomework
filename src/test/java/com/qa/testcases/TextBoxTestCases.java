package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pages.TextBoxPage;

public class TextBoxTestCases extends Baseclass{
	
public TextBoxPage objTextBoxPag;
	
	@BeforeClass
	public void startApplication() throws NumberFormatException, IOException, InterruptedException{
		driver=initializeDriver();
		objTextBoxPag=new TextBoxPage(driver);
		
		
	}
	
	@Test(priority=1)
	public void verifySubmittedData() throws InterruptedException {
		objTextBoxPag.launchTextBoxPage();
		Thread.sleep(6000);
		objTextBoxPag.submitStudentData("test ", "test2", "test@gmail.com", "1234567");
		
	}
	@AfterClass
	public void closeApplication(){
		closeAllDriver();
		
	}
}

