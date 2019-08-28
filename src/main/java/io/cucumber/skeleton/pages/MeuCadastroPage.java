package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.cucumber.skeleton.support.Swipper;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.support.AppiumController.driver;

public class MeuCadastroPage {


    public MeuCadastroPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private Swipper swipper = new Swipper();

    @AndroidFindBy(id = "textToolbarMainLoggedTitle")
    @iOSFindBy(id = "")
    private MobileElement meuCadastroTitle;

    @AndroidFindBy(id = "textToolbarMainLoggedTitle")
    @iOSFindBy(id = "")
    private MobileElement scroll;

    @AndroidFindBy(id = "btn_change_pass")
    @iOSFindBy(id = "")
    private MobileElement btnAlterarSenha;

    @AndroidFindBy(id = "textInputPasswordActual")
    @iOSFindBy(id = "")
    private MobileElement txtOldPassword;

    @AndroidFindBy(id = "textInputNewPassword")
    @iOSFindBy(id = "")
    private MobileElement txtNewPassword1;

    @AndroidFindBy(id = "textInputNewPasswordConfirm")
    @iOSFindBy(id = "")
    private MobileElement txtNewPassword2;

    @AndroidFindBy(id = "btn_change_pass")
    @iOSFindBy(id = "")
    private MobileElement btnSalvar;

    @AndroidFindBy(id = "custom_dialog_message")
    @iOSFindBy(id = "")
    private MobileElement popUpMsg;


    public boolean checkMeuCadastro() {
        return meuCadastroTitle.isDisplayed();
    }

    public boolean btnAlterarSenhaIsDisplayed() throws InterruptedException {
        swipper.verticalSwipe(scroll);
        swipper.verticalSwipe(scroll);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            return btnAlterarSenha.isDisplayed();
        } catch (WebDriverException e) {
            return false;
        }
    }

    public void clickBtnAlterarSenha() throws InterruptedException {
        btnAlterarSenhaIsDisplayed();
        btnAlterarSenha.click();
        swipper.verticalSwipe(scroll);
    }

    public void fillPasswords(String actualPass, String newPass) {
        txtOldPassword.setValue(actualPass);
        txtNewPassword1.setValue(newPass);
        txtNewPassword2.setValue(newPass);
    }

    public void clickBtnSalvar() throws InterruptedException {
        swipper.verticalSwipe(scroll);
        btnSalvar.click();
    }


    public String getPopUpMsgText() {
        return popUpMsg.getText();
    }
}
