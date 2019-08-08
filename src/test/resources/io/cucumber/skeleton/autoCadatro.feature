#language: pt

Funcionalidade: Auto cadastro

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"
    Quando eu estiver na tela de Login
    E eu selecionar o botão Criar Usuario
    Então a tela do Auto Cadastro deve ser exibida

  @done
  Esquema do Cenário: Cadastro de usuário com dados bancarios
    Dado que eu deseje realizar um cadastro do tipo <tipo_cadastro> utilizando o EC <EC>
    E que eu preencha os dados cadastrais
    Quando eu preencher os dados da conta bancaria, tipo de pessoa <tipo_pessoa>, banco <banco>, tipo de conta <tipo_conta>, agencia <agencia>, numero da conta <n_conta> e digito <digito>
    E selecionar o botão De acordo
    E selecionar o botão Confirmar
    Então eu devo informar o nome de usuário desejado
    E ao pressionar o botão Ok a tela de confirmação de email deve ser exibida
    E ao pressionar o botão voltar a tela de Login deve ser exibida

  @PfCc
    Exemplos:
      | tipo_cadastro | EC         | tipo_pessoa | banco | tipo_conta | agencia | n_conta   | digito |
      | Não migrado   | 2006080967 | PF          | 237   | CC         | 01711   | 000145677 | 6      |

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

  @done
  Esquema do Cenário: Cadastro de usuário com cartão pré-pago
    Dado que eu deseje realizar um cadastro do tipo <tipo_cadastro> utilizando o EC <EC>
    E que eu preencha os dados cadastrais
    Quando eu preencher o numero de serie <numero_serie> do cartão
    E selecionar o botão De acordo
    E selecionar o botão Confirmar
    Então eu devo informar o nome de usuário desejado
    E ao pressionar o botão Ok a tela de confirmação de email deve ser exibida
    E ao pressionar o botão voltar a tela de Login deve ser exibida

    Exemplos:
      | tipo_cadastro | EC         | numero_serie    |
      | Não migrado   | 2003000857 | 000000000034568 |
      | Migrado       | 2002997688 | 000000000034572 |
