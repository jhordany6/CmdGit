package stepdefinition.kiire;

import Actions.Time;
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
import org.openqa.selenium.WebDriver;
import ui.kiire.InternaProductoUI;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static ui.kiire.MarkeplaceUI.CARD_MINIDATAFONO;

public class ProductosStep {

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
       OnStage.setTheStage(new OnlineCast());
    }

    @Then("^Se abre la interna del Mini datafono y validamos los datos que se visualizan$")
    public void se_abre_la_interna_del_Mini_datafono_y_validamos_los_datos_que_se_visualizan() {

        theActorInTheSpotlight().attemptsTo(WaitUntil.the(InternaProductoUI.LBL_P_TITULO, containsText("Lo que debes saber")),
                WaitUntil.the(InternaProductoUI.LBL_S_TITULO, containsText("Beneficios")),
                WaitUntil.the(InternaProductoUI.IMG_P_IMAGEN, isPresent()),
                WaitUntil.the(InternaProductoUI.IMG_P_IMAGEN, isVisible()),
                WaitUntil.the(InternaProductoUI.IMG_S_IMAGEN, isPresent()),
                WaitUntil.the(InternaProductoUI.IMG_S_IMAGEN, isVisible())
        );

    }
    @Then("^Se abre la interna del Mini pro y validamos los datos que se visualizan$")
    public void se_abre_la_interna_del_Mini_pro_y_validamos_los_datos_que_se_visualizan() {

        theActorInTheSpotlight().attemptsTo(WaitUntil.the(
                InternaProductoUI.LBL_P_TITULO, containsText("Lo que debes saber")),
                WaitUntil.the(InternaProductoUI.LBL_PRODUCTO, containsText("Minipro")),
                WaitUntil.the(InternaProductoUI.LBL_S_TITULO, containsText("Beneficios")),
                WaitUntil.the(InternaProductoUI.IMG_P_IMAGEN, isPresent()),
                WaitUntil.the(InternaProductoUI.IMG_P_IMAGEN, isVisible()),
                WaitUntil.the(InternaProductoUI.IMG_S_IMAGEN, isPresent()),
                WaitUntil.the(InternaProductoUI.IMG_S_IMAGEN, isVisible())
        );
    }

    @Then("^Se abre la interna del Link de pagos y validamos los datos que se visualizan$")
    public void se_abre_la_interna_del_Link_de_pagos_y_validamos_los_datos_que_se_visualizan() {

        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(InternaProductoUI.LBL_P_TITULO, containsText("Lo que debes saber")),
                WaitUntil.the(InternaProductoUI.LBL_PRODUCTO, containsText("Link de pagos")),
                WaitUntil.the(InternaProductoUI.LBL_S_TITULO, containsText("Beneficios")),
                WaitUntil.the(InternaProductoUI.IMG_P_IMAGEN, isPresent()),
                WaitUntil.the(InternaProductoUI.IMG_P_IMAGEN, isVisible()),
                WaitUntil.the(InternaProductoUI.IMG_S_IMAGEN, isPresent()),
                WaitUntil.the(InternaProductoUI.IMG_S_IMAGEN, isVisible())
        );
    }

    @Then("^Se abre la interna del Codigo QR y validamos los datos que se visualizan$")
    public void se_abre_la_interna_del_Codigo_QR_y_validamos_los_datos_que_se_visualizan() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(InternaProductoUI.LBL_P_TITULO, containsText("Lo que debes saber")),
                WaitUntil.the(InternaProductoUI.LBL_S_TITULO, containsText("Beneficios")),
                WaitUntil.the(InternaProductoUI.IMG_P_IMAGEN, isPresent()),
                WaitUntil.the(InternaProductoUI.IMG_P_IMAGEN, isVisible()),
                WaitUntil.the(InternaProductoUI.IMG_S_IMAGEN, isPresent()),
                WaitUntil.the(InternaProductoUI.IMG_S_IMAGEN, isVisible())
        );
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
