package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSExecutorMethod {
	
	public static void clickElementByJS(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,200)");
				
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
}
