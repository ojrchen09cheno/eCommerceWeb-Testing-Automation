package starter.helpers;

import io.cucumber.java.After;
import net.serenitybdd.screenplay.actions.Click;
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
