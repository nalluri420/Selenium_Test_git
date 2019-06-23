package excel_ReadWrite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Req_Soft\\chromedriver.exe");	
		WebDriver driver;

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		/*WebElement listLanguage = driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget' and @id='msdd']"));
		Select selectLan = new Select(listLanguage);
		selectLan.selectByIndex(2); */
		
		WebElement listbox = driver.findElement(By.id("Skills"));
		Select select = new Select(listbox);
		select.selectByIndex(3);
		
		WebElement listbox1 = driver.findElement(By.id("countries"));
		Select select1 = new Select(listbox1);
		select1.selectByIndex(4);
		
		WebElement listbox2 = driver.findElement(By.xpath("//select[@id='country']"));
		Select select2 = new Select(listbox2);
		select2.selectByIndex(2); 
		
		
		WebElement  yerList = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select yrSelect = new Select(yerList);
		yrSelect.selectByIndex(1);
		
		WebElement monList = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select monSelect = new Select(monList);
		monSelect.selectByIndex(1);
		
		WebElement dayList = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select daySelect = new Select(dayList);
		daySelect.selectByIndex(1);
		
		

	}

}
