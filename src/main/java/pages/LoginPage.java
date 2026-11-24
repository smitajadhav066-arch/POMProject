package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// locagtors
	By username = By.id("username");
	By password = By.id("password");
	By loginbtn = By.cssSelector("button[type='submit']");
	By message = By.id("flash");

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// method:enter username
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys("tomsmith");
	}

	// method:enter password
	public void enterPassword(String passwrod) {
		driver.findElement(password).sendKeys("SuperSecretPassword!");
	}

	// method:click on login btn
	public void clickLogin() {
		driver.findElement(loginbtn).click();
	}

	// get success message
	public String getMessage() {
		return driver.findElement(message).getText();

	}
}
