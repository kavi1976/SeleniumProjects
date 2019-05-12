package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_PF {
@FindBy(how=How.ID,using="email")
public WebElement txtbx_UserName;

@FindBy(how=How.ID,using="pass")
public WebElement txtbx_Password;

//@FindBy(how=How.XPATH,using="//*@data-testid='royal_login_button'")

@FindBy(how=How.XPATH,using="//input[@value='Log In']")
//By.xpath("//input[@title='Save and Continue Edit']")).click();
public WebElement btn_Login;


}
