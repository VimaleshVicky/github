package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("login page is opened")
	public void login_page_is_opened() {
	    System.out.println("login page is opened");
	}

	@When("enter the credentails")
	public void enter_the_credentails() {
	    System.out.println("Credentials are entered");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    System.out.println("Click on login button");
	}

	@Then("login should be successful")
	public void login_should_be_successful() {
	    Assert.assertEquals("45","4");
	}

}
