package pageObjects;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class DescPage {
    public DescPage validateName(){
        $("[itemprop = 'name']").shouldHave(Condition.text("Printed Chiffon Dress"));
        return this;
    }
    public DescPage sendFriendButton(){
        $("#send_friend_button").click();
        return this;
    }
    public DescPage validatePopup(){
        $("#send_friend_form").shouldBe(visible);
        return this;
    }
}
