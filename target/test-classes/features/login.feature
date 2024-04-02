#language: pt

@login
Funcionalidade: Login no Sistema
  Como um usuário registrado
  Eu quero ser capaz de fazer login no sistema
  Para poder acessar minha conta

  @login-sucesso
  Cenário: Login bem-sucedido
    Dado que estou na página de login
    Quando eu insiro meu nome de usuário "meu_usuario" e minha senha "minha_senha"
    E eu clico no botão "Login"
    Então devo ser redirecionado para a página inicial
    E devo ver a mensagem "Login realizado com sucesso"

  @login-sucesso-2
  Cenário: Login bem-sucedido com usuario e senha
    Dado que eu realize login com sucesso
