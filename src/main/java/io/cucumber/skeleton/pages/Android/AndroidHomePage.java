package io.cucumber.skeleton.pages.Android;

import io.appium.java_client.MobileElement;
import io.cucumber.skeleton.AppiumController;

public class AndroidHomePage {

    private BaseAndroidPage baseAndroidPage = new BaseAndroidPage();
    public static AppiumController appiumController = BaseAndroidPage.appiumController;

    public boolean checkHomePage(){
        MobileElement hambuguerBtn = (MobileElement) appiumController.driver.findElementByAccessibilityId("Open navigation drawer");
        return hambuguerBtn.isDisplayed();
    }
}
