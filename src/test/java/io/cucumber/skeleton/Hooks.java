package io.cucumber.skeleton;

import cucumber.api.Scenario;
import io.cucumber.skeleton.support.AppiumController;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;

import static io.cucumber.skeleton.support.AppiumController.driver;

public class Hooks {

    //============Precisa fazer rodar===========================//
    @After
    public void afterScenarioFinish(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            File file = driver.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("/Users/t1409hnr/Desktop/System-Testing/cucumber-java-skeleton/target/prints/" + java.time.LocalDate.now() + "-run/" + scenario.getName() + ".png"));
        }
        AppiumController.stopDriver();
    }

}
