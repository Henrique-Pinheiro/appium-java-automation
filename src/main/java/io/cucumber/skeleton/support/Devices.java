package io.cucumber.skeleton.support;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Devices {

    private String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public String returnDeviceOs(String deviceName) {
        this.deviceName = deviceName;
        switch (deviceName.toLowerCase()) {
            case "emulator":
                return "android";
            case "moto g7":
                return "android";
            case "samsung j4":
                return "android";
            case "samsung s7":
                return "android";
            case "samsung s8":
                return "android";
            case "lg farm":
                return "Android";
            case "j6 farm":
                return "Android";
            case "iemulator":
                return "ios";
            case "iphone 6":
                return "ios";
            case "iphone 7":
                return "ios";
            case "iphone 8":
                return "ios";
            case "iphone xs":
                return "ios";
        }
        return null;
    }

    public DesiredCapabilities returnCaps(String deviceName) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        String platformName = returnDeviceOs(deviceName);
        capabilities.setCapability("platformName", platformName);
        if (platformName.equalsIgnoreCase("android")) {
            if (deviceName.contains("farm")) {
                capabilities.setCapability("noReset", "false");
                capabilities.setCapability("appPackage", "br.com.mobicare.cielo.homolog");
                capabilities.setCapability("appActivity", "br.com.mobicare.cielo.splash.presentation.ui.activities.SplashActivity");
                capabilities.setCapability("userName", "cielo@default.com");
                capabilities.setCapability("password", "Rs1c13l0");
            } else {
                capabilities.setCapability("app", "/Users/t1409hnr/desktop/System-Testing/cielo-app-android/app/build/outputs/apk/dev/homolog/app-dev-homolog.apk");
            }
        } else if (platformName.equals("ios")) {
            capabilities.setCapability("app", "/Users/t1409hnr/Desktop/CieloApp_Development/CieloApp_Development.ipa");
        }
        switch (deviceName.toLowerCase()) {
            case "emulator":
                capabilities.setCapability("platformVersion", "8.1");
                capabilities.setCapability("deviceName", "emulator-5554");
                return capabilities;
            case "moto g7":
                capabilities.setCapability("platformVersion", "9");
                capabilities.setCapability("deviceName", "0055447539");
                return capabilities;
            case "samsung j4":
                capabilities.setCapability("platformVersion", "9");
                capabilities.setCapability("deviceName", "253601f8");
                return capabilities;
            case "samsung s7":
                capabilities.setCapability("platformVersion", "8.0.0");
                capabilities.setCapability("deviceName", "ce0716077ccbc71d03");
                return capabilities;
            case "samsung s8":
                capabilities.setCapability("platformVersion", "9");
                capabilities.setCapability("deviceName", "ce081718cbd1643504");
                return capabilities;
            case "lg farm":
                capabilities.setCapability("deviceName", "LM-X410.F");
                return capabilities;
            case "j6 farm":
                capabilities.setCapability("deviceName", "SM-J610G");
                return capabilities;
            case "iemulator":
                break;
            case "iphone 6":
                break;
            case "iphone 7":
                break;
            case "iphone 8":
                break;
            case "iphone xs":
                break;
        }
        return null;
    }


}
