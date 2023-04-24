package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exelshit {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "G:/dss class/Softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//*[@name='email']"));
		
		a.sendKeys("adadas");
		
		FileInputStream exel = new FileInputStream("C:/Users/Dell/Desktop/new folder/asad.xlsx");
		
		Sheet b  = WorkbookFactory.create(exel).getSheet("Sheet1");
		
		String c = b.getRow(0).getCell(0).getStringCellValue();
		
		String d = b.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(c);
		
		System.out.println(d);
		
		System.out.println(c +"" + d);
		
		
	}

}
