package io.cucumber.skeleton.Steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.skeleton.pages.Android.BaseAndroidPage;
import io.cucumber.skeleton.pages.iOS.BaseIosPage;
import org.junit.Assert;

public class BaseStepdefs {

    public BaseIosPage iosPage = new BaseIosPage();
    public BaseAndroidPage androidPage = new BaseAndroidPage();

    @Dado("que eu estou na tela do {string}")
    public void queEuEstouNaTelaDo(String texto) {
        Assert.assertEquals(texto, androidPage.returnLabelText());
    }

    @Quando("eu clicar no botão")
    public void euClicarNoBotão() {
        androidPage.clickButton();
    }

    @Então("nada deve acontecer")
    public void nadaDeveAcontecer() {
        queEuEstouNaTelaDo("Hello World!");
    }
}
