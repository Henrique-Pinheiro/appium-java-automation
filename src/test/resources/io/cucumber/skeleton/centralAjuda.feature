#language: pt

Funcionalidade: Central de Ajuda - APPN-1761
  Eu, como usuário do app Cielo, quero ter uma área de Central de ajuda para ter acesso aos meios de atendimento da Cielo.

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"
    Quando eu estiver logado com o EC "2000463023", usuário "2000463023" e senha "123456"
    E acessar a opção Central de Ajuda no menu lateral
    Então a Tela da Central de Ajuda deve ser exibido

  @doing
  Cenário: Central de Ajuda - Categorias, Sub-Categorias e Perguntas/Respostas - Validação do Fluxo
    Dado que eu esteja visualizando a secção "Categorias"
    E ao selecionar as categorias as sub-categorias deve ser exibidas, com o titulo da pagina sendo a categoria escolhida:
      | Vendas | Acesso | Serviços | Suporte | Dúvidas |
    Quando eu selecionar uma sub-categoria
    E o titulo da pagina for a sub-categoria selecionada
    E as perguntas forem exibidas
    Então ao Selecionar uma Pergunta, a pagina de resposta deve ser exibida

#  Cenario: Central de Ajuda - Perguntas Frequentes
#    Dado que eu esteja visualizando a secção "Perguntas Frequentes"
#    Quando eu selecionar uma pergunta frequente
#    Então a pagina exibida deve possuir a resposta e o titulo exibido deve ser "Perguntas Frequentes"

@done
  Esquema do Cenário: Central de Ajuda - Canais de Atendimento
    Dado que eu esteja visualizando a secção "Canais de Atendimento"
    Quando eu selecionar o canal de atendimento <canal_atendimento>
    Então a pagina <pagina> deve ser exibida

    Exemplos:
      | canal_atendimento | pagina |
      | Chat              | Chat   |
#
#  Cenário: Central de Ajuda - Contato
#    Dado que eu esteja visualizando a secção "Entre em contato"
#    Quando eu passar os card para o lado
#    Então multiplos Cards de Contato devem ser exibidos
@done
  Cenário: Central de Ajuda - Perguntas e Respostas - Avaliação Positiva
    Dado que eu esteja visualizando a secção "Perguntas Frequentes"
    E eu abrir uma pergunta
    Quando a resposta for exibida
    E a avalição da resposta for exibida
    Então ao selecionar a avaliação "positiva" a mensagem "Que bom :)" deve ser exibida
@done
  Cenário: Central de Ajuda - Perguntas e Respostas - Avaliação Negativa
    Dado que eu esteja visualizando a secção "Perguntas Frequentes"
    E eu abrir uma pergunta
    Quando a resposta for exibida
    E a avalição da resposta for exibida
    Então ao selecionar a avaliação "negativo" a mensagem "Toque aqui e fale conosco via Chat" deve ser exibida
    E ao clicar nela o chat deve ser exibido
