package io.cucumber.skeleton.pages.Android;

import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.skeleton.AppiumController;
import org.junit.After;

import java.net.MalformedURLException;

public class BaseAndroidPage {

    private static AppiumController appiumController = new AppiumController("android");

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
