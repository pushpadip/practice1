package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "G:/dss class/Softwere/crome/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
		driver.manage().window().maximize();
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File d = new File ("C:/Users/Dell/Desktop/new folder/adasda.bmp");
		
		FileUtils.copyFile(s,d);
		
		driver.close();

	}

}
