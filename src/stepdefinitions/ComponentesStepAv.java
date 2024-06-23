package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import util.Compontentes;

public class ComponentesStepAv {

    Compontentes componentes = new Compontentes();

    @Dado("que o usuário acessou o arquivo de treinamento")
    public void que_o_usuário_acessou_o_arquivo_de_treinamento() {
        componentes.incializa();
    }

    @Dado("que o usuário preencheu os campos nome, sobrenome, sexo, comida preferida, escolaridade, esporte praticado e sugestão")
    public void que_o_usuário_preencheu_os_campos_nome_sobrenome_sexo_comida_preferida_escolaridade_esporte_praticado_e_sugestão() {
        componentes.testeTextField();
        componentes.testeTextFieldSobrenome();
        componentes.testeRadio();
        componentes.testeCheckbox();
        componentes.testeDropdown();
        componentes.testeSelect();
        componentes.testeTextArea();
    }

    @Dado("clicou no botão Cadastrar")
    public void clicou_no_botão_Cadastrar() {
        componentes.testeButtonCadastro();
    }

    @Quando("o botão Cadastrar for clicado")
    public void o_botão_Cadastrar_for_clicado() {
        componentes.validarButtonCadastro();
    }

    @Entao("as informações devem ser validadas e mostradas ao final da página")
    public void as_informações_devem_ser_validadas_e_mostradas_ao_final_da_página() {
        componentes.validarCadastro();
    }

    @Quando("o nome estiver vazio")
    public void o_nome_estiver_vazio() {
        componentes.testeButtonCadastro();
    }

    @Entao("a página deve mostrar um alert indicando a obrigatoriedade do campo nome")
    public void a_página_deve_mostrar_um_alert_indicando_a_obrigatoriedade_do_campo_nome() {
        componentes.validarCampoNome();
    }

    @Quando("o sobrenome estiver vazio")
    public void o_sobrenome_estiver_vazio() {
        componentes.testeTextField();
        componentes.testeButtonCadastro();
    }

    @Entao("a página deve mostrar um alert indicando a obrigatoriedade do campo sobrenome")
    public void a_página_deve_mostrar_um_alert_indicando_a_obrigatoriedade_do_campo_sobrenome() {
        componentes.validarCampoSobrenome();
    }

    @Quando("o sexo estiver vazio")
    public void o_sexo_estiver_vazio() {
        componentes.testeTextField();
        componentes.testeTextFieldSobrenome();
        componentes.testeButtonCadastro();
    }

    @Entao("a página deve mostrar um alert indicando a obrigatoriedade do campo sexo")
    public void a_página_deve_mostrar_um_alert_indicando_a_obrigatoriedade_do_campo_sexo() {
        componentes.validarCampoSexo();
    }

    @Dado("que o usuario clicou no botão alert")
    public void que_o_usuario_clicou_no_botão_alert() {
        componentes.testeButtonAlert();
    }

    @Dado("a mensagem for Alert Simples")
    public void a_mensagem_for_Alert_Simples() {
        componentes.validarButtonAlert();
    }

    @Quando("o usuário clicar em Ok")
    public void o_usuário_clicar_em_Ok() {
        componentes.validarAcceptButtonAlert();
    }

    @Entao("a página deve verificar se a mensagem não é mais apresentada")
    public void a_página_deve_verificar_se_a_mensagem_não_é_mais_apresentada() {
        componentes.validarAlertsClosed();
    }

    @Dado("que o usuario clicou no botão confirm")
    public void que_o_usuario_clicou_no_botão_confirm() {
        componentes.testeButtonConfirm();
    }

    @Dado("a mensagem for Confirm Simples")
    public void a_mensagem_for_Confirm_Simples() {
        componentes.validarButtonConfirm();
    }

    @Quando("o usuario clicar em Ok")
    public void o_usuario_clicar_em_Ok() {
        componentes.validarAcceptButtonConfirm();
    }

    @Entao("verificar se a mensagem que aparece é Confirmado")
    public void verificar_se_a_mensagem_que_aparece_é_Confirmado() {
        componentes.validarOkText();
    }

    @Quando("o usuario clicar em Cancelar")
    public void o_usuario_clicar_em_Cancelar() {
        componentes.validarDismissButtonConfirm();
    }

    @Entao("verificar se a mensagem que aparece é Negado")
    public void verificar_se_a_mensagem_que_aparece_é_Negado() {
        componentes.validarCancelarText();
    }

    @Entao("a página deve verificar se o alert de confirmação não é mais apresentada")
    public void a_página_deve_verificar_se_o_alert_de_confirmação_não_é_mais_apresentada() {
        componentes.validarAlertsClosed();
    }

    @Dado("que o usuário clicou no botão prompt")
    public void que_o_usuário_clicou_no_botão_prompt() {
        componentes.testeButtonPrompt();
    }

    @Dado("digitar um número na caixa de texto")
    public void digitar_um_número_na_caixa_de_texto() {
        componentes.validarButtonPrompt();
    }

    @Quando("o usuário clicar em Ok no prompt")
    public void o_usuário_clicar_em_Ok_no_prompt() {
        componentes.validarButtonOkPrompt();
    }


    @Entao("a página deve verificar se a mensagem que aparece corresponde ao número digitado")
    public void a_página_deve_verificar_se_a_mensagem_que_aparece_corresponde_ao_número_digitado() {
        componentes.validarTextoPrompt();
    }

    @Entao("clicou novamente em Ok")
    public void clicou_novamente_em_Ok() {
        componentes.validarButtonOkPrompt();
    }

    @Entao("verificou se a mensagem apresentada é :D")
    public void verificou_se_a_mensagem_apresentada_é_D() {
        componentes.validarTexto2Prompt();
    }

    @Entao("clicar novamente em Ok")
    public void clicar_novamente_em_Ok() {
        componentes.validarButtonOkPrompt();
    }

    @Entao("a mensagem com o número informado não é mais apresentada")
    public void a_mensagem_com_o_número_informado_não_é_mais_apresentada() {
        componentes.validarAlertsClosed();
    }

    @After
    public void sairdogoogle(){
        componentes.fechaNavegador();
    }
}
