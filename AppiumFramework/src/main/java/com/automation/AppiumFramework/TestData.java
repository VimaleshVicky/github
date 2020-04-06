package com.automation.AppiumFramework;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="name")
	public String[] nameData()
	{
		String[] obj = {"abc","213"};
		//Object[][] obj = new Object[][]{{"hello"},{"1234"},{"/-*-/"}};
		return obj;
		
	}

}
