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
            msgPopup = $("div.popup-error-msg").$("div.popup-dsk");


    public LoginPage goToLoginPage() {
        loginButton.click();
        return this;
    }

    public LoginPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public LoginPage setPassword(String value) {
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

}
