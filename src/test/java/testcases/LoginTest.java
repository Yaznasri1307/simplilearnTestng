package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{

	
	@Test
 	public void TC01_LoginFailureTest() {
		
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("abc@xyz.com", "Abcd@1234");
		lp.ValidateErrorMsg("The email or password you have entered is invalid.");
		
		
	}
	@Test
	public void TC02_LoginSuccessTest() {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("pqr@xyz.com", "Correct@1234");
		
	}
	
	@Test
	@Parameters({"param1","param2"})
	public void TC03_LoginSuccessTest(String Uname, String Pwd) {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction(Uname, Pwd);
		
	}
	
	public void TC05_LoginFailureTest() {
		
		LoginPage lp = new LoginPage();
		
		String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
		
		lp.LoginFunction(UserNameVal, PasswordVal);
		lp.ValidateErrorMsg("The email or password you have entered is invalid.");
			
		
	}



}
