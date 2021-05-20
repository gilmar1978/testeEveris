package ValidarValor;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import servicos.Driver;
import utilidades.Utilidades;

public class validarValorPageObject extends Utilidades {

	private By clicaSignIn = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
	private By cmpEmail = By.id("email");
	private By cmpSenha = By.id("passwd");
	private By clicaSignIn2 = By.id("SubmitLogin");
	private By escolhaEstilo = By.xpath("//*[@id='block_top_menu']/ul/li[1]/a");	
	private By escolhaProduto = By.xpath("//*[@id=\'center_column\']/ul/li[5]/div/div[1]/div/a[1]/img");
	private By clicaBtnAdiciona = By.xpath("//*[@id=\'add_to_cart\']/button");  
	private By clicaBTnProceedCheckout = By.xpath("//*[@id=\'add_to_cart\']/button");


	public static void acessarSite() {	 
		Driver.getInstance();
		Driver.getInstance().get("http://automationpractice.com/index.php");
	}
	

	public void clicaBotaoLogin() {
		clicar(this.clicaSignIn);
		
		
	}
	

	public void preencheEmail(String email) {
	esperaAteElementoEstarClicavel(cmpEmail);
	limpaEInsereTexto(email, this.cmpEmail);
		
	}
	
    public void preencheSenha(String senha) {
    	esperaAteElementoEstarClicavel(cmpSenha);
    	limpaEInsereTexto(senha, this.cmpSenha); 	
		
		
	}
    

	public void clicaConfirmaBotaoLogin() {	
		clicar(this.clicaSignIn2);
		
		
	}
	
    public void selecionaClicaEstilo() {
    	clicar(this.escolhaEstilo);
		
		
	}




	public void selecionaClicaProduto() {	
		clicar(this.escolhaProduto);
		
		
	}	
	

	
	
	

	public void clicaAddCart() {
		clicar(this.clicaBtnAdiciona);
		
	}
		
	public void alteraAba()   {
		for(String winHandle : driver.getWindowHandles() ) {
			driver.switchTo().window(winHandle);
			}	
		
		}	
	

	public void clicaProceedToCheckout() {
		clicar(this.clicaBTnProceedCheckout);
		
		
	}





	



	
	
	
	
	
}