package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
@BeforeMethod
public void StartBrowser()
{
	System.out.println("Starting Browser");
}
@Test(priority=0,description="Login Test case")
public void LoginToFB()
{
	System.out.println("Logged into FB");	
}
@Test(priority=3,description="Log out Test case")
public void Logout()
{
	System.out.println("Logged out of FB");	
}
@Test(priority=1,description="AddToCart Test Case")
public void AddToCart()
{
	System.out.println("Added to Cart");	
}
@Test(priority=2,description="Payment Test Case",dependsOnMethods="AddToCart")
public void Payment()
{
	System.out.println("Payment in progress");	
}
@AfterMethod
public void CloseBrowser()
{
	System.out.println("Closing Browser");
}
}
