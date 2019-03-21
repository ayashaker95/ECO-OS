package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import Core.BaseTest;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	
  @Test
  @Parameters({"UserName","Password"})
  public void logintest( String UserName, String Password) { 

	  LoginPage login = new LoginPage(driver);
	  login.loginToSite(UserName,Password);
  }

}




