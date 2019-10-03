package io.cucumber.skeleton.pages;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import static io.cucumber.skeleton.support.AppiumController.driver;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.skeleton.support.AppiumController;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class BasePage {

    //=========================ESPECIFICAR AQUI O NOME DO DEVICE QUE DEVE SER TESTADO==========================================================//

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "textInputEditNewLogin")
    @iOSFindBy(id = "")
    private MobileElement firstTxtField;

    @AndroidFindBy(id = "btnJump")
    @iOSFindBy(id = "")
    private MobileElement btnJump;

    @AndroidFindBy(id = "textLoginLabel")
    @iOSFindBy(id = "")
    private MobileElement txtLoginLabel;

    @AndroidFindBy(id = "buttonLoginNext")
    @iOSFindBy(id = "")
    private MobileElement btnProximo;

    @AndroidFindBy(id = "buttonNewLoginUserEnter")
    @iOSFindBy(id = "")
    private MobileElement btnLogin;

    @AndroidFindBy(id = "textInputEditLoginUsername")
    @iOSFindBy(id = "")
    private MobileElement userField;

    @AndroidFindBy(id = "textInputEditLoginPassword")
    @iOSFindBy(id = "")
    private MobileElement passField;



    public boolean checkLoginPage() {
        driver.hideKeyboard();

        if (btnJump.isDisplayed()) {
            btnJump.click();
        }

        return txtLoginLabel.isDisplayed();
    }

    public boolean checkLoginPageAgain() {
        driver.hideKeyboard();

        return txtLoginLabel.isDisplayed();

    }

    public void fillFirstLoginField(String emailEcOrCpf) {

        firstTxtField.setValue(emailEcOrCpf);
        driver.hideKeyboard();
    }

    public void clickBtnPoximo() {
        driver.hideKeyboard();

        btnProximo.click();
    }

    public void clickBtnLogin() {
        driver.hideKeyboard();

        btnLogin.click();
    }

    public void fillUser(String user) {
        if (!(user.isEmpty())) {

            userField.setValue(user);
            driver.hideKeyboard();
        }
    }

    public void fillPass(String password) {

        passField.setValue(password);
        driver.hideKeyboard();
    }


}
