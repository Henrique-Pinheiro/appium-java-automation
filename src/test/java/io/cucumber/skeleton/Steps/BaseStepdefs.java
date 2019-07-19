package io.cucumber.skeleton.Steps;

import cucumber.api.java.pt.Dado;
import org.junit.Assert;

public class BaseStepdefs {

    @Dado("que eu estou na tela do {string}")
    public void queEuEstouNaTelaDo(String texto) {
        Assert.assertEquals(texto, "Hello World!");
    }
}
