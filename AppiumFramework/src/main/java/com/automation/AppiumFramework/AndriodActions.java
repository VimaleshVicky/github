package com.automation.AppiumFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndriodActions {
	static AndroidDriver<AndroidElement> driver;
	
	public AndriodActions(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	
	void scroll(String element)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+element+");");
	}
	
	public static void screenshot(String testCaseName) throws IOException {
		File fileSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fileSrc,new File("D:\\Documents\\Appium\\AppiumFramework\\target\\"+testCaseName+".png"));
	}
	

}