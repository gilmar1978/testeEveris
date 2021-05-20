# language: pt

Funcionalidade: Validar valor no carrinho

	Eu como usuario final quero visualizar o valores dos produtos no carrinho
	
Esquema do Cenário: validar valor 
  Dado que estou no site da loja
  E faço o login 
  E digito o email "<email>"
  E digito a senha "<senha>"
  E confirmo login
  Quando seleciono estilo
  E seleciono produto
  E clico no botao add to cart
  E clico no botao proceed to checkout
  Entao visualizo o valor
  
  
Exemplos:
		|email                  |senha     | 
		|email@email.email      |tester123 |