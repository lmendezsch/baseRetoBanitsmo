package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ValidarPDF;
import tasks.IngresarASubmoduloFactaCRS;
import tasks.IngresarASubmoduloLegales;
import tasks.IngresarAprenderEsFacil;

import static models.Constantes.ACTOR;
import static models.Constantes.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static userinterfaces.BanitsmoPortal.PDF_ASOCIADO;

public class EscenarioStepDefinitions {
    @Given("el usuario ingresa al sitio web de Banistmo")
    public void elUsuarioTieneAccesoAlSitioWebAAutomatizar() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @When("ingresa desde el submodulo de acceso directo aprender es fácil hasta el modulo  FATCA & CRS")
    public void realizaAlgunTipoAeAccion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarAprenderEsFacil.onSite(),
                IngresarASubmoduloLegales.onSite(),
                IngresarASubmoduloFactaCRS.onSite()
        );

    }

    @Then("valida el pdf seleccionado")
    public void validarPdfSeleccionado() {
        OnStage.theActor(ACTOR).should(seeThat(ValidarPDF.onSite(PDF_ASOCIADO)));
    }


}
