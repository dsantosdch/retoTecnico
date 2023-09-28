package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.questions.VerificarBusinessUnit;
import co.com.choucair.certification.reto.tasks.CrearNuevaUnidad;
import co.com.choucair.certification.reto.tasks.Ingresar;
import co.com.choucair.certification.reto.tasks.PestanaOrganization;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class BusinessUnitSteps {

    @When("Andres inicia sesion y programa la reunion de la unidad de negocio")
    public void andresIniciaSesionYProgramaLaReunionDeLaUnidadDeNegocio() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
        OnStage.theActorInTheSpotlight().attemptsTo(PestanaOrganization.pulsarBoton());
        OnStage.theActorInTheSpotlight().attemptsTo(CrearNuevaUnidad.nombreUnidad());
        System.out.println("Finalizó la automatización");
    }

    @Then("se verifica que la unidad de negocio se haya creado")
    public void seVerificaQueLaUnidadDeNegocioSeHayaCreado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarBusinessUnit.resultado(), Matchers.equalTo("Business Units")));
    }

}
