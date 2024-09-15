package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {

	public WebDriver ldriver;

	public LoginScreen(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement Username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement Password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement LogIn;

	public void EnterUser() {

		Username.sendKeys("Admin");

	}

	public void EnterPassword() {

		Password.sendKeys("admin123");

	}
	
	public void ClickLogIn() {

		LogIn.click();

	}

}
