package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageSignedIn extends PageObject{

    public static final Target USERNAMETEXT = Target.the("username text").locatedBy(".username");

}
