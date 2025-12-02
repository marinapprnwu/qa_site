package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


public class RegistrationTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @DisplayName("Успешная регистрация на сайте")
    @Test
    void successfulRegistrationOnTheSite() {

        registrationPage.openLoginModal()
                .openRegistrationForm()
                .setRegistrationData()
                .successfulRegistration();

    }
}
