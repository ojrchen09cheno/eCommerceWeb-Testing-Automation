package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.pages.BStackHomePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class NavigateTo {
    public static Performable theBrowserStackHomePage() {
        return Task.where("{0} opens the Wikipedia home page",
                Open.browserOn().the(BStackHomePage.class));
    }

    public static Performable theLoginPage() {
        return Task.where("{0} clicks on Sign in",
                // SHELFITEM is more reliable as an indicator of page loaded properly
                WaitUntil.the(BStackHomePage.SHELFITEMTHUMBNAIL, isVisible()),
                Click.on(BStackHomePage.SIGNGINBUTTON)
                );
    }
}
