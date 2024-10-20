package projet_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelement {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		//Ecrire à l'interieur d'un champs
		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Test");
		
		//driver.close();
		
		
	}

}
	