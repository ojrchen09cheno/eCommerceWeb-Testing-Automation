package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import starter.pages.LoginPage;

public class Login {
    public static Performable with(String username, String password){
        return Task.where("{0} logs in the page with username " + username + " and password " + password,
                SendKeys.of(username).into(LoginPage.USERNAMEFIELDINPUT).thenHit(Keys.TAB).thenHit(Keys.TAB),
                SendKeys.of(password).into(LoginPage.PASSWORDFIELDINPUT).thenHit(Keys.ENTER).thenHit(Keys.ENTER)
        );
    }

}
