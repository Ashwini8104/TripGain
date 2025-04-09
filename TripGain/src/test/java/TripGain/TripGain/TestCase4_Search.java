package TripGain.TripGain;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4_Search extends TripGain_Launch_Quit


{
	
	@Test
	public void Search_City() throws InterruptedException, EncryptedDocumentException, IOException
	
	{
		LoginUser l1 = new LoginUser(driver);
    	l1.Username();
    	l1.Password();
		l1.LoginButton();
    	
    	Assert.assertEquals(driver.getTitle(),"TRIPGAIN - Business Travel Redefined");
    	
		SearchPage s1 = new SearchPage(driver);
		s1.Origin();
		
	
		
	}

}
