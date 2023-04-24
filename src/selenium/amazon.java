package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "G:/dss class/Softwere/crome/chromedriver.exe");
		
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(op);
		
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		catch(NoAlertPresentException e) {
			System.out.println("no alert");
		}
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("headphones");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).sendKeys(Keys.ENTER);
		
		System.out.println("headphone search");
			
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).click();
		
		System.out.println("click on star");
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s = new Select(dropdown);
		
		s.selectByVisibleText("Amazon Fashion");
		
	List<WebElement>b=s.getOptions();
	int size = b.size();
	System.out.println(size);
	for(int i=0; i<size;i++) {
		String text = b.get(i).getText();
		System.out.println(text);
	}
		
		Thread.sleep(3000);
//		
		driver.close();
//	}
	}

}
