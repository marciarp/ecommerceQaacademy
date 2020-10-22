package page;

import java.io.IOException;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoBuscaPage extends BasePage {

	public ResultadoBuscaPage(WebDriver driver) {
		super(driver);
	}

	public void clicarNoProduto() throws IOException {
		logger.info("clicaNoProduto");
		driver.findElement(By.xpath("//img[@id='product-collection-image-2439']")).click(); // Clicando no produto
		takeScreenShot("Clica Produto");
	}

	public void clicarNoNovoProduto() throws IOException {
		logger.info("clicaNoNovoProduto");
		driver.findElement(By.xpath("//img[@id='product-collection-image-2256']")).click(); // Clicando no produto
		takeScreenShot("Clica Novo Produto");
	}
}
