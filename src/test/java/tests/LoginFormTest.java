package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginFormTest {
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    static void beforeAll() {
        open("https://arenarussia.ru");
        $("div.popup-region2").$(byText("ДА")).click();
    }

    @Test
    void loginToTheSite() {
        String email = "test@gmail.com";
        String password = "est@gmailcom";

        loginPage.goToLoginPage();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickSubmitButton();
        loginPage.successfulLogin();
    }
}
