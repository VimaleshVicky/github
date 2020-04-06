package com.automation.AppiumFramework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ecommerceBase {
	public AppiumDriverLocalService service;
	static AndroidDriver<AndroidElement> driver;

	public AppiumDriverLocalService startAppiumServer()
	{
		System.out.println("Ecommerce base start appium server");
		boolean flag = isPortInUse(4723);
		if(!flag)
		{
			service = AppiumDriverLocalService.buildDefaultService();
			service.start();
		}
		return service;
	}
	
	public static void startEmulator() throws IOException, InterruptedException
	{
		System.out.println("Ecommerce base start emulator");
		Runtime.getRuntime().exec("D:\\Documents\\Appium\\startEmulator.bat");
		Thread.sleep(20000);
	}
	
	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		//properties
		//FileInputStream fis = new FileInputStream("D:\\Documents\\Appium\\AppiumFramework\\");
		System.out.println("Ecommere base capabilities block");
		FileInputStream fis = new FileInputStream("global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		//System.out.println(prop.get(appName));
				
		//appium code
		File file = new File("src");
		File fs = new File(file,(String) prop.get(appName)); //General-Store.apk

		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,System.getProperty("DeviceName")/*prop.get("device")*/);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15);
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
	
	private boolean isPortInUse(int portNumber) {
		System.out.println("ecomerce base post in use block");
        boolean result = false;
        ServerSocket serverSocket;

        try {
        	ServerSocket s = new ServerSocket(portNumber);
            s.close();
        }
        catch(Exception e) {
            result = true;
        }
        finally {
			serverSocket = null;
		}
        return result;
}
}
 