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
