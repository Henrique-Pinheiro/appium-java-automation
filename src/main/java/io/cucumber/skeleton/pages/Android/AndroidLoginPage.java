package io.cucumber.skeleton.pages.Android;
import io.cucumber.skeleton.Support.CpfGenerator;
import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;

import java.util.Locale;

public class AndroidLoginPage {

    private Faker faker = new Faker(new Locale("pt-BR"));
    private String email = faker.internet().emailAddress();
    private String cpf = CpfGenerator.generateCPF(true);

    public void fillEmail() {
        BaseAndroidPage.fillFirstLoginField(email);
    }


    public String getErrorMsgTxt(){
        MobileElement errorMsg = (MobileElement) BaseAndroidPage.appiumController.driver.findElementById("custom_dialog_message");
        return errorMsg.getText();
    }

    public void fillCpf() {
        System.out.println(cpf);
        BaseAndroidPage.fillFirstLoginField(cpf);
    }
}
