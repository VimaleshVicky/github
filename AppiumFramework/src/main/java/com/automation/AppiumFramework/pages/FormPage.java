package com.automation.AppiumFramework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {
	public FormPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private WebElement nameField;

	@AndroidFindBy(className = "android.widget.RadioButton")
	public List<WebElement> female;
	
	public WebElement getNameField() {
		return nameField;
	}

	public void setNameField(WebElement nameField) {
		this.nameField = nameField;
	}

	@AndroidFindBy(id = "android:id/text1")
	public WebElement country;
}
