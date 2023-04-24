package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("By.Remotable")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.linkText("AbstractAnnotations")).click();
	}

}
