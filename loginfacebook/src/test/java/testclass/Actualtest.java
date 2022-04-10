package testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import loginfacebook.Loginpage;

public class Actualtest  extends Baseclass {
		
	
	@Test
	public void login() throws IOException {
		
           Loginpage l =new  Loginpage();
		l.loginf();
		l.enterPass();
		l.clicklogin();
		if(driver.getTitle().equals("Facebook – log in or sign up"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			
		}
		
		
	}
}