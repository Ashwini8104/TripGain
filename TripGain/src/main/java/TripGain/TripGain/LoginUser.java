package TripGain.TripGain;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUser 

{
	WebDriver driver;
	
	//locating each element using FindBy annotation
   @FindBy(name ="username")
   WebElement Username1;
   
   
   @FindBy(name ="password")
   WebElement Password1;
   
   @FindBy(xpath ="//button[text()='Login']")
   WebElement LoginBtn;
   
   @FindBy(xpath="//div[@class=\"jss301 jss304\"]")
   WebElement invaidcredentialsAlert;
   
   
   @FindBy(id="react-select-8--value")
   WebElement Source;           
   
   
   
   public void Username() throws EncryptedDocumentException, IOException
   
   {
       DDT_File.username_password();
	   Username1.sendKeys(DDT_File.UserName);
   }
   
   public void Password() throws EncryptedDocumentException, IOException
   
   {
	   DDT_File.username_password();
	   Password1.sendKeys(DDT_File.Password);
   }
   
   public void LoginButton()
   {
	   LoginBtn.click();
   }
   
   public void InvalidCredentials() throws EncryptedDocumentException, IOException
   {
	   DDT_File.incorrectusername_password();
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.visibilityOf(Username1));
	   Username1.sendKeys(DDT_File.UserName);
	   Password1.sendKeys(DDT_File.Password);
	   
	  try
	   
	   {
		   if(invaidcredentialsAlert.isDisplayed()==true)
		   {
			   
			 //Reporter.log("Test Case 1 is fail due to incorrect username");
			   
		   }
	   }
	   catch(org.openqa.selenium.NoSuchElementException a)
	   {
		   DDT_File.incorrectusername_password();
		   Password1.sendKeys(DDT_File.Password);
		      
	   }
	  
	   
   }
   
   public void EmptyUnPasswrd()
   {
	   
   }
   
   public void origndrop()
   {
	   Source.sendKeys("Mumbai");
   }
   
 public  LoginUser(WebDriver driver)
 {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);  // Initializing @FindBy elements
 }
 
}
