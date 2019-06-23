package datadrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelToDataProvider {
	ExcelApiTest eAT = null;
	String xlFilePath = "C:\\Selenium_Req_Soft\\Credentials.xlsx";
	String sheetName = "LoginCreation";
	WebDriver driver ;
	
	
	@BeforeMethod
	public void setBup() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Req_Soft\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://practice.automationtesting.in/my-account/");
		
	}
	
	@Test(dataProvider="userData")
	public void fillUserForm(String userid,String password) {
	driver.findElement(By.id("reg_email")).sendKeys(userid);
	driver.findElement(By.id("reg_password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@type='submit' and @name='register']")).click();
	
	boolean msgdisplayed = driver.findElement(By.xpath("//li[text()=' An account is already registered with your email address. Please login.']")).isDisplayed();	
		System.out.println("displayed...."+msgdisplayed);
					
	}
	
	@DataProvider(name="userData")
	public Object[][] userFormData() throws Exception
	{
		Object[][] data = testData(xlFilePath,sheetName);
		return data;
	}
	
	public Object[][] testData(String xlFilePath, String sheetName) throws Exception
	{
		Object[][] excelData = null;
		eAT = new ExcelApiTest(xlFilePath);
		int rows = eAT.getRowCount(sheetName);
		int columns = eAT.getColumnCount(sheetName);
		excelData = new Object[rows-1][columns];
		
		for(int i=1; i<rows; i++) 
		{
			for (int j=0; j<columns; j++)
			{
				
				excelData[i-1][j] = eAT.getCellData(sheetName, j, i);
				
			}
		}
		
		return excelData;
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
