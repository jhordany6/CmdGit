package ui.kiire;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FooterUI {

    public static final Target ICN_YOUTUBE = Target.the("Se selecciona el Icono de youtube").located(By.cssSelector("body > app-root > app-footer > footer > section > section > a:nth-child(1)"));
    public static final Target ICN_TWITTER = Target.the("Se selecciona el Icono de twitter").located(By.cssSelector("body > app-root > app-footer > footer > section > section > a:nth-child(2)"));
    public static final Target ICN_INSTAGRAM = Target.the("Se selecciona el Icono de instagram").located(By.cssSelector("body > app-root > app-footer > footer > section > section > a:nth-child(3)"));
    public static final Target ICN_FACEBOOK = Target.the("Se selecciona el Icono de facebook").located(By.cssSelector("body > app-root > app-footer > footer > section > section > a:nth-child(4)"));

    public static final Target LBL_COPY = Target.the("Se selecciona el texto perteneciente al footer").located(By.cssSelector("body > app-root > app-footer > footer > section"));


}
