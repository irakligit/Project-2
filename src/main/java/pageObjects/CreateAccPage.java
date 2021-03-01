package pageObjects;
import dataObjects.InsertData;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;



import static com.codeborne.selenide.Selenide.$x;

public class CreateAccPage {

    @Step("SubmitCreate")
    public void enterEmail() {

        WebElement bla = $x("//*[contains(@name,'email_create')]");
        bla.sendKeys(InsertData.getEmail_2());
        $x("//*[@id=\"SubmitCreate\"]").click();
    }
}
