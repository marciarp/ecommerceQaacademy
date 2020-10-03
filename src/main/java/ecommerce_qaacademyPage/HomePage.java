package ecommerce_qaacademyPage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver = new ChromeDriver();

	public void buscarItem() {
		driver.get("https://www.supermercadodospets.com.br/"); // abrir site);

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("coleira"); // buscar produto

		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).click(); // clicar
																													// na
																													// lupa

		driver.findElement(By.xpath("//img[@id='product-collection-image-2439']")).click(); // Clicando no produto

		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[2]/div[6]/div[1]/button[1]/span[1]/span[1]"))
				.click(); // adicionar ao carrinho

		driver.findElement(By.xpath("//a[contains(text(),'+')]")).click();// mudar quantidade

		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]")).click();// excluir produto do carrinho

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ração"); // buscar novo produto

		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/i[1]")).click(); // lupa

		driver.findElement(By.xpath("//img[@id='product-collection-image-2256']")).click(); // Clicando no produto

		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[2]/div[7]/div[1]/button[1]/span[1]/span[1]"))
				.click(); // adicionar ao carrinho

		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]/span[1]/span[1]"))
				.click(); // finalziando a compra

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("teste.teste@gmail.com");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("teste01");

	}

}
