package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class scrollbar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","G:/chome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		j.executeScript("window.scrollBy(0, 1000)");
		
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(0, -1000)");

	}

}
