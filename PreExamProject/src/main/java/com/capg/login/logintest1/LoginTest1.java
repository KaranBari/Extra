package com.capg.login.logintest1;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		format= {"pretty"},
		features= {"feature"},
		glue= {"com.capg.login.StepDefinition"},
		tags= {"@tag1"}
	)
public class LoginTest1 {

	
}
