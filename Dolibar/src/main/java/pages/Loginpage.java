package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//Global WebDriver driver
	WebDriver driver;
	
	//parameterized constructor which accepts WedDriver as an argument
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(id="username")
	private WebElement usernameTextbox;
	
	@FindBy(id="password")
	private WebElement passwordTextbox;
	
	@FindBy(className="button")
	private WebElement connectionButton;
	
	public void login(String username, String password) {
		usernameTextbox.sendKeys(username);
		passwordTextbox.sendKeys(password);
		connectionButton.click();
	}

}
