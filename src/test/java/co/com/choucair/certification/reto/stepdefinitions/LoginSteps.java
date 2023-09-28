package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.questions.Comprobar;
import co.com.choucair.certification.reto.tasks.AbrirPagina;
import co.com.choucair.certification.reto.tasks.AccederPagina;
import co.com.choucair.certification.reto.tasks.Ingresar;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class LoginSteps {

    @Before
    public void iniciarEscenario() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que Andres ingresa a StartSharp")
    public void queAndresIngresaAStartSharp() {

        OnStage.theActorCalled("Andres").wasAbleTo(AccederPagina.urlApp());
    }

    @Cuando("digita sus credenciales e ingresa al app StartSharp")
    public void digitaSusCredencialesEIngresaAlAppStartSharp() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
    }

    @Entonces("verifica que puede ingresar correctamente a StartSharp")
    public void verificaQuePuedeIngresarCorrectamenteAStartSharp() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Comprobar.resultado(), Matchers.equalTo("Tablero")));
    }

    @Given("Andres open StartSharp")
    public void andresOpenStartSharp() {
        OnStage.theActorCalled("Andres").wasAbleTo(AccederPagina.urlApp());
    }



}
