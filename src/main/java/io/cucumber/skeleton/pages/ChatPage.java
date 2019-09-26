package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import static io.cucumber.skeleton.support.AppiumController.driver;

public class ChatPage {

    public ChatPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "txtTitle")
    @iOSFindBy(id = "")
    private MobileElement chatTitle;

    public boolean chatTitleIsDisplayed(){
        return chatTitle.isDisplayed();
    }

}
