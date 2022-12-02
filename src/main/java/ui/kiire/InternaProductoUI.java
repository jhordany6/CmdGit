package ui.kiire;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InternaProductoUI {

    public static final Target LBL_PRODUCTO = Target.the("El usuario visualiza en la interna el copie con el nombre del producto").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__container > div > div.product-detail__content.ng-star-inserted > h3"));
    public static final Target LBL_P_TITULO = Target.the("El usuario visualiza en la interna el primer titulo de lo que debes saber").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__container > app-must-know > div > h3"));
    public static final Target LBL_S_TITULO = Target.the("El usuario visualiza en la interna el segundo titulo de beneficios").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__container > app-benefits > div > div > h3"));
    public static final Target LBL_T_TITULO = Target.the("El usuario visualiza en la interna el tercer titulo de terminos y condiciones").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__container > app-terms-conditions > div > h3"));

    public static final Target IMG_P_IMAGEN = Target.the("El usuario visualiza en la interna la imagen del producto").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__container > div > div.product-detail__image > app-image > picture > img"));
    public static final Target IMG_S_IMAGEN = Target.the("El usuario visualiza en la interna la imagen de beneficios").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__container > app-benefits > div > div > div > app-image > picture > img"));

    public static final Target BTN_VOLVER = Target.the("El usuario visualiza en la interna el boton de volver para regresar").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__back-button > app-back-button > button"));
    public static final Target BTN_ANEXAR_CARRITO = Target.the("El usuario visualiza en la interna el boton de añadir al carrito").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__container > div > div.product-detail__content.ng-star-inserted > div > div.product-detail__cart-button > app-button > button"));
    public static final Target BTN_VER_CARRITO = Target.the("El usuario visualiza en la interna y en el modal que se abre el boton de ver carrito").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__container > div > div.product-detail__content.ng-star-inserted > div > div.product-detail__cart-button > app-modal > div.modal > div > section.modal-buttons > div:nth-child(2) > app-button"));
    public static final Target BTN_SEGUIR_COMPRANDO = Target.the("El usuario visualiza en la interna y en el modal que se abre el boton de seguir comprando").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__container > div > div.product-detail__content.ng-star-inserted > div > div.product-detail__cart-button > app-modal > div.modal > div > section.modal-buttons > div:nth-child(1) > app-button"));

    public static final Target ICN_X = Target.the("El usuario visualiza en la interna y en el modal que se abre el icono para cerrar el modal").located(By.cssSelector("body > app-root > main > app-detailed-product > section > div.product-detail__container > div > div.product-detail__content.ng-star-inserted > div > div.product-detail__cart-button > app-modal > div.modal > div > div > button"));
}
