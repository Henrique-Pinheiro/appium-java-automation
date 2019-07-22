package io.cucumber.skeleton;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class AppiumController {

    public static AppiumDriver driver;
    public static WebDriverWait wait;
    public static String platformName;
    public static String deviceName;
    public Devices devices = new Devices();

    public AppiumController(String deviceName){
        this.deviceName = deviceName;
    }

    public void startDriver() throws MalformedURLException {
        URL appiumURL = new URL("http://localhost:4723/wd/hub");
        DesiredCapabilities capabilities = devices.returnCaps(deviceName);
        platformName = (String) capabilities.getCapability("platformName");
        switch (platformName.toLowerCase()){
            default:
            case "android":
                driver = new AndroidDriver(appiumURL, capabilities);
                break;
            case "ios":
                driver = new IOSDriver(appiumURL, capabilities);
                break;
        }this.setDefaultTimeOut();
    }

    public void stopDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public void setDefaultTimeOut() {
        wait = new WebDriverWait(driver, 60); //seta timeout default
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


}
