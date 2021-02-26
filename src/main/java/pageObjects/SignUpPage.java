package pageObjects;
import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {
    public void signUp(){
        $(".login").click();
    }
}
