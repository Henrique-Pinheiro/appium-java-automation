package io.cucumber.skeleton.pages;

import cucumber.api.java.hu.Ha;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.support.AppiumController.driver;


public class TrocaDeEcPage {

    private int resultadosEncontrados = 0;
    private String xpathBegin = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[";
    private String xpathEnd = "]";
    private String ecOrName = "";


    public int getResultadosEncontrados() {
        return resultadosEncontrados;
    }

    public void openTrocaDeEc() {
        MobileElement openTrocaEc = (MobileElement) driver.findElementById("layout_trocar_estabelecimento");
        openTrocaEc.click();
    }


    public void searchForValid(String dado, int i) throws InterruptedException {
        MobileElement resultado = null;
        String letra = "";
        char[] arrDado = dado.toCharArray();
        if (i == 0) {
            MobileElement btnGrupo = (MobileElement) driver.findElementById("constraint_view");
            btnGrupo.click();
            MobileElement btnVoltar = (MobileElement) driver.findElementById("btnLeft");
        }
        MobileElement txtPesquisa = (MobileElement) driver.findElementById("edit_search");
        for (int n = 0; n < arrDado.length; n++) {
            letra = letra + arrDado[n];
            txtPesquisa.setValue(letra);
            driver.hideKeyboard();
            resultado = (MobileElement) driver.findElementByXPath(xpathBegin + "1" + xpathEnd);
        }
        if (resultado.isDisplayed()){
            resultadosEncontrados++;
        }
    }

    public void checkResults(int resultados) {
        for (int i = 1; i <= resultados; i++) {
            try {
                MobileElement resultado = (MobileElement) driver.findElementByXPath(xpathBegin + i + xpathEnd);
            } catch (WebDriverException e) {
                throw new RuntimeException("Nenhum EC foi encontrado, impossivel de realizar a troca.");
            }
        }
    }

    public void clickGrupoPagamento(){
        MobileElement btnGrupo = (MobileElement) driver.findElementById("constraint_view");
        btnGrupo.click();
    }

    public void searchForInvalid(String dado, int i){
        MobileElement resultado = null;
        if (i == 0) {
            clickGrupoPagamento();
            MobileElement btnVoltar = (MobileElement) driver.findElementById("btnLeft");
        }
        MobileElement txtPesquisa = (MobileElement) driver.findElementById("edit_search");
        txtPesquisa.setValue(dado);
        try{
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            resultado = (MobileElement) driver.findElementByXPath(xpathBegin + "1" + xpathEnd);
            resultadosEncontrados++;
        }catch (WebDriverException ignored){ }
    }

    public void searchEc(String ecOrName){
        this.ecOrName = ecOrName;
        MobileElement btnVoltar = (MobileElement) driver.findElementById("btnLeft");
        if (btnVoltar.isDisplayed()){
            MobileElement txtPesquisa = (MobileElement) driver.findElementById("edit_search");
            txtPesquisa.setValue(ecOrName);
        }
    }

    public void selectDisplayedEc(){
        String currentEc = HamburguerMenu.getCurrentEc();
        if (ecOrName.equals(currentEc)){
            MobileElement resultado = (MobileElement) driver.findElementByXPath(xpathBegin + "2" + xpathEnd);
            resultado.click();
        }else{
            MobileElement resultado = (MobileElement) driver.findElementByXPath(xpathBegin + "1" + xpathEnd);
            resultado.click();
        }
    }
}
