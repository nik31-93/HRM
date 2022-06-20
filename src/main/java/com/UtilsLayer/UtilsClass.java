package com.UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.Baseclass;

public class UtilsClass extends Baseclass {

	public static void explicitWait(int Wait, By by) {
		WebDriverWait wait = new WebDriverWait(driver, (Wait));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static String takeScreenShot(String filename) {
		SimpleDateFormat date = new SimpleDateFormat("ddMMyyyy_HHmmss");

		String dateName = date.format(new Date());

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String dist = System.getProperty("user.dir") + "\\" + filename + dateName + ".png";
		try {
			FileUtils.copyFile(f, new File(dist));
		} catch (IOException e) {

			e.printStackTrace();
		}

		return dist;
	}
}
