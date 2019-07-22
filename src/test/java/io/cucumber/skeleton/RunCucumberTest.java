package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.java.pt.*;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/io/cucumber/skeleton"}, plugin = {"json:target/jsonReports/CucumberReport.json"})
public class RunCucumberTest {


}
