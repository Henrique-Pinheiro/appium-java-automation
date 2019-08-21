package io.cucumber.skeleton.pages;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.support.AppiumController;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class BasePage {

    //=========================ESPECIFICAR AQUI O NOME DO DEVICE QUE DEVE SER TESTADO==========================================================//
    protected static String deviceName = "samsung s8";

    public static String getDeviceName() {
        return deviceName;
    }

    public static AppiumController appiumController = new AppiumController(deviceName);

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
    public void afterScenarioFinish(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            File file = appiumController.driver.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("/Users/t1409hnr/Desktop/System-Testing/cucumber-java-skeleton/target/prints/"+ java.time.LocalDate.now() + "-run/" + scenario.getName() + ".png"));
        }
        appiumController.stopDriver();
    }


    public static boolean checkLoginPage() {
//        appiumController.driver.hideKeyboard();
        MobileElement btnJump = (MobileElement) appiumController.driver.findElementById("btnJump");
        if (btnJump.isDisplayed()) {
            btnJump.click();
        }
        MobileElement txtLoginLabel = (MobileElement) appiumController.driver.findElementById("textLoginLabel");
        return txtLoginLabel.isDisplayed();
    }

    public static boolean checkLoginPageAgain() {
        MobileElement txtLoginLabel = (MobileElement) appiumController.driver.findElementById("textLoginLabel");
        return txtLoginLabel.isDisplayed();

    }

    public static void fillFirstLoginField(String emailEcOrCpf) {
        MobileElement firstTxtField = (MobileElement) appiumController.driver.findElementById("textInputEditNewLogin");
        firstTxtField.setValue(emailEcOrCpf);
//        appiumController.driver.hideKeyboard();
    }

    public static void clickBtnPoximo() {
//        appiumController.driver.hideKeyboard();
        MobileElement btnProximo = (MobileElement) appiumController.driver.findElementById("buttonLoginNext");
        btnProximo.click();
    }

    public void clickBtnLogin() {
//        appiumController.driver.hideKeyboard();
        MobileElement btnLogin = (MobileElement) appiumController.driver.findElementById("buttonNewLoginUserEnter");
        btnLogin.click();
    }

    public static void fillUser(String user) {
        if (!(user.isEmpty())) {
//            appiumController.driver.hideKeyboard();
            MobileElement userField = (MobileElement) appiumController.driver.findElementById("textInputEditLoginUsername");
            userField.setValue(user);
        }
    }

    public static void fillPass(String password) {
//        appiumController.driver.hideKeyboard();
        MobileElement passField = (MobileElement) appiumController.driver.findElementById("textInputEditLoginPassword");
        passField.setValue(password);
    }


}