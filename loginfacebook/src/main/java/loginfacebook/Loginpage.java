package loginfacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebElement login;
	@FindBy(xpath="//input[@id='email']")
	WebElement Pass;
	@FindBy(xpath="//input[@id='pass']")
	WebElement button;
	@FindBy(xpath="//button[@type='submit']")
	WebDriver driver;
	
	 public Loginpage()
	 
	
	{
		
		PageFactory.initElements(driver,this);
		
		
	}
	public  void loginf() {
		login.sendKeys("rushieksh7kulkarni@gmail.com");
	
		
		
	}
	public void enterPass() {
		Pass.sendKeys("rushi@123");
	}
	
	public void clicklogin() {
	button.click();}
}
