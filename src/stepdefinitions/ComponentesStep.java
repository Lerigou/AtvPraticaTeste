package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import util.Compontentes;

public class ComponentesStep {

    Compontentes compotentes = new Compontentes();

    @Dado("que o usuário acessou o arquivo de treinamento")
    public void que_o_usuário_acessou_o_arquivo_de_treinamento() {
        compotentes.incializa();
    }

    @Quando("o usuário digitar Batatinha no textfiled")
    public void o_usuário_digitar_Batatinha_no_textfiled() {
        compotentes.testeTextField();
    }

    @Entao("o resultado no campo textfiled de ser Batatinha")
    public void o_resultado_no_campo_textfiled_de_ser_Batatinha() {
        compotentes.validaTextField();
    }

    @Quando("o usuário digitar batatinha batatinha batatinha no textarea")
    public void o_usuário_digitar_batatinha_batatinha_batatinha_no_textarea() {
        compotentes.testeTextArea();
    }

    @Entao("o resultado no campo textarea de ser batatinha batatinha batatinha")
    public void o_resultado_no_campo_textarea_de_ser_batatinha_batatinha_batatinha() {
        compotentes.validaTextArea();
    }

    @Quando("o usuário clicar no elemento radio")
    public void o_usuário_clicar_no_elemento_radio(){
        compotentes.testeRadio();
    }

    @Entao("o radio deve aparecer selecionado")
    public void o_radio_deve_aparecer_selecionado(){
        compotentes.validarRadio();
    }

    @Quando("o usuário clicar no elemento checkbox")
    public void o_usuário_clicar_no_elemento_checkbox(){
        compotentes.testeCheckbox();
    }

    @Entao("o checkbox deve aparecer selecionado")
    public void o_checkbox_deve_aparecer_selecionado(){
        compotentes.validarCheckbox();
    }

    @Quando("o usuário selecionar mestrado")
    public void o_usuário_selecionar_mestrado() {
        compotentes.testeDropdown();
    }

    @Entao("o dropdown deve mostrar mestrado")
    public void o_dropdown_deve_mostrar_mestrado() {
        compotentes.validarDropdown();
    }

    @Quando("o usuário <opção> um valor no elemento combo de multipla escolha")
    public void o_usuário_opção_um_valor_no_elemento_combo_de_multipla_escolha() {
        compotentes.testeSelect();
    }

    @Entao("o valor deve aparecer selecionado no elemento combo de multipla escolha")
    public void o_valor_deve_aparecer_selecionado_no_elemento_combo_de_multipla_escolha() {
        compotentes.validarSelect();
    }

    @Quando("o usuário clicar no botão")
    public void o_usuário_clicar_no_botão() {
        compotentes.testeButtonTks();
    }

    @Entao("o label deve alterar para Obrigado!")
    public void o_label_deve_alterar_para_Obrigado() {
        compotentes.validarButtonTks();
    }

    @Quando("o usuário clicar no link")
    public void o_usuário_clicar_no_link() {
        compotentes.testeLink();
    }

    @Entao("o status deve alterar para {string}")
    public void o_status_deve_alterar_para(String string) {
        compotentes.validarLink();
    }

    @After
    public void sair(){
        compotentes.fechaNavegador();
    }

}
