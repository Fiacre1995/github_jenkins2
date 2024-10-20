package projet_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clavier {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		/*
		//Valider au clavier avec la touche ENTRER
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Voiture 2022" +Keys.ENTER);
		
		Thread.sleep(200);
		
		// Faire un CONTROLE A
		Actions actionProvider = new Actions(driver) ;
		Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();
		*/
		
		Thread.sleep(200);
		
		// ECRIRE En majuscule et miniscule
		driver.get("http://www.google.com/");
		Actions actionProvider1 = new Actions(driver) ;
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		actionProvider1.keyDown(Keys.SHIFT).sendKeys(searchbox, "mercedes ")
		.keyUp(Keys.SHIFT).sendKeys("mercedes").perform();
		
	}

}
