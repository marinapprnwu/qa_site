package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class OrderPage {
    private final SelenideElement opticsCatalogButton = $("div.main-links-wrap").$(byText("оптика")),
            productProfileButton = $("div.catalog-list-wrap").$(byText("Arena TRACKS MIRROR")),
            colorSelectionButton = $("div.color_select_slider").$("[data-id=black-smokesilver-black]"),
            buyButton = $("div.buy-block-button").$(byText("Купить")),
            buyButtonModal = $("[value='Купить']"),
            textRegPopup = $("div.reg-popup-text");

    public OrderPage goToTheOpticsCatalog() {
        opticsCatalogButton.click();
        return this;
    }

    public OrderPage goToTheProductProfile() {
        productProfileButton.click();
        return this;
    }

    public OrderPage choiceOfColor() {
        colorSelectionButton.click();
        return this;
    }

    public OrderPage goToCheckout() {
        buyButton.click();
        buyButtonModal.click();

        return this;
    }

    public void orderConfirmedSuccessfully() {
        textRegPopup.shouldHave(text("При регистрации на сайте у вас появится"));
    }

}
