package io.cucumber.skeleton.pages.Android;

import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.AppiumController;

import java.util.concurrent.TimeUnit;

public class AndroidHomePage {

    private BaseAndroidPage baseAndroidPage = new BaseAndroidPage();
    public static AppiumController appiumController = BaseAndroidPage.appiumController;

    public boolean checkHomePage(){
        appiumController.driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        MobileElement chatBtn = (MobileElement) appiumController.driver.findElementById("icon_chat");
        return chatBtn.isDisplayed();
    }
}
