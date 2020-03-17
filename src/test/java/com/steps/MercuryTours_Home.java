package com.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryTours_Home {
	WebDriver driver;
	com.page.MercuryTours_HomePage home = new com.page.MercuryTours_HomePage();

	@Given("^user Launched the chrome browser$")
	public void user_Launched_the_chrome_browser() throws Throwable {
		home.url();
	}

	@When("^user open the Mercurytours app home page$")
	public void user_open_the_Mercurytours_app_home_page() throws Throwable {
		home.MercuryTours_homePage();
	}

	@Then("^copy the web table$")
	public void copy_the_web_table() throws Throwable {
		home.table();
	}

}
