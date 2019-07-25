package io.cucumber.skeleton.pages.Android;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.Support.CpfGenerator;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.pages.Android.BaseAndroidPage.appiumController;

public class AndroidLoginPage {

    private Faker faker = new Faker(new Locale("pt-BR"));
    private String email = faker.internet().emailAddress();
    private String cpf = CpfGenerator.generateCPF(true);

    public void fillEmail() {
        BaseAndroidPage.fillFirstLoginField(email);
    }


    public String getErrorMsgTxt(){
        MobileElement errorMsg = (MobileElement) appiumController.driver.findElementById("custom_dialog_message");
        return errorMsg.getText();
    }

    public void fillCpf() {
        System.out.println(cpf);
        BaseAndroidPage.fillFirstLoginField(cpf);
    }

    //valida caso o serviço de Login esteja fora do Ar
    public boolean loginError() {
        appiumController.driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        if(!appiumController.driver.findElementsById("custom_dialog_message").isEmpty()){
            MobileElement errorMsg = (MobileElement) appiumController.driver.findElementById("custom_dialog_message");
            String errorMsgTxt = errorMsg.getText();
            return errorMsgTxt.contains("erro");
        }else{
            return false;
        }
    }

    public void checkSalvarDados() {
        MobileElement checkBoxSaveUserData = (MobileElement) appiumController.driver.findElementById("checkBoxSaveUserData");
        checkBoxSaveUserData.click();
    }
}
