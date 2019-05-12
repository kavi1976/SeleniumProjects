package Main;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\SeleniumAutomationProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
				/*implicit wait
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 */
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		ele.sendKeys("kavithasunju@yahoo.co.in");
		
		WebElement ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		ele1.sendKeys("ayiani2019");
		
		//WebElement ele2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Forgotten account']")));
		//ele2.click();
		driver.findElement(By.name("firstname")).sendKeys("Kavitha");
		driver.findElement(By.name("lastname")).sendKeys("VS");
		
		Select s= new Select(driver.findElement(By.name("birthday_day")));
			s.selectByValue("06");
			Select s1= new Select(driver.findElement(By.name("birthday_month")));
			s1.selectByValue("12");
			//s1.selectByVisibleText("Aug");
			Select s2= new Select(driver.findElement(By.name("birthday_year")));
			s2.selectByValue("1977");
			
			
			
				System.out.println("End");
		//driver.close();
	}

}
