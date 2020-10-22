package page;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import exceptions.ElementoNaoEncontradoException;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void abrirUrl(String url) {
		driver.get(url);
	}

	public void buscarProduto(String item) throws ElementoNaoEncontradoException {
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(item); // clicando no campo de busca
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).click(); // clicando
																													// na
																													// lupa
	}

	public void buscarNovoProduto(String item) throws ElementoNaoEncontradoException {
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(item); // buscando novo produto
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/i[1]")).click(); // clicando
																															// na
																															// lupa
	}
}
