package com.capg.login.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginBeans {

		@FindBy(how=How.ID,id="uname")
		private WebElement name1;
		
		@FindBy(how=How.ID,id="upassword")
		private WebElement password1;
		
		@FindBy(how=How.ID,id="submit")
		private WebElement submit;
		@FindBy(how=How.ID,id="cancel")
		private WebElement cancel;
		
		@FindBy(how=How.ID,id="gender")
		private List<WebElement> gender;
		
		
		
		
		
		
		public String getName() {
			return name1.getAttribute("value");
		}
		public void setName(String name) {
			name1.sendKeys(name);
			//this.uname.sendKeys(uname);
		}
		public String getPassword() {
			return password1.getAttribute("value");
		}
		public void setPassword(String password) {
			password1.sendKeys(password);
		}
		
		
		
		public String  getGender() {
			for (WebElement webElement:gender) 
				if(webElement.isSelected())
					return webElement.getAttribute("value");
				return null;
		}

		public void setGender(String gender) {
			if(gender.equals("male"))
				this.gender.get(0).click();
			else if(gender.equals("female"))
				this.gender.get(1).click();
		}

		public void submit()
		{
			submit.click();
		}
		public void cancel()
		{
			cancel.clear();
		}
		
}
