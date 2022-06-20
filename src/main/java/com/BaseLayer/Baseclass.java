package com.BaseLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver;

	public static void inilitization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sele_webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
