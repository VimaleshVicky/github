package resources;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automation.AppiumFramework.AndriodActions;
import com.automation.AppiumFramework.ecommerceBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Listeners implements ITestListener {
	
@Override
public void onTestFailure(ITestResult result) {
	
	String testCaseName = result.getName();
	//capture screenshot
	try {
		AndriodActions.screenshot(testCaseName);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ITestListener.super.onTestFailure(result);
}
}
