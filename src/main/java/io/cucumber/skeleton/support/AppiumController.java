package io.cucumber.skeleton.support;

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
    public String platformName;
    public String deviceName;
    private static URL appiumURL;

    public AppiumController(String deviceName) {
        this.deviceName = deviceName;
    }

    public void startDriver() throws MalformedURLException {
        Devices devices = new Devices();
        if (deviceName.contains("farm")){
            appiumURL = new URL("http://10.64.234.8:8080/wd/hub");
        }else{
            appiumURL = new URL("http://localhost:4723/wd/hub");
        }
        DesiredCapabilities capabilities = devices.returnCaps(deviceName);
        platformName = (String) capabilities.getCapability("platformName");
        switch (platformName.toLowerCase()) {
            default:
            case "android":
                driver = new AndroidDriver(appiumURL, capabilities);
                break;
            case "ios":
                driver = new IOSDriver(appiumURL, capabilities);
                break;
        }
        this.setDefaultTimeOut();
    }

    public void stopDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public void setDefaultTimeOut() {
        wait = new WebDriverWait(driver, 30); //seta timeout default
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


}
