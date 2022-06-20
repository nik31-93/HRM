package com.UtilsLayer;

import com.BaseLayer.Baseclass;

public class AlertMethods extends Baseclass {
	
	// it will click on Ok Button
	public static void clickOnOkButton() {
		driver.switchTo().alert().accept();
	}

	// it will click on Cancel Button
	public static void clickOnCancel() {
		driver.switchTo().alert().dismiss();
	}

	// it will enter data on alert Box
	public static void enterData(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	// it will capture alert text
	public static String captureText() {
		return driver.switchTo().alert().getText();
	}
}