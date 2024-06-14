package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarPDF implements Question<Boolean> {

    protected Target pdfTitle;

    public ValidarPDF(Target pdfTitle) {
        this.pdfTitle = pdfTitle;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return pdfTitle.resolveFor(actor).isDisplayed();
    }

    public static Question<Boolean> onSite(Target txtValidacion) {
        return new ValidarPDF(txtValidacion);
    }
}