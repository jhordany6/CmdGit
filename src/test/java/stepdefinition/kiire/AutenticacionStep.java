package stepdefinition.kiire;

import Actions.Time;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.kiire.*;
import ui.kiire.HeaderUI;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStep {

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
       OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El usuario procede a loguearse con el \"([^\"]*)\" y \"([^\"]*)\"$")
    public void el_usuario_procede_a_loguearse_con_el_y(String usuario, String contrasena) {
        theActorInTheSpotlight().attemptsTo(Click.on(HeaderUI.BTN_INICIAR_SESION));
        Time.getTimeThree();
        theActorInTheSpotlight().attemptsTo(loginTask.Login(usuario,contrasena));
    }

    @Then("^Se valida la vista de registro y se llena la data \"([^\"]*)\", \"([^\"]*)\" y \"([^\"]*)\"$")
    public void se_valida_la_vista_de_registro_y_se_llena_la_data_y(String usuario, String celular, String contrasena) {
        theActorInTheSpotlight().attemptsTo(registroTask.Registro(usuario, celular, contrasena));

    }
    @After
    public void tearDown(){
        driver.close();
    }
}
