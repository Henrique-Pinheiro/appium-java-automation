package io.cucumber.skeleton.pages.Android;


import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.Support.CpfGenerator;
import io.cucumber.skeleton.Support.Swipper;

import java.util.Locale;

import static io.cucumber.skeleton.Support.StringUtils.unaccent;
import static io.cucumber.skeleton.pages.Android.BaseAndroidPage.appiumController;

public class AndroidAutoCadastroPage {

    private Faker faker = new Faker(new Locale("pt-BR"));
    private Swipper swipper = new Swipper();
    private String tipoCadastro;
    private String ec;

    public void setTipoCadastro(String tipoCadastro) {
        this.tipoCadastro = tipoCadastro.toLowerCase();
    }

    public String getTipoCadastro() {
        return tipoCadastro;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public String getEc() {
        return ec;
    }

    public String getPageTitle() {
        MobileElement labelAutoCadastro = (MobileElement) appiumController.driver.findElementById("textToolbarMainTitle");
        appiumController.driver.hideKeyboard();
        return labelAutoCadastro.getText();
    }

    public void preencherDadosCadastrais() {
        MobileElement txtNomeCompleto = (MobileElement) appiumController.driver.findElementById("edit_text_full_name");
        MobileElement txtEmail = (MobileElement) appiumController.driver.findElementById("edit_text_email");
        MobileElement txtEmail2 = (MobileElement) appiumController.driver.findElementById("edit_text_email_confirm");
        MobileElement txtCpf = (MobileElement) appiumController.driver.findElementById("edit_text_cpf");
        MobileElement txtSenha = (MobileElement) appiumController.driver.findElementById("edit_text_password");
        MobileElement txtSenha2 = (MobileElement) appiumController.driver.findElementById("edit_text_password_confirm");
        String nomeCompleto = faker.name().firstName() + " " + faker.name().lastName();
        nomeCompleto = unaccent(nomeCompleto);
        String email = (nomeCompleto.substring(0, nomeCompleto.indexOf(" ")) + "@cielo.com").toLowerCase();
        String cpf = CpfGenerator.generateCPF(true);
        String senha = tipoCadastro.contains("não") ? "s@" + ec : "123456";
        txtNomeCompleto.setValue(nomeCompleto);
        txtEmail.setValue(email);
        txtEmail2.setValue(email);
        txtCpf.setValue(cpf);
        txtSenha.setValue(senha);
        txtSenha2.setValue(senha);
    }

    public void preencherDadosBancarios(String tipoPessoa, String banco, String tipoConta, String agencia, String nConta, String digitoConta) throws InterruptedException {
        swipper.verticalSwipe("layout_scroll_view");
        MobileElement txtEc = (MobileElement) appiumController.driver.findElementById("edit_text_stablishment");
        MobileElement btnBancaria = (MobileElement) appiumController.driver.findElementById("button_dados_bancario");
        MobileElement btnFisica = (MobileElement) appiumController.driver.findElementById("button_account_fisica");
        MobileElement btnJuridica = (MobileElement) appiumController.driver.findElementById("button_account_juridica");
        txtEc.setValue(ec);
        btnBancaria.click();
        if (tipoPessoa.toLowerCase().equals("pf")) {
            btnFisica.click();
        } else {
            btnJuridica.click();
        }
        swipper.verticalSwipe("layout_scroll_view");
        MobileElement spinnerBanco = (MobileElement) appiumController.driver.findElementById("spinner_esqueci_senha_banco");
        MobileElement spinnerTipoConta = (MobileElement) appiumController.driver.findElementById("spinner_esqueci_minha_conta");
        spinnerBanco.click();
        MobileElement listViewBanco = (MobileElement) appiumController.driver.findElementById("select_dialog_listview");
        


    //Tem que descer
//    MobileElement txtAgencia = (MobileElement) appiumController.driver.findElementById("textToolbarMainTitle");
//    MobileElement txtConta = (MobileElement) appiumController.driver.findElementById("textToolbarMainTitle");
//    MobileElement txtNConta = (MobileElement) appiumController.driver.findElementById("textToolbarMainTitle");
//    MobileElement txtDigito = (MobileElement) appiumController.driver.findElementById("textToolbarMainTitle");
//    MobileElement checkDeAcordo = (MobileElement) appiumController.driver.findElementById("textToolbarMainTitle");
//    MobileElement btnConfirmar = (MobileElement) appiumController.driver.findElementById("textToolbarMainTitle");
}
