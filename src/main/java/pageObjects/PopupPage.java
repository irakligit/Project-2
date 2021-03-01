package pageObjects;
import dataObjects.DataProvider;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PopupPage extends DataProvider {

    public PopupPage name(String name ) {
        $("#friend_name").sendKeys(name);
        return this;
    }
    public PopupPage email(String email){
        $("#friend_email").sendKeys(email);
        return this;
    }
    public PopupPage clickSendBtn(){
        $("#sendEmail").click();
        return this;
    }
    public PopupPage waitWindow(){
        $(".fancybox-inner").shouldHave(text("Send to a friend"));
        return this;
    }


}
