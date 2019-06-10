package jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage {
	
	WebDriver driver; 

	By signout = By.linkText("注销");

	public SignOutPage(WebDriver driver) {
	
		this.driver = driver;
		
	}
	
	// Click sign in
	public void signout() {
		
		driver.findElement(signout).click();
		
	}
}