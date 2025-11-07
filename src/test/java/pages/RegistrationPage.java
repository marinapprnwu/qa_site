package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static tests.TestData.*;

public class RegistrationPage {
    private final SelenideElement loginButton = $("a.login-lnk"),
            registrationButton = $("div.links").$("a.orange"),
            emailInput = $("#frmPersData").$("[name='email']"),
            passwordInput = $("#frmPersData").$("[name='password']"),
            lastNameInput = $("#frmPersData").$("[name='lastname']"),
            firstNameInput = $("#frmPersData").$("[name='firstname']"),
            birthdayInput = $("#frmPersData").$("[name='birthday']"),
            genderRadioButton = $("div.radios").$("#sex2"),
            phoneNumberInput = $("#frmPersData").$("[name='phone']"),
            citySelect = $("div.select"),
            cityGroupList = $("ul.ui-selectgroup-list").$(byText("Другой город...")),
            othCityInput = $("#frmPersData").$("[name='othcity']"),
            submitButton = $("#frmPersData").$("[type='submit']"),
            msgReg = $("div.error-msg2");


    public RegistrationPage openLoginModal() {
        loginButton.click();
        return this;
    }

    public RegistrationPage openRegistrationForm() {
        registrationButton.click();
        return this;
    }


    public RegistrationPage setRegistrationData() {
        emailInput.setValue(email);
        passwordInput.setValue(password);
        firstNameInput.setValue(firstName);
        lastNameInput.setValue(lastName);
        birthdayInput.setValue(birthDay);
        genderRadioButton.click();
        phoneNumberInput.setValue(phoneNumber);
        citySelect.click();
        cityGroupList.click();
        othCityInput.setValue(othCity);

        submitButton.click();
        return this;
    }

    public void successfulRegistration() {
        msgReg.shouldBe(visible).shouldHave(text("Проверка капчи не пройдена!"));

    }

}
