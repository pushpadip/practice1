package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertpopup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:/dss class/Softwere/chrome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("adas");
		
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		String a =driver.switchTo().alert().getText();	
		
		System.out.println(a);
		
	
	}

}
