package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import io.cucumber.skeleton.support.AppiumController;
import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

import static io.cucumber.skeleton.support.AppiumController.driver;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/io/cucumber/skeleton"}, plugin = {"json:target/jsonReports/CucumberReport.json"}, tags = "@doing")
public class RunCucumberTest {
}
