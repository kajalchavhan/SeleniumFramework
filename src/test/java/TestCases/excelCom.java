package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.Constant;
import Resources.baseClass;
import pageObjectModel.LoginPageObjects;

public class excelCom extends baseClass{

	 
    @Test
	public void login() throws IOException {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    Constant constant = new Constant();
    constant.userpass();

    for (int i = 0; i < constant.userpass().get(0).size(); i++) {

    LoginPageObjects LPO = new LoginPageObjects(driver);
     LPO.entreUsername().sendKeys(constant.userpass().get(0).get(i)); // Get username from the current index of
                      // both ArrayLists
     LPO.entrePassword().sendKeys(constant.userpass().get(1).get(i)); // Get password from the current index of
                      // the password ArrayList
     LPO.clickLogin().click();

     String expectedtext = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
     String actualtext = driver.findElement(By.xpath("//div[@class='loginError']")).getText();
     System.out.println(actualtext);

     SoftAssert assertion = new SoftAssert();
     assertion.assertEquals(actualtext, expectedtext);
     System.out.println("done");
    }
    }
}
