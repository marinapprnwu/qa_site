package tests;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    static final String siteUrl = "https://arenarussia.ru";
    static SelenideElement regionPopup = $("div.popup-region2").$(byText("ДА"));

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open(siteUrl);
//       ToDo вынести селектр в отдельный класс
        regionPopup.click();
    }
}
