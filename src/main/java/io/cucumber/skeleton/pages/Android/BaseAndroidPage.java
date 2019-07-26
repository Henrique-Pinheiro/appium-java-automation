package io.cucumber.skeleton.pages.Android;

import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.AppiumController;
import org.junit.After;

import java.net.MalformedURLException;

public class BaseAndroidPage {

    //=========================ESPECIFICAR AQUI O NOME DO DEVICE QUE DEVE SER TESTADO==========================================================//
    protected static String deviceName = "emulator";

    public static String getDeviceName() {
        return deviceName;
    }

    public static AppiumController appiumController = new AppiumController(deviceName);

    //============Remover as Tags por enquanto dependendo de quem for rodar===========================//
    @Before
    public void beforeScenarioStart() {
        try {
            appiumController.startDriver();
        } catch (MalformedURLException e) {
            System.out.println("Deu ruim no Appium");
            e.printStackTrace();
        }
    }

    //============Remover as Tags por enquanto dependendo de quem for rodar===========================//
    @After
    public void afterScenarioFinish() {
        appiumController.stopDriver();
    }

    public static boolean checkLoginPage() {
        MobileElement btnJump = (MobileElement) appiumController.driver.findElementById("btnJump");
        if (btnJump.isDisplayed()) {
            btnJump.click();
        }
        MobileElement txtLoginLabel = (MobileElement) appiumController.driver.findElementById("textLoginLabel");
        return txtLoginLabel.isDisplayed();
    }

    public static void fillFirstLoginField(String emailEcOrCpf) {
        MobileElement firstTxtField = (MobileElement) appiumController.driver.findElementById("textInputEditNewLogin");
        firstTxtField.setValue(emailEcOrCpf);
    }

    public static void clickBtnPoximo() {
        MobileElement btnProximo = (MobileElement) appiumController.driver.findElementById("buttonLoginNext");
        btnProximo.click();
    }

    public void clickBtnLogin() {
        MobileElement btnLogin = (MobileElement) appiumController.driver.findElementById("buttonNewLoginUserEnter");
        btnLogin.click();
    }

    public static void fillUser(String user) {
        MobileElement userField = (MobileElement) appiumController.driver.findElementById("textInputEditLoginUsername");
        userField.setValue(user);
    }


    public static void fillPass(String password) {
        MobileElement passField = (MobileElement) appiumController.driver.findElementById("textInputEditLoginPassword");
        passField.setValue(password);
    }


}
