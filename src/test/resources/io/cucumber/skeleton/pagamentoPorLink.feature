#language: pt

Funcionalidade: Pagamento por Link - APPN-1077
  Eu, como usuário do app Cielo, quero gerar e consultar links para enviar aos clientes, para que eles possam fazer o pagamento do produto através desse link.

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @ignore
  Esquema do Cenário: Tela pagamento por link com usuário não elegivel
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    Quando eu selecionar a opção Pagamento por Link no Menu Lateral
    Então a tela de aviso de não eligibilidade deve ser exibida contendo o numero para contato "4002-9700"
    E o email "cieloecommerce@cielo.com.br"

    Exemplos:
      | EcCpfEmail | usuario    | senha        |
      | 2006005264 | 2006095565 | s@2006095565 |

  @ignore
  Esquema do Cenário: Tela pagamento por Link com usuário elegivel - Sem links gerados
    Dado que eu realize login informando o Ec <EC>, o usuário, <usuario> e a senha <senha>
    E eu selecionar a opção Pagamento por Link no Menu Lateral
    Quando a tela Pagamento por Link for exibida
    E a opção criar novo link for exibida na area Novo pagamento
    Então na area Últimos links ativos a mensagem "Não há links para exibir." deve ser exibida

    Exemplos:
      | EC         | usuario    | senha  |
      | 2000463023 | 2000463023 | 123456 |

  @ignore
  Esquema do Cenário: Validar os limites de valores da tela de criação de links
    Dado que eu realize login informando o Ec <EC>, o usuário, <usuario> e a senha <senha>
    E eu selecionar a opção Pagamento por Link no Menu Lateral
    E a tela Pagamento por Link for exibida
    Quando eu clicar na opção Criar novo link
    E preencher o Nome do produto com "Teste de Valores"
    E o campo valor desejado com os seguintes valores:
      | 4.99        |
      | 20000000.01 |
      | 5.00        |
      | 20000000.00 |
    Então o botão Gerar link só deve ser habilitado 2 vezes
    Exemplos:
      | EC         | usuario    | senha  |
      | 2000463023 | 2000463023 | 123456 |

  @ignore
  Esquema do Cenário: Criar link utilizando os botões de valores
    Dado que eu realize login informando o Ec <EC>, o usuário, <usuario> e a senha <senha>
    E eu selecionar a opção Pagamento por Link no Menu Lateral
    E a tela Pagamento por Link for exibida
    Quando eu clicar na opção Criar novo link
    E preencher o Nome do produto com "Teste botoes valores"
    E selecionar todos os botões de valores
    E clicar no botão Gerar link
    E acessar os detalhes do link na area de Últimos links ativos
    Então o valor do link gerado deve ser de "165.00"

    Exemplos:
      | EC         | usuario    | senha  |
      | 2000463023 | 2000463023 | 123456 |

  @ignore
  Esquema do Cenário: Criar e Consultar Links na area de Últimos links ativos
    Dado que eu realize login informando o Ec <EC>, o usuário, <usuario> e a senha <senha>
    E eu selecionar a opção Pagamento por Link no Menu Lateral
    E a tela Pagamento por Link for exibida
    Quando eu clicar na opção Criar novo link
    E criar o link informando o nome do link <nome_link> e o valor do link <valor_link>
    E acessar os detalhes do link na area de Últimos links ativos
    Então o link consultado deve possuir o nome <nome_link> e o valor <valor_link> e o link

    Exemplos:
      | EC         | usuario    | senha  | nome_link            | valor_link |
      | 2000463023 | 2000463023 | 123456 | Produto Links Ativos | 1500.00    |

  @ignore
  Esquema do Cenário: Criar e Consultar Links na tela Todos os links ativos exibindo seus detalhes
    Dado que eu realize login informando o Ec <EC>, o usuário, <usuario> e a senha <senha>
    E eu selecionar a opção Pagamento por Link no Menu Lateral
    E a tela Pagamento por Link for exibida
    Quando eu clicar na opção Criar novo link
    E criar o link informando o nome do link <nome_link> e o valor do link <valor_link>
    E acessar a tela de Todos os links ativos
    E acessar os detalhes do link
    Então o link consultado deve possuir o nome <nome_link> e o valor <valor_link> e o link

    Exemplos:
      | EC         | usuario    | senha  | nome_link              | valor_link |
      | 2000463023 | 2000463023 | 123456 | Produto Todos os Links | 1500.00    |

  @ignore
  Esquema do Cenário: Botão Fechar Detalhes do Link
    Dado que eu realize login informando o Ec <EC>, o usuário, <usuario> e a senha <senha>
    E o usuário possua somente um link gerado
    E eu selecionar a opção Pagamento por Link no Menu Lateral
    E a tela Pagamento por Link for exibida
    Quando eu acessar os detalhes do link na area de Últimos links ativos
    E pressionar o botão de fechar link
    Então a tela Pagamento por Link deve ser exibida

    Exemplos:
      | EC         | usuario    | senha  |
      | 2000463023 | 2000463023 | 123456 |

  @ignore
  Esquema do Cenário: Excluir Link
    Dado que eu realize login informando o Ec <EC>, o usuário, <usuario> e a senha <senha>
    E o usuário possua somente um link gerado
    E eu selecionar a opção Pagamento por Link no Menu Lateral
    E a tela Pagamento por Link for exibida
    Quando eu acessar os detalhes do link na area de Últimos links ativos
    E pressionar o botão de excluir o link
    E pressionar o botão confirmar do PopUp exibido
    Então na area Últimos links ativos a mensagem "Não há links para exibir." deve ser exibida

    Exemplos:
      | EC         | usuario    | senha  |
      | 2000463023 | 2000463023 | 123456 |

  @done
  Esquema do Cenário: FAQ Pagamento Por Link
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    E eu selecionar a opção Pagamento por Link no Menu Lateral
    E a tela Pagamento por Link for exibida
    E eu pressionar o Botão Central de Ajuda
    Quando 6 respostas forem exibidas
    E eu selecionar a resposta 1
    E os detalhes forem exibidos
    Então ao pressionar o botão fechar a tela pagamento por link deve ser exibida

  @elegivel
    Exemplos:
      | EcCpfEmail | usuario    | senha  |
      | 2000463023 | 2000463023 | 123456 |

  @naoElegivel
    Exemplos:
      | EcCpfEmail | usuario    | senha        |
      | 2006005264 | 2006095565 | s@2006095565 |