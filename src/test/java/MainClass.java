import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.TextReport;
import dataObjects.InsertData;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;
import pageObjects.retryAnalizer.RetryAnalyzerPage;
import pageObjects.retryAnalizer.RetryCountIfFailed;
import java.sql.SQLException;
import static com.codeborne.selenide.Selenide.*;

@Epic("project_2")
@Feature("United Test")
@Listeners({ TextReport.class})

public class MainClass extends InsertData {

    @BeforeTest(alwaysRun = true)
    public void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
        Configuration.timeout = 5000;
        Configuration.startMaximized = true;
    }

    SignUpPage signUpPage = new SignUpPage();
    CreateAccPage createAccPage = new CreateAccPage();
    RegistrationPage registrationPage = new RegistrationPage();
    BestSellerPage bestSellerPage = new BestSellerPage();
    DescPage descPage = new DescPage();
    AddToCartPage addToCartPage = new AddToCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    SignInPage signInPage = new SignInPage();
    OrderPage orderPage = new OrderPage();
    PaymentPage paymentPage = new PaymentPage();
    PopupPage popupPage = new PopupPage();
    BuyDress buyDress = new BuyDress();
    SupportPage supportPage = new SupportPage();
    EveningDress eveningDress = new EveningDress();


    @Story("The third and fourth tests depend on it")
    @Description("create account")
    @Flaky
    @Test(testName = "user_registration",
            groups= {"Resgression1","Resgression2"},priority = 1,alwaysRun = true,
            description = "main registration test")
    public void first_method() throws SQLException {
        open("http://automationpractice.com/index.php");
        signUpPage.signUp();
        createAccPage.enterEmail();
       registrationPage
                .gender().sql_data().dropdowns().submitAcc();
       closeWebDriver();

    }

    @Story("Does not depend on any test")
    @Description("Buy a dress that has a discount")
    @Test(testName = "second test",groups= {"Resgression1"},priority = 2,dataProvider = "dataMethod",alwaysRun = true,
            description = "Buy a dress that has a discount")
    public void secondTest(String name,String email){
        open("http://automationpractice.com/index.php");
        bestSellerPage.bestSellersBtn()
                .hover()
                .clickMoreBtn();
        descPage.validateName()
                .sendFriendButton()
                .validatePopup();
        popupPage.name(name)
                .email(email)
                .clickSendBtn()
                .waitWindow();
        closeWebDriver();


    }

    @Story("Depending on the first test")
    @Description("Buy a dress that has a discount")
    @Test(testName = "third test",groups= {"Resgression2"},priority = 3,dependsOnMethods = "first_method",alwaysRun = true,
    description = "sign in and buy a dress")
    public void thirdTest(){
        open("http://automationpractice.com/index.php");
        bestSellerPage.bestSellersBtn()
                .hover()
                .clickMoreBtn();
        descPage.validateName();
        addToCartPage.icon_plus()
                .size_M()
                .addToCartBtn();
        checkoutPage.checkoutBtn().
                secondCheckoutBtn();
        signInPage.friendEmail()
                .friendName()
                .clickSignIn();
        checkoutPage.thirdCheckoutBtn()
                .fourthCheckoutBtn();
        paymentPage.bankWireBtn();
        orderPage.orderBtn();

        closeWebDriver();


    }


    @Story("Depending on the first test")
    @Description("last test")
    @RetryCountIfFailed(3)
    @Test(testName = "fourth test",priority = 4,dependsOnMethods = "first_method",retryAnalyzer= RetryAnalyzerPage.class,
            groups= {"Resgression2"},alwaysRun = true,description = "Buy an evening dress")
    public void fourthTest(){
        open("http://automationpractice.com/index.php");
        eveningDress.logoutBtn()
                .clickDress();
        buyDress.hover()
                .clickAddBtn();
        checkoutPage.checkoutBtn()
                .secondCheckoutBtn();
        signInPage.friendName()
                .friendEmail()
                .clickSignIn();
        checkoutPage.thirdCheckoutBtn()
                .fourthCheckoutBtn();
        paymentPage.bankWireBtn();
        orderPage.orderBtn();
        supportPage.clickLink()
                .dropdowns()
                .text_area()
                .file_upload()
                .submitBtn();
    }
}
