package pageObjects;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AddToCartPage {

    public AddToCartPage icon_plus(){
        $(".icon-plus").scrollIntoView(true);
        $(".icon-plus").click();
        return this;
    }
    public AddToCartPage size_M(){
        $("#group_1").selectOptionByValue("2");
        return this;
    }
    public AddToCartPage addToCartBtn(){
        $x("//*[@id=\"add_to_cart\"]//span[text() = 'Add to cart']").click();
        return this;
    }

}
