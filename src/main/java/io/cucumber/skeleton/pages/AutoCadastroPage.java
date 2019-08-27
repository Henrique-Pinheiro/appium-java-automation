package io.cucumber.skeleton.pages;


import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.cucumber.skeleton.support.AppiumController;
import io.cucumber.skeleton.support.CpfGenerator;
import io.cucumber.skeleton.support.Swipper;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;
import java.util.Random;

import static io.cucumber.skeleton.support.AppiumController.driver;
import static io.cucumber.skeleton.support.StringUtils.unaccent;
import static io.cucumber.skeleton.support.AppiumStart.deviceName;

public class AutoCadastroPage {

    private Random rand = new Random();
    private Faker faker = new Faker(new Locale("pt-BR"));
    private Swipper swipper = new Swipper();
    private String tipoCadastro = "";
    private String ec;
    private String nomeCompleto = "";
    private String email = "";
    private String cpf = "";
    private String senha = "";
    private String numEmail = "";

    @AndroidFindBy(id = "textToolbarMainTitle")
    @iOSFindBy(id = "")
    private MobileElement labelAutoCadastro;

    @AndroidFindBy(id = "edit_text_full_name")
    @iOSFindBy(id = "")
    private MobileElement txtNomeCompleto;

    @AndroidFindBy(id = "edit_text_email")
    @iOSFindBy(id = "")
    private MobileElement txtEmail;

    @AndroidFindBy(id = "edit_text_email_confirm")
    @iOSFindBy(id = "")
    private MobileElement txtEmail2;

    @AndroidFindBy(id = "edit_text_cpf")
    @iOSFindBy(id = "")
    private MobileElement txtCpf;

    @AndroidFindBy(id = "edit_text_password")
    @iOSFindBy(id = "")
    private MobileElement txtSenha;

    @AndroidFindBy(id = "edit_text_password_confirm")
    @iOSFindBy(id = "")
    private MobileElement txtSenha2;

    @AndroidFindBy(id = "layout_scroll_view")
    @iOSFindBy(id = "")
    private MobileElement scrollView;

    @AndroidFindBy(id = "edit_text_stablishment")
    @iOSFindBy(id = "")
    private MobileElement txtEc;

    @AndroidFindBy(id = "button_dados_bancario")
    @iOSFindBy(id = "")
    private MobileElement btnBancaria;

    @AndroidFindBy(id = "button_account_fisica")
    @iOSFindBy(id = "")
    private MobileElement btnFisica;

    @AndroidFindBy(id = "button_account_juridica")
    @iOSFindBy(id = "")
    private MobileElement btnJuridica;

    @AndroidFindBy(id = "spinner_esqueci_senha_banco")
    @iOSFindBy(id = "")
    private MobileElement openSpinnerBanco;

    @AndroidFindBy(id = "spinner_esqueci_minha_conta")
    @iOSFindBy(id = "")
    private MobileElement openSpinnerTipoConta;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView")
    @iOSFindBy(id = "")
    private MobileElement spinnerBancoBody;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    @iOSFindBy(id = "")
    private MobileElement btnTipoContaCc;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")
    @iOSFindBy(id = "")
    private MobileElement btnTipoContaCp;

    @AndroidFindBy(id = "edit_text_esqueci_senha_agencia")
    @iOSFindBy(id = "")
    private MobileElement txtAgencia;

    @AndroidFindBy(id = "edit_text_esqueci_senha_numero_conta")
    @iOSFindBy(id = "")
    private MobileElement txtConta;

    @AndroidFindBy(id = "edit_text_esqueci_senha_digito_conta")
    @iOSFindBy(id = "")
    private MobileElement txtDigito;

    @AndroidFindBy(id = "button_dados_digital")
    @iOSFindBy(id = "")
    private MobileElement btnPrePago;

    @AndroidFindBy(id = "edit_text_serie_number")
    @iOSFindBy(id = "")
    private MobileElement txtCardNumber;

    @AndroidFindBy(id = "checkBoxConfirmTerms")
    @iOSFindBy(id = "")
    private MobileElement checkDeAcordo;

    @AndroidFindBy(id = "buttonConfirm")
    @iOSFindBy(id = "")
    private MobileElement btnConfirmar;

    @AndroidFindBy(id = "edit_text_user")
    @iOSFindBy(id = "")
    private MobileElement txtUsuario;

    @AndroidFindBy(id = "btn_welcome_ok")
    @iOSFindBy(id = "")
    private MobileElement btnOk;

    @AndroidFindBy(id = "text_email")
    @iOSFindBy(id = "")
    private MobileElement txtEmailConfirm;

    //Muda o ID no Android
    @iOSFindBy(id = "")
    private MobileElement btnVoltar;


