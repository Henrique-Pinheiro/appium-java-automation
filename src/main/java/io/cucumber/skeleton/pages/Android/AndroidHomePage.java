package io.cucumber.skeleton.pages.Android;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriverException;

import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.pages.Android.BaseAndroidPage.appiumController;

public class AndroidHomePage {

    private BaseAndroidPage baseAndroidPage = new BaseAndroidPage();
    //public static AppiumController appiumController = BaseAndroidPage.appiumController;
//    MobileElement btnfehcar = (MobileElement) appiumController.driver.findElementById("btnRight");
//    84740319314

    public boolean checkHomePage(){
        try {
            try{
                MobileElement btnfehcar2 = (MobileElement) appiumController.driver.findElementById("btn_rm_close");
                while(btnfehcar2.isDisplayed()){
                    btnfehcar2.click();
                }
            }
            catch (WebDriverException ignored){
            }
            MobileElement btnfehcar = (MobileElement) appiumController.driver.findElementById("btnRight");
            while(btnfehcar.isDisplayed()){
                btnfehcar.click();
            }
        }
        catch (WebDriverException ignored) {
        }
        appiumController.driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        MobileElement chatBtn = (MobileElement) appiumController.driver.findElementById("icon_chat");
        return chatBtn.isDisplayed();
    }
}
