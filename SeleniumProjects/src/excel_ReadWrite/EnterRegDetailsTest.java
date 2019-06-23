package excel_ReadWrite;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnterRegDetailsTest {

	WebDriver driver;

	@BeforeMethod
	public void projectSetup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Req_Soft\\chromedriver.exe");	

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");

	}

	@Test
	public void RegDetailsTest() throws InterruptedException 
	{
		

		// enter data
				driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
				driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anand");
				driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
				driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Babu");
				driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).clear();
				driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Kondapur,hyderabad");
				driver.findElement(By.xpath("//input[@type='email']")).clear();
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anand@gmail.com");
				driver.findElement(By.xpath("//input[@type='tel']")).clear();
				driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
				
			
				WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@type='radio'][@value='Male']"));
				maleRadioBtn.click();
				
				/*boolean radioBtnIsDisplayed = maleRadioBtn.isDisplayed();
				boolean radioBtnIsEnabled = maleRadioBtn.isEnabled();
				boolean radioBtnIsSelected = maleRadioBtn.isSelected();*/
				
				
					
					//boolean radioBtnNewSelectionStatus = maleRadioBtn.isSselected();
				
				
				
				
				/*driver.findElement(By.xpath("//input[@id='checkbox1']")).clear();*/
				
				WebElement cirketRadioBtn = driver.findElement(By.xpath("//input[@id='checkbox1']"));
				cirketRadioBtn.click();
				
				
				/*driver.findElement(By.xpath("//input[@id='checkbox2']")).clear();
				driver.findElement(By.xpath("//input[@id='checkbox2']")).sendKeys(hobbies);
				driver.findElement(By.xpath("//input[@id='checkbox3']")).clear();
				driver.findElement(By.xpath("//input[@id='checkbox3']")).sendKeys(hobbies);*/
			
				
				
				/*WebElement listbox = driver.findElement(By.xpath("//*[@id='msdd']"));
				Select select = new Select(listbox);
				select.selectByIndex(1);
				listbox.click();*/
				// select the third dropdown using "select by index"
				
				   Select selectByIndex = new Select(driver.findElement(By.xpath("//*[@id='msdd' and @class='ui-autocomplete-multiselect ui-state-default ui-widget']")));
				   selectByIndex.selectByIndex(1);	
				   System.out.println(selectByIndex);
				   
				   Thread.sleep(5000);  
			
				
				/*
				 WebElement skillList = driver.findElement(By.xpath("//select[@id='Skills']"));
				 Select skSelect = new Select(skillList);
				 skSelect.selectByIndex(1);
				 
				 WebElement cntList = driver.findElement(By.xpath("//select[@id='countries']"));
				 Select cntSelect = new Select(cntList);
				 cntSelect.selectByIndex(1);
				
				 WebElement cntList1 = driver.findElement(By.xpath("//span[@id='select2-country-container']"));
				 Select cntSelect1 = new Select(cntList1);
				 cntSelect1.selectByIndex(1);
				 
				
				
				
				
				WebElement  yerList = driver.findElement(By.xpath("//select[@id='yearbox']"));
				Select yrSelect = new Select(yerList);
				yrSelect.selectByIndex(1);
				
				WebElement monList = driver.findElement(By.xpath("//select[@placeholder='Month']"));
				Select monSelect = new Select(monList);
				monSelect.selectByIndex(1);
				
				WebElement dayList = driver.findElement(By.xpath("//select[@placeholder='Day']"));
				Select daySelect = new Select(dayList);
				daySelect.selectByIndex(1);
				
				
				
				driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("anand123");
				
				driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("anand123");*/
				
		
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
