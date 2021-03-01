package pageObjects;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {
    @Step("click sign up")
    public void signUp(){
        $(".login").click();
    }
}
