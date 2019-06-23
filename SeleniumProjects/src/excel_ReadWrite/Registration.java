package excel_ReadWrite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registration {
WebDriver driver;

	@BeforeMethod
	public void projectSetup() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_Req_Soft\\chromedriver.exe");	
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Register.html");
	
	}
	
	@Test
	public void EnterRegDetails (String fname1,String lsname1, String address, String email, String phone1, String  genderMale,
			String genderFeMale,String  hobbies, String language, String skill,  String country, String selectCountry, String dobYear,
			String dobMonth,String dobDay, String pwd, String conPwd ) {
		
		// enter data
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname1);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lsname1);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).clear();
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='tel']")).clear();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(phone1);
		driver.findElement(By.xpath("//input[@type='radio'][@value='Male']")).clear();
		driver.findElement(By.xpath("//input[@type='radio'][@value='Male']")).sendKeys(genderFeMale);
		driver.findElement(By.xpath("//input[@type='radio'][@value='FeMale']")).clear();
		driver.findElement(By.xpath("//input[@type='radio'][@value='FeMale']")).sendKeys(genderFeMale);
		driver.findElement(By.xpath("//input[@id='checkbox1']")).clear();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).sendKeys(hobbies);
		driver.findElement(By.xpath("//input[@id='checkbox2']")).clear();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).sendKeys(hobbies);
		driver.findElement(By.xpath("//input[@id='checkbox3']")).clear();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).sendKeys(hobbies);
		driver.findElement(By.xpath("//div[@id='msdd']")).clear();
		driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys(language);
		driver.findElement(By.xpath("//select[@id='Skills']")).clear();
		driver.findElement(By.xpath("//select[@id='Skills']")).sendKeys(skill);
		driver.findElement(By.xpath("//select[@id='countries']")).clear();
		driver.findElement(By.xpath("//select[@id='countries']")).sendKeys(country);
		
		driver.findElement(By.xpath("//span[@id='select2-country-container']")).clear();
		driver.findElement(By.xpath("//span[@id='select2-country-container']")).sendKeys(selectCountry);
		driver.findElement(By.xpath("//select[@id='yearbox']")).clear();
		driver.findElement(By.xpath("//select[@id='yearbox']")).sendKeys(dobYear);
		driver.findElement(By.xpath("//select[@placeholder='Month']")).clear();
		driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys(dobMonth);
		driver.findElement(By.xpath("//select[@placeholder='Day']")).clear();
		driver.findElement(By.xpath("//select[@placeholder='Day']")).sendKeys(dobDay);
		driver.findElement(By.xpath("//input[@id='firstpassword']")).clear();
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).clear();
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(conPwd);
		
												
		
	}
		
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
}


