package io.cucumber.skeleton.Steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.skeleton.pages.Android.AndroidHamburguerMenu;
import io.cucumber.skeleton.pages.Android.AndroidHomePage;
import io.cucumber.skeleton.pages.Android.AndroidLoginPage;
import io.cucumber.skeleton.pages.Android.BaseAndroidPage;
import org.junit.Assert;

public class LoginSteps {

    private BaseAndroidPage baseAndroidPage = new BaseAndroidPage();
    private AndroidLoginPage androidLogin = new AndroidLoginPage();
    private AndroidHomePage androidHomePage = new AndroidHomePage();
    private AndroidHamburguerMenu hbgMenu = new AndroidHamburguerMenu();

    @E("preencho o campo de Login com {string}")
    public void preenchoOCampoDeLoginComOEC(String ec) {
        baseAndroidPage.fillFirstLoginField(ec);
    }

    @Quando("eu selecionar o botão Proximo")
    public void euSelecionarOBotãoProximo() {
        baseAndroidPage.clickBtnPoximo();
    }

    @E("preencher o campo usuário com {string}")
    public void preencherOCampoUsuárioCom(String user) {
        baseAndroidPage.fillUser(user);
    }

    @E("o campo senha com {string}")
    public void oCampoSenhaCom(String password) {
        baseAndroidPage.fillPass(password);
    }

    @Então("ao pressionar o botão Entrar a tela Home deve ser exibida")
    public void aoPressionarOBotãoEntrarATelaHomeDeveSerExibida() {
        baseAndroidPage.clickBtnLogin();
       boolean test = androidLogin.loginError();
        System.out.println(test);
        if(test){
            throw new RuntimeException("Não foi possivel logar no App devido a um erro no serviço");
        }else{
        Assert.assertTrue("A tela home não foi exibida", androidHomePage.checkHomePage());
        }
    }

    @E("preencho o campo de Login com um email não cadastrado")
    public void preenchoOCampoDeLoginComUmEmailNãoCadastrado() {
        androidLogin.fillEmail();
    }

    @Então("ao pressionar o botão Entrar, a mensagem {string} deve ser exibida")
    public void aMensagemDeveSerExibida(String msg) {
        baseAndroidPage.clickBtnLogin();
        Assert.assertEquals(msg, androidLogin.getErrorMsgTxt());
    }

    @E("preencho o campo de Login com um CPF não cadastrado")
    public void preenchoOCampoDeLoginComUmCPFNãoCadastrado() {
        androidLogin.fillCpf();
    }

    @Quando("eu realizar Login informando (.*), (.*), (.*) com a opção Salvar Dados selecionada")
    public void euRealizarLoginInformandoECUsuarioSenhaComAOpçãoSalvarDadosSelecionada(String ec, String user, String senha) {
        preenchoOCampoDeLoginComOEC(ec);
        euSelecionarOBotãoProximo();
        preencherOCampoUsuárioCom(user);
        oCampoSenhaCom(senha);
        androidLogin.checkSalvarDados();
        aoPressionarOBotãoEntrarATelaHomeDeveSerExibida();
    }

    @Então("ao sair do App, os campos (.*), (.*), (.*) devem continuar preenchidos na Tela de Login")
    public void aoSairDoAppOsCamposECUsuarioSenhaDevemContinuarPreenchidosNaTelaDeLogin(String ec, String user, String senha) throws InterruptedException {
        hbgMenu.sair();
    }
}
