package com.BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public static void inilitization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sele_webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com");
				
	}

}
