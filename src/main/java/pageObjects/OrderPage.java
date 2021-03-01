package pageObjects;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class OrderPage {
    @Step("click orderBtn")
    public void orderBtn(){
        $x("//*[@id=\"cart_navigation\"]/button").scrollIntoView(true);
        $x("//*[@id=\"cart_navigation\"]/button").click();
    }
}
