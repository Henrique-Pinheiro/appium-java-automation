package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.support.Swipper;

import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.pages.BasePage.appiumController;

public class HamburguerMenu {

    private Swipper swipper = new Swipper();
    MobileElement hbgMenuBtn = (MobileElement) appiumController.driver.findElementByAccessibilityId("Open navigation drawer");

    public void sair() throws InterruptedException {
        openHbgMenu();
        MobileElement hbgMenu = (MobileElement) appiumController.driver.findElementById("layout_menu_logado");
        swipper.verticalSwipe(hbgMenu);
        appiumController.driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        MobileElement btnSair = (MobileElement) appiumController.driver.findElementById("textview_menu_sair");
        btnSair.click();
    }

    public void openHbgMenu(){
        hbgMenuBtn.click();
    }
}
