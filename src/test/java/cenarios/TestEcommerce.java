package cenarios;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.MidiDevice.Info;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utils.LeitorMassaJson;
import exceptions.ElementoNaoEncontradoException;
import page.BasePage;
import page.CarrinhoPage;
import page.HomePage;
import page.LoginPage;
import page.ResultadoBuscaPage;

public class TestEcommerce {
	WebDriver driver;
	
	HomePage homePage;
	ResultadoBuscaPage resultadoBuscaPage;
	CarrinhoPage carrinhoPage;
	LoginPage loginPage;
	LeitorMassaJson leitorMassa;
	public static final Logger logger = Logger.getLogger(TestEcommerce.class);

	
	
	@Before
	public void before() throws IOException {
		leitorMassa = new LeitorMassaJson();
		leitorMassa.leitorJson();
		verificaSistemaOperacionalESetaChromeDriver();
		configuraChromeDriver();
		homePage = new HomePage(driver);
		resultadoBuscaPage = new ResultadoBuscaPage(driver);
		carrinhoPage = new CarrinhoPage(driver);
		loginPage = new LoginPage(driver);
	}

	@After
	public void fecharSite() {
		driver.quit();

	}

	@Test
	public void realizarCompra() throws IOException, ElementoNaoEncontradoException {
		try {
			String preco = leitorMassa.getMassa("preco_atual");
//			homePage.abrirUrl("http://www.supermercadodospets.com.br");
			homePage.abrirUrl(leitorMassa.getMassa("url"));			
//			homePage.buscarProduto("coleira");
			homePage.buscarProduto(leitorMassa.getMassa("produto"));
			resultadoBuscaPage.clicarNoProduto();
			String valorSite = carrinhoPage.retornaValorProduto();
			logger.info("Valor Retornado: " + valorSite);
			logger.info(preco);
			assertEquals("Valor diferente do que o esperado:", preco, valorSite);
		} catch (Exception e) {
			logger.info(e.getStackTrace() + " " + e.getMessage());
		}
	carrinhoPage.incluirProdutoNoCarrinho();
	carrinhoPage.alterarProdutoDoCarrinho();
	carrinhoPage.excluirProdutoDoCarrinho();
	homePage.buscarNovoProduto("ração");
	resultadoBuscaPage.clicarNoNovoProduto();
	carrinhoPage.incluirNovoProdutoNoCarrinho();
	loginPage.realizarLogin();
	}
	

	private void configuraChromeDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	private void verificaSistemaOperacionalESetaChromeDriver() {
		System.out.println(System.getProperty("os.name"));
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			System.setProperty("/Users/Marcia de Paula/Desktop/ProjetoAutomação/chromedriver", "chromedriver.exe");
		} else {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		}
	}
		
}
