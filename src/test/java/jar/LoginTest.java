package jar;
import java.io.IOException;

import org.testng.annotations.Test;

public class LoginTest extends testBase{

	@Test
	public void LoginAPP() throws IOException 
	{
		setup();
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("admin");
		lp.setPasswordId("admin");
		lp.signIn();

	}
	

}
