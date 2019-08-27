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



    public boolean checkHomePage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try {
            try {
//                MobileElement btnFehcar2 = (MobileElement) driver.findElementById("btn_rm_close");
                while (btFechar2.isDisplayed()) {
                    btFechar2.click();
                }
            } catch (WebDriverException ignored) {
            }
//            MobileElement btnFechar = (MobileElement) driver.findElementById("btnRight");
            while (btnFechar.isDisplayed()) {
                btnFechar.click();
            }
        } catch (WebDriverException ignored) {
        }
//        MobileElement chatBtn = (MobileElement) driver.findElementById("icon_chat");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return chatBtn.isDisplayed();
    }
}
