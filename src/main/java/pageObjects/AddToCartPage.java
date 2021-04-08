package pageObjects;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AddToCartPage {

    @Step("icon-plus Btn")
    public AddToCartPage icon_plus(){
        $(".icon-plus").scrollIntoView(true);
        $(".icon-plus").click();
        return this;
    }
    @Step("size dropdown")
    public AddToCartPage size_M(){
        $("#group_1").selectOptionByValue("2");
        return this;
    }
    @Step("add to cart Btn")
    public AddToCartPage addToCartBtn(){
        $x("//*[@id=\"add_to_cart\"]//span[text() = 'Add to cart']").click();
        return this;
    }

}
