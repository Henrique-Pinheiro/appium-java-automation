package io.cucumber.skeleton.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.support.CpfGenerator;
import org.openqa.selenium.WebDriverException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import static io.cucumber.skeleton.pages.BasePage.appiumController;

public class LoginPage {

    private Faker faker = new Faker(new Locale("pt-BR"));
    private String email = faker.internet().emailAddress();
    private String cpf = CpfGenerator.generateCPF(true);
    private HomePage homePage = new HomePage();

    public void fillEmail() {
        BasePage.fillFirstLoginField(email);
    }


    public String getErrorMsgTxt() {
        MobileElement errorMsg = (MobileElement) appiumController.driver.findElementById("custom_dialog_message");
        return errorMsg.getText();
    }

    public void fillCpf() {
        BasePage.fillFirstLoginField(cpf);
    }

    //valida caso o serviço de Login esteja fora do Ar
    public boolean loginError() {
        appiumController.driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        boolean result;
        try {
            appiumController.driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            MobileElement chatBtn = (MobileElement) appiumController.driver.findElementById("icon_chat");
            result = !(chatBtn.isDisplayed());
        } catch (WebDriverException e) {
            result = false;
            MobileElement errorMsg = (MobileElement) appiumController.driver.findElementById("custom_dialog_message");
            errorMsg.isDisplayed();
            String errorMsgTxt = errorMsg.getText();
            result = errorMsgTxt.contains("erro");
        }
        return result;
    }

    public void checkSalvarDados() {
        MobileElement checkBoxSaveUserData = (MobileElement) appiumController.driver.findElementById("checkBoxSaveUserData");
        checkBoxSaveUserData.click();
    }

    public String getECSalvo() {
        MobileElement ecField = (MobileElement) appiumController.driver.findElementById("textInputEditNewLogin");
        return ecField.getText().replace(".", "").replace("-", "");
    }

    public String getUserSalvo() {
        MobileElement userField = (MobileElement) appiumController.driver.findElementById("textInputEditLoginUsername");
        return userField.getText();

    }

    public void touchAutoCadastro() {
        MobileElement btnAutoCadastro = (MobileElement) appiumController.driver.findElementById("headerButtonViewCreateUser");
        btnAutoCadastro.click();
    }
}
