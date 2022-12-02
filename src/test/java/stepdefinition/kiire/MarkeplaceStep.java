package stepdefinition.kiire;

import Actions.DriverChrome;
import Actions.Time;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.model.screenshots.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.kiire.CarritoVacioUI;
import ui.kiire.HeaderUI;
import ui.kiire.InternaProductoUI;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static ui.kiire.MarkeplaceUI.*;
import static ui.kiire.RegistrarseUI.*;

public class MarkeplaceStep {

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
       OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El Usuario abre la aplicacion y visualiza el markeplace$")
    public void el_Usuario_abre_la_aplicacion_y_visualiza_el_markeplace() {
        theActorCalled("usuario").can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().attemptsTo(Open.url("https://portalqa.pagosredeban.com/"));
        Time.getTimeFive();
    }

    @When("^Presencia el producto del Mini datafono y lo selecciona$")
    public void presencia_el_producto_del_Mini_datafono_y_lo_selecciona() {

        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CARD_MINIDATAFONO,isVisible()), Click.on(CARD_MINIDATAFONO)
        );
        Time.getTimeFive();

    }

    @When("^Presencia el producto del Mini pro y lo selecciona$")
    public void presencia_el_producto_del_Mini_pro_y_lo_selecciona() {

        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CARD_MINIPRO,isVisible()), Click.on(CARD_MINIPRO));
        Time.getTimeFive();
    }

    @When("^Presencia el producto del Link de pagos y lo selecciona$")
    public void presencia_el_producto_del_Link_de_pagos_y_lo_selecciona() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CARD_LINKPAGOS,isVisible()), Click.on(CARD_LINKPAGOS));
                Time.getTimeFive();
    }

    @When("^Presencia el producto del Codigo QR y lo selecciona$")
    public void presencia_el_producto_del_Codigo_QR_y_lo_selecciona() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CARD_CODIGOQR,isVisible()), Click.on(CARD_CODIGOQR));
                Time.getTimeFive();
    }

    @When("^Se le de clic al icono del carrito se debe redireccionar a la vista de carrito vacio$")
    public void se_le_de_clic_al_icono_del_carrito_se_debe_redireccionar_a_la_vista_de_carrito_vacio() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(HeaderUI.ICN_CARRITO));
                Time.getTimeFive();

    }


    @Then("^Se valida la vista del carrito vacio$")
    public void se_valida_la_vista_del_carrito_vacio() {

        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CarritoVacioUI.IMG_CARRITO,isVisible()),
                WaitUntil.the(CarritoVacioUI.BTN_COMPRANDO,isVisible()),
                Click.on(CarritoVacioUI.BTN_VOLVER));
                Time.getTimeFive();
    }

    @When("^Le de clic al boton de crear cuenta debe redireccionar a la vista de registro$")
    public void le_de_clic_al_boton_de_crear_cuenta_debe_redireccionar_a_la_vista_de_registro() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(HeaderUI.BTN_CREAR_CUENTA),
                WaitUntil.the(IMG_REGISTER, isVisible()),
                WaitUntil.the(LBL_CREAR, containsOnlyText("Crea tu cuenta y adquiere tus dispositivos")),
                WaitUntil.the(LBL_COMPLETA, containsOnlyText("Completa tus datos para continuar tu proceso de compra"))
                );
                Time.getTimeFive();

    }


    @After
    public void tearDown(){
        driver.close();
    }
}
