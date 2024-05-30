#language:pt
Funcionalidade: Interagir com vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo de treinamento

#  Em apenas um cenário, preencher seu nome, seu sobrenome, seu sexo, sua comida preferida,
#  sua escolaridade, qual esporte você pratica, alguma sugestão e clicar no botão Cadastrar.
#  Após clicar no botão cadastrar, validar todas as informações preenchidas no formulário que
#  será apresentado no formulário no final da página.

  @validar_dados_de_cadastro
  Cenário: Validar cadastro
    Dado que o usuário preencheu os campos nome, sobrenome, sexo, comida preferida, escolaridade, esporte praticado e sugestão
    E clicou no botão Cadastrar
    Quando o botão Cadastrar for clicado
    Entao as informações devem ser validadas e mostradas ao final da página
