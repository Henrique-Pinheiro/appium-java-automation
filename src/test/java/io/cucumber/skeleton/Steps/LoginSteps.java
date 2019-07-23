package io.cucumber.skeleton.Steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.skeleton.pages.Android.AndroidHomePage;
import io.cucumber.skeleton.pages.Android.AndroidLoginPage;
import io.cucumber.skeleton.pages.Android.BaseAndroidPage;
import org.junit.Assert;

public class LoginSteps {

    private BaseAndroidPage baseAndroidPage = new BaseAndroidPage();
    private AndroidLoginPage androidLogin = new AndroidLoginPage();
    private AndroidHomePage androidHomePage = new AndroidHomePage();

    @E("preencho o campo de Login com o EC {string}")
    public void preenchoOCampoDeLoginComOEC(String ec) {
        baseAndroidPage.fillFirstLogin(ec);
    }

    @Quando("eu selecionar o botão Proximo")
    public void euSelecionarOBotãoProximo() {
        baseAndroidPage.clickBtnPoximo();
    }

    @E("preencher os campos usuário com {string} e senha com {string}")
    public void preencherOsCamposUsuárioComESenhaCom(String user, String password) {
        baseAndroidPage.fillUserAndPass(user, password);
    }

    @Então("ao pressionar o botão Entrar a tela Home deve ser exibida")
    public void aoPressionarOBotãoEntrarATelaHomeDeveSerExibida() {
        Assert.assertTrue("A tela home não foi exibida", androidHomePage.checkHomePage());
    }
}
