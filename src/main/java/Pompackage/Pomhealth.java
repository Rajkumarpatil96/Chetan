package Pompackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomhealth {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Online Plans']")private WebElement online;
@FindBy(xpath="//span[text()='Retirement Plan']")private WebElement retirementtab;
@FindBy(xpath="//div[@id='div-close']")private WebElement popup;


public Pomhealth(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);
	
}

public void hourOnOnline()
{driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//popup.click();
	Actions act=new Actions(driver);
	act.moveToElement(online).perform();
	
	retirementtab.click();
	
}
}
