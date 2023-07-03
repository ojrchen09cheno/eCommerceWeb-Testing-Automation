package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
    public static final Target USERNAMEFIELD = Target.the("username field").locatedBy("#username");
    public static final Target USERNAMEFIELDINPUT = Target.the("username field").locatedBy("#react-select-2-input");

    public static final Target PASSWORDFIELD = Target.the("password field").locatedBy("#password");
    public static final Target PASSWORDFIELDINPUT = Target.the("username field").locatedBy("#react-select-3-input");
    public static final Target INVALIDLOGIN = Target.the("invalid log in message").locatedBy(".api-error");

}
