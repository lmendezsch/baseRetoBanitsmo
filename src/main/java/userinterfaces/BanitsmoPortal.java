package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BanitsmoPortal {
    public static final Target ACCESO_RAPIDO_APRENDER_ES_FACIL = Target.the("").locatedBy("//a[contains(text(), 'Aprender es fácil')]");
    public static final Target SECCION_LEGALES = Target.the("").locatedBy("(//a[contains(text(), 'Descubre más')])[5]");
    public static final Target SECCION_FACTA_CRS = Target.the("").locatedBy("(//a[contains(text(), 'Conoce más')])[2]");
    public static final Target DOCUMENTO_PDF = Target.the("").locatedBy("(//a[@title='PN- Autocertificación - Fatca y CRS'])[2]");
    public static final Target PDF_ASOCIADO = Target.the("").locatedBy("//title[contains(text(), 'PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf')]");

}
