package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;

import static io.cucumber.skeleton.support.AppiumController.driver;

public class PagamentoPorLinkPage {

    private int timesEnable = 0;

    public PagamentoPorLinkPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "textToolbarMainLoggedTitle")
    @iOSFindBy(id = "")
    private MobileElement pagamentoPorLinkTitle;

    @AndroidFindBy(id = "textCustomerNotEligiblePhoneToContact")
    @iOSFindBy(id = "")
    private MobileElement phoneNumberLink;

    @AndroidFindBy(id = "textCustomerNotEligibleContactEmail")
    @iOSFindBy(id = "")
    private MobileElement emailLink;

    @AndroidFindBy(id = "buttonCallToAction")
    @iOSFindBy(id = "")
    private MobileElement btnCriarNovoLink;

    @AndroidFindBy(id = "text_not_found")
    @iOSFindBy(id = "")
    private MobileElement txtNoLinks;

    @AndroidFindBy(id = "textInputEditCreateLinkTitle")
    @iOSFindBy(id = "")
    private MobileElement txtInputLinkName;

    @AndroidFindBy(id = "textInputEditCreateLinkValue")
    @iOSFindBy(id = "")
    private MobileElement txtInputLinkValue;

    @AndroidFindBy(id = "buttonGenerateLink")
    @iOSFindBy(id = "")
    private MobileElement btnGerarNovoLink;

    //O claudio vai colocar ID para mim
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup[1]")
    @iOSFindBy(id = "")
    private MobileElement firstLinkUltimosLink;

    //O claudio vai colocar ID para mim
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout")
    @iOSFindBy(id = "")
    private MobileElement verMaisLinksBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    @iOSFindBy(id = "")
    private MobileElement firstLinkTodosOsLinks;

    @AndroidFindBy(id = "tv_name_item_detail")
    @iOSFindBy(id = "")
    private MobileElement txtLinkName;

    @AndroidFindBy(id = "tv_value_sale")
    @iOSFindBy(id = "")
    private MobileElement txtLinkValue;

    @AndroidFindBy(id = "link_value")
    @iOSFindBy(id = "")
    private MobileElement link;

    @AndroidFindBy(id = "btn_trash")
    @iOSFindBy(id = "")
    private MobileElement btnTrash;

    @AndroidFindBy(id = "btn_close")
    @iOSFindBy(id = "")
    private MobileElement btnClose;

    @AndroidFindBy(id = "textPlusOneShortcut")
    @iOSFindBy(id = "")
    private MobileElement btnValue5;

    @AndroidFindBy(id = "textPlusFiveShortcut")
    @iOSFindBy(id = "")
    private MobileElement btnValue10;

    @AndroidFindBy(id = "textPlusTenShortcut")
    @iOSFindBy(id = "")
    private MobileElement btnValue50;

    @AndroidFindBy(id = "textPlusFiftyShortcut")
    @iOSFindBy(id = "")
    private MobileElement btnValue100;

    @AndroidFindBy(id = "custom_dialog_button_right")
    @iOSFindBy(id = "")
    private MobileElement btnConfirmarPopUp;

    @AndroidFindBy(id = "action_help")
    @iOSFindBy(id = "")
    private MobileElement openFaqBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    @iOSFindBy(id = "")
    private MobileElement question1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    @iOSFindBy(id = "")
    private MobileElement question2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    @iOSFindBy(id = "")
    private MobileElement question3;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
    @iOSFindBy(id = "")
    private MobileElement question4;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]")
    @iOSFindBy(id = "")
    private MobileElement question5;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]")
    @iOSFindBy(id = "")
    private MobileElement question6;

    @AndroidFindBy(id = "btnLeft")
    @iOSFindBy(id = "")
    private MobileElement btnVoltar;

    @AndroidFindBy(id = "btnRight")
    @iOSFindBy(id = "")
    private MobileElement closeFaqBtn;

    public String getPhoneNumber() {
        return phoneNumberLink.getText();
    }

    public String getEmail() {
        return emailLink.getText();
    }

    public boolean checkPage() {
        driver.hideKeyboard();
        return pagamentoPorLinkTitle.isDisplayed();
    }


    public boolean checkNovoLink() {
        return btnCriarNovoLink.isDisplayed();
    }

    public String getNoLinksMsg() {
        return txtNoLinks.getText();
    }

    public void clickCriarNovoLink() {
        btnCriarNovoLink.click();
    }

    public void fillNomeProduto(String nomeProduto) {
        txtInputLinkName.setValue(nomeProduto);
    }

    public void fillValorProduto(String valor) {
        driver.hideKeyboard();
        txtInputLinkValue.setValue(valor);
    }

    public void checkAndSumBtnGerarLink() {
        timesEnable = btnGerarNovoLink.isEnabled() ? timesEnable + 1 : timesEnable;
    }

    public int getTimesEnable() {
        return timesEnable;
    }

    public void ClickAllValuesBtn() {
        driver.hideKeyboard();
        btnValue5.click();
        btnValue10.click();
        btnValue50.click();
        btnValue100.click();
    }

    public void clickGerarLinkBtn() {
        btnGerarNovoLink.click();
    }

    public void openFirstUltimosLinks() {
        firstLinkUltimosLink.click();
    }

    public String getValorLinkDetalhado() {
        return txtLinkValue.getText();
    }

    public void fillLinkName(String nomeLink) {
        txtInputLinkName.setValue(nomeLink);
    }


    public void fillLinkValue(String valorLink) {
        driver.hideKeyboard();
        txtInputLinkValue.setValue(valorLink);
    }

    public String getLinkName() {
        return txtLinkName.getText();
    }

    public String getLinkValue() {
        return txtLinkValue.getText().replace(".", "");
    }

    public void openTodosOsLinks() {
        verMaisLinksBtn.click();
    }

    public void openLink() {
        firstLinkTodosOsLinks.click();
    }

    public void clickCloseLink() {
        btnClose.click();
    }

    public void clickExcluirLink() {
        btnTrash.click();
    }

    public void clickConfirmarPopUp() {
        btnConfirmarPopUp.click();
    }

    public boolean checkLink() {
        return link.isDisplayed();
    }

    public void clickFaqBtn() {
        openFaqBtn.click();
    }

    public int returnNumberOfQuestions() {
        int questionsNumber = 0;
        if (question1.isDisplayed()){
            questionsNumber++;
        }if (question2.isDisplayed()){
            questionsNumber++;
        }if (question3.isDisplayed()){
            questionsNumber++;
        }if (question4.isDisplayed()){
            questionsNumber++;
        }if (question5.isDisplayed()){
            questionsNumber++;
        }if (question6.isDisplayed()){
            questionsNumber++;
        }
        return questionsNumber;
    }

    public void openFaqQuestionNumber(int questionNumber) {
        switch (questionNumber){
            case 1:
                question1.click();
                break;
            case 2:
                question2.click();
                break;
            case 3:
                question3.click();
                break;
            case 4:
                question4.click();
                break;
            case 5:
                question5.click();
                break;
            case 6:
                question6.click();
                break;
        }
    }

    public boolean checkQuestionDetail() {
        return btnVoltar.isDisplayed();
    }

    public void closeFaq() {
        closeFaqBtn.click();
    }
}
