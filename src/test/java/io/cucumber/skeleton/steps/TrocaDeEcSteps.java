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
    private String ec = "";
    private List<String> ecsList = null;

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
        HamburguerMenu.setCurrentEc();
        trocaDeEc.openTrocaDeEc();
    }

    @Quando("eu realizar uma busca com os seguintes dados validos:$")
    public void euRealizarUmaBuscaDoComEssesDados(List<String> dados) throws InterruptedException {
        for (int i = 0; i < dados.size(); i++) {
            String dado = dados.get(i);
            trocaDeEc.searchForValid(dado, i);
        }
        numBuscas = dados.size();
    }

    @Então("as buscas devem retornar os resultados esperados")
    public void aBuscaDeveRetornarRetorno_buscaResultados() {
        Assert.assertEquals(numBuscas, trocaDeEc.getResultadosEncontrados());
    }

    @Quando("eu realizar uma busca com os seguintes dados invalidos:$")
    public void euRealizarUmaBuscaComOsSeguintesDadosInvalidos(List<String> dados) {
        for (int i = 0; i < dados.size(); i++) {
            String dado = dados.get(i);
            trocaDeEc.searchForInvalid(dado, i);
        }
        numBuscas = 0;
    }

    @Então("as buscas não devem retornar resultados")
    public void asBuscasNãoDevemRetornarResultados() {
        aBuscaDeveRetornarRetorno_buscaResultados();
    }

    @Quando("eu selecionar o grupo de pagamento")
    public void euSelecionarOGrupoDePagamento() {
        trocaDeEc.clickGrupoPagamento();
    }

    @E("pesquisar e selecionar o estabelecimento com o numero de EC(.*)")
    public void pesquisarESelecionarOEstabelecimentoComONumeroDeECEC(String ec) {
        this.ec = ec;
        trocaDeEc.searchEc(ec);
        trocaDeEc.selectDisplayedEc();
    }

    @Então("esse EC deve ser exibido no Menu Lateral")
    public void esseECDeveSerExibidoNoMenuLateral() {
        HamburguerMenu.openHbgMenu();
        HamburguerMenu.setCurrentEc();
        Assert.assertEquals(ec, HamburguerMenu.getCurrentEc());
    }

    @Dado("que realize Login informando o Ec ou CPF ou Email {string}, o usuário, opcional, {string} e a senha {string}")
    public void queRealizeLoginInformandoOEcOuCPFOuEmailOUsuárioOpcionalEASenha(String ec, String user, String pass) {
        baseSteps.queEuEstouNaTelaDeLogin();
        loginSteps.euRealizarLoginInformandoOEcOuCPFOuEmailEcCpfEmailOUsuárioOpcionalUsuarioEASenhaSenha(ec, user, pass);
        loginSteps.aoPressionarOBotãoEntrarATelaHomeDeveSerExibida();
    }
}
