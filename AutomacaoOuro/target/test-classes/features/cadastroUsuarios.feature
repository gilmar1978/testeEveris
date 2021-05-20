#language: pt
Funcionalidade: Cadastro de usuario



EU COMO usuário do sistema
DESEJO realizar o cadastro de novos usuários
PARA QUE seja possível armazenar e gerenciar seus dados


 
   
 Contexto:
   Dado que eu estou acessando o portal
   Quando preencho o nome 
   E preencho o email
   E preencho a senha
   E clico em cadastrar 
   
 @tela1 
 Cenario: Nao deve cadastrar sem digitar o nome  
   Entao o sistema adverte : O campo nome e obrigatorio 
   
 @tela2
 Cenario: Nao deve cadastrar sem digitar o email  
   Entao o sistema adverte : O campo email e obrigatorio
   
   
 Cenario: Nao deve cadastrar sem digitar a senha    
   Entao o sistema adverte : O campo senha e obrigatorio   
   

 Cenario: Nao deve cadastrar sem nome completo 
   Entao o sistema adverte : Por favor, insira um nome completo
   

 Cenario: Nao deve cadastrar sem email valido  
   Entao o sistema adverte : Por favor, insira um email valido
   

 Cenario: Nao deve cadastrar sem senha valida  
   Entao o sistema adverte : A senha deve conter ao menos 8 caracteres
   
   

 Cenario: criando um novo usuario
   Entao um novo usuario sera cadastrado
   
   

 Cenario: excluindo usuario 
   Quando seleciono usuario 
   E clico em excluir     
   Entao o usuario sera excluido
   
   
   
   
   
 