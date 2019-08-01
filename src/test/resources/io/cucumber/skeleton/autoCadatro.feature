#language: pt

Funcionalidade: Auto cadastro

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"
    Quando eu estiver na tela de Login
    E eu selecionar o botão Criar Usuario
    Então a tela do Auto Cadastro deve ser exibida

  Esquema do Cenário: Cadastro de usuário com dados bancarios
    Dado que eu deseje realizar um cadastro do tipo <tipo_cadastro> utilizando o EC <EC>
    E que eu preencha os dados cadastrais
    Quando eu preencher os dados da conta bancaria, tipo de pessoa <tipo_pessoa>, banco <banco>, tipo de conta <tipo_conta>, agencia <agencia>, numero da conta <n_conta> e digito <digito>
    E selecionar o botão De acordo
    E selecionar o botão Confirmar
    Então eu devo informar o nome de usuário desejado
    E a tela de confirmação de email deve ser exibida

  @PfCc
    Exemplos:
      | tipo_cadastro | EC         | tipo_pessoa | banco | tipo_conta | agencia | n_conta   | digito |
      | Não migrado   | 2007700098 | PJ          | 237   | CC         | 2345    | 103911839 | 0      |



#  @PfCp
#    Exemplos:
#      | tipo_cadastro | EC | tipo_pessoa | banco | tipo_conta | agencia | n_conta | digito |
#
#  @PjCc
#    Exemplos:
#      | tipo_cadastro | EC | tipo_pessoa | banco | tipo_conta | agencia | n_conta | digito |
#
#  @PjCp
#    Exemplos:
#      | tipo_cadastro | EC | tipo_pessoa | banco | tipo_conta | agencia | n_conta | digito |
