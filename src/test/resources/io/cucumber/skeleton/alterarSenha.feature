#language: pt

Funcionalidade: Alteração de Senha - Area Logada

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @done
  Esquema do Cenário: Função trocar senha - Não exibida
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Meu Cadastro no Menu Lateral
    E eu selecionar a opção Usuário no menu superior
    Quando eu selecionar a opção Usuário no menu superior
    Então a tela com os dados de usuário for exibida
    Mas o botão Alterar Senha não

    Exemplos:
      | EcCpfEmail | usuario    | senha        |
      | 2006095565 | 2006095565 | s@2006095565 |

  @done
  Esquema do Cenário: Função alterar senha - Alteração Valida
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Meu Cadastro no Menu Lateral
    E eu selecionar a opção Usuário no menu superior
    Quando a tela com os dados de usuário for exibida
    E eu pressionar o botão Alterar senha
    E preencher os campos senha atual <senha>, os campos nova senha com <nova_senha>
    E pressionar o botão Salvar
    Então o PopUp com a mensagem de alteração com sucesso deve ser exibida

    Exemplos:
      | EcCpfEmail     | usuario | senha  | nova_senha |
      | 005.376.283-55 |         | 123456 | 123456     |

  @done
  Esquema do Cenário: Função alterar senha - Alteração Invalida
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Meu Cadastro no Menu Lateral
    E eu selecionar a opção Usuário no menu superior
    Quando a tela com os dados de usuário for exibida
    E eu pressionar o botão Alterar senha
    E preencher os campos senha atual <nova_senha>, os campos nova senha com <nova_senha>
    E pressionar o botão Salvar
    Então o PopUp com a mensagem de alteração sem sucesso deve ser exibida

  @SenhaAtualIncorreta
    Exemplos:
      | EcCpfEmail     | usuario | senha  | nova_senha |
      | 005.376.283-55 |         | 123456 | 654321     |

  @SenhaNovaInvalida
    Exemplos:
      | EcCpfEmail     | usuario | senha  | nova_senha    |
      | 005.376.283-55 |         | 123456 | senhaInvalida |