package io.cucumber.skeleton.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.support.CpfGenerator;
import org.openqa.selenium.WebDriverException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import static io.cucumber.skeleton.support.AppiumController.driver;
public class LoginPage {

    private Faker faker = new Faker(new Locale("pt-BR"));
    private String email = faker.internet().emailAddress();
    private String cpf = CpfGenerator.generateCPF(true);
    private HomePage homePage = new HomePage();
    private BasePage basePage = new BasePage();

    public void fillEmail() {
        basePage.fillFirstLoginField(email);
    }


    public String getErrorMsgTxt() {
        MobileElement errorMsg = (MobileElement) driver.findElementById("custom_dialog_message");
        return errorMsg.getText();
    }

    public void fillCpf() {
        basePage.fillFirstLoginField(cpf);
    }

    //valida caso o serviço de Login esteja fora do Ar
    public boolean loginError() {
        boolean result;
        try {
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            MobileElement chatBtn = (MobileElement) driver.findElementById("icon_chat");
            result = !(chatBtn.isDisplayed());
        } catch (WebDriverException e) {
            result = false;
            MobileElement errorMsg = (MobileElement) driver.findElementById("custom_dialog_message");
            errorMsg.isDisplayed();
            String errorMsgTxt = errorMsg.getText();
            result = errorMsgTxt.contains("erro");
        }
        return result;
    }

    public void checkSalvarDados() {
        MobileElement checkBoxSaveUserData = (MobileElement) driver.findElementById("checkBoxSaveUserData");
        checkBoxSaveUserData.click();
    }

    public String getECSalvo() {
        MobileElement ecField = (MobileElement) driver.findElementById("textInputEditNewLogin");
        return ecField.getText().replace(".", "").replace("-", "");
    }

    public String getUserSalvo() {
        MobileElement userField = (MobileElement) driver.findElementById("textInputEditLoginUsername");
        return userField.getText();

    }

    public void touchAutoCadastro() {
        MobileElement btnAutoCadastro = (MobileElement) driver.findElementById("headerButtonViewCreateUser");
        btnAutoCadastro.click();
    }
}
