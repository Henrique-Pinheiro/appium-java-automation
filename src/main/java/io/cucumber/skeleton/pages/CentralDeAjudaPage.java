package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.cucumber.skeleton.support.Swipper;
import org.openqa.selenium.support.PageFactory;

import static io.cucumber.skeleton.support.AppiumController.driver;

public class CentralDeAjudaPage {


    public CentralDeAjudaPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "textToolbarMainLoggedTitle")
    @iOSFindBy(id = "")
    private MobileElement centralDeAjudaTittle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")
    @iOSFindBy(id = "")
    private MobileElement sectionCategoria;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[2]")
    @iOSFindBy(id = "")
    private MobileElement sectionPerguntasFreq;

    @AndroidFindBy(id = "text_view_central_atendimento")
    @iOSFindBy(id = "")
    private MobileElement sectionCanaisAtendimento;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[2]")
    @iOSFindBy(id = "")
    private MobileElement sectionEntreContato;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout")
    @iOSFindBy(id = "")
    private MobileElement chatBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]")
    @iOSFindBy(id = "")
    private MobileElement faqCard;

    @AndroidFindBy(id="linearUserBadReaction")
    @iOSFindBy(id = "")
    private MobileElement openChatbtn;

    @AndroidFindBy(id = "scroll_central_ajuda")
    @iOSFindBy(id = "")
    private MobileElement scrollFaq;

    private ChatPage chat = new ChatPage();
    private Swipper swippper = new Swipper();

    public boolean checkCentralDeAjuda() {
        return centralDeAjudaTittle.isDisplayed();
    }

    public boolean goToSection(String section) throws InterruptedException {
        switch (section.toLowerCase()) {
            case "categorias": {
                return sectionCategoria.isDisplayed();
            }
            case "perguntas frequentes": {
                return sectionPerguntasFreq.isDisplayed();
            }
            case "canais de atendimento": {
                swippper.verticalSwipe(scrollFaq);
                return sectionCanaisAtendimento.isDisplayed();
            }
            case "entre em contato": {
                return sectionEntreContato.isDisplayed();
            }
            default: return false;
        }
    }

    public void selectCommunicationChannel(String channel) {
        switch (channel.toLowerCase()){
            case "chat": {
                chatBtn.click();
            }
        }
    }

    public boolean communicationChannelIsDisplayed(String page) {
        switch (page.toLowerCase()){
            case "chat":{
                return chat.chatTitleIsDisplayed();
            }
            default: return false;
        }
    }

    public void swippeCards() {

    }

    public void openFaq() {
        faqCard.click();
    }

    public void openChatRating() {
        openChatbtn.click();
    }
}
