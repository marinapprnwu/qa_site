package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import net.datafaker.Faker;
import pages.RegistrationPage;

import java.util.Locale;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {

    Faker faker = new Faker(new Locale("ru"));

    String email = faker.internet().emailAddress();
    String password = "12345";
//  String pass = faker.internet().password(12);
    String lastName = faker.name().lastName();
    String firstName = faker.name().firstName();
    String birthDay = "07.07.2007";
    String phoneNumber = faker.phoneNumber().phoneNumberInternational();
    String othCity = "Йошкар-Ола";

    RegistrationPage registrationPage = new RegistrationPage();


    @BeforeAll
    static void beforeAll() {
        open("https://arenarussia.ru");
        $("div.popup-region2").$(byText("ДА")).click();
    }

    @Test
    void successfulRegistrationOnTheSite() {

        registrationPage.openLoginModal()
                        .openRegistrationForm()
                                .setRegistrationData(email, password, firstName, lastName, birthDay, phoneNumber, othCity)
                                        .successfulRegistration();

        sleep(6000);
    }
}
