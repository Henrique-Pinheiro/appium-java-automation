package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.support.StringUtils;
import io.cucumber.skeleton.support.Swipper;
import org.openqa.selenium.WebDriverException;

import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.support.AppiumController.driver;

public class HamburguerMenu {

    private Swipper swipper = new Swipper();
    private static String currentEc = "";



    public void sair() throws InterruptedException {
        openHbgMenu();
        MobileElement hbgMenu = (MobileElement) driver.findElementById("layout_menu_logado");
        swipper.verticalSwipe(hbgMenu);
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        MobileElement btnSair = (MobileElement) driver.findElementById("textview_menu_sair");
        btnSair.click();
    }

    public static void openHbgMenu() {
        MobileElement hbgMenuBtn = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
        hbgMenuBtn.click();
    }

    public static void setCurrentEc() {
        MobileElement hbgMenuEc = (MobileElement) driver.findElementById("textview_menu_logado_ec");
        currentEc =  StringUtils.getDigits(hbgMenuEc.getText());
//        currentEc = hbgMenuEc.getText();
    }

    public static String getCurrentEc(){
        return currentEc;
    }
}
