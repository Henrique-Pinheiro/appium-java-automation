package io.cucumber.skeleton.pages.Android;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.Support.CpfGenerator;
import org.openqa.selenium.WebDriverException;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.Support.AppiumStarter.appiumController;

public class AndroidLoginPage {

    private Faker faker = new Faker(new Locale("pt-BR"));
    private String email = faker.internet().emailAddress();
    private String cpf = CpfGenerator.generateCPF(true);
    private AndroidHomePage homePage = new AndroidHomePage();

    public void fillEmail() {
        BaseAndroidPage.fillFirstLoginField(email);
    }


    public String getErrorMsgTxt(){
        MobileElement errorMsg = (MobileElement) appiumController.driver.findElementById("custom_dialog_message");
        return errorMsg.getText();
    }

    public void fillCpf() {
        BaseAndroidPage.fillFirstLoginField(cpf);
    }

    //valida caso o serviço de Login esteja fora do Ar
    public boolean loginError() {
        appiumController.driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        boolean result;
        try {
            appiumController.driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            MobileElement chatBtn = (MobileElement) appiumController.driver.findElementById("icon_chat");
            result =  !(chatBtn.isDisplayed());
        }
        catch (WebDriverException e) {
            MobileElement errorMsg = (MobileElement) appiumController.driver.findElementById("custom_dialog_message");
            errorMsg.isDisplayed();
            String errorMsgTxt = errorMsg.getText();
            result = errorMsgTxt.contains("erro");
        }
//        test = ;
//        System.out.println(test);
//        if(!test){
//            MobileElement errorMsg = (MobileElement) appiumController.driver.findElementById("custom_dialog_message");
//            String errorMsgTxt = errorMsg.getText();
//            return errorMsgTxt.contains("erro");
//        }else{
//            return false;
//        }
        return result;
    }

    public void checkSalvarDados() {
        MobileElement checkBoxSaveUserData = (MobileElement) appiumController.driver.findElementById("checkBoxSaveUserData");
        checkBoxSaveUserData.click();
    }

    public String getECSalvo() {
        MobileElement ecField = (MobileElement) appiumController.driver.findElementById("textInputEditNewLogin");
        return ecField.getText();
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
