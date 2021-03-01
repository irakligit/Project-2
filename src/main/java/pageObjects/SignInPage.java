package pageObjects;
import dataObjects.InsertData;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.$;

public class SignInPage   {

    @Step("sendKeys email")
    public SignInPage friendEmail()  {
        $("#email").sendKeys(InsertData.getEmail_2());
        return this;
    }

    @Step("sendKeys Name")
    public SignInPage friendName(){
        $("#passwd").sendKeys(InsertData.getPassword_2());
        return this;
    }
    @Step("click signIn btn")
    public SignInPage clickSignIn(){
        $("#SubmitLogin").click();
        return this;
    }
}
