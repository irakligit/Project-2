package pageObjects;



import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class SupportPage {
    @Step("click supportLink")
    public SupportPage clickLink(){
        $x("//*[@id=\"center_column\"]//*[@href=\"http://automationpractice.com/index.php?controller=contact\"]")
                .click();
        return this;
    }
    @Step("select order")
    public SupportPage dropdowns() {
        $("#id_contact").selectOptionByValue("2");
        $("[name = 'id_order']").selectOption(1);
        return this;
    }
    @Step("enter text textarea")
    public SupportPage text_area(){
        $("#message").sendKeys("finish");
        return this;
    }
    @Step("upload file")
    public SupportPage file_upload(){
       WebElement addFile =  $("#fileUpload");
        File file = new File((System.getProperty("user.dir") + "/src/files/1.png"));
        String picturePath = file.getAbsolutePath();
        addFile.sendKeys(picturePath);
        return this;
    }
    @Step("click submit")
    public SupportPage submitBtn(){
        $("#submitMessage").click();
        return this;
    }
}
