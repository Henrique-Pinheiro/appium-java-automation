package io.cucumber.skeleton.pages.Android;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.AppiumController;

import java.net.MalformedURLException;

public class BaseAndroidPage {

    //=========================ESPECIFICAR AQUI O NOME DO DEVICE QUE DEVE SER TESTADO==========================================================//
    protected static String deviceName = "samsung s8";

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

//    MobileElement appLbl = (MobileElement) appiumController.driver.findElementById("batata");
//    String lblText = appLbl.getText();
//        return lblText;

    public boolean checkLoginPage() {
        MobileElement btnJump = (MobileElement) appiumController.driver.findElementById("btnJump");
        if(btnJump.isDisplayed()){
            btnJump.click();
        }
        MobileElement txtLoginLabel = (MobileElement) appiumController.driver.findElementById("textLoginLabel");
        return txtLoginLabel.isDisplayed();
    }

    public void fillFirstLogin(String emailEcOrCpf){
        MobileElement firstTxtField = (MobileElement) appiumController.driver.findElementById("textInputEditNewLogin");
        firstTxtField.setValue(emailEcOrCpf);
    }

    public void clickBtnPoximo(){
        MobileElement btnProximo = (MobileElement) appiumController.driver.findElementById("buttonLoginNext");
        btnProximo.click();
    }

    public void fillUserAndPass(String user, String password){
        MobileElement userField = (MobileElement) appiumController.driver.findElementById("textInputEditLoginUsername");
        MobileElement passField = (MobileElement) appiumController.driver.findElementById("textInputEditLoginPassword");
        userField.setValue(user);
        passField.setValue(password);
    }




}
