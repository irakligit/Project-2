package pageObjects;

import com.codeborne.selenide.logevents.SelenideLogger;
import dataObjects.InsertData;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeTest;


public class ScreenshotPage extends InsertData {
    @BeforeTest
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
    }
}
