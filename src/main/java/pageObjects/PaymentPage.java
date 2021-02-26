package pageObjects;

import static com.codeborne.selenide.Selenide.$;

public class PaymentPage {
    public void bankWireBtn(){
        $(".bankwire").click();
    }
}
