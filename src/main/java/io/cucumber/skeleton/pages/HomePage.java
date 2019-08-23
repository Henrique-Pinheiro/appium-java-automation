package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriverException;

import java.util.concurrent.TimeUnit;

import static io.cucumber.skeleton.support.AppiumController.driver;
public class HomePage {

    private BasePage basePage = new BasePage();
    //public static AppiumController appiumController = BasePage.appiumController;
//    MobileElement btnfehcar = (MobileElement) driver.findElementById("btnRight");
//    84740319314

    public boolean checkHomePage(){
        try {
            try{
                MobileElement btnfehcar2 = (MobileElement) driver.findElementById("btn_rm_close");
                while(btnfehcar2.isDisplayed()){
                    btnfehcar2.click();
                }
            }
            catch (WebDriverException ignored){
            }
            MobileElement btnfehcar = (MobileElement) driver.findElementById("btnRight");
            while(btnfehcar.isDisplayed()){
                btnfehcar.click();
            }
        }
        catch (WebDriverException ignored) {
        }
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        MobileElement chatBtn = (MobileElement) driver.findElementById("icon_chat");
        return chatBtn.isDisplayed();
    }
}
