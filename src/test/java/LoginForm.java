import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginForm {

    @Test
    void shouldLoginToTheSite() {
        open("https://arenarussia.ru");
        $("div.popup-region2").$(byText("ДА")).click();
        $("a.login-lnk").click();
        $("#idLogForm").$("[name='email']").setValue("test@gmail.com");
        $("#idLogForm").$("[name='password']").setValue("test@gmailcom");
        $("#idLogForm").$("[value='войти']").click();

        sleep(6000);
    }
}
