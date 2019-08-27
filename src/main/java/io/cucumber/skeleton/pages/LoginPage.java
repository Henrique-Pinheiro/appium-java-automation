package io.cucumber.skeleton.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.cucumber.skeleton.support.CpfGenerator;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import static io.cucumber.skeleton.support.AppiumController.driver;


public class LoginPage {

    private Faker faker = new Faker(new Locale("pt-BR"));
    private String email = faker.internet().emailAddress();
    private String cpf = CpfGenerator.generateCPF(true);
    private HomePage homePage = new HomePage();
    private BasePage basePage = new BasePage();

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "custom_dialog_message")
    @iOSFindBy(id = "")
    private MobileElement errorMsg;

    @AndroidFindBy(id = "icon_chat")
    @iOSFindBy(id = "")
    private MobileElement chatBtn;

    @AndroidFindBy(id = "checkBoxSaveUserData")
    @iOSFindBy(id = "")
    private MobileElement checkBoxSaveUserData;

    @AndroidFindBy(id = "textInputEditNewLogin")
    @iOSFindBy(id = "")
    private MobileElement ecField;

    @AndroidFindBy(id = "textInputEditLoginUsername")
    @iOSFindBy(id = "")
    private MobileElement userField;

    @AndroidFindBy(id = "headerButtonViewCreateUser")
    @iOSFindBy(id = "")
    private MobileElement btnAutoCadastro;

    public void fillEmail() {
        basePage.fillFirstLoginField(email);
    }


    public String getErrorMsgTxt() {
//        MobileElement errorMsg = (MobileElement) driver.findElementById("custom_dialog_message");
        return errorMsg.getText();
    }

    public void fillCpf() {
        basePage.fillFirstLoginField(cpf);
    }

    //valida caso o serviço de Login esteja fora do Ar - Muito devagar precisa ser refatorada
    public boolean loginError() {
        boolean result;
        try {
//            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//            MobileElement chatBtn = (MobileElement) driver.findElementById("icon_chat");
            result = !(chatBtn.isDisplayed());
        } catch (WebDriverException e) {
            result = false;
//            MobileElement errorMsg = (MobileElement) driver.findElementById("custom_dialog_message");
            errorMsg.isDisplayed();
            String errorMsgTxt = errorMsg.getText();
            result = errorMsgTxt.contains("erro");
        }
        return result;
    }

    public void checkSalvarDados() {
//        MobileElement checkBoxSaveUserData = (MobileElement) driver.findElementById("checkBoxSaveUserData");
        checkBoxSaveUserData.click();
    }

    public String getECSalvo() {
//        MobileElement ecField = (MobileElement) driver.findElementById("textInputEditNewLogin");
        return ecField.getText().replace(".", "").replace("-", "");
    }

    public String getUserSalvo() {
//        MobileElement userField = (MobileElement) driver.findElementById("textInputEditLoginUsername");
        return userField.getText();

    }

    public void touchAutoCadastro() {
//        MobileElement btnAutoCadastro = (MobileElement) driver.findElementById("headerButtonViewCreateUser");
        btnAutoCadastro.click();
    }
}
