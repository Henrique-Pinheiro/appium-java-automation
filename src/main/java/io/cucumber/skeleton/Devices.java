package io.cucumber.skeleton;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Devices {

    private String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public String returnDeviceOs(String deviceName){
        this.deviceName = deviceName;
        switch (deviceName){
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

    public DesiredCapabilities returnCaps(String deviceName){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        String platformName = returnDeviceOs(deviceName);
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("appPackage", "com.example.myapplication");
        capabilities.setCapability("appActivity", ".MainActivity");
        //capabilities.setCapability("app", "");
        switch (deviceName.toLowerCase()){
            case "emulator":
                capabilities.setCapability("platformVersion", "8.1");
                capabilities.setCapability("deviceName", "emulator-5554");
                return capabilities;
            case "moto g7":
                capabilities.setCapability("platformVersion", "9");
                capabilities.setCapability("deviceName", "0055447539");
                return capabilities;
            case "samsung j4":
                capabilities.setCapability("platformVersion", "8.1.0");
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
