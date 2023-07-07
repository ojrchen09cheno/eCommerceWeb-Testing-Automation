package starter.helpers;

import io.cucumber.java.After;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.webdriver.CloseBrowser;
import org.openqa.selenium.devtools.v85.browser.Browser;
import starter.pages.BStackHomePage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hooks {

    // Logout of account since driver is not restarting browser after each scenario
    @After(value="@logout")
    public void afterScenario(){
        if(BStackHomePage.LOGOUTBUTTON.isVisibleFor(theActorInTheSpotlight()))
        theActorInTheSpotlight().attemptsTo(Click.on(BStackHomePage.LOGOUTBUTTON));
    }
}
