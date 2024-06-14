package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.BanitsmoPortal.BTN_ACEPTAR_COOKIES;
import static userinterfaces.BanitsmoPortal.MODAL_COOKIES;

public class ValidarModalCookies implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(MODAL_COOKIES, isVisible()).forNoMoreThan(30).seconds();
        if (MODAL_COOKIES.isVisibleFor(actor)) {
            actor.attemptsTo(
                    Click.on(BTN_ACEPTAR_COOKIES)
            );
        } else {
            System.out.println("Modal no está presente en la página");
        }

    }

    public static ValidarModalCookies onSite(){
        return Instrumented.instanceOf(ValidarModalCookies.class).withProperties();
    }
}
