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

public class IngresarASubmoduloFactaCRS implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SECCION_FACTA_CRS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(SECCION_FACTA_CRS),

                WaitUntil.the(DOCUMENTO_PDF, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DOCUMENTO_PDF),

                Wait.forTime(10),
                Switch.toTheOtherWindow(),
                Wait.forTime(10)
        );
    }
    public static IngresarASubmoduloFactaCRS onSite(){
        return Instrumented.instanceOf(IngresarASubmoduloFactaCRS.class).withProperties();
    }
}
