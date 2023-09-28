package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.questions.VerificarReunion;
import co.com.choucair.certification.reto.tasks.CrearReunion;
import co.com.choucair.certification.reto.tasks.Ingresar;
import co.com.choucair.certification.reto.tasks.RellenarCamposReunion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class MeetingSteps {
    @When("se crea una reunion")
    public void seCreaUnaReunion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
        OnStage.theActorInTheSpotlight().attemptsTo(CrearReunion.PulsarDesplegableReunion());
        OnStage.theActorInTheSpotlight().attemptsTo(RellenarCamposReunion.campos());
    }

    @Then("se verifica que se haya creado la reunion")
    public void seVerificaQueSeHayaCreadoLaReunion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarReunion.resultado(), Matchers.equalTo("Meetings")));
    }
}
