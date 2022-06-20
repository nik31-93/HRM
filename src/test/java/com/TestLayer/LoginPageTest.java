package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.Baseclass;
import com.PageLayer.LoginPage;

public class LoginPageTest extends Baseclass {

	@BeforeClass
	public void setUp() {
		Baseclass.inilitization();
	}

	
	@Test
	public void validateLoginFunctionality() {
		LoginPage loginpage = new LoginPage();
		loginpage.loginFunctionality("Admin","admin123");
		System.out.println("Test case pass");
	}

	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
