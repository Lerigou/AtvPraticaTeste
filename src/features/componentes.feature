#language:pt
Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo de treinamento

  @validar_campo_textfield
  Cenário: Validar campo textfield
    Quando o usuário digitar Batatinha no textflied
    Entao o resultado no campo textfield de ser Batatinha

  @validar_campo_textarea
  Cenário: Validar campo textarea
    Quando o usuário digitar batatinha batatinha batatinha no textarea
    Entao o resultado no campo textarea deve ser batatinha batatinha batatinha

  @validar_campo_textfield_textarea
  Esquema do Cenário: Validar campo textfield e textarea
    Quando o usuário digitar <valor> no <campo>
    Entao o resultado no campo <campo> de ser <valor>
    Exemplos:
      |campo    |valor                        |
      |textfiled|Batatinha                    |
      |textarea |batatinha batatinha batatinha|

    @validar_radio
    Cenário: Validar elemento radio
      Quando o usuário clicar no elemento radio
      Entao o radio deve aparecer selecionado

    @validar_checkbox
    Cenário: Validar elemento checkbox
      Quando o usuário clicar no elemento checkbox
      Entao o checkbox deve aparecer selecionado

    @validar_radio_checkbox
    Esquema do Cenario: Validar elemento do radio e checkbox
      Quando o usuário clicar no elemento <campo>
      Entao o <campo> deve aparecer selecionado
      Exemplos:
      |campo|
      |radio|
      |checkbox|

    @validar_campo_dropdown
    Cenario: Validar campo dropdown
      Quando o usuário selecionar mestrado
      Entao o dropdown deve mostrar mestrado

    @validar_campo_select
    Cenario: Validar campo select
      Quando o usuário selecionar futebol
      Entao o select deve mostrar futebol

    @validar_campo_select_multipla_escolha
    Esquema do Cenario: Validar elemento Como Múltipla Escolha
      Quando o usuário <opção> um valor no elemento combo de multipla escolha
      Entao o valor deve aparecer <resultado> no elemento combo de multipla escolha
      Exemplos:
      |opcao|resultado|
      |selecionar|selecionado|
      |desselecionar|selecionado|

      @validar_alteração_de_label_do_botão
      Cenario: Validar alteração de label do botão
        Quando o usuário clicar no botão
        Entao o label deve alterar para Obrigado!

      @validar_alteração_de_status_do_link
      Cenario: Validar alteração de Status do link
        Quando o usuário clicar no link
        Entao o status deve alterar para "Voltou!"