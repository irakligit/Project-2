package pageObjects;
import dataObjects.DataProvider;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PopupPage extends DataProvider {

    @Step("sendKeys friendName")
    public PopupPage name(String name ) {
        $("#friend_name").sendKeys(name);
        return this;
    }
    @Step("sendKeys friendEmail")
    public PopupPage email(String email){
        $("#friend_email").sendKeys(email);
        return this;
    }
    @Step("click sendBtn")
    public PopupPage clickSendBtn(){
        $("#sendEmail").click();
        return this;
    }
    @Step("waitWindow")
    public PopupPage waitWindow(){
        $(".fancybox-inner").shouldHave(text("Send to a friend"));
        return this;
    }


}
