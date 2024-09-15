package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginScreen;

public class Login3 extends BaseClass{
	
	LoginScreen LoginObjects;
	
	@Test
	public void Test() throws InterruptedException {
		
		Loggertest = reports.createTest("LoginClass");

		Loggertest.info("LoginClass");
		//log.info("CurbSidePickupNowFrom_HomeScreen Method Started");
		
		LoginObjects = new LoginScreen(driver);
        
		Thread.sleep(3000);
		LoginObjects.EnterUser();
		Loggertest.pass("User Entered");

		LoginObjects.EnterPassword();
		Loggertest.pass("Password Entered");

		LoginObjects.ClickLogIn();
		Loggertest.pass("Login Clicked");
		
	}

}
