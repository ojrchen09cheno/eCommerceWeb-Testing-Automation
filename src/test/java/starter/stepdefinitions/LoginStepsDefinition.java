package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.jetbrains.annotations.NotNull;
import starter.login.Login;
import starter.navigation.NavigateTo;
import starter.pages.BStackHomePage;
import starter.pages.HomePageSignedIn;
import starter.pages.LoginPage;

public class LoginStepsDefinition {

    //Navigation to homepage and sign in page
    @Given("{actor} is in BStacks homepage")
    public void actorIsInBStacksHomepage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theBrowserStackHomePage());
    }

    @When("{actor} goes to the sign in page")
    public void heGoesToTheSignInPage(Actor actor) {
        actor.attemptsTo(NavigateTo.theLoginPage());
    }

    // Valid login steps
    @And("{actor} goes to sign in with his credentials username {string} and password {string}")
    public void heGoesToSignInWithHisCredentials(Actor actor, String username, String password) {
        actor.attemptsTo(Login.with(username, password));
    }

    @Then("{actor} should successfully log in to {string}")
    public void heShouldSuccessfullyLogInToHisAccount(Actor actor, String account) {
        actor.attemptsTo(Ensure.that(HomePageSignedIn.USERNAMETEXT).hasText(account));
    }

    // Invalid login steps
    @And("{actor} goes to sign in with wrong credentials username {string} and password {string}")
    public void heGoesToSignInWithWrongCredentials(Actor actor, String username, String password) {
        actor.attemptsTo(Login.with(username, password));
    }
    @Then("{actor} should see an invalid credentials error")
    public void heShouldSeeAnInvalidCredentialsError(Actor actor) {
        actor.attemptsTo(Ensure.that(LoginPage.INVALIDLOGIN).isDisplayed());
    }




}
