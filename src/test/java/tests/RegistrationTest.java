package tests;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import static tests.TestData.*;


public class RegistrationTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulRegistrationOnTheSite() {

        registrationPage.openLoginModal()
                .openRegistrationForm()
                .setRegistrationData(email, password, firstName, lastName, birthDay, phoneNumber, othCity)
                .successfulRegistration();

    }
}
