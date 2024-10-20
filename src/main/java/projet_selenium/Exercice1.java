package projet_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercice1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.netflix.com/ci/");
		
		driver.get("http://google.com/");
		
		driver.close();
		
		// permet de fermer toutes les fenetres
		//driver.quit()
		
		/* 
		 * Ecemple de commentaire sur plusieurs lignes 
		 */
		
		
	}

}
