package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	
    //Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public HomePage login(String em, String pwd){
			email.sendKeys(em);
			password.sendKeys(pwd); 
			
			return new HomePage();
		}		
		public HomePage LoginBtn() {
	
	         JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
			    	
			return new HomePage();
}	
}