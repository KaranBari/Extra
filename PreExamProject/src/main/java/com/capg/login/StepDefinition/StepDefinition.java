package com.capg.login.StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.capg.login.beans.LoginBeans;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
WebDriver driver;
LoginBeans loginBean=new LoginBeans();
	 @Before
public void setUpStepEnv() {
	System.setProperty("webdriver.chrome.driver", "D:\\karan jenkins\\Driver Files for Selenium\\"
			+"chromedriver.exe");
}
	 @Given("^username and password$")
	 public void username_and_password() throws Throwable {
		 driver = new ChromeDriver();
			driver.get("file:///D:/karan_bdd/ConferenceSirFormWeb/WebContent/Login.html");
			driver.manage().window().maximize();
		    
	 }

	 @When("^username and password matches$")
	 public void username_and_password_matches() throws Throwable {
		
			PageFactory.initElements(driver, loginBean);
			loginBean.setName("karan");
			loginBean.setPassword("123456789");
			loginBean.setGender("male");
			Thread.sleep(6000);
	 }

	 @Then("^login to github account$")
	 public void login_to_github_account() throws Throwable {
		 loginBean.submit();
		 System.out.println("Success");
		// driver.close();
		 
	 }


}
