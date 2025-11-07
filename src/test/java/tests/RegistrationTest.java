package tests;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


public class RegistrationTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulRegistrationOnTheSite() {

        registrationPage.openLoginModal()
                .openRegistrationForm()
                .setRegistrationData()
                .successfulRegistration();

    }
}


//