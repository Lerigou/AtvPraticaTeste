package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import util.Compontentes;

// Em estes utilizando Cucumber, a boa prática é não colocar lógica de programação aqui
// a lógica fica em util e somente é chamada aqui
public class ComponentesStep {

    Compontentes compontentes = new Compontentes();

    @Dado("que o usuário acessou o arquivo de treinamento")
    public void que_o_usuário_acessou_o_arquivo_de_treinamento() {
        compontentes.incializa();
    }

    @Quando("o usuário digitar Batatinha")
    public void o_usuário_digitar_Batatinha() {
        compontentes.testeTextField();
    }

    @Entao("o resultado no campo textfield de ser Batatinha")
    public void o_resultado_no_campo_textfield_de_ser_Batatinha() {
        // dps de testar pela primeira vez, colocar o método fechaNavegador
        compontentes.validaTextField();
    }

}
