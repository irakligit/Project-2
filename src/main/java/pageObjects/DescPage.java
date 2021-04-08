package pageObjects;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class DescPage {

    @Step("assertion page")
    public DescPage validateName(){
        $("[itemprop = 'name']").shouldHave(Condition.text("Printed Chiffon Dress"));
        return this;
    }

    @Step("sendFriendButton click")
    public DescPage sendFriendButton(){
        $("#send_friend_button").click();
        return this;
    }

    @Step("validate popup")
    public DescPage validatePopup(){
        $("#send_friend_form").shouldBe(visible);
        return this;
    }
}
