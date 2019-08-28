package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.cucumber.skeleton.support.StringUtils;
import io.cucumber.skeleton.support.Swipper;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.support.AppiumController.driver;

public class HamburguerMenu {

    private Swipper swipper = new Swipper();
    private static String currentEc = "";

    public HamburguerMenu() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(id = "layout_menu_logado")
    @iOSFindBy(id = "")
    private MobileElement hbgMenu;

    @AndroidFindBy(id = "textview_menu_sair")
    @iOSFindBy(id = "")
    private MobileElement btnSair;

    @AndroidFindBy(accessibility = "Open navigation drawer")
    @iOSFindBy(id = "")
    private MobileElement hbgMenuBtn;

    @AndroidFindBy(id = "textview_menu_logado_ec")
    @iOSFindBy(id = "")
    private MobileElement hbgMenuEc;

    @AndroidFindBy(id = "textview_menu_cadastro")
    @iOSFindBy(id = "")
    private MobileElement hbgMenuMeuCadastro;

    public void sair() throws InterruptedException {
        openHbgMenu();
//        MobileElement hbgMenu = (MobileElement) driver.findElementById("layout_menu_logado");
        swipper.verticalSwipe(hbgMenu);
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//        MobileElement btnSair = (MobileElement) driver.findElementById("textview_menu_sair");
        btnSair.click();
    }

    public void openHbgMenu() {
//        MobileElement hbgMenuBtn = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
        hbgMenuBtn.click();
    }

    public void openMeuCadastro(){
        openHbgMenu();
        hbgMenuMeuCadastro.click();
    }

    public void setCurrentEc() {
//        MobileElement hbgMenuEc = (MobileElement) driver.findElementById("textview_menu_logado_ec");
        currentEc = StringUtils.getDigits(hbgMenuEc.getText());
//        currentEc = hbgMenuEc.getText();
    }

    public static String getCurrentEc() {
        return currentEc;
    }
}
