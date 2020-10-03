package ecommerce_qaacademyTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ecommerce_qaacademyPage.CarrinhoPage;
import ecommerce_qaacademyPage.HomePage;

public class TestEcommerce {

	@Test
	public void realizarCompra() {
		HomePage home = new HomePage();
		home.buscarItem();

		// CarrinhoPage carrinho = new CarrinhoPage();
		// carrinho.incluirItemNoCarrinho();

	}

//	public void alterarProdutoDoCarrinho() {
//		CarrinhoPage carrinho = new CarrinhoPage();
//		carrinho.alterarItemDoCarrinho();
//		
//	}

//	@After
//	public void fecharDriver() {
//		driver.quit(); // fecha a aba e finaliza a execução
//
//	}

//	@Before
//	public void abreUrl() {
//		driver.get("https://www.kabum.com.br/"); // abrir site);
//}

}
