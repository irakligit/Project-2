import com.codeborne.selenide.Configuration;
import dataObjects.InsertData;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;
import java.sql.SQLException;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class MainClass extends InsertData {

    @BeforeTest
    public void setup() {
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


    @Test(priority = 1)
    public void user_registration() throws SQLException, InterruptedException {
        open("http://automationpractice.com/index.php");
        signUpPage.signUp();
        createAccPage.enterEmail();
       registrationPage
                .gender().sql_data().dropdowns().submitAcc();
       closeWebDriver();

    }


    @Test(priority = 2,dataProvider = "dataMethod")
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

    @Test(priority = 3,dependsOnMethods = "user_registration")
    public void thirdTest() throws InterruptedException, SQLException {
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
        Thread.sleep(5000);

    }
}
