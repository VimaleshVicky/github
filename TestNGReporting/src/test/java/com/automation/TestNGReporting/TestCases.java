package com.automation.TestNGReporting;

import org.testng.annotations.Test;

public class TestCases {
	
	@Test
	public void testCase1()
	{
		System.out.println("Test Case 1");
		System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test Case 2");
		System.out.println("Test Case Two with Thread Id:- "
				+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("Test Case 3");
		System.out.println("Test Case Three with Thread Id:- "
				+ Thread.currentThread().getId());
	}
	
	@Test
	public void testCase4()
	{
		System.out.println("Test Case 4");
		System.out.println("Test Case Four with Thread Id:- "
				+ Thread.currentThread().getId());
	}

}
