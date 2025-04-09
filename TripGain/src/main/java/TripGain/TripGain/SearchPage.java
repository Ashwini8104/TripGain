package TripGain.TripGain;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage 

{

	WebDriver driver;
	
@FindBy(xpath="(//button[@class=\"jss200 jss174 jss176 jss179 jss195\"])[1]")
WebElement home;

@FindBy(xpath="//div[contains(@id, 'react-select-10-placeholder')]")
WebElement origin;



public void Origin() throws InterruptedException
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id, 'react-select-4-placeholder')]")));
	origin.sendKeys("BOM");
	
}



public SearchPage(WebDriver driver)

{
	
	this.driver = driver;
  PageFactory.initElements(driver, this);
	 
}

}
