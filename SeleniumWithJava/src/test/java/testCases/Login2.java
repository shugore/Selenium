 package testCases;

import java.util.logging.Logger;

import org.testng.annotations.Test;

import pageObjects.LoginScreen;

public class Login2 extends BaseClass{
	
	LoginScreen LoginObjects;
	
	@Test
	public void test() throws InterruptedException {
		
		LoginObjects = new LoginScreen(driver);
		
		Thread.sleep(5000);
		LoginObjects.EnterUser();
		//Logger.getLogger(" User Entered");
		Loggertest.info(" User Entered");
		Thread.sleep(5000);
		LoginObjects.EnterPassword();
		
		Thread.sleep(5000);
		LoginObjects.ClickLogIn();
		
	}

}
