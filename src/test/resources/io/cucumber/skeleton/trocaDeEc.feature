#language: pt

Funcionalidade: Troca de EC

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @done
  Esquema do Cenário: Função buscar da Tela Troca de EC - Buscas Validas
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Trocar de Estabelecimento no Menu Lateral
    Quando eu realizar uma busca com os seguintes dados validos:
      | 2006005264        |
      | Massa Dados Afil. |
    Então as buscas devem retornar os resultados esperados
    Exemplos:
      | EcCpfEmail | usuario    | senha        |
      | 2006005264 | 2006095565 | s@2006095565 |

  @done
  Esquema do Cenário: Função buscar da Tela Troca de EC - Buscas Invalidas
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Trocar de Estabelecimento no Menu Lateral
    Quando eu realizar uma busca com os seguintes dados invalidos:
      | 2006005263            |
      | Massa Dados Invalidos |
    Então as buscas não devem retornar resultados
    Exemplos:
      | EcCpfEmail | usuario    | senha        |
      | 2006005264 | 2006095565 | s@2006095565 |

  @done
  Esquema do Cenário: Função trocar de Eestabecimento utilizando a pesquisa
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Trocar de Estabelecimento no Menu Lateral
    Quando eu selecionar o grupo de pagamento
    E pesquisar e selecionar o estabelecimento com o numero de EC<EC>
    Então esse EC deve ser exibido no Menu Lateral

    Exemplos:
      | EcCpfEmail | usuario    | senha        | EC         |
      | 2006005264 | 2006095565 | s@2006095565 | 2006005264 |
      | 2006005264 | 2006095565 | s@2006095565 | 2006005310 |
      | 2006005264 | 2006095565 | s@2006095565 | 2006005299 |
      | 2006005264 | 2006095565 | s@2006095565 | 2006005280 |
      | 2006005264 | 2006095565 | s@2006095565 | 2006005272 |

#  2006005272
#  2006005280
#  2006005299
#  2006005310
