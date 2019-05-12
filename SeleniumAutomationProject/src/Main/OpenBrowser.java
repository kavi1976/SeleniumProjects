package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Webdriver d=new InternetExplorerDriver();
		//driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		/*String Expected = "Facebook";
		String Actual = driver.getTitle();
		if (Actual.equals(Expected))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");*/
	WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("kavithasunju@yahoo.co.in");
		
		WebElement password= driver.findElement(By.id("pass"));
		password.sendKeys("ayiani2019");
		
		WebElement loginbtn=driver.findElement(By.id("u_0_2"));
		loginbtn.click();
		
		
		
		WebElement validate = driver.findElement(By.linkText("Recover Your Account"));
		/* absolute xpath reference and relative xpath reference
		 link //a[@href=' '] or
		 //a[text()=' ']
		  textbox - //input[@class=' ']
		  xpath =//input[@name='uid']
		 
		 xpath=//* contains(@name,'sub')
		 Xpath= //*[@type='submit' AND @name='btnReset']
		 same way OR can be used
		 XPath=//label[starts-with(@id,'message')]
		 */
		
		Thread.sleep(2000);
		System.out.println(validate.getText());
		
		if(validate.isDisplayed())
		{
			System.out.println("Test case failed");
			
		}
				
		else{
			System.out.println("Error");
		}
			
		
		
		driver.quit();

	}

}
