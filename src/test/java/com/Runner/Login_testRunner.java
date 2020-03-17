package com.Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/feature/login.feature",
plugin = {"pretty","html:reports/cucumber-html-report"},
tags= {"@tc01_MercuryTours_login"},
glue= {"steps"},
monochrome=true
)

public class Login_testRunner
{
	

}
