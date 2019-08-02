package io.cucumber.skeleton.Steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import io.cucumber.skeleton.Support.Devices;
import io.cucumber.skeleton.pages.Android.BaseAndroidPage;
import io.cucumber.skeleton.pages.iOS.BaseIosPage;
import org.junit.Assert;

public class BaseStepdefs {

    public String deviceName;
    public String deviceOs;
    public Devices devices = new Devices();
//    public Object basePage;

    @Dado("que eu estou usando o aparelho {string}")
    public void queEuEstouUsandoOAparelho(String device) {
        deviceName = device;
        deviceOs = devices.returnDeviceOs(device.toLowerCase());
    }

    public BaseIosPage baseIosPage = new BaseIosPage();
    public BaseAndroidPage baseAndroidPage = new BaseAndroidPage();


    @Dado("que eu estou na tela de Login")
    public void queEuEstouNaTelaDeLogin() {
        Assert.assertTrue("A pagina de login não está sendo exibida", baseAndroidPage.checkLoginPage());
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
