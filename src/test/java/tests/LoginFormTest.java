package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginFormTest extends TestBase {
    LoginPage loginPage = new LoginPage();


    @Test
    void loginToTheSite() {
        String email = "test@gmail.com";
        String password = "est@gmailcom";

        loginPage.goToLoginPage()
                .setEmail(email)
                .setPassword(password)
                .clickSubmitButton()
                .successfulLogin();
    }
}
