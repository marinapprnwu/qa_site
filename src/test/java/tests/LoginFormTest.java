package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import static tests.TestData.*;

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

    @Test
    void successfulLoginToTheSite() {

        loginPage.setEmail(emailLogin)
                .setPassword(password)
                .clickSubmitButton()
                .successfulLogin();

    }

    @Test
    void unsuccessfulLoginToTheSite() {

        loginPage.setEmail(email)
                .setPassword(password)
                .clickSubmitButton()
                .unccessfulLogin();
    }
}
