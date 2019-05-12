package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.JSExecutorMethod;
import testbase.TestBase;
import helper.ScreenshotCapture;

public class TestJSMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestBase tb=new TestBase();
		tb.initialization();
		
		WebElement elem=TestBase.driver.findElement(By.linkText("Forgotten account?"));
		JSExecutorMethod.clickElementByJS(elem, TestBase.driver);
		//JSExecutorMethod.scrollPageDown(TestBase.driver);
		WebElement elem1=TestBase.driver.findElement(By.linkText("Login help"));
		JSExecutorMethod.scrollIntoView(elem1, TestBase.driver);
		
		//JSExecutorMethod.clickElementByJS(elem1, TestBase.driver);
		JSExecutorMethod.drawBorder(elem1, TestBase.driver);
		ScreenshotCapture.getScreenshot(TestBase.driver, "kavitha");
	}

}
