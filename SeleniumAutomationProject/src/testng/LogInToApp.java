package testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogInToApp {
WebDriver driver=null;
@Test
public void HomePage1()
{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("first started");
	driver.navigate().to("https://www.google.com");
	
	Assert.assertEquals("Google1", driver.getTitle(),"I'm hard failed");
	System.out.println("Hard assert success1");
	
	Assert.assertEquals("Google", driver.getTitle());
	System.out.println("Hard assert failed1");
	
	System.out.println(" Test Case 1 executed successfully");
	
}

@Test
public void HomePage2()
{
	SoftAssert softassert=new SoftAssert();
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("second started");
	driver.navigate().to("https://www.google.com");
	
	softassert.assertEquals("Google1", driver.getTitle(),"I got failed");
	System.out.println("Soft assert failed");
	
	softassert.assertEquals("Google", driver.getTitle());
	System.out.println("Soft assert success");
	
	System.out.println(" Test Case two executed successfully");
	softassert.assertAll();
	
}
@AfterMethod
public void tearDown()
{
	driver.close();
}

}
