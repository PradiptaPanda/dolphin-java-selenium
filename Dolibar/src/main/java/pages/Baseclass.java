package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	public WebDriver driver;
	@BeforeClass
	public void launch() {
		driver=new FirefoxDriver();
		driver.get("http://localhost:97/dolibarr/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void quit() {
		driver.quit();
	}

}
