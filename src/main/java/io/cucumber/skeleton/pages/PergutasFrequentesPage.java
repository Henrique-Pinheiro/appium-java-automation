package io.cucumber.skeleton.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import static io.cucumber.skeleton.support.AppiumController.driver;

public class PergutasFrequentesPage {
    public PergutasFrequentesPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy (id="textToolbarMainTitle")
    @iOSFindBy(id="")
    private MobileElement faqPageTitle;

    @AndroidFindBy (id="linearLikeOrDislikeContent")
    @iOSFindBy(id="")
    private MobileElement modalRatingAnswer;

    @AndroidFindBy (id="buttonNegativeQuestion")
    @iOSFindBy(id="")
    private MobileElement badRating;

    @AndroidFindBy (id="buttonPositiveQuestion")
    @iOSFindBy(id="")
    private MobileElement happyRating;

    @AndroidFindBy (id="textUserGoodReactionToQuestion")
    @iOSFindBy(id="")
    private MobileElement txtGoodReaction;

    @AndroidFindBy (id="textUserBadReaction")
    @iOSFindBy(id="")
    private MobileElement txtBadReaction;


    public boolean faqAnswerIsDisplayed(){
        return faqPageTitle.isDisplayed();
    }

    public boolean answerRatingIsDisplayed() {
        return modalRatingAnswer.isDisplayed();
    }

    public void selectAnswerRating(String rating) {
        if(rating.equalsIgnoreCase("negativo")){
            badRating.click();
        }else{
            happyRating.click();
        }
    }

    public String getDisplayedMsg(String msg) {
        if(msg.equalsIgnoreCase("Que bom :)")){
            return txtGoodReaction.getText();
        }else{
            return txtBadReaction.getText();
        }
    }
}
