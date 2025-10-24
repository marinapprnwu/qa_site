package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginFormTest {
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    static void beforeAll() {
        open("https://arenarussia.ru");
        $("div.popup-region2").$(byText("ДА")).click();
        $("a.login-lnk").click();
    }

    @Test
    void loginToTheSite() {
        String email = "test@gmail.com";
        String password = "est@gmailcom";
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        $("#idLogForm").$("[value='войти']").click();
//        $("span.popup-in").shouldHave(Condition.text("Неправильный логин/пароль."));
    }

    @Test
    void makeAnOrder() {
        open("https://arenarussia.ru");
        $("div.main-links-wrap").$(byText("оптика")).click();
        $("div.catalog-list-wrap").$(byText("Arena TRACKS MIRROR")).click();
        $("div.color_select_slider").$("[data-id=black-smokesilver-black]").click();
        $("div.buy-block-button").$(byText("Купить")).click();
        $("[value='Купить']").click();
        sleep(6000);
    }
}
