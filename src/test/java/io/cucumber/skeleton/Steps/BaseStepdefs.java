package io.cucumber.skeleton.Steps;

import cucumber.api.java.en.Given;
import io.cucumber.skeleton.pages.Belly;
import org.junit.Assert;

public class BaseStepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        Assert.assertEquals(cukes, belly.eat());
    }
}
