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
                Click.on(ACCESO_RAPIDO_APRENDER_ES_FACIL)

        );
    }
    public static IngresarAprenderEsFacil onSite(){
        return Instrumented.instanceOf(IngresarAprenderEsFacil.class).withProperties();
    }
}
