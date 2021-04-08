package pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class EveningDress {

    //es metodi shevkmeni imitom rom retrys dros xels mishlida roca daloginebuli rcheboda
    @Step("click sign out")
    public EveningDress logoutBtn(){
        SelenideElement logout = $(".logout");
        if (logout.exists()){
            logout.click();
        }
        return this;
    }


    @Step("click eveningDress")
    public EveningDress clickDress() {
         WebElement evening_dress = $("ul.submenu-container a[title='Evening Dresses']");
         executeJavaScript("arguments[0].click();",evening_dress );
         return this;
    }

}
