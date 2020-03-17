package com.steps;


import org.openqa.selenium.WebDriver;

import com.page.MercuryTours_Register_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MercuryTours_Registration {
	WebDriver driver;
	com.page.MercuryTours_Register_page pageobj=new com.page.MercuryTours_Register_page();
	@Given("^The user Launch the chrome browser$")
	public void the_user_Launch_the_chrome_browser() throws Throwable {
	   pageobj.url();
	}

	@When("^i open the Mercury tours$")
	public void i_open_the_Mercury_tours() throws Throwable {
		pageobj.login();
	   
	}

	@Then("^the user enter the details$")
	public void the_user_enter_the_details() throws Throwable {
		pageobj.register();
	    
	}

	@Then("^click the submit button$")
	public void click_the_submit_button() throws Throwable {
		pageobj.submit();
	    
	}


	}