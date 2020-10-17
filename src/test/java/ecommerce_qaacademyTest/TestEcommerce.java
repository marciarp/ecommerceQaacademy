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
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeOptions;
import exceptions.ElementoNaoEncontradoException;


public class TestEcommerce {
	WebDriver driver;
	HomePage homePage;
	ResultadoBuscaPage resultadoBuscaPage;
	CarrinhoPage carrinhoPage;
		
	@Before
	public void before() {
		// verificasistema operacional
		// configura chromeDriver
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		resultadoBuscaPage = new ResultadoBuscaPage(driver);
		carrinhoPage = new CarrinhoPage(driver);
}
	
	@Test
	public void realizarCompra() {						
		homePage.abrirUrl ("http://www.supermercadodospets.com.br");
	//	homePage.buscarItem("coleira");
	//	resultadoBuscaPage.clicarNoProduto();
	//	carrinhoPage.incluirItemNoCarrinho();
	}
	
	@After
	public void fecharSite() {
		driver.quit();

	}


//	public void alterarProdutoDoCarrinho() {
//		CarrinhoPage carrinho = new CarrinhoPage();
//		carrinho.alterarItemDoCarrinho();
//		
//	}


}
