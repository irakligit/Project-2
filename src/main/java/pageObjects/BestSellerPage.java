package pageObjects;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestSellerPage {
    public BestSellerPage bestSellersBtn(){
        $(byText("Best Sellers")).scrollIntoView(true);
        $(byText("Best Sellers")).click();
        return this;
    }

    public BestSellerPage hover(){
        SelenideElement element = $x("//*[@id=\"blockbestsellers\"]/li[1]/div/div[1]/div/a[1]/img");
        actions().moveToElement(element).perform();
        return this;
    }
    public BestSellerPage clickMoreBtn(){
        $(byLinkText("More")).click();
        return this;
    }

}
