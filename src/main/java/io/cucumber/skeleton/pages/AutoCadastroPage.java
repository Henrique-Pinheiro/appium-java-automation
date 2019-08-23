package io.cucumber.skeleton.pages;


import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.support.CpfGenerator;
import io.cucumber.skeleton.support.Swipper;
import org.junit.Assert;

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
        MobileElement labelAutoCadastro = (MobileElement) driver.findElementById("textToolbarMainTitle");
        driver.hideKeyboard();
        return labelAutoCadastro.getText();
    }

    public void preencherDadosCadastrais() {
        MobileElement txtNomeCompleto = (MobileElement) driver.findElementById("edit_text_full_name");
        MobileElement txtEmail = (MobileElement) driver.findElementById("edit_text_email");
        MobileElement txtEmail2 = (MobileElement) driver.findElementById("edit_text_email_confirm");
        MobileElement txtCpf = (MobileElement) driver.findElementById("edit_text_cpf");
        MobileElement txtSenha = (MobileElement) driver.findElementById("edit_text_password");
        MobileElement txtSenha2 = (MobileElement) driver.findElementById("edit_text_password_confirm");
        nomeCompleto = faker.name().firstName() + " " + faker.name().lastName();
        nomeCompleto = unaccent(nomeCompleto);
        email = (nomeCompleto.substring(0, nomeCompleto.indexOf(" ")) + rand.nextInt(20) + "@cielo.com").toLowerCase();
//        email = "teste" + numEmail + "@emailibre.com";
        cpf = CpfGenerator.generateCPF(true);
        senha = tipoCadastro.contains("não") ? "s@" + ec : "123456";
        txtNomeCompleto.setValue(nomeCompleto);
        txtEmail.setValue(email);
        txtEmail2.setValue(email);
        txtCpf.setValue(cpf);
        txtSenha.setValue(senha);
        txtSenha2.setValue(senha);
    }

    public void preencherDadosBancarios(String tipoPessoa, String banco, String tipoConta, String agencia, String nConta, String digitoConta) throws InterruptedException {
        //A scroll view é o componente aonde estao esses dados, sempre que precisar descer a tela, tem que usar o swipper nela
        MobileElement scrollView = (MobileElement) driver.findElementById("layout_scroll_view");
        swipper.verticalSwipe(scrollView);
        MobileElement txtEc = (MobileElement) driver.findElementById("edit_text_stablishment");
        MobileElement btnBancaria = (MobileElement) driver.findElementById("button_dados_bancario");
        MobileElement btnFisica = (MobileElement) driver.findElementById("button_account_fisica");
        MobileElement btnJuridica = (MobileElement) driver.findElementById("button_account_juridica");
        txtEc.setValue(ec);
        btnBancaria.click();
        if (tipoPessoa.toLowerCase().equals("pf")) {
            btnFisica.click();
        } else {
            btnJuridica.click();
        }
        swipper.verticalSwipe(scrollView);
        MobileElement openSpinnerBanco = (MobileElement) driver.findElementById("spinner_esqueci_senha_banco");
        MobileElement openSpinnerTipoConta = (MobileElement) driver.findElementById("spinner_esqueci_minha_conta");
        openSpinnerBanco.click();
        MobileElement spinnerBancoBody = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView");
        String txtBanco = "";
        int cont = 1;
        MobileElement elementoBanco = null;
        do {
            try {
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
            MobileElement btnTipoConta = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
            btnTipoConta.click();
        } else {
            MobileElement btnTipoConta = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
            btnTipoConta.click();
        }
        MobileElement txtAgencia = (MobileElement) driver.findElementById("edit_text_esqueci_senha_agencia");
        MobileElement txtConta = (MobileElement) driver.findElementById("edit_text_esqueci_senha_numero_conta");
        MobileElement txtDigito = (MobileElement) driver.findElementById("edit_text_esqueci_senha_digito_conta");
        txtAgencia.setValue(agencia);
        txtConta.setValue(nConta);
        txtDigito.setValue(digitoConta);
    }

    public void preencherDadosCartao(String cardNumber) throws InterruptedException {
        //A scroll view é o componente aonde estao esses dados, sempre que precisar descer a tela, tem que usar o swipper nela
        MobileElement scrollView = (MobileElement) driver.findElementById("layout_scroll_view");
        swipper.verticalSwipe(scrollView);
        MobileElement txtEc = (MobileElement) driver.findElementById("edit_text_stablishment");
        txtEc.setValue(ec);
        MobileElement btnPrePago = (MobileElement) driver.findElementById("button_dados_digital");
        btnPrePago.click();
        MobileElement txtCardNumber = (MobileElement) driver.findElementById("edit_text_serie_number");
        txtCardNumber.setValue(cardNumber);
    }


    public void deAcordo() throws InterruptedException {
        MobileElement scrollView = (MobileElement) driver.findElementById("layout_scroll_view");
        swipper.verticalSwipe(scrollView);
        MobileElement checkDeAcordo = (MobileElement) driver.findElementById("checkBoxConfirmTerms");
        checkDeAcordo.click();
    }

    public void pressBtnConfirmar() {
        MobileElement btnConfirmar = (MobileElement) driver.findElementById("buttonConfirm");
        btnConfirmar.click();
    }

    public void preencherUsuario() {
        if (tipoCadastro.contains("não")) {
            driver.hideKeyboard();
            MobileElement txtUsuario = (MobileElement) driver.findElementById("edit_text_user");
            txtUsuario.setValue("cielomult");
        }
    }

    public void pressBtnOk() {
        if (tipoCadastro.contains("não")) {
            driver.hideKeyboard();
            MobileElement btnOk = (MobileElement) driver.findElementById("btn_welcome_ok");
            btnOk.click();
        }
    }

    public void verificaTelaEmail() {
        MobileElement txtEmail = (MobileElement) driver.findElementById("text_email");
        Assert.assertEquals(email, txtEmail.getText());
    }

    public void pressBtnVoltar() {
        MobileElement btnVoltar = null;
        if(deviceName.contains("moto") || deviceName.contains("s8") || deviceName.contains("farm")){
            btnVoltar = (MobileElement) driver.findElementByAccessibilityId("Navegar para cima");
        }else{
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