    public AutoCadastroPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

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
//        MobileElement labelAutoCadastro = (MobileElement) driver.findElementById("textToolbarMainTitle");
        return labelAutoCadastro.getText();
    }

    public void preencherDadosCadastrais() {
//        MobileElement txtNomeCompleto = (MobileElement) driver.findElementById("edit_text_full_name");
//        MobileElement txtEmail = (MobileElement) driver.findElementById("edit_text_email");
//        MobileElement txtEmail2 = (MobileElement) driver.findElementById("edit_text_email_confirm");
//        MobileElement txtCpf = (MobileElement) driver.findElementById("edit_text_cpf");
//        MobileElement txtSenha = (MobileElement) driver.findElementById("edit_text_password");
//        MobileElement txtSenha2 = (MobileElement) driver.findElementById("edit_text_password_confirm");
        driver.hideKeyboard();
        nomeCompleto = faker.name().firstName() + " " + faker.name().lastName();
        nomeCompleto = unaccent(nomeCompleto);
        email = (nomeCompleto.substring(0, nomeCompleto.indexOf(" ")) + rand.nextInt(20) + "@cielo.com").toLowerCase();
        cpf = CpfGenerator.generateCPF(true);
        senha = tipoCadastro.contains("não") ? "s@" + ec : "123456";
        txtNomeCompleto.setValue(nomeCompleto);
        txtEmail.setValue(email);
        txtEmail2.setValue(email);
        txtCpf.setValue(cpf);
        txtSenha.setValue(senha);
        txtSenha2.setValue(senha);
    }

    //A scroll view é o componente aonde estao esses dados, sempre que precisar descer a tela, tem que usar o swipper nela
    public void preencherDadosBancarios(String tipoPessoa, String banco, String tipoConta, String agencia, String nConta, String digitoConta) throws InterruptedException {
        swipper.verticalSwipe(scrollView);
//        MobileElement scrollView = (MobileElement) driver.findElementById("layout_scroll_view");
//        MobileElement txtEc = (MobileElement) driver.findElementById("edit_text_stablishment");
//        MobileElement btnBancaria = (MobileElement) driver.findElementById("button_dados_bancario");
//        MobileElement btnFisica = (MobileElement) driver.findElementById("button_account_fisica");
//        MobileElement btnJuridica = (MobileElement) driver.findElementById("button_account_juridica");
        txtEc.setValue(ec);
        btnBancaria.click();
        if (tipoPessoa.toLowerCase().equals("pf")) {
            btnFisica.click();
        } else {
            btnJuridica.click();
        }
        swipper.verticalSwipe(scrollView);
//        MobileElement openSpinnerBanco = (MobileElement) driver.findElementById("spinner_esqueci_senha_banco");
//        MobileElement openSpinnerTipoConta = (MobileElement) driver.findElementById("spinner_esqueci_minha_conta");
        openSpinnerBanco.click();
//        MobileElement spinnerBancoBody = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView");
        String txtBanco = "";
        int cont = 1;
        MobileElement elementoBanco = null;
        do {
            try {
                //=======================AQUI VAI TER QUE COLOCAR IF, NÃO TEM JEITO=============================//
                elementoBanco = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[" + cont + "]");
                cont++;
                txtBanco = elementoBanco.getText();
            } catch (Exception e) {
                swipper.verticalSwipe(spinnerBancoBody);
                cont = 1;
            }
        } while (!(txtBanco.contains(banco.toLowerCase())));
        elementoBanco.click();
        openSpinnerTipoConta.click();
        if (tipoConta.toLowerCase().equals("cc")) {
//            MobileElement btnTipoConta = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
            btnTipoContaCc.click();
        } else {
//            MobileElement btnTipoConta = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
            btnTipoContaCp.click();
        }
//        MobileElement txtAgencia = (MobileElement) driver.findElementById("edit_text_esqueci_senha_agencia");
//        MobileElement txtConta = (MobileElement) driver.findElementById("edit_text_esqueci_senha_numero_conta");
//        MobileElement txtDigito = (MobileElement) driver.findElementById("edit_text_esqueci_senha_digito_conta");
        txtAgencia.setValue(agencia);
        txtConta.setValue(nConta);
        txtDigito.setValue(digitoConta);
    }

    public void preencherDadosCartao(String cardNumber) throws InterruptedException {
        swipper.verticalSwipe(scrollView);
        txtEc.setValue(ec);
//        MobileElement btnPrePago = (MobileElement) driver.findElementById("button_dados_digital");
//        MobileElement txtCardNumber = (MobileElement) driver.findElementById("edit_text_serie_number");
        btnPrePago.click();
        txtCardNumber.setValue(cardNumber);
    }


    public void deAcordo() throws InterruptedException {
        swipper.verticalSwipe(scrollView);
//        MobileElement checkDeAcordo = (MobileElement) driver.findElementById("checkBoxConfirmTerms");
        checkDeAcordo.click();
    }

    public void pressBtnConfirmar() {
//        MobileElement btnConfirmar = (MobileElement) driver.findElementById("buttonConfirm");
        btnConfirmar.click();
    }

    public void preencherUsuario() {
        if (tipoCadastro.contains("não")) {
            driver.hideKeyboard();
//            MobileElement txtUsuario = (MobileElement) driver.findElementById("edit_text_user");
            txtUsuario.setValue("cielomult");
        }
    }

    public void pressBtnOk() {
        if (tipoCadastro.contains("não")) {
            driver.hideKeyboard();
//            MobileElement btnOk = (MobileElement) driver.findElementById("btn_welcome_ok");
            btnOk.click();
        }
    }

    public void verificaTelaEmail() {
//        MobileElement txtEmail = (MobileElement) driver.findElementById("text_email");
        Assert.assertEquals(email, txtEmailConfirm.getText());
    }

    public void pressBtnVoltar() {
        if (deviceName.contains("moto") || deviceName.contains("s8") || deviceName.contains("farm")) {
            btnVoltar = (MobileElement) driver.findElementByAccessibilityId("Navegar para cima");
        } else if (!deviceName.contains("phone")){
            btnVoltar = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        }
        btnVoltar.click();
    }

    public void setNumEmail(String numEmail) {
        this.numEmail = numEmail;
    }

    public String getNumEmail() {
        return numEmail;
    }
}
