package seleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProject1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Req_Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\'gb_70\']")).click();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("babu.nalluri7@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("South@1234");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac' and text()='Next']")).click();
		driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/?tab=wm&ogbl']")).click();

		driver.findElement(By.xpath("//div[@role='button' and @class='T-I J-J5-Ji T-I-KE L3']")).click();

		driver.findElement(By.xpath("//*[@name='to']")).sendKeys("babu.nalluri7@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("This is my Test mail to Anand");

		//driver.findElement(By.xpath("//div[@id=':qn'])")).sendKeys("Hi ...This is my first testitng program");

		driver.findElement(By.xpath("//div[@id=':p8']")).click();
	}

}
