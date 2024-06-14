package tasks;

import interactions.Wait;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.BanitsmoPortal.*;
import static userinterfaces.BanitsmoPortal.SECCION_LEGALES;

public class IngresarASubmoduloLegales implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SECCION_LEGALES, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(SECCION_LEGALES)
        );
    }
    public static IngresarASubmoduloLegales onSite(){
        return Instrumented.instanceOf(IngresarASubmoduloLegales.class).withProperties();
    }
}
