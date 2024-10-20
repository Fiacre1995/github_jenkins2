package projet_selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture_Ecran {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.netflix.com/ci/");
		
		
		File scrFile = (File) (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE)) ;
		FileUtils.copyFile(scrFile, new File("./image2.png"));
	}

}
