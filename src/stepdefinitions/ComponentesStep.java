package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import util.Compontentes;

// Em testes utilizando Cucumber, a boa prática é não colocar lógica de programação aqui
// a lógica fica em util e somente é chamada aqui
public class ComponentesStep {

    Compontentes compontentes = new Compontentes();

    @Dado("que o usuário acessou o arquivo de treinamento")
    public void que_o_usuário_acessou_o_arquivo_de_treinamento() {
        compontentes.incializa();
    }

    @Quando("o usuário digitar Batatinha no textfiled")
    public void o_usuário_digitar_Batatinha_no_textfiled() {
        compontentes.testeTextField();
    }

    @Entao("o resultado no campo textfiled de ser Batatinha")
    public void o_resultado_no_campo_textfiled_de_ser_Batatinha() {
        // dps de testar pela primeira vez, colocar o método fechaNavegador
        compontentes.validaTextField();
    }

    @Quando("o usuário digitar batatinha batatinha batatinha no textarea")
    public void o_usuário_digitar_batatinha_batatinha_batatinha_no_textarea() {
        // Write code here that turns the phrase above into concrete actions
        compontentes.testeTextArea();
    }

    @Entao("o resultado no campo textarea de ser batatinha batatinha batatinha")
    public void o_resultado_no_campo_textarea_de_ser_batatinha_batatinha_batatinha() {
        // Write code here that turns the phrase above into concrete actions
        compontentes.validaTextArea();
    }

    @Quando("o usuário clicar no elemento radio")
    public void o_usuário_clicar_no_elemento_radio(){
        compontentes.testeRadio();
    }

    @Entao("o radio deve aparecer selecionado")
    public void o_radio_deve_aparecer_selecionado(){
        compontentes.validarRadio();
    }

    @Quando("o usuário clicar no elemento checkbox")
    public void o_usuário_clicar_no_elemento_checkbox(){
        compontentes.testeCheckbox();
    }

    @Entao("o checkbox deve aparecer selecionado")
    public void o_checkbox_deve_aparecer_selecionado(){
        compontentes.validarCheckbox();
    }

    @Quando("o usuário selecionar mestrado")
    public void o_usuário_selecionar_mestrado() {
        compontentes.testeDropdown();
    }

    @Entao("o dropdown deve mostrar mestrado")
    public void o_dropdown_deve_mostrar_mestrado() {
        compontentes.validarDropdown();
    }

    @Quando("o usuário <opção> um valor no elemento combo de multipla escolha")
    public void o_usuário_opção_um_valor_no_elemento_combo_de_multipla_escolha() {
        compontentes.testeSelect();
    }

    @Entao("o valor deve aparecer selecionado no elemento combo de multipla escolha")
    public void o_valor_deve_aparecer_selecionado_no_elemento_combo_de_multipla_escolha() {
        compontentes.validarSelect();
    }

    @Quando("o usuário clicar no botão")
    public void o_usuário_clicar_no_botão() {
        compontentes.testeButtonTks();
    }

    @Entao("o label deve alterar para Obrigado!")
    public void o_label_deve_alterar_para_Obrigado() {
        compontentes.validarButtonTks();
    }

    @Quando("o usuário clicar no link")
    public void o_usuário_clicar_no_link() {
        compontentes.testeLink();
    }

    @Entao("o status deve alterar para {string}")
    public void o_status_deve_alterar_para(String string) {
        compontentes.validarLink();
    }

//    Trabalho avaliativo
    @Dado("que o usuário preencheu os campos nome, sobrenome, sexo, comida preferida, escolaridade, esporte praticado e sugestão")
    public void que_o_usuário_preencheu_os_campos_nome_sobrenome_sexo_comida_preferida_escolaridade_esporte_praticado_e_sugestão() {
        // aqui eu só escrevo nos campos
        compontentes.testeTextField();
        compontentes.testeTextFieldSobrenome();
        compontentes.testeRadio();
        compontentes.testeCheckbox();
        compontentes.testeDropdown();
        compontentes.testeSelect();
        compontentes.testeTextArea();
    }

