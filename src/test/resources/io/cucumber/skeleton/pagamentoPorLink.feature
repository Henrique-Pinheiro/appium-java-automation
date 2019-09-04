#language: pt


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E devo informar o nome do produto <nome_produto> e valor da venda <valor_venda>
    E o bot„o Gerar Link devera estar disponivel
    E ao pressionar o bot„o Gerar Link a tela de Link gerado para pagamento deve ser exibida
    E deve ser exibido a confirmaÁ„o de Link Gerado e as opÁıes de compartilhamento
    E seleciono o Ìcone de compartilhar
    E ent„o devera abrir as opÁıes de compartilhamento do dispositivo

    Exemplos:
      | nome_produto | valor_venda |
      | Pilha        | 99999,99    |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que n„o esteja elegÌvel
  Devem ser exibidos o n˙mero e o email para contato




Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
    E seleciono o bot„o VER MAIS
    Quando selecionado deve ser exibida a tela Todos os links ativos
    E seleciono um link <link_item> criado
    E deve ser exibida a confirmaÁ„o de Link Gerado e as opÁıes de compartilhamento
    E seleciono o Ìcone de excluir
    E devera ser exibida a tela de confirmaÁ„o
    E ent„o seleciono o bot„o CANCELAR
    E deve deve exibida a tela confirmaÁ„o de Link Gerado e as opÁıes de compartilhamento

    Exemplos:
      | nome_produto | valor_venda | link_item  |
      | Pilha        | 99999,99    | Pilha      |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E devo informar o nome do produto <nome_produto> e valor da venda <valor_venda>
    E ent„o o bot„o Gerar Link devera estar desabilitado

    Exemplos:
      | nome_produto | valor_venda |
      | AA           | 300         |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E devo informar o nome do produto <nome_produto> e valor da venda <valor_venda>
    E o bot„o Gerar Link devera estar disponivel
    E ao pressionar o bot„o Gerar Link a tela de Link gerado para pagamento deve ser exibida

    Exemplos:
      | nome_produto | valor_venda |
      | Pilha        | 99999,99    |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E devo informar o nome do produto <nome_produto> e valor da venda <valor_venda>
    E o bot„o Gerar Link devera estar disponivel
    E ao pressionar o bot„o Gerar Link a tela de Link gerado para pagamento deve ser exibida

    Exemplos:
      | nome_produto | valor_venda |
      | Pilha        | 0,01         |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
    E seleciono o bot„o VER MAIS
    E deve ser exibido todos os links ativos
    E seleciono um link <link_item> criado
    E deve ser exibido a confirmaÁ„o de Link Gerado e as opÁıes de compartilhamento
    E devo selecionar o bot„o de fechar
    E ent„o devera ser exibida a tela de Pagamento Por Link

    Exemplos:
      | nome_produto | valor_venda | link_item  |
      | Pilha        | 99999,99    | Pilha      |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E devo selecionar o bot„o de voltar
    E ent„o devera ser exibido o menu Pagamento por Link


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E devo informar o nome do produto <nome_produto> e valor da venda <valor_venda>
    E o bot„o Gerar Link devera estar disponivel
    E ao pressionar o bot„o Gerar Link a tela de Link gerado para pagamento deve ser exibida
    E devo pressionar o bot„o de fechar
    E ent„o devera ser exibida a tela de Pagamento por Link

    Exemplos:
      | nome_produto | valor_venda |
      | Pilha        | 99999,99    |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
    E seleciono o ultimo link <link_item> criado
    E deve ser exibido a confirmaÁ„o de Link Gerado e as opÁıes de compartilhamento
    E seleciono o Ìcone de compartilhar
    E ent„o devera abrir as opÁıes de compartilhamento do dispositivo

    Exemplos:
      | nome_produto | valor_venda | link_item  |
      | Pilha        | 99999,99    | Pilha      |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E devo informar o valor da venda <valor_venda>
    E ent„o o bot„o Gerar Link devera estar desabilitado

    Exemplos:
      | nome_produto | valor_venda |
      | Pilha        | 300         |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E ent„o o bot„o Gerar Link devera estar desabilitado


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
    E seleciono o ultimo link <link_item> criado
    E deve ser exibido a confirmaÁ„o de Link Gerado e as opÁıes de compartilhamento
    E devo selecionar o bot„o de fechar
    E ent„o devera ser exibida a tela de Pagamento Por Link


    Exemplos:
      | nome_produto | valor_venda | link_item  |
      | Pilha        | 99999,99    | Pilha      |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
    E seleciono o ultimo link <link_item> criado
    E deve ser exibido a confirmaÁ„o de Link Gerado e as opÁıes de compartilhamento
    E seleciono o Ìcone de copiar
    E ent„o o link devera ir para ·rea de transferencia


    Exemplos:
      | nome_produto | valor_venda | link_item  |
      | Pilha        | 99999,99    | Pilha      |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
    E seleciono o ultimo link <link_item> criado
    E ent„o deve ser exibido a confirmaÁ„o de Link Gerado e as opÁıes de compartilhamento



    Exemplos:
      | nome_produto | valor_venda | link_item  |
      | Pilha        | 99999,99    | Pilha      |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
    E seleciono o bot„o VER MAIS
    E deve ser exibido todos os links ativos
    E devo selecionar o bot„o Voltar
    E ent„o deve ser exibida a tela de Pagamento Por Link


    Exemplos:
      | nome_produto | valor_venda |
      | Pilha        | 99999,99    |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E devo informar o nome do produto <nome_produto> e valor da venda <valor_venda>
    E o bot„o Gerar Link devera estar disponivel
    E ao pressionar o bot„o Gerar Link a tela de Link gerado para pagamento deve ser exibida
    E devo pressionar o bot„o de fechar
    E ent„o devera ser exibida a tela de Pagamento por Link

    Exemplos:
      | nome_produto | valor_venda |
      | Pilha        | 99999,99    |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E devo informar o nome do produto <nome_produto>
    E ent„o o bot„o Gerar Link devera estar desabilitado

    Exemplos:
      | nome_produto | valor_venda |
      | Pilha        | 300         |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    E seleciono o bot„o de Central de ajuda
    E deve ser exibida a tela de Central de ajuda
    E eu clico em uma pergunta <pergunta_saq>
    Quando clico deve abrir a tela da pergunta <pergunta_saq>
    E seleciono o bot„o de voltar
    E ent„o deve ser exibida a tela de Central de ajuda


    Exemplos:
      | pergunta_saq |
      | Como desativar um link de pagamento |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    E seleciono o bot„o de Central de ajuda
    E deve ser exibida a tela de Central de ajuda
    E eu seleciono o bot„o de fechar
    E ent„o deve ser exibida a tela de Pagamento por Link

    Exemplos:
      | pergunta_saq |
      | Como desativar um link de pagamento |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
    E ent„o ser exibido o bot„o Criar novo Link




Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos




Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
  Devo selecionar o bot„o Criar Novo Link
    Quando selecionado devera abrir a tela Criar novo Link
    E devo informar o nome do produto <nome_produto> e valor da venda <valor_venda>
    E o bot„o Gerar Link devera estar disponivel
    E ao pressionar o bot„o Gerar Link a tela de Link gerado para pagamento deve ser exibida
    E deve ser exibido a confirmaÁ„o de Link Gerado e as opÁıes de compartilhamento
    E ent„o ao clicar no Ìcone de copiar link, o link devera ir para ·rea de transferencia

    Exemplos:
      | nome_produto | valor_venda |
      | Pilha        | 99999,99    |


Funcionalidade: Gerar link

  Contexto:
    Dado que eu estou usando o aparelho "X"

  @Manual
  Esquema do Cen·rio: GeraÁ„o de Link para pagamento
    Quando eu estiver na tela logada
    E eu clicar no bot„o de menu
  Devo selecionar Pagamento por Link
    E ent„o o menu Pagamento por Link deve ser exibido

    Dado que eu esteja elegÌvel
  Deve ser exibido o bot„o Criar novo Link
    E ent„o devem ser apontados os ˙ltimos links ativos
    E seleciono o bot„o VER MAIS
    Quando selecionado deve ser exibida a tela Todos os links ativos
    E seleciono um link <link_item> criado
    E deve ser exibida a confirmaÁ„o de Link Gerado e as opÁıes de compartilhamento
    E seleciono o Ìcone de excluir
    E devera ser exibida a tela de confirmaÁ„o
    E ent„o seleciono o bot„o CONFIRMAR
    E deve deve exibida a tela Todos Links Ativos

    Exemplos:
      | nome_produto | valor_venda | link_item  |
      | Pilha        | 99999,99    | Pilha      |