package Main;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class handleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://C:\\Users\\Kavithavs\\Downloads\\iframe.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframe_b");
		driver.findElement(By.name("a")).sendKeys("Kavitha");
		driver.switchTo().defaultContent();
		driver.findElement(By.name("a")).sendKeys("Navneeth");
		//Test cases for login FB page, flipkart,amazon - valid scenario and invalid
	}
	

}
