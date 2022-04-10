package testclass;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

//import utilityfile.Readconfig;

public class Baseclass {

	//Readconfig readconf=new Readconfig();
	 public static WebDriver driver;
	//public String  url =readconf.getApplicationURL();
	
	 @BeforeClass
@Parameters ("Browser")
	
	public void setup(String br) {
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");		
		     driver=new ChromeDriver();
	
	}
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");		
		driver.manage().window().maximize();
		
}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/screenshot/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}		
	}


	