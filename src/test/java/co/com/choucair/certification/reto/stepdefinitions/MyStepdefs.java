package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.questions.Verificar;
import co.com.choucair.certification.reto.tasks.AbrirPagina;
import co.com.choucair.certification.reto.tasks.Ingresar;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class MyStepdefs {

    @Before
    public void iniciarEscenario() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que Andres ingresa a XTTT")
    public void queAndresIngresaAXTTT() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Andres").wasAbleTo(AbrirPagina.urlApp());
    }

    @Cuando("digita sus credenciales e ingresa al app")
    public void digitaSusCredencialesEIngresaAlApp() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
    }

    @Entonces("^verifica que puede ingresar correctamente$")
    public void verificaQuePuedeIngresarCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.equalTo("MENU")));
    }
}
