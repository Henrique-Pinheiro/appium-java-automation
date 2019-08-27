package io.cucumber.skeleton.pages;

import cucumber.api.java.hu.Ha;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.support.AppiumController.driver;


public class TrocaDeEcPage {

    private int resultadosEncontrados = 0;
    private String xpathBegin = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[";
    private String xpathEnd = "]";
    private String ecOrName = "";

    public TrocaDeEcPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "layout_trocar_estabelecimento")
    @iOSFindBy(id = "")
    private MobileElement openTrocaEc;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    @iOSFindBy(id = "")
    private MobileElement resultado1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    @iOSFindBy(id = "")
    private MobileElement resultado2;

    @AndroidFindBy(id = "constraint_view")
    @iOSFindBy(id = "")
    private MobileElement btnGrupo;

    @AndroidFindBy(id = "btnLeft")
    @iOSFindBy(id = "")
    private MobileElement btnVoltar;

    @AndroidFindBy(id = "edit_search")
    @iOSFindBy(id = "")
    private MobileElement txtPesquisa;

    public int getResultadosEncontrados() {
        return resultadosEncontrados;
    }

    public void openTrocaDeEc() {
//        MobileElement openTrocaEc = (MobileElement) driver.findElementById("layout_trocar_estabelecimento");
        openTrocaEc.click();
    }


    public void searchForValid(String dado, int i) throws InterruptedException {
//        MobileElement resultado = null;
        String letra = "";
        char[] arrDado = dado.toCharArray();
        if (i == 0) {
//            MobileElement btnGrupo = (MobileElement) driver.findElementById("constraint_view");
            btnGrupo.click();
//            MobileElement btnVoltar = (MobileElement) driver.findElementById("btnLeft");
            btnVoltar.isDisplayed();
        }
//        MobileElement txtPesquisa = (MobileElement) driver.findElementById("edit_search");
        for (int n = 0; n < arrDado.length; n++) {
            letra = letra + arrDado[n];
            txtPesquisa.setValue(letra);
            driver.hideKeyboard();
//            resultado = (MobileElement) driver.findElementByXPath(xpathBegin + "1" + xpathEnd);
        }
        if (resultado1.isDisplayed()){
            resultadosEncontrados++;
        }
    }

    public void checkResults(int resultados) {
        for (int i = 1; i <= resultados; i++) {
            try {
                //VAI TER QUE DAR UMA OLHADA EM COMO FAZER ISSO DOS QUE USAM XPATH//
                MobileElement resultado = (MobileElement) driver.findElementByXPath(xpathBegin + i + xpathEnd);
            } catch (WebDriverException e) {
                throw new RuntimeException("Nenhum EC foi encontrado, impossivel de realizar a troca.");
            }
        }
    }

    public void clickGrupoPagamento(){
//        MobileElement btnGrupo = (MobileElement) driver.findElementById("constraint_view");
        btnGrupo.click();
    }

    public void searchForInvalid(String dado, int i){
//        MobileElement resultado = null;
        if (i == 0) {
            clickGrupoPagamento();
//            MobileElement btnVoltar = (MobileElement) driver.findElementById("btnLeft");
            btnVoltar.isDisplayed();
        }
//        MobileElement txtPesquisa = (MobileElement) driver.findElementById("edit_search");
        txtPesquisa.setValue(dado);
        try{
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//            resultado = (MobileElement) driver.findElementByXPath(xpathBegin + "1" + xpathEnd);
            if(resultado1.isDisplayed()){
                resultadosEncontrados++;
            }
        }catch (WebDriverException ignored){ }
    }

    public void searchEc(String ecOrName){
        this.ecOrName = ecOrName;
//        MobileElement btnVoltar = (MobileElement) driver.findElementById("btnLeft");
        if (btnVoltar.isDisplayed()){
//            MobileElement txtPesquisa = (MobileElement) driver.findElementById("edit_search");
            txtPesquisa.setValue(ecOrName);
        }
    }

    public void selectDisplayedEc(){
        String currentEc = HamburguerMenu.getCurrentEc();
        if (ecOrName.equals(currentEc)){
//            MobileElement resultado = (MobileElement) driver.findElementByXPath(xpathBegin + "2" + xpathEnd);
            resultado2.click();
        }else{
//            MobileElement resultado = (MobileElement) driver.findElementByXPath(xpathBegin + "1" + xpathEnd);
            resultado1.click();
        }
    }
}
