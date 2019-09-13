package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.support.AppiumController.driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btn_rm_close")
    @iOSFindBy(id = "")
    private MobileElement btFechar2;

    @AndroidFindBy(id = "btnRight")
    @iOSFindBy(id = "")
    private MobileElement btnFechar;

    @AndroidFindBy(id = "icon_chat")
    @iOSFindBy(id = "")
    private MobileElement chatBtn;


    //TEM QUE TENTAR REFATORAR AGORA QUE TEM PAGEFACTORY PARA VER SE DA PARA SER MAIS RAPIDO
    public boolean checkHomePage() {
        try {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            if (btFechar2.isDisplayed()) {
                btFechar2.click();
            }
        }catch(WebDriverException ignored){}
        btnFechar.click();
        return chatBtn.isDisplayed();
    }


}
