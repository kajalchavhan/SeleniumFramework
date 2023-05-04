package TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.Constant;
import Resources.baseClass;
import pageObjectModel.LoginPageObjects;

public class loginArrayList extends baseClass {

	
	
	   @Test
	 
	   
	   public void login() throws IOException {
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      ArrayList<String> name1 = new ArrayList<String>(); // this is blank not null
	      ArrayList<String> pass = new ArrayList<String>();

	      Constant constant = new Constant(name1, pass);

	      for (int i = 0; i < name1.size(); i++) {

	    	  LoginPageObjects LPO = new LoginPageObjects(driver);

	       LPO.entreUsername().sendKeys(name1.get(i)); // Get username from the current index of
	                  // both ArrayLists
	       LPO.entrePassword().sendKeys(pass.get(i)); // Get password from the current index of
	                  // the password ArrayList
	       LPO.clickLogin().click();

	       String expectedtext =constant.loginExpectedMessage;
	       String actualtext = LPO.clickonerrorText().getText();
	       System.out.println(actualtext);

	       SoftAssert assertion = new SoftAssert();
	       assertion.assertEquals(actualtext, expectedtext);
	       System.out.println("done");

	      }
	   }}

