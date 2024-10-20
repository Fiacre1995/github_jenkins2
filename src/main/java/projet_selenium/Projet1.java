package projet_selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projet1 {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Prendre en charge les drivers 
		WebDriverManager.chromedriver().setup();
		
		
		
		// Préciser le navigateur qui sera utiliser 
		WebDriver driver = new ChromeDriver();
		
		// Temps avant l'exécution de la commande
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.get("https://www.ci.sanlam.com/");
		
		//Taille de l'ecran
		driver.manage().window().maximize();
		
		//Définir une taille précise de l'Ecran
		Dimension size = driver.manage().window().getSize();
		driver.manage().window().setSize(new Dimension(400, 450));
		
		
		// Position de notre fenetre
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY()); 
		
		driver.manage().window().setPosition(new Point(20, 20)) ;
		
		// Temps avant l'exécution de la commande
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//*[@id=\"pop-up-service-client\"]/button")).click();
		
		//Recharger la page
		//driver.navigate().refresh();
		
		
		System.out.println(driver.getTitle());
		
		
		driver.close();
	}

}
