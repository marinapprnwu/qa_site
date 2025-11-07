package tests;

import net.datafaker.Faker;
import java.util.Locale;

public class TestData {
    static Faker faker = new Faker(new Locale("ru"));

    public static String email = faker.internet().emailAddress();
    public static String password = faker.credentials().password(true);
    public static String lastName = faker.name().lastName();
    public static String firstName = faker.name().firstName();
    public static String birthDay = "07.07.2007";
    public static String phoneNumber = faker.phoneNumber().phoneNumberInternational();
    public static String othCity = "Йошкар-Ола";

    public static String emailLogin = "test123@gmail.com";
}
