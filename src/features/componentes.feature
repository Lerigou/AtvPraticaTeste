#language:pt
Funcionalidade: Acessar vários componentes html
  Contexto:
    Dado que o usuário acessou o arquivo de treinamento

  Cenário: Validar campo textfield
    Quando o usuário digitar Batatinha
    Entao o resultado no campo textfield de ser Batatinha

  Cenário: Validar campo textarea
    Quando o usuário digitar batatinha batatinha batatinha
    Entao o resultado no campo textarea deve ser batatinha batatinha batatinha