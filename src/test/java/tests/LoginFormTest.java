package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import pages.LoginPage;


public class LoginFormTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @BeforeEach
    void beforeEach() {
        loginPage.goToLoginPage();
    }

    @AfterEach
    void afterEach() {
        loginPage.closeModal();
    }

    @DisplayName("Успешная авторизация на сайте с email = {0}, password = {1}")
    @ParameterizedTest()
    @CsvFileSource(resources = "/testdata/successfulLoginToTheSite.csv")
    void successfulLoginToTheSite(String email, String password) {

        loginPage.setEmail(email)
                .setPassword(password)
                .clickSubmitButton()
                .successfulLogin();

    }

    @DisplayName("Неуспешная авторизация на сайте: email = {0}, password = {1}")
    @ParameterizedTest()
    @CsvSource({
            ".@gmail.com, 1234",
            "test@.com, 12345"
    })
    void unsuccessfulLoginToTheSite(String email, String password) {

        loginPage.setEmail(email)
                .setPassword(password)
                .clickSubmitButton()
                .unccessfulLogin();
    }
}
