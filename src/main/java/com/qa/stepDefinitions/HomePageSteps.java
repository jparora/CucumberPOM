package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class HomePageSteps extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
@Given("^User open the browser$")
public void user_open_the_browser(){
	TestBase.initialization();
   }

@Then("^User is on Login Page$")
public void user_is_on_Login_Page(){
	loginpage = new LoginPage();
	String title = loginpage.validateLoginPageTitle();
	Assert.assertEquals("Cogmento CRM", title);
  
}
@Then("^User enters the Email and Password$")
public void user_enters_the_Email_and_Password(){
	homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
}

@Then("^User Click on Login Button$")
public void user_Click_on_Login_Button() {
   homepage = loginpage.LoginBtn();
  
}

@Then("^User validates home page title$")
public void user_validates_home_page_title(){
	String hometitle = homepage.verifyHomePageTitle();
	Assert.assertEquals("Cogmento CRM", hometitle);
}

@And("^Validate logged in username$")
public void validate_logged_in_username() {
   boolean nameflag = homepage.verifyCorrectUserName();
   Assert.assertTrue(nameflag);
}

}
