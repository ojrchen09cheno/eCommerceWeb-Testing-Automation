package starter.helpers;

import io.cucumber.java.After;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.devtools.v85.browser.Browser;
import starter.pages.BStackHomePage;

//public class Hooks {
//    @After
//    public void afterScenario(Actor actor){
//        actor.attemptsTo(Browser.close());
//    }
//
//    public static Performable closeTheBrowser() {
//        return Task.where("{0} closes the crowser",
//                ,
//                Open.browserOn().the(BStackHomePage.class));
//    }
//}
