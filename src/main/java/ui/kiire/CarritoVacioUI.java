package ui.kiire;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoVacioUI {

    public static final Target IMG_CARRITO = Target.the("Se selecciona la imagen del carrito vacio").located(By.cssSelector("body > app-root > main > app-shopping-cart > app-empty-shopping-cart > div > div.empty-cart__content > div.empty-cart__image > app-image > picture > img"));

    public static final Target BTN_COMPRANDO = Target.the("Se selecciona el boton de seguir comprando").located(By.cssSelector("body > app-root > main > app-shopping-cart > app-empty-shopping-cart > div > div.empty-cart__content > div.empty-cart__button > app-button"));
    public static final Target BTN_VOLVER = Target.the("Se selecciona el boton de volver").located(By.cssSelector("body > app-root > main > app-shopping-cart > app-empty-shopping-cart > div > div.empty-cart__back > app-back-button > button"));

}
