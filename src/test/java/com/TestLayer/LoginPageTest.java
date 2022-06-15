package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	@BeforeClass
	public void setUp() {
		BaseClass.inilitization();
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
