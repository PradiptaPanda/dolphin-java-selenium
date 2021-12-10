package testcases;
import org.testng.annotations.Test;

import pages.Baseclass;
import pages.Homepage;
import pages.Loginpage;

public class login_logout extends Baseclass {
	
	@Test
	public void testLoginLogout() {
		Loginpage lp=new Loginpage(driver);
		lp.login("admin", "admin");
		
		Homepage lo=new Homepage(driver);
		lo.logout();
	}

}
