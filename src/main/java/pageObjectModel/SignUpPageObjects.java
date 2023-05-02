package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignUpPageObjects {

	public WebDriver driver;
	
	By firstName=By.xpath("//input[@name='UserFirstName']");
	By lastName=By.xpath("//input[@name='UserLastName']");
	By jobTtitle=By.xpath("//input[@name='UserTitle']");
	
	By phoneNum=By.xpath("//input[@name='UserPhone']");
	By emailId=By.xpath("//input[@name='UserEmail']");

	By companyName=By.xpath("//input[@name='CompanyName']");	
	By employee=By.xpath("//select[@name='CompanyEmployees']");
	By CompanyCountry=By.xpath("//select[@name='CompanyCountry']");
	By checkValidatate=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	public SignUpPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
	}
	public WebElement entreFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement entrelastName() {
		return driver.findElement(lastName);
	}
	public WebElement entreJobTtitle() {
		return driver.findElement(jobTtitle);
	}
	
	public WebElement entrePhoneNum() {
		return driver.findElement(phoneNum);
	}
	public WebElement entreEmailId() {
		return driver.findElement(emailId);
	}
	

	public WebElement entreCompanyName() {
	return driver.findElement(companyName);
	}
	
	//Static drop down list--
	public WebElement entreEmployee() {
	return driver.findElement(employee);
	
	}
	public WebElement entreCompanyCountry() {
	return driver.findElement(CompanyCountry);
	}
	public WebElement ClickCheckValidatate() {
		return driver.findElement(checkValidatate);
	}
}
