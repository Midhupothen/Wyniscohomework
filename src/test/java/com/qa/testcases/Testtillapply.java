package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pages.TextBoxPage;
import com.qa.pages.Textboxpage2;

public class Testtillapply extends Baseclass {
	public Textboxpage2 objTextBoxPag;

	@BeforeClass
	public void startApplication() throws NumberFormatException, IOException, InterruptedException{
		driver=initializeDriver();
		objTextBoxPag=new Textboxpage2(driver);
		}
	@Test(priority=1)
	public void verifySubmittedData() throws InterruptedException {
		objTextBoxPag.launchTextBoxPage();
		Thread.sleep(6000);
	
	
}
}
