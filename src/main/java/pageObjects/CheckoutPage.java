package pageObjects;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage {
    @Step("click checkout btn")
    public CheckoutPage checkoutBtn() {
        $("[title = 'Proceed to checkout']").click();
        return this;
    }

    @Step("secondCheckoutBtn")
    public CheckoutPage secondCheckoutBtn() {
        $x("//*[@href=\"http://automationpractice.com/index.php?controller=order&step=1\"]")
                .scrollIntoView(true);
        $x("//*[@href=\"http://automationpractice.com/index.php?controller=order&step=1\"]").click();
        return this;
    }
    @Step("thirdCheckoutBtn")
    public CheckoutPage thirdCheckoutBtn(){
        $("[name = 'processAddress']").scrollIntoView(true);
        $("[name = 'processAddress']").click();
        return this;
    }
    @Step("fourthCheckoutBtn")
    public CheckoutPage fourthCheckoutBtn(){
        $("#uniform-cgv").click();
        $("[name = 'processCarrier']").scrollIntoView(true);
        $("[name = 'processCarrier']").click();
        return this;
    }
}

