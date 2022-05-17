package com.hybridframework.inetbanking.utility;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static void capturescreenshot(WebDriver driver) {
		String screenpath = System.getProperty("user.dir") + "//Screenshot//inetbanking_" + getCurrentDateTime() + ".png";
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(screenpath));
			
			System.out.println("Captured Screenshot Succsesfully");
		} catch (Exception e) {
			System.out.println("Not Captured Screenshot succsefully");
		}
	}

	public static String getCurrentDateTime() {
		SimpleDateFormat customDate = new SimpleDateFormat("dd_mm_yyyy_hh_mm_ss");
		Date currentDate = new Date(0);
		return customDate.format(currentDate);
	}

	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
		} catch (NoAlertPresentException e) {
			return true;			
		}
		return false;

	}

}
