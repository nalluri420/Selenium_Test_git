package robotAPI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotAPIDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//On POP Window - Press down arrow, Press TAB 3 times and Press enter
		
		// URL:  http://spreadsheetpage.com/index.php/file/yearly_calendar_workbook/
		// Path: C:\Selenium_Req_Soft\geckodriver.exe	
		// Auto-IT, Sicoli etc.
		
		System.setProperty("webdriver.gecko.driver","C:/Selenium_Req_Soft/geckodriver_v.24.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://spreadsheetpage.com/index.php/file/yearly_calendar_workbook");
		
        driver.findElement(By.xpath("//a[@href='http://spreadsheetpage.com/downloads/xl/yearly-calendar.xls']")).click();
        
        // Creation of ROBOT object
        Robot robot = new Robot();
        //Pressing the downarrow key in the KEY BOARD
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        //Enter TAB 3 times
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        //Press Enter on ok button
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        
        
        
	}

}
