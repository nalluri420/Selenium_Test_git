package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGsample {
	@Test
	public void myTestMethod() {
		System.out.println("Inside Method:- myTestMethod");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This piece of Code is executed Before Method:-myTechMethod");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Req_Soft\\chromedriver.exe");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This piece of code is executed After myTechMethod");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This piece of code is executed Before Class is executed");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This piece of code is executed After Class is executed");
	}
}

