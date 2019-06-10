package jar;
import java.io.IOException;
import org.testng.annotations.Test;


public class SignOutTest extends testBase{

	@Test
	public void SignOutAPP() throws IOException 
	{
		SignOutPage sp = new SignOutPage(driver);
		sp.signout();
	}
	

}
