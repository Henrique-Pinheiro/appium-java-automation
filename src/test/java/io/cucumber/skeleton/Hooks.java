package io.cucumber.skeleton;

import cucumber.api.java.Before;
import org.junit.After;
import java.net.MalformedURLException;

public class Hooks {

    private static AppiumController appiumController = new AppiumController();

    @Before
    public void beforeScenarioStart() {
        try {
            appiumController.startDriver();
        } catch (MalformedURLException e) {
            System.out.println("Deu ruim no Appium");
            e.printStackTrace();
        }
    }

    @After
    public void afterScenarioFinish(){
        appiumController.stopDriver();
    }
}
