package com.steps;

import org.openqa.selenium.WebDriver;

import com.page.MercuryTours_Cruises_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryTours_Cruises {
	WebDriver driver;
	com.page.MercuryTours_Cruises_Page cpage=new MercuryTours_Cruises_Page();
	@Given("^user Launch the chrome browser$")
	public void user_Launch_the_chrome_browser() throws Throwable {
		cpage.launch();
	   
	}

	@When("^i open the Mercury tours application$")
	public void i_open_the_Mercury_tours_application() throws Throwable {
		cpage.website();
	    
	}

	@Then("^the user go to cruises and read the table data$")
	public void the_user_go_to_cruises_and_read_the_table_data() throws Throwable {
		cpage.method();
	  
	}

	   
	}




