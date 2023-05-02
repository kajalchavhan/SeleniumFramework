package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.Constant;
import Resources.baseClass;
import pageObjectModel.CommonMethods;
import pageObjectModel.LoginPageObjects;
import pageObjectModel.SignUpPageObjects;

        public class VerfySignUp extends baseClass{
	    
	    	  @Test
	 public void signUp() throws IOException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        LoginPageObjects LPO=new LoginPageObjects(driver);
		LPO.clickonTryForFree().click();
		
		
		SignUpPageObjects SPO=new SignUpPageObjects(driver);
	
		
		SPO.entreFirstName().sendKeys(Constant.FirstName);
		SPO.entrelastName().sendKeys(Constant.LastName);
		SPO.entreJobTtitle().sendKeys("test");
		SPO.entreEmailId().sendKeys("kajal@gmail.com");
		SPO.entrePhoneNum().sendKeys("6589423663");
		
		SPO.entreEmployee().click();
		//Select s=new Select(SPO.entreEmployee());
		//s.selectByIndex(1);
		CommonMethods.handleDropdown(SPO.entreEmployee(),1);
		CommonMethods.handleDropdown(SPO.entreCompanyCountry(), 5);
		SPO.entreCompanyName().sendKeys("TechInfo");
		
		
		
		
		
		
		
		
		//SPO.entreCompanyCountry().click();
		//CommonMethods.commonselect(SPO.entreCompanyCountry(), "United States");
		//SPO.ClickCheckValidatate().click();
		
		
		
		
		
		
		
		
		//Select s1=new Select(SPO.entreCompanyCountry());
		//s1.selectByVisibleText("France");
		//driver.quit();
	}
	    	  
        /*  CommonMethods.handleDropdown(SPO.entreJobTtitle(), "Sales Manager");
	    CommonMethods.handleDropdown(SPO.entreCompanyCountry(), "India");
	    CommonMethods.handleDropdown(SPO.entreEmployee(), "16 - 50 employees");
*/



}
