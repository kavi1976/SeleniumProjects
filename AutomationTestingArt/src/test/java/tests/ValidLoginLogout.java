package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.HomePage_PF;
import pageobjects.LoginPage_PF;

public class ValidLoginLogout {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@Test(priority=0,description="Login Test case")
	public void LoginToFB()
	{
		
		LoginPage_PF loginpage=PageFactory.initElements(driver, LoginPage_PF.class);
		
		loginpage.txtbx_UserName.sendKeys("kavithasunju@yahoo.co.in");
		loginpage.txtbx_Password.sendKeys("ayiani2019");
		loginpage.btn_Login.click();
		System.out.println("Logged into FB");
	}
	
	@Test(description="Log out Test case")
	public void Logout()
	{
		HomePage_PF homepage=PageFactory.initElements(driver, HomePage_PF.class);	
		homepage.lnk_AccountSetting.click();
		homepage.lnk_Logout.click();
		System.out.println("Logged out from FB");	
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
