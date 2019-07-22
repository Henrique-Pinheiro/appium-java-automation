package io.cucumber.skeleton.Steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.skeleton.Devices;
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

    @Dado("que eu estou na tela do {string}")
    public void queEuEstouNaTelaDo(String texto) {
        switch (deviceOs){
            case "android":
                Assert.assertEquals(texto, baseAndroidPage.returnLabelText());
                break;
            case "ios":
                Assert.assertEquals(texto, baseIosPage.returnLabelText());
                break;
        }
    }

    @Quando("eu clicar no botão")
    public void euClicarNoBotão() {
        switch (deviceOs){
            case "android":
                baseAndroidPage.clickButton();
                break;
            case "ios":
                baseIosPage.clickButton();
                break;
        }
    }

    @Então("nada deve acontecer")
    public void nadaDeveAcontecer() {
        queEuEstouNaTelaDo("Hello World!");
    }

}
