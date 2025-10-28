package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.OrderPage;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MakeAnOrderTest {

    OrderPage orderPage = new OrderPage();

    @BeforeAll
    static void beforeAll() {
        open("https://arenarussia.ru");
        $("div.popup-region2").$(byText("ДА")).click();
    }

    @Test
    void successfulMakeAnOrder() {
        orderPage.goToTheOpticsCatalog()
                .goToTheProductProfile()
                .choiceOfColor()
                .goToCheckout()
                .orderConfirmedSuccessfully();
//        sleep(6000);
    }
}
