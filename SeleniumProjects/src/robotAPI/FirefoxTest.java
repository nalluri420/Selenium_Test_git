package robotAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxTest {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:/Selenium_Req_Soft/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "C:/Selenium_Req_Soft/geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		FirefoxDriver driver;
		driver = new FirefoxDriver(capabilities);*/
		

	}

}
