package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.cucumber.skeleton.support.Swipper;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;
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

    @AndroidFindBy(id = "btn_du_salve")
    @iOSFindBy(id = "")
    private MobileElement btnSalvar;

    @AndroidFindBy(id = "custom_dialog_message")
    @iOSFindBy(id = "")
    private MobileElement popUpMsg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
    @iOSFindBy(id = "")
    private MobileElement errorSenhaAtual;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
    @iOSFindBy(id = "")
    private MobileElement errorNovaSenha1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
    @iOSFindBy(id = "")
    private MobileElement errorNovaSenha2;

    @AndroidFindBy(accessibility = "USUÁRIO")
    @iOSFindBy(id = "")
    private MobileElement btnUser;

    @AndroidFindBy(accessibility = "ESTABELECIMENTO")
    @iOSFindBy(id = "")
    private MobileElement btnEc;

    @AndroidFindBy(accessibility = "CONTAS")
    @iOSFindBy(id = "")
    private MobileElement btnContas;

    @AndroidFindBy(id = "contrant_view_title_est")
    @iOSFindBy(id = "")
    private MobileElement openDadosEc;

    @AndroidFindBy(id = "contrant_view_title_end")
    @iOSFindBy(id = "")
    private MobileElement openEndereco;

    @AndroidFindBy(id = "contrant_view_title_pro")
    @iOSFindBy(id = "")
    private MobileElement openDadosProprietario;

    @AndroidFindBy(id = "contrant_view_title_con")
    @iOSFindBy(id = "")
    private MobileElement openDadoContatos;

    @AndroidFindBy(id = "text_number_stabliment")
    @iOSFindBy(id = "")
    private MobileElement ecNumber;

    @AndroidFindBy(id = "text_ative")
    @iOSFindBy(id = "")
    private MobileElement status;

    @AndroidFindBy(id = "text_payment_block_debit")
    @iOSFindBy(id = "")
    private MobileElement bloqPagamento;

    @AndroidFindBy(id = "text_date_open")
    @iOSFindBy(id = "")
    private MobileElement dtAbertura;

    @AndroidFindBy(id = "text_main_name")
    @iOSFindBy(id = "")
    private MobileElement razaoSocial;

    @AndroidFindBy(id = "text_cnpj")
    @iOSFindBy(id = "")
    private MobileElement cnpj;

    @AndroidFindBy(id = "text_mcc")
    @iOSFindBy(id = "")
    private MobileElement mcc;

    @AndroidFindBy(id = "text_branch")
    @iOSFindBy(id = "")
    private MobileElement ramoAtividades;

    @AndroidFindBy(id = "viewpager_meu_cad")
    @iOSFindBy(id = "")
    private MobileElement pageScroll;

    @AndroidFindBy(id = "text_address_description")
    @iOSFindBy(id = "")
    private MobileElement txtAddress;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.TextView[2]")
    @iOSFindBy(id = "")
    private MobileElement proprietarioName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.TextView[4]")
    @iOSFindBy(id = "")
    private MobileElement proprietarioCpf;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.TextView[6]")
    @iOSFindBy(id = "")
    private MobileElement proprietarioDate;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.TextView[8]")
    @iOSFindBy(id = "")
    private MobileElement proprietarioTel1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.TextView[10]")
    @iOSFindBy(id = "")
    private MobileElement proprietarioTel2;

    @AndroidFindBy(id = "text_name")
    @iOSFindBy(id = "")
    private MobileElement contatoName;

    @AndroidFindBy(id = "text_phone_1")
    @iOSFindBy(id = "")
    private MobileElement contatoPhone1;

    @AndroidFindBy(id = "text_phone_2")
    @iOSFindBy(id = "")
    private MobileElement contatoPhone2;

    @AndroidFindBy(id = "text_email")
    @iOSFindBy(id = "")
    private MobileElement contatoEmail;

    @AndroidFindBy(id = "tv_dp_name_value")
    @iOSFindBy(id = "")
    private MobileElement usuarioName;

    @AndroidFindBy(id = "tv_dp_cpf_value")
    @iOSFindBy(id = "")
    private MobileElement usuarioCpf;

    @AndroidFindBy(id = "tv_dp_email_value")
    @iOSFindBy(id = "")
    private MobileElement usuarioEmail;

    @AndroidFindBy(id = "card_view_coil")
    @iOSFindBy(id = "")
    private MobileElement bancoCard;

    @AndroidFindBy(id = "dc_tv_name_bank")
    @iOSFindBy(id = "")
    private MobileElement contaName;

    @AndroidFindBy(id = "dc_tv_num_banck_impl")
    @iOSFindBy(id = "")
    private MobileElement contaNumber;

    @AndroidFindBy(id = "dc_tv_num_agencia_impl")
    @iOSFindBy(id = "")
    private MobileElement contaAgencia;

    @AndroidFindBy(id = "dc_tv_num_conta_impl")
    @iOSFindBy(id = "")
    private MobileElement contaConta;

    @AndroidFindBy(id = "dc_btn_banner_close")
    @iOSFindBy(id = "")
    private MobileElement closeDetalhesConta;

    public boolean checkMeuCadastro() {
        openDadosEc.click();
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
        fillOldPassword(actualPass);
        fillNewPassword1(newPass);
        fillNewPassword2(newPass);
    }

    public void fillOldPassword(String pass) {
        txtOldPassword.setValue(pass);
    }

    public void fillNewPassword1(String pass) {
        txtNewPassword1.setValue(pass);
    }

    public void fillNewPassword2(String pass) {
        txtNewPassword2.setValue(pass);
    }

    public void clickBtnSalvar() throws InterruptedException {
        swipper.verticalSwipe(scroll);
        btnSalvar.click();
    }


    public String getPopUpMsgText() {
        return popUpMsg.getText();
    }

    public void clickBtnUsuario() {
        btnUser.click();
    }

    public void clickUpperMenuOption(String option) {
        switch (option.toUpperCase()) {
            case "ESTABELECIMENTO":
                btnEc.click();
                break;
            case "USUÁRIO":
                btnUser.click();
                break;
            case "CONTAS":
                btnContas.click();
                break;
        }
    }

    public boolean upperMenuIsSelected(String option) {
        switch (option.toUpperCase()) {
            case "ESTABELECIMENTO":
                return btnEc.isSelected();
            case "USUÁRIO":
                return btnUser.isSelected();
            case "CONTAS":
                return btnContas.isSelected();
            default:
                return false;
        }
    }

    public void openSection(String section) throws InterruptedException {
        switch (section.toUpperCase()) {
            case "DADOS DO ESTABELECIMENTO":
                openDadosEc.click();
                break;
            case "ENDEREÇOS":
                openEndereco.click();
                break;
            case "DADOS DO PROPRIETARIO":
                openDadosProprietario.click();
                swipper.verticalSwipe(pageScroll);
                break;
            case "DADOS DE CONTATO":
                openDadoContatos.click();
                swipper.verticalSwipe(pageScroll);
                break;
        }
    }

    public String getEcNumber() {
        return ecNumber.getText();
    }

    public String getStatus() {
        return status.getText();
    }

    public String getBloqueio() {
        return bloqPagamento.getText();
    }

    public String getDtAbertura()  {

        return dtAbertura.getText();
    }

    public String getRazaoSocial() throws InterruptedException {
        scrollPageDown();
        return razaoSocial.getText();
    }

    public String getCnpj() {
        return cnpj.getText();
    }
    public String getMcc() {
        return mcc.getText();
    }

    public String getRamo() {
        return ramoAtividades.getText();
    }

    public String getAddress() {
        return txtAddress.getText();
    }

    private void scrollPageDown() throws InterruptedException {
        swipper.verticalSwipe(pageScroll);
    }

    public String getProprietarioName() {
        return proprietarioName.getText();
    }

    public String getProprietarioCpf() {
        return proprietarioCpf.getText();
    }

    public String getProprietarioDate() {
        return proprietarioDate.getText();
    }

    public String getProprietarioTel1() {
        return proprietarioTel1.getText();
    }

    public String getProprietarioTel2() throws InterruptedException {
        return proprietarioTel2.getText();
    }

    public String getContatoName() {
        return contatoName.getText();
    }

    public String getContatoTel1() {
        return contatoPhone1.getText();
    }

    public String getContatoTel2() {
        return contatoPhone2.getText();
    }

    public String getContatoEmail() {
        return contatoEmail.getText();
    }

    public String getUsuarioName() {
        return usuarioName.getText();
    }

    public String getUsuarioCpf() {
        return usuarioCpf.getText();
    }

    public String getUsuarioEmail() {
        return usuarioEmail.getText();
    }

    public String getContaName() {
        return contaName.getText();
    }

    public String getContaNumber() {
        return contaNumber.getText();
    }

    public String getContaAgencia() {
        return contaAgencia.getText();
    }

    public String getContaConta() {
        return contaConta.getText();
    }

    public void openBancoCard() {
        bancoCard.click();
    }

    public void closeDetalhesConta() {
        closeDetalhesConta.click();
    }

    public boolean checkMeuCadastroContas() {
        return btnContas.isDisplayed();
    }
}
