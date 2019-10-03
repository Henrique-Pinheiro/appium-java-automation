package io.cucumber.skeleton.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.skeleton.pages.AutoCadastroPage;
import io.cucumber.skeleton.pages.LoginPage;
import io.cucumber.skeleton.pages.BasePage;
import org.junit.Assert;


public class AutoCadastroSteps {

    public BasePage basePage = new BasePage();
    public LoginPage loginPage = new LoginPage();
    public AutoCadastroPage autoCadastroPage = new AutoCadastroPage();

    @E("eu selecionar o botão Criar Usuario")
    public void euSelecionarOBotãoAutoCadastro() {
        loginPage.touchAutoCadastro();
    }

    @Então("a tela do Auto Cadastro deve ser exibida")
    public void aTelaDoAutoCadastroDeveSerExibida() {
        Assert.assertEquals("Criar usuário", autoCadastroPage.getPageTitle());
    }

    @Dado("que eu deseje realizar um cadastro do tipo (.*) utilizando o EC (.*)")
    public void queEuDesejeRealizarUmCadastroDoTipoTipo_cadastroUtilizandoOECEC(String tipoCadastro, String ec) {
        autoCadastroPage.setTipoCadastro(tipoCadastro);
        autoCadastroPage.setEc(ec);
    }

    @Dado("que eu deseje realizar um cadastro utilizando o EC (.*)")
    public void queEuDesejeRealizarUmCadastroUtilizandoOECEC(String ec) {
        autoCadastroPage.setEc(ec);
    }

    @E("que eu preencha os dados cadastrais")
    public void queEuPreenchaOsDadosCadastrais() {
        autoCadastroPage.preencherDadosCadastrais();
    }

    @Quando("eu preencher os dados da conta bancaria, tipo de pessoa (.*), banco (.*), tipo de conta (.*), agencia (.*), numero da conta (.*) e digito (.*)")
    public void euPreencherOsDadosDaContaBancariaTipoDePessoaTipo_pessoaBancoBancoTipoDeContaTipo_contaAgenciaAgenciaNumeroDaContaN_contaEDigitoDigito(String tipoPessoa, String banco, String tipoConta, String agencia, String nConta, String digitoConta) throws InterruptedException {
        autoCadastroPage.preencherDadosBancarios(tipoPessoa, banco, tipoConta, agencia, nConta, digitoConta);
    }

    @E("selecionar o botão De acordo")
    public void selecionarOBotãoDeAcordo() throws InterruptedException {
        autoCadastroPage.deAcordo();
    }

    @E("selecionar o botão Confirmar")
    public void selecionarOBotãoConfirmar() {
        autoCadastroPage.pressBtnConfirmar();
    }

    @Então("eu devo informar o nome de usuário desejado")
    public void euDevoInformarONomeDeUsuárioDesejado() {
        autoCadastroPage.preencherUsuario();
    }


    @E("ao pressionar o botão Ok a tela de confirmação de email deve ser exibida")
    public void aoPressionarOBotãoContinuarATelaDeConfirmaçãoDeEmailDeveSerExibida() {
        autoCadastroPage.pressBtnOk();
        autoCadastroPage.verificaTelaEmail();
    }

    @E("ao pressionar o botão voltar a tela de Login deve ser exibida")
    public void aoPressionarOBotãoVoltarATelaDeLoginDeveSerExibida() {
        autoCadastroPage.pressBtnVoltar();
        Assert.assertTrue("A pagina de login não está sendo exibida", basePage.checkLoginPageAgain());
    }

    @Quando("eu preencher o numero de serie (.*) do cartão")
    public void euPreencherONumeroDeSerieNumero_serieDoCartão(String cardNumber) throws InterruptedException {
        autoCadastroPage.preencherDadosCartao(cardNumber);
    }
}
