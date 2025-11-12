package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class GenderComponent {
    public void chooseGender(String gender) {
        $("div.radios").$("#"+gender).click();
    }
}
