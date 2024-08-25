package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class Homepage {
	WebDriver driver = BaseClass.driver;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	
	}
	

}
