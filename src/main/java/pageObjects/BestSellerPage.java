package pageObjects;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestSellerPage {
    @Step("best sellers btn")
    public BestSellerPage bestSellersBtn(){
        $(byText("Best Sellers")).scrollIntoView(true);
        $(byText("Best Sellers")).click();
        return this;
    }

    @Step("hover")
    public BestSellerPage hover(){
        SelenideElement element = $x("//*[@id=\"blockbestsellers\"]/li[1]/div/div[1]/div/a[1]/img");
        actions().moveToElement(element).perform();
        return this;
    }
    @Step("click more btn")
    public BestSellerPage clickMoreBtn(){
        $(byLinkText("More")).click();
        return this;
    }

}
