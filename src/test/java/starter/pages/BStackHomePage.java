package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://bstackdemo.com")
public class BStackHomePage extends PageObject {

    public static final Target SIGNGINBUTTON = Target.the("Sign in button").locatedBy("#signin");
    public static final Target USERNAMETEXT = Target.the("username text").locatedBy(".flex flex-1 justify-end align-center space-x-8");
    public static final Target SHELFITEMTHUMBNAIL = Target.the("shelf item thumbnail").locatedBy("//*[@id='8']/div[2]/img");
    // #__next > div > div > main > div.shelf-container > div.shelf-container-header > small > span
    // //*[@id="__next"]/div/div/main/div[2]/div[1]/small/span
}
