package io.cucumber.skeleton.pages.Android;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.AppiumController;

import java.net.MalformedURLException;

public class BaseAndroidPage {

//=========================ESPECIFICAR AQUI O NOME DO DEVICE QUE DEVE SER TESTADO==========================================================//
    protected static String deviceName = "emulator";
    public static String getDeviceName() {
        return deviceName;
    }
    private static AppiumController appiumController = new AppiumController(deviceName);

//============Remover as Tags por enquanto dependendo de quem for rodar===========================//
    //@Before
    public void beforeScenarioStart() {
        try {
            appiumController.startDriver();
        } catch (MalformedURLException e) {
            System.out.println("Deu ruim no Appium");
            e.printStackTrace();
        }
    }

//============Remover as Tags por enquanto dependendo de quem for rodar===========================//
//   @After
    public void afterScenarioFinish(){
        appiumController.stopDriver();
    }

    public String returnLabelText(){
        MobileElement appLbl = (MobileElement) appiumController.driver.findElementById("batata");
        String lblText = appLbl.getText();
        return lblText;
    }

    public void clickButton(){
        MobileElement btn = (MobileElement) appiumController.driver.findElementById("testButton");
        btn.click();
    }
}
