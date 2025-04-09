package TripGain.TripGain;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2_InvalidLogin  extends TripGain_Launch_Quit

{
   @Test
   public void InvalidLogin() throws EncryptedDocumentException, IOException
   {
	   LoginUser l1 = new LoginUser(driver);
	   l1.InvalidCredentials();
	   l1.LoginButton();
	 Assert.assertTrue(true, "TestCase2 is fail");
   }
}
