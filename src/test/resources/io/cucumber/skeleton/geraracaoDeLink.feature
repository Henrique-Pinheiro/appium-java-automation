#language: pt
  
Funcionalidade: Pagamento por Link - APPN-1077
  Eu, como usuário do app Cielo, quero gerar links para enviar aos clientes, para que eles possam fazer o pagamento do produto através desse link.

  Contexto:
    Dado que eu estou usando o aparelho "Emulator"

  @done
  Esquema do Cenário: Tela pagamento por link com usuário não elegivel
    Dado que eu realize Login informando o Ec ou CPF ou Email <EcCpfEmail>, o usuário, opcional, <usuario> e a senha <senha>
    Quando eu selecionar a opção Pagamento por Link no Menu Lateral
    Então a tela de aviso de não eligibilidade deve ser exibida contendo o numero para contato ""
    E o email ""


    Exemplos:
      | EcCpfEmail | usuario    | senha        |
      | 2006005264 | 2006095565 | s@2006095565 |
