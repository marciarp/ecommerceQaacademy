package ecommerce_qaacademyPage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void abrirUrl(String url) {	
		driver.get(url);
	}
	
	public void buscarItem(String item) {
		
		//driver.findElement(By.cssSelector("//input[@id='search']")).sendKeys(item); buscar produto
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(item);
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).click(); // clicar na lupa
		

	}

}
