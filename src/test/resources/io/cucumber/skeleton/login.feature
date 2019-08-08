#language: pt

Funcionalidade: Login no App Cielo

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @done
  Cenario: Realizar Login no App com usuário não migrado, utilizando, EC e nome de usuário sem dados salvos
    Dado que eu estou na tela de Login
    E preencho o campo de Login com "2006074959"
    Quando eu selecionar o botão Proximo
    E preencher o campo usuário com "cielomult"
    E o campo senha com "s@2006074959"
    Então ao pressionar o botão Entrar a tela Home deve ser exibida

  @done
  Cenario: Realizar Login com usário migrado no App utlizando, Email sem dados salvos
    Dado que eu estou na tela de Login
    E preencho o campo de Login com "teste@zurtel.gq"
    Quando eu selecionar o botão Proximo
    E o campo senha com "654321"
    Então ao pressionar o botão Entrar a tela Home deve ser exibida

  @done
  Cenario: Realizar Login com usário migrado no App utlizando, CPF sem dados salvos
    Dado que eu estou na tela de Login
    E preencho o campo de Login com "27774382003"
    Quando eu selecionar o botão Proximo
    E o campo senha com "654321"
    Então ao pressionar o botão Entrar a tela Home deve ser exibida

  @done
  Cenario: Tentar realizar Login no App, preenchendo o campo de Login com EC e usuário sem cadastro
    Dado que eu estou na tela de Login
    E preencho o campo de Login com "2007700179"
    Quando eu selecionar o botão Proximo
    E preencher o campo usuário com "cielofalho"
    E o campo senha com "s@2007700179"
    Então ao pressionar o botão Entrar, a mensagem "Os dados de acesso estão incorretos." deve ser exibida

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

  @done
  Esquema do Cenario: Realizar Login no App selecionando a Opçao Salvar dados
    Dado que eu estou na tela de Login
    Quando eu realizar Login informando <EC>, <usuario>, <senha> com a opção Salvar Dados selecionada
    Então ao sair do App, os campos <EC> e <usuario> devem continuar preenchidos na Tela de Login

    Exemplos:
      | EC         | usuario    | senha  |
      | 2007700179 | 2007700179 | 654321 |

  @done
  Esquema do Cenario: Realizar multiplos Logins no App
    Dado que eu estou na tela de Login
    Quando eu realizar Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    Então ao pressionar o botão Entrar a tela Home deve ser exibida

    Exemplos:
      | EcCpfEmail      | usuario    | senha      |
      | 2007700179      | 2007700179 | 654321     |
      | teste@zurtel.gq |            | 654321     |

#    E-mail: teste@zurtel.gq CPF: 277.743.820-03

#      | DT_REF          | CD_MES_REF | NU_EC      | NU_CNPJ_CPF    | TP_PESSOA | COD_CAMPANHA | NU_EC_PARCEIRO | VLR_LMT_EMP | QTD_MAX_PARC | TX_JUROS | VLR_PARC | VLR_TTL_EMP | DT_INI_CAMP | DT_FNL_CAMP | D_MIN_PARC | D_MAX_PARC | NOTA_PARCEIRO | FL_ATIVO
#      | 08/08/2019      | 201908     | 2006074975 | 31887982000109 | 2         | 0000008936   | 1074260691     | 66687,73    | 18           | 1,75     | 4472,56  | 80506,05    | 08/08/2019  | 10/10/2019  | 30         | 45         | 4             | S
#      | 08/08/2019      | 201908     | 2006074983 | 31887983000153 | 2         | 0000008936   | 1074260691     | 22595,63    | 24           | 2,99     | 1691,86  | 30453,48    | 08/08/2019  | 10/10/2019  | 30         | 45         | 4             | S