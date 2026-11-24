package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {

	
	@Test
	public void verifyLogin()
	{
		WebDriver driver=new ChromeDriver();
		
		try
		{
			
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		LoginPage page=new LoginPage(driver);
		page.enterUsername("tomsmith");
		page.enterPassword("SuperSecretPassword!");
		page.clickLogin();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(d ->page.getMessage().contains("You logged into a secure area!"));
		
		 // Verify result
		Assert.assertTrue(page.getMessage().contains("You logged into a secure area!"));
		System.out.println("login successfullly");
		}
		finally
		{
		driver.quit();
		}
	}
	

}
