package TripGain.TripGain;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_File 


{
	static String UserName;
	static String Password; 

	public static void username_password() throws EncryptedDocumentException, IOException
	
	{
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\User\\Desktop\\TripGain_Login.xlsx");
		
		Workbook w1 = WorkbookFactory.create(f1);
		
	Sheet login  = w1.getSheet("Login");
	
	UserName =login.getRow(1).getCell(0).getStringCellValue();
	Password = login.getRow(1).getCell(1).getStringCellValue();
	
		
	}
	 
	public static void incorrectusername_password() throws EncryptedDocumentException, IOException
	
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\User\\Desktop\\TripGain_Login.xlsx");
		
		 Workbook w1 = WorkbookFactory.create(f1);
		 
	Sheet login = w1.getSheet("IncorrectLogin");
	
	UserName = login.getRow(1).getCell(0).getStringCellValue();
	
	Password = login.getRow(1).getCell(1).getStringCellValue();
	
	}
	
public static void Empty_UserName_Password() throws EncryptedDocumentException, IOException
	
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\User\\Desktop\\TripGain_Login.xlsx");
		
		 Workbook w1 = WorkbookFactory.create(f1);
		 
	Sheet login = w1.getSheet("EmptyUnPa");
	
	UserName = login.getRow(1).getCell(0).getStringCellValue();
	
	Password = login.getRow(1).getCell(1).getStringCellValue();
	
	}
}
