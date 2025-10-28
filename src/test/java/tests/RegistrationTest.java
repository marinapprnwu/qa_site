package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import net.datafaker.Faker;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {

    Faker faker = new Faker();

    String email = "1";
    String password = "2";
    String lastName = "3";
    String firstName = "4";
    String birthDay = "07.07.2007";
    String phoneNumber = "9999999999";
    String othCity = "Йошкар-Ола";


    @BeforeAll
    static void beforeAll() {
        open("https://arenarussia.ru");
        $("div.popup-region2").$(byText("ДА")).click();
    }

    @Test
    void successfulRegistrationOnTheSite() {
        $("a.login-lnk").click();
        $("div.links").$("a.orange").click();
        $("#frmPersData").$("[name='email']").setValue(email);
        $("#frmPersData").$("[name='password']").setValue(password);
        $("#frmPersData").$("[name='lastname']").setValue(lastName);
        $("#frmPersData").$("[name='firstname']").setValue(firstName);
        $("#frmPersData").$("[name='firstname']").setValue(firstName);

//        $("#frmPersData").$("[name='birthday']").click();

        $("#frmPersData").$("[name='birthday']").setValue(birthDay).pressEnter();
        $("div.radios").$("#sex2").click();
        $("#frmPersData").$("[name='phone']").setValue(phoneNumber);
        $("div.select").click();
        $("ul.ui-selectgroup-list").$(byText("Другой город...")).click();
        $("#frmPersData").$("[name='othcity']").setValue(othCity);
        $("#frmPersData").$("[type='submit']").click();
        sleep(6000);
    }
}
