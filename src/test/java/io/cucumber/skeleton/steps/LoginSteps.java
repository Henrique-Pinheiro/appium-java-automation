package io.cucumber.skeleton.steps;

import cucumber.api.java.pt.*;
import io.cucumber.skeleton.pages.HamburguerMenu;
import io.cucumber.skeleton.pages.HomePage;
import io.cucumber.skeleton.pages.LoginPage;
import io.cucumber.skeleton.pages.BasePage;
import org.junit.Assert;

public class LoginSteps {

    private BaseStepdefs baseSteps = new BaseStepdefs();
    private BasePage basePage = new BasePage();
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();
    private HamburguerMenu hbgMenu = new HamburguerMenu();
    private String user = "";

    @E("preencho o campo de Login com {string}")
    public void preenchoOCampoDeLoginComOEC(String ec) {
        basePage.fillFirstLoginField(ec);
    }

    @Quando("eu selecionar o botão Proximo")
    public void euSelecionarOBotãoProximo() {
        basePage.clickBtnPoximo();
    }

    @E("preencher o campo usuário com {string}")
    public void preencherOCampoUsuárioCom(String user) {
        this.user = user;
        basePage.fillUser(this.user);
    }

    @E("o campo senha com {string}")
    public void oCampoSenhaCom(String password) {
        basePage.fillPass(password);
    }

    @Então("ao pressionar o botão Entrar a tela Home deve ser exibida")
    public void aoPressionarOBotãoEntrarATelaHomeDeveSerExibida() {
        basePage.clickBtnLogin();
//        if (androidLogin.loginError()) {
//            throw new RuntimeException("Não foi possivel logar no App devido a um erro no serviço");
//        } else {
            Assert.assertTrue("A tela home não foi exibida", homePage.checkHomePage());
//        }
    }

    @E("preencho o campo de Login com um email não cadastrado")
    public void preenchoOCampoDeLoginComUmEmailNãoCadastrado() {
        loginPage.fillEmail();
    }

    @Então("ao pressionar o botão Entrar, a mensagem {string} deve ser exibida")
    public void aMensagemDeveSerExibida(String msg) {
        basePage.clickBtnLogin();
        Assert.assertEquals(msg, loginPage.getErrorMsgTxt());
    }

    @E("preencho o campo de Login com um CPF não cadastrado")
    public void preenchoOCampoDeLoginComUmCPFNãoCadastrado() {
        loginPage.fillCpf();
    }

    @Quando("eu realizar Login informando (.*), (.*), (.*) com a opção Salvar Dados selecionada")
    public void euRealizarLoginInformandoECUsuarioSenhaComAOpçãoSalvarDadosSelecionada(String ec, String user, String senha) {
        preenchoOCampoDeLoginComOEC(ec);
        euSelecionarOBotãoProximo();
        preencherOCampoUsuárioCom(user);
        oCampoSenhaCom(senha);
        loginPage.checkSalvarDados();
        aoPressionarOBotãoEntrarATelaHomeDeveSerExibida();
    }

    @Então("ao sair do App, os campos (.*) e (.*) devem continuar preenchidos na Tela de Login")
    public void aoSairDoAppOsCamposECUsuarioSenhaDevemContinuarPreenchidosNaTelaDeLogin(String ec, String user) throws InterruptedException {
        HamburguerMenu hbgMenu = new HamburguerMenu();
        hbgMenu.sair();
        if (ec.length() > 0) {
            Assert.assertEquals(ec, loginPage.getECSalvo());
        }
        Assert.assertEquals(user, loginPage.getUserSalvo());

    }


    @Quando("eu realizar Login informando o Ec ou CPF ou Email (.*), o usuário, opcional, (.*) e a senha (.*)")
    public void euRealizarLoginInformandoOEcOuCPFOuEmailEcCpfEmailOUsuárioOpcionalUsuarioEASenhaSenha(String ecEmailCpf, String user, String senha) {
        preenchoOCampoDeLoginComOEC(ecEmailCpf);
        euSelecionarOBotãoProximo();
        preencherOCampoUsuárioCom(user);
        oCampoSenhaCom(senha);
    }

    @Quando("eu estiver logado com o EC {string}, usuário {string} e senha {string}")
    public void euEstiverLogadoComOECUsuárioESenha(String ec, String user, String pass) {
        baseSteps.euEstiverNaTelaDeLogin();
        preenchoOCampoDeLoginComOEC(ec);
        euSelecionarOBotãoProximo();
        preencherOCampoUsuárioCom(user);
        oCampoSenhaCom(pass);
        aoPressionarOBotãoEntrarATelaHomeDeveSerExibida();
    }
}
