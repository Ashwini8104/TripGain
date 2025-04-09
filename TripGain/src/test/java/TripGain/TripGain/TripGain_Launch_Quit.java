package TripGain.TripGain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TripGain_Launch_Quit 


{

	WebDriver driver;
	
	@BeforeMethod
	
	public void Launch_TripGain() throws InterruptedException
	
	{
		 driver = new ChromeDriver();
		 
		 driver.get("https://v3.tripgain.com/flights");
		 
		 driver.manage().window().maximize();
	   
		
	}
	
	
}
