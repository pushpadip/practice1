package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//*[@class=\"upload_txt\"]"));
		
		a.sendKeys("C:/Users/Dell/Downloads/RequiredJar.DOCX");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();		
		

	}

}
