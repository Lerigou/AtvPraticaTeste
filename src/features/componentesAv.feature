#language:pt
Funcionalidade: Interagir com vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo de treinamento

  @validar_dados_de_cadastro
  Cenário: Validar cadastro
    Dado que o usuário preencheu os campos nome, sobrenome, sexo, comida preferida, escolaridade, esporte praticado e sugestão
    E clicou no botão Cadastrar
    Quando o botão Cadastrar for clicado
    Entao as informações devem ser validadas e mostradas ao final da página

  @validar_campos_obrigatórios
  Esquema do Cenário: Validar campos obrigatórios
    Quando o <campo> estiver vazio
    Entao a página deve mostrar um alert indicando a obrigatoriedade do campo <campo>
    Exemplos:
      |campo    |
      |nome     |
      |sobrenome|
      |sexo     |

  @validar_botão_alert
  Cenario: validar botão alert
    Dado que o usuario clicou no botão alert
    E a mensagem for Alert Simples
    Quando o usuário clicar em Ok
    Entao a página deve verificar se a mensagem não é mais apresentada

  @validar_botão_confirm
  Esquema do Cenario: validar botão confirm
    Dado que o usuario clicou no botão confirm
    E a mensagem for Confirm Simples
    Quando o usuario clicar em <opção>
    Entao verificar se a mensagem que aparece é <mensagem>
    E a página deve verificar se o alert de confirmação não é mais apresentada
    Exemplos:
    |opção   |mensagem  |
    |Ok      |Confirmado|
    |Cancelar|Negado    |

