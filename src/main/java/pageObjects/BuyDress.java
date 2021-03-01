package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class BuyDress {
    @Step("hover image")
    public BuyDress hover(){
        WebElement hoverImage = $x("//*[@src=\"http://automationpractice.com/img/p/1/0/10-home_default.jpg\"]");
        actions().moveToElement(hoverImage).perform();
        return this;
    }
    @Step("click add btn")
    public BuyDress clickAddBtn(){
        $(".ajax_add_to_cart_button").click();
        return this;
    }
}
