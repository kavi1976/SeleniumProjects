package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGoogleHomePage {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	@Test(priority=0)
	public void VerifyCorrectTitle()
	{
		/*String Actual = driver.getTitle();
		String Expected = "Google";
		if (Actual.equals(Expected))
			System.out.println("Test case passed");*/
		Assert.assertEquals(driver.getTitle(), "Google");
		
		
	}
	@Test(priority=1)
	public void VerifyWrongTitle()
	{
		/*String Actual = driver.getTitle();
		String Expected = "Google1";
		if (Actual.equals(Expected))
			System.out.println("Test case failed");
		else
			System.out.println("Test case passed");*/
		Assert.assertEquals(driver.getTitle(), "Google1");
	}
	@Test(priority=2, dependsOnMethods="VerifyWrongTitle")
	public void searchName()
	{
		System.out.println("Searching name");
	}
	@Test(priority=3, dependsOnMethods="VerifyCorrectTitle")
	public void searchMail()
	{
		System.out.println("Searching mail");
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
