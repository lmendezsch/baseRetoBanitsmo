package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BanitsmoPortal {
    public static final Target MODAL_COOKIES = Target.the("").locatedBy("//div[@id='cookie-container']");
    public static final Target BTN_ACEPTAR_COOKIES = Target.the("").locatedBy("//button[@id='btn-aceptar-cookies']");

    public static final Target ACCESO_RAPIDO_APRENDER_ES_FACIL = Target.the("").locatedBy("//a[contains(text(), 'Aprender es fácil')]");
    public static final Target SECCION_LEGALES = Target.the("").locatedBy("(//a[contains(text(), 'Descubre más')])[5]");
    public static final Target SECCION_FACTA_CRS = Target.the("").locatedBy("(//a[contains(text(), 'Conoce más')])[2]");
    public static final Target DOCUMENTO_PDF = Target.the("").locatedBy("(//table[@class='table-responsive'])[1]//tr[3]//a");
    public static final Target PDF_ASOCIADO = Target.the("").locatedBy("//embed[@type='application/pdf']");

}
