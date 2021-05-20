package ValidarValor;



import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

import cucumber.api.java.pt.Quando;

public class validarValorSteps {

	private static validarValorPageObject validarValor;

	public validarValorSteps() {

		validarValor = new validarValorPageObject();
		
	}
	


	@Dado("^que estou no site da loja$")
	public void que_estou_no_site_da_loja() throws Throwable {
		validarValor.acessarSite();	

	}  
	
	@Dado("^faço o login$")
	public void faço_o_login() throws Throwable {
	    validarValor.clicaBotaoLogin();
	}
	
	@Dado("^digito o email \"([^\"]*)\"$")
	public void digito_o_email(String email) throws Throwable {
		validarValor.preencheEmail(email);
	   
	}

	@Dado("^digito a senha \"([^\"]*)\"$")
	public void digito_a_senha(String senha) throws Throwable {
	   validarValor.preencheSenha(senha);
	}
	
	@Dado("^confirmo login$")
	public void confirmo_login() throws Throwable {
		validarValor.clicaConfirmaBotaoLogin();
		
	   
	}
	
	@Quando("^seleciono estilo$")
	public void seleciono_estilo() throws Throwable {
	   validarValor.selecionaClicaEstilo();
	}


	@Quando("^seleciono produto$")
	public void seleciono_produto()  {
		validarValor.selecionaClicaProduto();
	    
	}

	@Quando("^clico no botao add to cart$")
	public void clico_no_botao_add_to_cart() {
		validarValor.clicaAddCart();
	   
	}

	@Quando("^clico no botao proceed to checkout$")
	public void clico_no_botao_proceed_to_checkout() throws Throwable {
		validarValor.clicaProceedToCheckout();
	 
	}

	@Entao("^visualizo o valor$")
	public void visualizo_o_valor() throws Throwable {
	   
	}
	
}
