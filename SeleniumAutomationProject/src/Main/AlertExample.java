package Main;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		WebElement srbtn=driver.findElement(By.className("src_btn"));
		//driver.findElement(By.xpath("//*[@class='src_btn']")).click();
		srbtn.click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
	}

}
