package task.kiire;

import Actions.Time;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.kiire.RegistrarseUI.*;

public class registroTask implements Task {


    private final String username;
    private final String celular;
    private final String password;

    public registroTask(String username, String celular, String password) {
        this.username = username;
        this.celular = celular;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_CORREO),
                Enter.theValue(username).into(INPUT_CORREO),
                Enter.theValue(celular).into(INPUT_CELULAR),
                Enter.theValue(password).into(INPUT_CONTRASENA),
                Click.on(CHECK_CONDICIONES),
                Click.on(CHECK_CONDICIONES),
                Click.on(CHECK_DATOS_PERSONALES)

        );
        Time.getTimeFive();

    }
    public static Performable Registro(String username, String celular, String password){
         return instrumented(registroTask.class,username, celular, password );
    }
}
