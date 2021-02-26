package pageObjects;
import dataObjects.InsertData;
import java.sql.SQLException;
import static com.codeborne.selenide.Selenide.$;
public class RegistrationPage {

    public RegistrationPage gender(){ $("#id_gender1").click();
    return this;}

    public RegistrationPage dropdowns(){
        $("#days").selectOptionByValue("12");
        $("#months").selectOptionByValue("5");
        $("#years").selectOptionByValue("2001");
        return this;
    }

    public RegistrationPage submitAcc(){
        $("#other").scrollIntoView(true);
        $("#submitAccount").click();
        return this;
    }


    public RegistrationPage sql_data() throws SQLException {

        $("[id = 'customer_firstname']").sendKeys(InsertData.getFirstName_2());
        $("#customer_lastname").sendKeys(InsertData.getLastname_2());
        $("#passwd").sendKeys(InsertData.getPassword_2());
        $(InsertData.getState_2()).selectOptionByValue("3");
        $("#address1").sendKeys(InsertData.getAddress_2());
        $("#phone").sendKeys(InsertData.getPhone_2());
        $("#city").sendKeys(InsertData.getCity_2());
        $("#postcode").sendKeys(InsertData.getZip_2());
        return this;
    }

}
