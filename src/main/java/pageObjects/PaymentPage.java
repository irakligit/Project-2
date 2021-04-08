package pageObjects;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class PaymentPage {
    @Step("click bankWireBtn")
    public void bankWireBtn(){
        $(".bankwire").click();
    }
}