    @Dado("clicou no botão Cadastrar")
    public void clicou_no_botão_Cadastrar() {
        // aqui eu mando ele clicar no botão
        compontentes.testeButtonCadastro();
    }

    @Quando("o botão Cadastrar for clicado")
    public void o_botão_Cadastrar_for_clicado() {
        compontentes.validarButtonCadastro();
    }

    @Entao("as informações devem ser validadas e mostradas ao final da página")
    public void as_informações_devem_ser_validadas_e_mostradas_ao_final_da_página() {
        compontentes.validarCadastro();
    }

    @Quando("o nome estiver vazio")
    public void o_nome_estiver_vazio() {
        compontentes.testeButtonCadastro();
    }

    @Entao("a página deve mostrar um alert indicando a obrigatoriedade do campo nome")
    public void a_página_deve_mostrar_um_alert_indicando_a_obrigatoriedade_do_campo_nome() {
        compontentes.validarCampoNome();
    }

    @Quando("o sobrenome estiver vazio")
    public void o_sobrenome_estiver_vazio() {
        compontentes.testeTextField();
        compontentes.testeButtonCadastro();
    }

    @Entao("a página deve mostrar um alert indicando a obrigatoriedade do campo sobrenome")
    public void a_página_deve_mostrar_um_alert_indicando_a_obrigatoriedade_do_campo_sobrenome() {
        compontentes.validarCampoSobrenome();
    }

    @Quando("o sexo estiver vazio")
    public void o_sexo_estiver_vazio() {
        compontentes.testeTextField();
        compontentes.testeTextFieldSobrenome();
        compontentes.testeButtonCadastro();
    }

    @Entao("a página deve mostrar um alert indicando a obrigatoriedade do campo sexo")
    public void a_página_deve_mostrar_um_alert_indicando_a_obrigatoriedade_do_campo_sexo() {
        compontentes.validarCampoSexo();
    }

    @Dado("que o usuario clicou no botão alert")
    public void que_o_usuario_clicou_no_botão_alert() {
        compontentes.testeButtonAlert();
    }

    @Dado("a mensagem for Alert Simples")
    public void a_mensagem_for_Alert_Simples() {
        compontentes.validarButtonAlert();
    }

    @Quando("o usuário clicar em Ok")
    public void o_usuário_clicar_em_Ok() {
        compontentes.validarAcceptButtonAlert();
    }

    @Entao("a página deve verificar se a mensagem não é mais apresentada")
    public void a_página_deve_verificar_se_a_mensagem_não_é_mais_apresentada() {
        compontentes.validarAlertsClosed();
    }

    @Dado("que o usuario clicou no botão confirm")
    public void que_o_usuario_clicou_no_botão_confirm() {
        compontentes.testeButtonConfirm();
    }

    @Dado("a mensagem for Confirm Simples")
    public void a_mensagem_for_Confirm_Simples() {
        compontentes.validarButtonConfirm();
    }

    @Quando("o usuario clicar em Ok")
    public void o_usuario_clicar_em_Ok() {
        compontentes.validarAcceptButtonConfirm();
    }

    @Entao("verificar se a mensagem que aparece é Confirmado")
    public void verificar_se_a_mensagem_que_aparece_é_Confirmado() {
        compontentes.validarOkText();
    }

    @Quando("o usuario clicar em Cancelar")
    public void o_usuario_clicar_em_Cancelar() {
        compontentes.validarDismissButtonConfirm();
    }

    @Entao("verificar se a mensagem que aparece é Negado")
    public void verificar_se_a_mensagem_que_aparece_é_Negado() {
        compontentes.validarCancelarText();
    }

    @Entao("a página deve verificar se o alert de confirmação não é mais apresentada")
    public void a_página_deve_verificar_se_o_alert_de_confirmação_não_é_mais_apresentada() {
        compontentes.validarAlertsClosed();
    }


    @After
    public void sair(){
        compontentes.fechaNavegador();
    }

}
