package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pompackage.Pomhealth;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng {
	Pomhealth health;
	WebDriver driver;
	@BeforeSuite
	public void lounchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.kotaklife.com/");
		driver.manage().window().maximize();
		
	}
	
	@BeforeClass
	public void assingDriver()
	{
		 health = new Pomhealth(driver); 
	}
  @Test
  public void validateUrl() {
	  health.hourOnOnline();
	 String url = driver.getCurrentUrl();
	boolean expturl = url.contains("retirement");
	 Assert.assertTrue(expturl);
	 Reporter.log("Test case is validate ,test case is pass",true);
	  
	  
  }
}
