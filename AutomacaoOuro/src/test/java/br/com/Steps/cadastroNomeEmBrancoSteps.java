package br.com.Steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import cucumber.runtime.Timeout;
import gherkin.formatter.model.Scenario;

public class cadastroNomeEmBrancoSteps {
	
	private WebDriver driver;
	
	@Dado("^que eu estou acessando o portal$")
	public void queEuEstouAcessandoOPortal() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teste\\Documents\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://prova.stefanini-jgr.com.br/teste/qa/");
	    
	}
	
	@Quando("^preencho o nome$")
	public void preenchoONome() throws Throwable {
		
//		driver.findElement(By.id("name")).sendKeys("");
	   
	}
	
	@Quando("^preencho o email$")
	public void preenchoOEmail() throws Throwable {
		
		
//		driver.findElement(By.id("email")).sendKeys("bernardo@hotmail.com");
	}

	@Quando("^preencho a senha$")
	public void preenchoASenha() throws Throwable {
		
		
		
//		driver.findElement(By.id("password")).sendKeys("12345678");
	    
	}

	@Quando("^clico em cadastrar$")
	public void clicoEmCadastrar() throws Throwable {
		
		
		
//		driver.findElement(By.id("register")).click();	    
	}
	
	@Entao("^o sistema adverte : O campo nome e obrigatorio$")
	public void oSistemaAdverteOCampoNomeEObrigatorio() throws Throwable {
		
		
//		String texto = driver.findElement(By.className("error")).getText();
//		Assert.assertEquals("O campo Nome é obrigatório.", texto);
		
		
		
	}
	
	@After(order = 1)
	public void screenshot() {
		 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
		      FileUtils.copyFile(file,new File("target/screenshots/nome.jpg"));
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
		 
		
		
	}
//	@After(order = 0)
//	public void fecharBrowser() {
//		driver.quit();
//		
//	}


	
	
	
	


}
