package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:/chrome/New folder/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@target='_blank']")).click();
		
		Set<String> a = driver.getWindowHandles();
		
		Iterator<String> b = a.iterator();
		
		b.next();
		
		String c = b.next();
		
		driver.switchTo().window(c);
		
		driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("sdhjds@GMAIL.COM");
		
		driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
		
		driver.findElement(By.xpath("//*[@style='font-size:16px;']")).click();
	}

}
