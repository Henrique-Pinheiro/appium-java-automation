#language: pt

Funcionalidade: Troca de EC

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @doing
  Esquema do Cenário: Função buscar da Tela Troca de EC com dados validos
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E selecionar a opção Trocar de Estabelecimento no Menu Lateral
    Quando eu realizar uma busca com os seguintes dados validos:
      | 2006005264        |
      | Massa Dados Afil. |
    Então as buscas devem retornar os resultados esperados
    Exemplos:
      | EcCpfEmail | usuario    | senha        |
      | 2006005264 | 2006095565 | s@2006095565 |

#
#      | 2006005263            |
#      | Massa Dados Invalidos |
#  @BuscasInvalidas
#    Exemplos:
#      | EcCpfEmail | usuario    | senha        | retorno_busca |
#      | 2006005264 | 2006095565 | s@2006095565 | 0             |