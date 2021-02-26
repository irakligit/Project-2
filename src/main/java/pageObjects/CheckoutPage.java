package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage {
    public CheckoutPage checkoutBtn() {
        $("[title = 'Proceed to checkout']").click();
        return this;
    }

    public CheckoutPage secondCheckoutBtn() {
        $x("//*[@href=\"http://automationpractice.com/index.php?controller=order&step=1\"]")
                .scrollIntoView(true);
        $x("//*[@href=\"http://automationpractice.com/index.php?controller=order&step=1\"]").click();
        return this;
    }
    public CheckoutPage thirdCheckoutBtn(){
        $("[name = 'processAddress']").scrollIntoView(true);
        $("[name = 'processAddress']").click();
        return this;
    }
    public CheckoutPage fourthCheckoutBtn(){
        $("#uniform-cgv").click();
        $("[name = 'processCarrier']").scrollIntoView(true);
        $("[name = 'processCarrier']").click();
        return this;
    }
}

