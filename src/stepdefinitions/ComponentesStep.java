package stepdefinitions;

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
        compontentes.fechaNavegador();
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
        compontentes.fechaNavegador();
    }

    @Quando("o usuário clicar no elemento radio")
    public void o_usuário_clicar_no_elemento_radio(){
        compontentes.testeRadio();
    }

    @Entao("o radio deve aparecer selecionado")
    public void o_radio_deve_aparecer_selecionado(){
        compontentes.validarRadio();
        compontentes.fechaNavegador();
    }

    @Quando("o usuário clicar no elemento checkbox")
    public void o_usuário_clicar_no_elemento_checkbox(){
        compontentes.testeCheckbox();
    }

    @Entao("o checkbox deve aparecer selecionado")
    public void o_checkbox_deve_aparecer_selecionado(){
        compontentes.validarCheckbox();
        compontentes.fechaNavegador();
    }

    @Quando("o usuário selecionar mestrado")
    public void o_usuário_selecionar_mestrado() {
        compontentes.testeDropdown();
    }

    @Entao("o dropdown deve mostrar mestrado")
    public void o_dropdown_deve_mostrar_mestrado() {
        compontentes.validarDropdown();
        compontentes.fechaNavegador();
    }

    @Quando("o usuário <opção> um valor no elemento combo de multipla escolha")
    public void o_usuário_opção_um_valor_no_elemento_combo_de_multipla_escolha() {
        compontentes.testeSelect();
    }

    @Entao("o valor deve aparecer selecionado no elemento combo de multipla escolha")
    public void o_valor_deve_aparecer_selecionado_no_elemento_combo_de_multipla_escolha() {
        compontentes.validarSelect();
        compontentes.fechaNavegador();
    }

    @Quando("o usuário clicar no botão")
    public void o_usuário_clicar_no_botão() {
        compontentes.testeButtonTks();
    }

    @Entao("o label deve alterar para Obrigado!")
    public void o_label_deve_alterar_para_Obrigado() {
        compontentes.validarButtonTks();
        compontentes.fechaNavegador();
    }

    @Quando("o usuário clicar no link")
    public void o_usuário_clicar_no_link() {
        compontentes.testeLink();
    }

    @Entao("o status deve alterar para {string}")
    public void o_status_deve_alterar_para(String string) {
        compontentes.validarLink();
        compontentes.fechaNavegador();
    }

}
