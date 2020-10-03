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
import ecommerce_qaacademyPage.ResultadoBuscaPage;

public class TestEcommerce {
	WebDriver driver;
		
	@Before
	public void abreUrl() {
//		driver = new ChromeDriver();	
}

	@Test
	public void realizarCompra() {
		
		HomePage home = new HomePage(driver);
		ResultadoBuscaPage resultbusca = new ResultadoBuscaPage();
				
		home.abrirUrl ("http://www.supermercadodospets.com.br");
		home.buscarItem();
		
		resultbusca.clicarNoProduto();

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



}
