package ecommerce_qaacademyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResultadoBuscaPage {
	WebDriver driver;
	
	public ResultadoBuscaPage(WebDriver driver) {
		this.driver = driver;
	}


	public void clicarNoProduto() {

	driver.findElement(By.xpath("//img[@id='product-collection-image-2439']")).click(); // Clicando no produto
	
	
}
}
