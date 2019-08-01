package io.cucumber.skeleton.Steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.skeleton.pages.Android.AndroidAutoCadastroPage;
import io.cucumber.skeleton.pages.Android.AndroidLoginPage;
import io.cucumber.skeleton.pages.Android.BaseAndroidPage;
import io.cucumber.skeleton.pages.iOS.BaseIosPage;
import org.junit.Assert;


public class AutoCadastroSteps {


    public BaseIosPage baseIosPage = new BaseIosPage();
    public BaseAndroidPage baseAndroidPage = new BaseAndroidPage();
    public AndroidLoginPage androidLoginPage = new AndroidLoginPage();
    public AndroidAutoCadastroPage androidCadastro = new AndroidAutoCadastroPage();

    @E("eu selecionar o botão Criar Usuario")
    public void euSelecionarOBotãoAutoCadastro() {
        androidLoginPage.touchAutoCadastro();
    }

    @Então("a tela do Auto Cadastro deve ser exibida")
    public void aTelaDoAutoCadastroDeveSerExibida() {
        Assert.assertEquals("Criar usuário", androidCadastro.getPageTitle());
    }


    @Dado("que eu deseje realizar um cadastro do tipo (.*) utilizando o EC (.*)")
    public void queEuDesejeRealizarUmCadastroDoTipoTipo_cadastroUtilizandoOECEC(String tipoCadastro, String ec) {
        androidCadastro.setTipoCadastro(tipoCadastro);
        androidCadastro.setEc(ec);
    }

    @E("que eu preencha os dados cadastrais")
    public void queEuPreenchaOsDadosCadastrais() {
        androidCadastro.preencherDadosCadastrais();
    }

    @Quando("eu preencher os dados da conta bancaria, tipo de pessoa (.*), banco (.*), tipo de conta (.*), agencia (.*), numero da conta (.*) e digito (.*)")
    public void euPreencherOsDadosDaContaBancariaTipoDePessoaTipo_pessoaBancoBancoTipoDeContaTipo_contaAgenciaAgenciaNumeroDaContaN_contaEDigitoDigito(String tipoPessoa, String banco, String tipoConta, String agencia, String nConta, String digitoConta) throws InterruptedException {
        androidCadastro.preencherDadosBancarios(tipoPessoa, banco, tipoConta, agencia, nConta, digitoConta);
    }

    @E("selecionar o botão De acordo")
    public void selecionarOBotãoDeAcordo() {

    }

    @E("selecionar o botão Confirmar")
    public void selecionarOBotãoConfirmar() {

    }

    @Então("eu devo informar o nome de usuário desejado")
    public void euDevoInformarONomeDeUsuárioDesejado() {
    }

    @E("a tela de confirmação de email deve ser exibida")
    public void aTelaDeConfirmaçãoDeEmailDeveSerExibida() {
        
    }
}
