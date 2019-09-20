package io.cucumber.skeleton.steps;
import cucumber.api.java.bs.A;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import io.cucumber.skeleton.support.AppiumStart;
import io.cucumber.skeleton.support.Devices;
import io.cucumber.skeleton.pages.BasePage;
import org.junit.Assert;

public class BaseStepdefs {

    private String deviceOs;
    private Devices devices = new Devices();
    private BasePage basePage;

    @Dado("que eu estou usando o aparelho {string}")
    public void queEuEstouUsandoOAparelho(String device) {
        AppiumStart appiumStart = new AppiumStart(device);
        deviceOs = devices.returnDeviceOs(device.toLowerCase());
        appiumStart.beforeScenarioStart();
        basePage = new BasePage();
    }

    @Dado("que eu estou na tela de Login")
    public void queEuEstouNaTelaDeLogin() {
        basePage = new BasePage();
        Assert.assertTrue("A pagina de login não está sendo exibida", basePage.checkLoginPage());
    }

    @Quando("eu estiver na tela de Login")
    public void euEstiverNaTelaDeLogin() {
        queEuEstouNaTelaDeLogin();
    }

    @Quando("esse step vai falhar")
    public void esseStepVaiFalhar() {
        Assert.assertEquals("batata", "mandioca");
    }

}
