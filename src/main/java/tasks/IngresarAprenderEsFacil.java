package tasks;

import interactions.ValidarModalCookies;
import interactions.Wait;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.BanitsmoPortal.*;

public class IngresarAprenderEsFacil implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ValidarModalCookies.onSite(),
                WaitUntil.the(ACCESO_RAPIDO_APRENDER_ES_FACIL, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ACCESO_RAPIDO_APRENDER_ES_FACIL),

                WaitUntil.the(SECCION_LEGALES, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(SECCION_LEGALES),

                WaitUntil.the(SECCION_FACTA_CRS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(SECCION_FACTA_CRS),

                WaitUntil.the(DOCUMENTO_PDF, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DOCUMENTO_PDF),

                Wait.forTime(10),
                Switch.toTheOtherWindow(),
                Wait.forTime(10)
        );
    }
    public static IngresarAprenderEsFacil onSite(){
        return Instrumented.instanceOf(IngresarAprenderEsFacil.class).withProperties();
    }
}
