package com.automation.AppiumFramework;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.AppiumFramework.pages.FormPage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_Test extends ecommerceBase{
	
	@BeforeTest
	public void killAllNodes() throws IOException
	{
		Runtime.getRuntime().exec("taskkill /F /M node.exe");
	}
	
	
	@Test(dataProvider = "name",dataProviderClass = TestData.class)
	public void ecomerce_Testing(String input) throws IOException, InterruptedException {
		System.out.println("Ecommerce Test block");
		service =  startAppiumServer();
		//startEmulator();
		AndroidDriver<AndroidElement> driver = capabilities("GeneralStoreApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FormPage fp = new FormPage(driver);
		
		//fp.country.click();
		//String element = "text(\"Austria\")";
		AndriodActions andAct = new AndriodActions(driver);
		//andAct.scroll(element);
		//driver.findElement(By.xpath("*//[@text='Austria']")).click();
		
		//fp.nameField.sendKeys("abc");
		fp.getNameField().sendKeys(input);

		driver.hideKeyboard();
		
		WebElement femaleOption = fp.female.get(1);
		femaleOption.click();
		
		driver.findElement(By.className("android.widget.Button")).click(); //To click on lets shop
		Thread.sleep(5000);
		//driver.findElement(By.xpath("*//[@text='Austria']")).click(); //Fail the test intentionally
		//service.stop();
		/*try {
			service.stop();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		Thread.sleep(5000);
		

	}
	
	public static void screenshot(String testCaseName) throws IOException {
		File fileSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fileSrc,new File("D:\\Documents\\Appium\\AppiumFramework\\"+testCaseName+".png"));
	}
	
	
	
	
	

}
	