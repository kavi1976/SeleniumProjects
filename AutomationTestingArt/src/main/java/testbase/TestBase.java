package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
public TestBase()
{
	try{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Selenium_Workspace\\AutomationTestingArt\\src\\main\\java\\config\\config.properties");
		prop.load(ip);
		}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
public static void initialization()
{
	String browserName= prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Workspace\\AutomationTestingArt\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Selenium_Workspace\\AutomationTestingArt\\Drivers\\IEDriverServer.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}
}
