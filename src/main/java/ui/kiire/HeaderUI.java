package ui.kiire;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HeaderUI {

    public static final Target ICN_REDEBAN = Target.the("Se selecciona el Icono de redeban").located(By.className("header__logo"));
    public static final Target ICN_CARRITO = Target.the("Se selecciona el icono de carrito").located(By.className("shopping-cart"));

    public static final Target BTN_CREAR_CUENTA = Target.the("Se selecciona el boton de crear mi cuenta").located(By.cssSelector("body > app-root > app-header > header > div > div > nav > div > app-button:nth-child(1)"));
    public static final Target BTN_INICIAR_SESION = Target.the("Se selecciona el boton de iniciar sesion").located(By.cssSelector("body > app-root > app-header > header > div > div > nav > div > app-button:nth-child(2)"));


}
