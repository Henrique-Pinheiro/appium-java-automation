#language: pt

Funcionalidade: Login

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @done
  Cenario: Realizar Login no App utilizando, EC e nome de usuário sem dados salvos
    Dado que eu estou na tela de Login
    E preencho o campo de Login com "2006074940"
    Quando eu selecionar o botão Proximo
    E preencher o campo usuário com "cielomult"
    E o campo senha com "Pinheiro123!"
    Então ao pressionar o botão Entrar a tela Home deve ser exibida

  @done
  Cenario: Tentar realizar Login no App, preenchendo o campo de Login com email sem cadastro
    Dado que eu estou na tela de Login
    E preencho o campo de Login com um email não cadastrado
    Quando eu selecionar o botão Proximo
    E o campo senha com "123456"
    Então ao pressionar o botão Entrar, a mensagem "Os dados de acesso estão incorretos." deve ser exibida

  @done
  Cenario: Tentar realizar Login no App, preenchendo o campo de Login com CPF sem cadastro
    Dado que eu estou na tela de Login
    E preencho o campo de Login com um CPF não cadastrado
    Quando eu selecionar o botão Proximo
    E o campo senha com "123456"
    Então ao pressionar o botão Entrar, a mensagem "Os dados de acesso estão incorretos." deve ser exibida
