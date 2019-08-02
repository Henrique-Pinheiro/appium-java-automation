#language: pt

Funcionalidade: Login no App Cielo

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @done
  Cenario: Realizar Login no App utilizando, EC e nome de usuário sem dados salvos
    Dado que eu estou na tela de Login
    E preencho o campo de Login com "2006074940"
    Quando eu selecionar o botão Proximo
    E preencher o campo usuário com "cielomult"
    E o campo senha com "s@2006074940"
#    Então ao pressionar o botão Entrar a tela Home deve ser exibida

#  @done
#  Cenario: Realizar Login no App utlizando, Email sem dados salvos
#    Dado que eu estou na tela de Login
#    E preencho o campo de Login com ""
#    Quando eu selecionar o botão Proximo
#    E o campo senha com ""
#    Então ao pressionar o botão Entrar a tela Home deve ser exibida
#
#  @done
#  Cenario: Realizar Login no App utlizando, CPF sem dados salvos
#    Dado que eu estou na tela de Login
#    E preencho o campo de Login com ""
#    Quando eu selecionar o botão Proximo
#    E o campo senha com ""
#    Então ao pressionar o botão Entrar a tela Home deve ser exibida
#
#  @done
#  Cenario: Tentar realizar Login no App, preenchendo o campo de Login com EC e usuário sem cadastro
#    Dado que eu estou na tela de Login
#    E preencho o campo de Login com "2006074949"
#    Quando eu selecionar o botão Proximo
#    E preencher o campo usuário com "cielofalho"
#    E o campo senha com "s@2006074949"
#    Então ao pressionar o botão Entrar, a mensagem "Os dados de acesso estão incorretos." deve ser exibida
#
#  @done
#  Cenario: Tentar realizar Login no App, preenchendo o campo de Login com email sem cadastro
#    Dado que eu estou na tela de Login
#    E preencho o campo de Login com um email não cadastrado
#    Quando eu selecionar o botão Proximo
#    E o campo senha com "123456"
#    Então ao pressionar o botão Entrar, a mensagem "Os dados de acesso estão incorretos." deve ser exibida
#
#  @done
#  Cenario: Tentar realizar Login no App, preenchendo o campo de Login com CPF sem cadastro
#    Dado que eu estou na tela de Login
#    E preencho o campo de Login com um CPF não cadastrado
#    Quando eu selecionar o botão Proximo
#    E o campo senha com "123456"
#    Então ao pressionar o botão Entrar, a mensagem "Os dados de acesso estão incorretos." deve ser exibida
#
#  @done
#  Esquema do Cenario: Realizar Login no App utilizando selecionando a Opçao Salvar dados
#    Dado que eu estou na tela de Login
#    Quando eu realizar Login informando <EC>, <usuario>, <senha> com a opção Salvar Dados selecionada
#    Então ao sair do App, os campos <EC> e <usuario> devem continuar preenchidos na Tela de Login
#
#    Exemplos:
#      | EC         | usuario   | senha        |
#      | 2006074940 | cielomult | s@2006074940 |

@done
  Cenario: Realizar Login no App utilizando, EC e nome de usuário sem dados salvos
    Dado que eu estou na tela de Login
    Quando esse step vai falhar