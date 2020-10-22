package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarrinhoPage extends BasePage {

	final String PRECO_PRODUTO = "//body/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[3]/div[1]/div[2]/div[2]/span[1]/span[1]"; // preço
																																				// do
																																				// produto

	public CarrinhoPage(WebDriver driver) {
		super(driver);
	}

	public String retornaValorProduto() throws IOException {
		logger.info("Retorna Valor do Produto");
		takeScreenShot("Retorna Valor do Produto");
		return driver.findElement(By.xpath(PRECO_PRODUTO)).getText();
	}

	public void incluirProdutoNoCarrinho() {
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[2]/div[6]/div[1]/button[1]/span[1]/span[1]"))
				.click(); // adicionando produto no carrinho
	}

	public void alterarProdutoDoCarrinho() {
		driver.findElement(By.xpath("//a[contains(text(),'+')]")).click(); // aumentando a quantidade do produto
	}

	public void excluirProdutoDoCarrinho() {
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]")).click();// excluindo produto do carrinho
	}

	public void incluirNovoProdutoNoCarrinho() {
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[2]/div[7]/div[1]/button[1]/span[1]/span[1]"))
				.click(); // adicionando produto novo ao carrinho
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]/span[1]/span[1]"))
				.click(); // clicando em Finalizar
	}
}
