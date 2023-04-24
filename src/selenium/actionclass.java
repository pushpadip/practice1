package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/Softwere/crome/chromedriver.exe");
		
		//chrome browser not opening
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(op);
		
		//open amazon webside
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//search in search bar for required items
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung galaxy a14 5g");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,250)");
		
		Thread.sleep(1000);
		
		//select require item
		WebElement as =driver.findElement(By.xpath("(//*[@class=\"a-size-medium a-color-base a-text-normal\"])[1]"));
		
		as.click();
		
		//new window open so use window handler
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String>it=s.iterator();
		 String w1=it.next();
		 String w2=it.next();
		 driver.switchTo().window(w2);
		 
		j.executeScript("window.scrollBy(0,1000)");
			
		Thread.sleep(1000);
		 
		driver.findElement(By.xpath("//*[@name=\"submit.add-to-cart\"]")).click();
		
		Thread.sleep(1000);
		
		driver.close();
		
		driver.quit();
		
	}

}
