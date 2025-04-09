package TripGain.TripGain;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1_LoginUser extends TripGain_Launch_Quit

{
	
	
    @Test
    
    public void testEnterUsername() throws EncryptedDocumentException, IOException 
    
    {
		LoginUser l1 = new LoginUser(driver);
    	
		l1.Username();
    	l1.Password();
		l1.LoginButton();
    	
    	Assert.assertEquals(driver.getTitle(),"TRIPGAIN - Business Travel Redefined");
    	
    }
}
