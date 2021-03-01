package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class EveningDress {

    //es metodi shevkmeni imitom rom retrys dros xels mishlida roca daloginebuli rcheboda
    public EveningDress logoutBtn(){
        SelenideElement logout = $(".logout");
        if (logout.exists()){
            logout.click();
        }
        return this;
    }


    public EveningDress clickDress() {
         WebElement evening_dress = $("ul.submenu-container a[title='Evening Dresses']");
         executeJavaScript("arguments[0].click();",evening_dress );
         return this;
    }

}
