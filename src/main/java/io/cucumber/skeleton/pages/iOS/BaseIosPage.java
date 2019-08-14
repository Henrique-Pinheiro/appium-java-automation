package io.cucumber.skeleton.pages.iOS;

import io.cucumber.skeleton.Support.AppiumController;

import java.net.MalformedURLException;

public class BaseIosPage {

    //=========================ESPECIFICAR AQUI O NOME DO DEVICE QUE DEVE SER TESTADO==========================================================//
    protected static String deviceName = "iemulator";

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
    //@After
    public void afterScenarioFinish() {
        appiumController.stopDriver();
    }

}
