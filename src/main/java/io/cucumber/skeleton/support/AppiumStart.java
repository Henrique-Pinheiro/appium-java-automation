package io.cucumber.skeleton.support;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.skeleton.pages.BasePage;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;

import static io.cucumber.skeleton.support.AppiumController.driver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class AppiumStart {

    //=========================ESPECIFICAR AQUI O NOME DO DEVICE QUE DEVE SER TESTADO==========================================================//
    private static String deviceName;
    private AppiumController appiumController;

    public AppiumStart(String deviceName) {
        this.deviceName = deviceName;
    }

    public static void setDeviceName(String device) {
        deviceName = device;
    }

    public String getDeviceName() {
        return deviceName;
    }


    //============Remover as Tags por enquanto dependendo de quem for rodar===========================//
//    @Before
    public void beforeScenarioStart() {
        appiumController = new AppiumController(deviceName);
        try {
            appiumController.startDriver();
        } catch (MalformedURLException e) {
            System.out.println("Deu ruim no Appium");
            e.printStackTrace();
        }
    }

    //============Remover as Tags por enquanto dependendo de quem for rodar===========================//
    @After
    public void afterScenarioFinish(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            File file = driver.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("/Users/t1409hnr/Desktop/System-Testing/cucumber-java-skeleton/target/prints/" + java.time.LocalDate.now() + "-run/" + scenario.getName() + ".png"));
        }
        appiumController.stopDriver();
    }
}
