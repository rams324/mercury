package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/main/resources/feature/login.feature",
	tags= {"@tc_04"},
	glue= {"steps"},
	monochrome=true
	)
	public class MercuryTours_HomeRunner {
	
	

}
