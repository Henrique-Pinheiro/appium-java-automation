package io.cucumber.skeleton.Support;

import cucumber.api.java.Before;
import org.junit.After;

import java.net.MalformedURLException;

public class AppiumStarter {

    //=========================ESPECIFICAR AQUI O NOME DO DEVICE QUE DEVE SER TESTADO==========================================================//
    protected static String deviceName = "emulator";

    public static String getDeviceName() {
        return deviceName;
    }

    public static AppiumController appiumController;

    public AppiumStarter(){
        appiumController = new AppiumController(deviceName);
    }

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
}
