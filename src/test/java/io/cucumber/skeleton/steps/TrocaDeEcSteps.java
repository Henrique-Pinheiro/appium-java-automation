package io.cucumber.skeleton.steps;


import cucumber.api.java.pt.*;
import io.cucumber.skeleton.pages.*;
import org.junit.Assert;

import java.util.List;


public class TrocaDeEcSteps {

    private BaseStepdefs baseSteps = new BaseStepdefs();
    private LoginSteps loginSteps = new LoginSteps();
    private TrocaDeEcPage trocaDeEc = new TrocaDeEcPage();

    private int numBuscas = 0;

    @Dado("que eu realize Login informando o Ec ou CPF ou Email (.*), o usuário, opcional, (.*) e a senha (.*)")
    public void euEstiverLogadoNaTelaHomeComOsDadosECUsuárioESenha(String ecEmailCpf, String user, String pass) {
        baseSteps.queEuEstouNaTelaDeLogin();
        loginSteps.euRealizarLoginInformandoOEcOuCPFOuEmailEcCpfEmailOUsuárioOpcionalUsuarioEASenhaSenha(ecEmailCpf, user, pass);
        loginSteps.aoPressionarOBotãoEntrarATelaHomeDeveSerExibida();
    }

    @E("selecionar a opção Trocar de Estabelecimento no Menu Lateral")
    public void selecionarAOpçãoTrocarDeEstabelecimentoNoMenuLateral() {
        HamburguerMenu hbgMenu = new HamburguerMenu();
        hbgMenu.openHbgMenu();
        trocaDeEc.openTrocaDeEc();
    }

    @Quando("eu realizar uma busca com os seguintes dados validos:$")
    public void euRealizarUmaBuscaDoComEssesDados(List<String> dados) throws InterruptedException {
        for (int i = 0; i < dados.size(); i++) {
            String dado = dados.get(i);
            trocaDeEc.searchFor(dado, i);
        }
        numBuscas = dados.size();
    }

    @Então("as buscas devem retornar os resultados esperados")
    public void aBuscaDeveRetornarRetorno_buscaResultados() {
        Assert.assertEquals(numBuscas, trocaDeEc.getResultadosEncontrados());
    }
}
