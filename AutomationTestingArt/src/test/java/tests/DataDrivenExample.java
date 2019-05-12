package tests;
import utility.ExcelUtils;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenExample {

	
		WebDriver driver;
		@DataProvider(name="Authentication")
		public static Object[][] credentials() throws Exception 
		{
			/*return new Object[][]
					{
				{"kavithasunju@yahoo.co.in","ayiani2019"},{"testuser1", "love123"}				
					};*/
			ExcelUtils.setExcelFile("C:\\Kavitha\\mydata.xlsx","Sheet1");
			Object[][] obj=ExcelUtils.getExcelData();
			return obj;
		}
		/*@BeforeMethod
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		}*/

		//@Test(priority=0,description="Login Test case")
		@Test(dataProvider="Authentication")
		public void LoginToFB(String Username, String Password) throws AWTException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys(Username);
			
			driver.findElement(By.id("pass")).sendKeys(Password);
			
			
			driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
			driver.close();
			
						
		}
	/*	@AfterMethod
		public void tearDown()
		{
			driver.close();
		}*/
	}

