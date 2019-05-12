package helper;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCapture {

	public static String getScreenshot(WebDriver driver,String screenshotname) throws Exception
	{
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		String destination= System.getProperty("user.dir")+"//FailedTestsScreenshots//"+screenshotname+dateName+".png";
		File finalDestination= new File(destination);
		FileHandler.copy(source, finalDestination);
		return destination;
	}
}
