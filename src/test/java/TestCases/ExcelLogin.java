package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.ExcelData;
import Resources.baseClass;
import pageObjectModel.LoginPageObjects;

public class ExcelLogin extends baseClass{
     @Test
	public void loginExcel() throws IOException {
		String xlpath="C:\\Users\\DELL\\Desktop\\Screenshot\\friday.xlsx";
		String sheeet="Sheet1";
		ExcelData obj=new ExcelData(xlpath,sheeet);
		LoginPageObjects LPO=new LoginPageObjects(driver);
		for(int i=2;i<=obj.rowcount();i++) {
		LPO.entreUsername().sendKeys(obj.getData(i, 5));
		LPO.entrePassword().sendKeys(obj.getData(i, 6));
		LPO.clickLogin().click();
		}
	}
	
}
