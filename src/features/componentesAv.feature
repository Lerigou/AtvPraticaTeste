#language:pt
Funcionalidade: Interagir com vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo de treinamento

#    Questão 1
  @validar_dados_de_cadastro
  Cenário: Validar cadastro
    Dado que o usuário preencheu os campos nome, sobrenome, sexo, comida preferida, escolaridade, esporte praticado e sugestão
    E clicou no botão Cadastrar
    Quando o botão Cadastrar for clicado
    Entao as informações devem ser validadas e mostradas ao final da página

#    Questão 2
  @validar_campos_obrigatórios
  Esquema do Cenário: Validar campos obrigatórios
    Quando o <campo> estiver vazio
    Entao a página deve mostrar um alert indicando a obrigatoriedade do campo <campo>
    Exemplos:
      |campo    |
      |nome     |
      |sobrenome|
      |sexo     |

#    Questão 3 - a
  @validar_botão_alert
  Cenario: validar botão alert
    Dado que o usuario clicou no botão alert
    E a mensagem for Alert Simples
    Quando o usuário clicar em Ok
    Entao a página deve verificar se a mensagem não é mais apresentada

#    Questão 3 - b e c
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

#    Questão 3 - d
  @validar_botão_prompt
  Cenario: validar botão prompt
    Dado que o usuário clicou no botão prompt
    E digitar um número na caixa de texto
    Quando o usuário clicar em Ok no prompt
    Entao a página deve verificar se a mensagem que aparece corresponde ao número digitado
    E clicou novamente em Ok
    E verificou se a mensagem apresentada é :D
    E clicar novamente em Ok
    Entao a mensagem com o número informado não é mais apresentada
