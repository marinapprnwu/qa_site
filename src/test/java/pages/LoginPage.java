package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement emailInput = $("#idLogForm").$("[name='email']"),
            passwordInput = $("#idLogForm").$("[name='password']"),
            loginButton = $("#idLogForm").$("[value='войти']");

    public void setEmail(String value) {
        emailInput.setValue(value);
    }

    public void setPassword(String value) {
        passwordInput.setValue(value);
    }

}
