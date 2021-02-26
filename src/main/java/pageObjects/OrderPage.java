package pageObjects;
import static com.codeborne.selenide.Selenide.$x;

public class OrderPage {
    public void orderBtn(){
        $x("//*[@id=\"cart_navigation\"]/button").scrollIntoView(true);
        $x("//*[@id=\"cart_navigation\"]/button").click();
    }
}
