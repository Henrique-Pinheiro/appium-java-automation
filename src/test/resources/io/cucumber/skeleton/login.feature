#language: pt

Funcionalidade: Login

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @done 
  Cenario: Realizar login no App utilizando, EC e nome de usuário sem dados salvos
    Dado que eu estou na tela de Login
    E preencho o campo de Login com o EC "2006074940"
    Quando eu selecionar o botão Proximo
    E preencher os campos usuário com "cielomult" e senha com "s@2006074940"
    Então ao pressionar o botão Entrar a tela Home deve ser exibida

