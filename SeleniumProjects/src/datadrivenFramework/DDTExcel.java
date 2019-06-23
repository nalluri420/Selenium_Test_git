package datadrivenFramework;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExcel {
	ChromeDriver driver;
	
	@Test(dataProvider = "testdata")
	public void DemoProject(String username, String password) throws InterruptedException {
		//String fname1,lname1,address,email,  phone,  gender,language,sill,country,boolean year, month,day,String pwd1, cpwd1
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Req_Soft\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().matches("Find a Flight: Mercury Tours"),"Invalid Credentials");
		System.out.println("Login successfully");
		
	}
	
	@AfterMethod
	void ProgramTermination() {
		driver.quit();
	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed() throws FileNotFoundException{
		ReadExcelFile config = new ReadExcelFile("‪C:\\Selenium_Req_Soft\\LoginCredentials.xlsx");
		int rows = config.getRowCount(0);
		Object[][] credentials = new Object[rows][2];
		
		for(int i=0; i<rows; i++) 
		{
			credentials[i][0] = config.getData(0, i, 0);
			credentials[i][1] = config.getData(0, i, 1);
		}
		
		return credentials;
		
	}
	

}
