package jar;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {

	public static WebDriver driver = null;
	

	public void setup() throws IOException{
		
		// read setting from external file
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream("D:\\Mvn\\Project\\src\\main\\java\\jar\\global.config");
		p.load(fi);
		
		// Print info
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));
		
		// Open browser based on setting
		if (p.getProperty("browser").contains("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe"); 
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else {
			// Other browsers
		}
		
		//Get URL
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
}
