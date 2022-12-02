package ui.kiire;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrarseUI {

    public static final Target INPUT_CORREO = Target.the("El usuario visualiza el input de correo").located(By.cssSelector(".input-control > #userName"));
    public static final Target INPUT_CONTRASENA = Target.the("El usuario visualiza el input de contraseña").located(By.cssSelector(".input-control > #password"));
    public static final Target INPUT_CELULAR = Target.the("El usuario visualiza el input del celular").located(By.cssSelector(".input-control > #cellphone"));

    public static final Target CHECK_DATOS_PERSONALES = Target.the("El usuario visualiza el check box de tratamiento de datos").located(By.cssSelector("#acceptancePersonalInformation .image > .image"));
    public static final Target CHECK_CONDICIONES = Target.the("El usuario visualiza el check box de terminos y condiciones").located(By.cssSelector("#acceptanceTerms .image > .image"));

    public static final Target BTN_CONTINUAR = Target.the("El usuario visualiza el boton de continuar").located(By.cssSelector("body > app-root > main > app-register > section > div.register__container > div > app-register-form > form > app-button"));
    public static final Target BTN_INICIA_SESION = Target.the("El usuario visualiza el boton de iniciar sesion").located(By.cssSelector("body > app-root > main > app-register > section > div.register__container > div > app-register-form > div > app-button > button"));
    public static final Target BTN_VOLVER  = Target.the("El usuario visualiza el boton de volver").located(By.cssSelector("body > app-root > main > app-register > section > div.register__back > app-back-button > button"));

    public static final Target IMG_REGISTER = Target.the("El usuario visualiza la imagen de registrate").located(By.cssSelector("body > app-root > main > app-register > section > div.register__container > app-image > picture > img"));

    public static final Target LBL_CREAR = Target.the("El usuario visualiza el copie de la vista").located(By.cssSelector("body > app-root > main > app-register > section > div.register__container > div > h1"));
    public static final Target LBL_COMPLETA = Target.the("El usuario visualiza el copie de la vista").located(By.cssSelector("body > app-root > main > app-register > section > div.register__container > div > h5"));

}
