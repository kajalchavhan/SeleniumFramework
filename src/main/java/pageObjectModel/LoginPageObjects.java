package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;
	
	
   private By username=By.xpath("//input[@id='username']");
   private By password=By.xpath("//input[@type='password']");
   private By login =By.xpath("//input[@type='submit']");
	
   private By tryForFree=By.xpath("//a[@id='signup_link']");

   private By errorText=By.xpath("//div[@id='error']");
   private By privacy=By.xpath("//a[@id='privacy-link']");
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement entreUsername() {
		return driver.findElement(username);
	}
	public WebElement entrePassword() {
		return driver.findElement(password);
	}
	public WebElement clickLogin() {
		return driver.findElement(login);
	}
	public WebElement clickonTryForFree() {
		return driver.findElement(tryForFree);
	}
	public WebElement clickonerrorText() {
		return driver.findElement(errorText);
	}
	public WebElement clickPrivacyText() {
		return driver.findElement(privacy);
	}
}
