package jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver; 

	By username = By.name("j_username");
	By password = By.name("j_password");
	By signin = By.name("Submit");
	
	public LoginPage(WebDriver driver) {
	
		this.driver = driver;
		
	}
	
	// Set username
	public void setUserId (String userId) {
		
		driver.findElement(username).sendKeys(userId);
		
	}
	
	//Set password
	public void setPasswordId(String passwordId) {
		
		driver.findElement(password).sendKeys(passwordId);
		
	}
	
	// Click sign in
	public void signIn() {
		
		driver.findElement(signin).click();
		
	}
}
