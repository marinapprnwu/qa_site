package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginButton = $("a.login-lnk"),
            emailInput = $("#idLogForm").$("[name='email']"),
            passwordInput = $("#idLogForm").$("[name='password']"),
            submitButton = $("#idLogForm").$("[value='войти']");


    public void goToLoginPage() {
        loginButton.click();
    }

    public void setEmail(String value) {
        emailInput.setValue(value);
    }

    public void setPassword(String value) {
        passwordInput.setValue(value);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void successfulLogin() {
        $("div.popup-error-msg").shouldBe(visible)
                .$("div.popup-dsk").shouldHave(text("Неправильный логин/пароль."));
    }

}
