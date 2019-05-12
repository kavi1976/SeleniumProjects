package Main;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		List<WebElement> elem = driver.findElements(By.tagName("a"));
		
		for(WebElement e:elem)
		System.out.println(e.getText() + " " + e.getAttribute("href"));
		
	
		
		driver.close();
	}

}
