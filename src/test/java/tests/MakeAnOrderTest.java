package tests;

import org.junit.jupiter.api.Test;
import pages.OrderPage;

public class MakeAnOrderTest extends TestBase {

    OrderPage orderPage = new OrderPage();

    @Test
    void successfulMakeAnOrder() {
        orderPage.goToTheOpticsCatalog()
                .goToTheProductProfile()
                .choiceOfColor()
                .goToCheckout()
                .orderConfirmedSuccessfully();
    }
}
