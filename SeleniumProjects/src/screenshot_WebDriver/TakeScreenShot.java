package screenshot_WebDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;



public class TakeScreenShot {
	public WebDriver driver;
	

	@BeforeMethod
	public void setup()
	 {
		
	}
	
	@Test
	public void runDummyTest()  { 
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingexcellence.com");
		String title = driver.getTitle();
		System.out.println("Title......."+title);

		try {
			driver.findElement(By.id("dummyId")).click();
		} 

		catch (Exception e) {
			System.out.println("Element Not Found");
		    //takeScreen();
			
			
		}
		
		
		/*public void takeScreen() throws IOException {
			File scrFile =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile,new File("C:\\Selenium_Req_Soft\\failed-test.png"));*/

													}
		
		
	}
	


	




