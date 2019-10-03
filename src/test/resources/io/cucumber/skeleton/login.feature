#language: pt

Funcionalidade: Login

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @done
  Cenario: Realizar Login no App
    Dado que eu estou na tela de Login
    E preencho o campo de Login com ""
    Quando eu selecionar o botão Proximo
    E preencher o campo usuário com ""
    E o campo senha com ""
    Então ao pressionar o botão Entrar a tela Home deve ser exibida

  @done
  Cenario: Realizar Login com usário no App utlizando, Email sem dados salvos
    Dado que eu estou na tela de Login
    E preencho o campo de Login com ""
    Quando eu selecionar o botão Proximo
    E o campo senha com ""
    Então ao pressionar o botão Entrar a tela Home deve ser exibida

  @done
  Cenario: Realizar Login com usário no App utlizando, CPF sem dados salvos
    Dado que eu estou na tela de Login
    E preencho o campo de Login com ""
    Quando eu selecionar o botão Proximo
    E o campo senha com ""
    Então ao pressionar o botão Entrar a tela Home deve ser exibida

  @done
  Cenario: Tentar realizar Login no App, preenchendo o campo de Login com EC e usuário sem cadastro
    Dado que eu estou na tela de Login
    E preencho o campo de Login com ""
    Quando eu selecionar o botão Proximo
    E preencher o campo usuário com ""
    E o campo senha com ""
    Então ao pressionar o botão Entrar, a mensagem "" deve ser exibida

  @done
  Cenario: Tentar realizar Login no App, preenchendo o campo de Login com email sem cadastro
    Dado que eu estou na tela de Login
    E preencho o campo de Login com um email não cadastrado
    Quando eu selecionar o botão Proximo
    E o campo senha com ""
    Então ao pressionar o botão Entrar, a mensagem "" deve ser exibida

  @done
  Cenario: Tentar realizar Login no App, preenchendo o campo de Login com CPF sem cadastro
    Dado que eu estou na tela de Login
    E preencho o campo de Login com um CPF não cadastrado
    Quando eu selecionar o botão Proximo
    E o campo senha com ""
    Então ao pressionar o botão Entrar, a mensagem "" deve ser exibida
    
  @done
  Esquema do Cenario: Realizar multiplos Logins no App
    Dado que eu estou na tela de Login
    Quando eu realizar Login informando o Ec ou CPF ou Email <CpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    Então ao pressionar o botão Entrar a tela Home deve ser exibida

    Exemplos:
      | CpfEmail      | usuario    | senha  |
