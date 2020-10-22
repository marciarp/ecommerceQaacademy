package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void realizarLogin() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("teste.teste@gmail.com"); // colocando e-mail
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("teste01"); // colocando senha
	}
}
