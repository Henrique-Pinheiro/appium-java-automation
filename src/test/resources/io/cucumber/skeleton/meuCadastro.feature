#language: pt

Funcionalidade: Meu cadastro - Tela que exibe os Dados do estabelecimento, usuário e das contas
  Eu, como usuário do app Cielo, desejo visualizar os dados do meu cadastro.
  O menu ficará logo abaixo da primeira linha divisória do menu, depois do menu Serviços.
  Esse menu deve estar visível para todos os usuários logados.

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @done
  Esquema do Cenário: Tela Meu cadastro - Opção Estabelecimento - Validação de dados do estabelecimento
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Meu Cadastro no Menu Lateral
    E a tela Meu cadastro deve ser exibida
    Quando eu estiver com a opção "ESTABELECIMENTO" selecionada
    E a secção "DADOS DO ESTABELECIMENTO" estiver expandida
    Então os seguintes dados devem ser exibidos:
      | Numero_ec  | Status | Bloqueio | Dt_abertura | Razao_social                | Cnpj               | Mcc  | Ramo   |
      | 2000463023 | Ativo  | Não      | 26/01/2017  | PJ04541 - CONVIVENCIA SITE2 | 99.906.385/0002-07 | 7011 | Motéis |

    Exemplos:
      | EcCpfEmail | usuario    | senha  |
      | 2000463023 | 2000463023 | 123456 |
#      | 2006005264 | 2006095565 | s@2006095565 |

  @done
  Esquema do Cenário: Tela Meu cadastro - Opção Estabelecimento - Validação dos dados do Endereço
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Meu Cadastro no Menu Lateral
    E a tela Meu cadastro deve ser exibida
    Quando eu estiver com a opção "ESTABELECIMENTO" selecionada
    E a secção "ENDEREÇOS" estiver expandida
    Então o endereço "Satélite, 333 - Quase Aldeia - JANDIRA - SP" deve ser exibido
    E conter o CEP "06602230"

    Exemplos:
      | EcCpfEmail | usuario    | senha  |
      | 2000463023 | 2000463023 | 123456 |

  @done
  Esquema do Cenário: Tela Meu cadastro - Opção Estabelecimento - Validação dos dados do Proprietario
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Meu Cadastro no Menu Lateral
    E a tela Meu cadastro deve ser exibida
    Quando eu estiver com a opção "ESTABELECIMENTO" selecionada
    E a secção "DADOS DO PROPRIETARIO" estiver expandida
    Então os dados  nome do proprietario <nome_proprietario>, CPF <cpf>, data de nascimento <dt_nasc>, telefone <tel1>
    E telefone <tel2> devem ser exibidos

    Exemplos:
      | EcCpfEmail | usuario    | senha        | nome_proprietario              | cpf            | dt_nasc    | tel1          | tel2          |
      | 2006005264 | 2006095565 | s@2006095565 | MASSA DADOS AFIL. - 237-175456 | 666.453.984-50 | 16/11/1981 | 11 92328 6566 | 11 92328 6677 |

  @done
  Esquema do Cenário: Tela Meu cadastro - Opção Estabelecimento - Validação dos dados do Contato
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Meu Cadastro no Menu Lateral
    E a tela Meu cadastro deve ser exibida
    Quando eu estiver com a opção "ESTABELECIMENTO" selecionada
    E a secção "DADOS DE CONTATO" estiver expandida
    Então os dados nome do contato <nome_contato>, telefone <tel1>, telefone <tel2>
    E email <email> devem ser exibidos

    Exemplos:
      | EcCpfEmail | usuario    | senha        | nome_contato                   | tel1          | tel2          | email   |
      | 2006005264 | 2006095565 | s@2006095565 | MASSA DADOS AFIL. - 237-175456 | 11 92328 6566 | 11 92328 6677 | -ð-þ--- |

  @done
  Esquema do Cenário: Tela Meu cadastro - Opção Usuário - Validação dos dados exibidos
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Meu Cadastro no Menu Lateral
    E a tela Meu cadastro deve ser exibida
    Quando eu estiver com a opção "USUÁRIO" selecionada
    Então os dados nome <nome>, CPF <cpf>, email <email>
    Exemplos:
      | EcCpfEmail | usuario    | senha        | nome  | cpf            | email                         |
      | 2006005264 | 2006095565 | s@2006095565 | Teste | 825.670.450-07 | pinheiro_henrique@hotmail.com |

  @done
  Esquema do Cenário: Tela Meu cadastro - Opção Conta - Validação dos dados exibidos
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Meu Cadastro no Menu Lateral
    E a tela Meu cadastro deve ser exibida
    Quando eu estiver com a opção "CONTAS" selecionada
    E o card do banco exibir os dados, nome do banco <nome>, numero do banco <numero>, agencia <agencia>, e numero da conta <num_conta>
    E ao tocar no card ele deve ser expandido
    Então exibir os dados, nome do banco <nome>, numero do banco <numero>, agencia <agencia>, e numero da conta <num_conta>
    E ao pressionar o botão fechar a tela de contas deve ser exibida

    Exemplos:
      | EcCpfEmail | usuario    | senha        | nome                | numero | agencia | num_conta   |
      | 2006005264 | 2006095565 | s@2006095565 | BANCO BRADESCO S.A. | 237    | 03666-6 | 103900315-1 |