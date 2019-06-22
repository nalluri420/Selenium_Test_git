package titleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WindowTitleTest {
	
	WebDriver driver;
	
	@Test
	public void windowTitleTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Req_Soft\\chromedriver.exe");
	driver = new ChromeDriver();
	
	String title="Amrish Puri’s 87th Birthday";
	
	driver.get("https://www.google.com/");
	String otitle = driver.getTitle();
	
	System.out.println("Window get Title    ..."+otitle+"Title value..."+title);
	driver.manage().window().maximize();
	// comparing the titile
	if (title.contentEquals(otitle))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test failed");
	}
	
		driver.close();
	}
	

}
