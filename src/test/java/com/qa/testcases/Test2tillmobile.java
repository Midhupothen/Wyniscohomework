package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.qa.pages.Textboxpage2;

public class Test2tillmobile extends Testtillapply {
	public Textboxpage2 objTextBoxPag;

	
	@Test(priority=1)
	public void verifySubmittedData2() throws InterruptedException {
		
		objTextBoxPag.submitStudentData("test ", "test", "test@gmail.com");
		
	}}