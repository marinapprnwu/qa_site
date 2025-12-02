package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class RadioButtonComponent {
    public void chooseItem(String item) {
        $("div.radios").$("#"+item).click();
    }
}
