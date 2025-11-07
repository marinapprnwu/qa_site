package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement loginButton = $("a.login-lnk"),
            emailInput = $("#idLogForm").$("[name='email']"),
            passwordInput = $("#idLogForm").$("[name='password']"),
            submitButton = $("#idLogForm").$("[value='войти']"),
            msgPopup = $("div.popup-error-msg").$("div.popup-dsk"),
            closeButton = $("div.popup-error-msg").$("div.popup-close");


    public void goToLoginPage() {
        loginButton.click();
    }

    public LoginPage setEmail(String value) {
        emailInput.clear();
        emailInput.setValue(value);
        return this;
    }

    public LoginPage setPassword(String value) {
        passwordInput.clear();
        passwordInput.setValue(value);
        return this;
    }

    public LoginPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public void successfulLogin() {
        msgPopup.shouldBe(visible).shouldHave(text("Неправильный логин/пароль."));
    }

    public void unccessfulLogin() {
        msgPopup.shouldBe(visible).shouldHave(text("Неправильно заполнено поле Эл.почта/телефон."));
    }

    public void closeModal() {
        closeButton.click();
    }

}
