package ui.kiire;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target INPUT_CORREO = Target.the("El usuario visualiza el input de correo").located(By.cssSelector(".input-control > #userName"));
    public static final Target INPUT_CONTRASENA = Target.the("El usuario visualiza el input de CONTRASENA").located(By.cssSelector(".input-control > #password"));

    public static final Target BTN_INICIAR_SESION = Target.the("El usuario visualiza el boton de iniciar sesion").located(By.className("login-form__submit"));
    public static final Target BTN_CREAR_CUENTA = Target.the("El usuario visualiza el boton de crear mi cuenta").located(By.cssSelector("body > app-root > main > app-login > section > div.login__container > div > app-login-form > div > app-button"));
    public static final Target BTN_VOLVER = Target.the("El usuario visualiza el boton de volver").located(By.cssSelector("body > app-root > main > app-login > section > div.login__back > app-back-button > button"));
}
