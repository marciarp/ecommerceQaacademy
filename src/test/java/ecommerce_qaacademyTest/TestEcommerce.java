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
	HomePage homePage;
	ResultadoBuscaPage resultadoBuscaPage;
	CarrinhoPage carrinhoPage;
		
	@Before
	public void before() {
		// verificasistema operacional
		// configura chromeDriver
		homePage = new HomePage(driver);
}
	
	@After
	public void fecharSite() {
		driver.quit();

	}


	@Test
	public void realizarCompra() {						
		homePage.abrirUrl ("http://www.supermercadodospets.com.br");
	//	homePage.buscarItem("coleira");
	//	resultadoBuscaPage.clicarNoProduto();
	//	carrinhoPage.incluirItemNoCarrinho();
	}

//	public void alterarProdutoDoCarrinho() {
//		CarrinhoPage carrinho = new CarrinhoPage();
//		carrinho.alterarItemDoCarrinho();
//		
//	}





}
