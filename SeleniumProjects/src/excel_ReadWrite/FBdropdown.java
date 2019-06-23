package excel_ReadWrite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBdropdown {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Req_Soft\\chromedriver.exe");	
		
		driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			
			
			WebElement fbDay = driver.findElement(By.id("day"));
			Select daySelect = new Select(fbDay);
			daySelect.selectByIndex(2);
			
			WebElement fbMonth = driver.findElement(By.id("month"));
			Select monSelect = new Select(fbMonth);
			monSelect.selectByIndex(2);
			WebElement fbYear = driver.findElement(By.id("year"));
			Select yrSelect = new Select(fbYear);
			yrSelect.selectByIndex(3);
			
			
					
			/*WebElement  yerList = driver.findElement(By.xpath("//select[@id='yearbox']"));
			Select yrSelect = new Select(yerList);
			yrSelect.selectByIndex(1);*/
			
			
			//driver.quit();
	}
	

}

