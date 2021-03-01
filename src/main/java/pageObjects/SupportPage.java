package pageObjects;



import org.openqa.selenium.WebElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class SupportPage {
    public SupportPage clickLink(){
        $x("//*[@id=\"center_column\"]//*[@href=\"http://automationpractice.com/index.php?controller=contact\"]")
                .click();
        return this;
    }
    public SupportPage dropdowns() throws InterruptedException {
        $("#id_contact").selectOptionByValue("2");
        $("[name = 'id_order']").selectOption(1);
        return this;
    }
    public SupportPage text_area(){
        $("#message").sendKeys("finish");
        return this;
    }
    public SupportPage file_upload(){
       WebElement addFile =  $("#fileUpload");
        File file = new File((System.getProperty("user.dir") + "/src/files/1.png"));
        String picturePath = file.getAbsolutePath();
        addFile.sendKeys(picturePath);
        return this;
    }
    public SupportPage submitBtn(){
        $("#submitMessage").click();
        return this;
    }
}
