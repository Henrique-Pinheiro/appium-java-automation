package io.cucumber.skeleton.pages.Android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import static io.cucumber.skeleton.pages.Android.BaseAndroidPage.appiumController;

public class AndroidHamburguerMenu {

    MobileElement hbgMenuBtn = (MobileElement) appiumController.driver.findElementByAccessibilityId("Open navigation drawer");
    TouchAction touchAction;

    public void sair() {
        hbgMenuBtn.click();
        MobileElement hbgMenu = (MobileElement) appiumController.driver.findElementById("nav_view");
        hbgMenu.sendKeys("e2adbe");
        //310 1285 e 310 952
        //MobileElement btnSair = (MobileElement) appiumController.driver.findElementsByAccessibilityId("textview_menu_sair");
        //btnSair.click();

    }
}
