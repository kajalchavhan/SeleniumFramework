package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.Constant;
import Resources.baseClass;
import pageObjectModel.CommonMethods;
import pageObjectModel.LoginPageObjects;

public class VerifyLogin extends baseClass {
	
	
    @Test
	public void Invalidlogin() throws IOException {
    	
    	//this driver is not null
    	driver.manage().window().maximize();
    	
    	LoginPageObjects LPO=new LoginPageObjects(driver);
    	LPO.entreUsername().sendKeys(Constant.username);
    	LPO.entrePassword().sendKeys(Constant.password);
    	LPO.clickLogin().click();
    	
   	  
   	    String actualText=LPO.clickonerrorText().getText();
   	    String ExpectedText=Constant.loginExpectedMessage;
   	   CommonMethods.handleAssersions(actualText,ExpectedText, "Error massage is not match");
   	   
   	    String privacyActualText=LPO.clickPrivacyText().getText();
   	    String privacyExpectedText="Privacy"; 
   	 CommonMethods.handleAssersions(privacyActualText, privacyExpectedText, "Invalid Data");
   	 
   	 
   	 
   	  /*  SoftAssert assertion=new SoftAssert();
   	    assertion.assertEquals(actualText,ExpectedText,"Error message is not valid");
   	    assertion.assertAll();*/
    	
    	
	}
	
}
 