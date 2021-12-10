package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	//parameterized constructor which accepts WedDriver as an argument
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(className="login")
	private WebElement logoutButton;
	
	public void logout() {
		logoutButton.click();
	}

}
