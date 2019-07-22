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

    public AppiumController(String platformName){
        this.platformName = platformName;
    }

    public void startDriver() throws MalformedURLException {

        URL appiumURL = new URL("http://localhost:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage", "com.example.myapplication");
        capabilities.setCapability("appActivity", ".MainActivity");
        //capabilities.setCapability("app", "");
        switch (platformName.toLowerCase()){
            default:
            case "android":
                driver = new AndroidDriver(appiumURL, capabilities);
                System.out.println("Batata");
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
