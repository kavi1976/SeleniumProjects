package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFBPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("kavithasunju@yahoo.co.in");
		
		WebElement password= driver.findElement(By.id("pass"));
		password.sendKeys("ayiani2019");
		
		//WebElement loginbtn=driver.findElement(By.id("u_0_2"));
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='u_0_2']"));
		loginbtn.click();
		
		try
		{
		if (driver.findElement(By.linkText("Home")).isDisplayed())
		
		 {System.out.println("Login successful");}
		}
		catch(Exception e)
		{
		
			System.out.println("Invalid credentials");}
		 
	}

}
