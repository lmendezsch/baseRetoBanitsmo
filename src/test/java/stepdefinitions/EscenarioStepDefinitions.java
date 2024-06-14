package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.IngresarAprenderEsFacil;

import static models.Constantes.ACTOR;
import static models.Constantes.URL;

public class EscenarioStepDefinitions {
    @Given("el usuario tiene acceso al sitio web a automatizar")
    public void elUsuarioTieneAccesoAlSitioWebAAutomatizar() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @When("realiza algún tipo de acción")
    public void realizaAlgunTipoAeAccion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarAprenderEsFacil.onSite()
        );

    }

    @Then("valida resultado del proceso")
    public void validaResultadoDelProceso() {

    }


}
