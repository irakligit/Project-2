package pageObjects;
import dataObjects.InsertData;
import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage   {
    public SignInPage friendEmail() throws SQLException {


        $("#email").sendKeys(InsertData.getEmail_2());
        return this;
    }
    public SignInPage friendName(){

        $("#passwd").sendKeys(InsertData.getPassword_2());
        return this;
    }
    public SignInPage clickSignIn(){
        $("#SubmitLogin").click();
        return this;
    }
}
