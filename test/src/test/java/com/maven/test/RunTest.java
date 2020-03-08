package com.maven.test;

import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		,glue = "stepDefinitions"
		)
public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
