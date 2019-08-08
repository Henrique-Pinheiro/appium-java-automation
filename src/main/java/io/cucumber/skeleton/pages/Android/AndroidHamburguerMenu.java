package io.cucumber.skeleton.pages.Android;

import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.Support.Swipper;

import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.pages.Android.BaseAndroidPage.appiumController;

public class AndroidHamburguerMenu {

    private Swipper swipper = new Swipper();
    MobileElement hbgMenuBtn = (MobileElement) appiumController.driver.findElementByAccessibilityId("Open navigation drawer");

    public void sair() throws InterruptedException {
        hbgMenuBtn.click();
        MobileElement hbgMenu = (MobileElement) appiumController.driver.findElementById("layout_menu_logado");
        swipper.verticalSwipe(hbgMenu);
        appiumController.driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        MobileElement btnSair = (MobileElement) appiumController.driver.findElementById("textview_menu_sair");
        btnSair.click();


    }
}
