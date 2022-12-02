package task.kiire;

import Actions.Time;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static ui.kiire.LoginUI.*;

public class loginTask implements Task {


    private final String username;
    private final String password;

    public loginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_CORREO),
                WaitUntil.the(INPUT_CORREO , isVisible()), Enter.theValue(username).into(INPUT_CORREO),
                WaitUntil.the(INPUT_CONTRASENA,isVisible()), Enter.theValue(password).into(INPUT_CONTRASENA),
                WaitUntil.the(BTN_INICIAR_SESION,isVisible()), Click.on(BTN_INICIAR_SESION)
        );
        Time.getTimeFive();

    }
    public static Performable Login(String username, String password){
         return instrumented(loginTask.class,username, password );
    }
}
