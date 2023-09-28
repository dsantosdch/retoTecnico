package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.PaginaBusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class PestanaOrganization implements Task{
    private PaginaBusinessUnit paginaBusinessUnit;

    public static PestanaOrganization pulsarBoton() {
        return Tasks.instrumented(PestanaOrganization.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PaginaBusinessUnit.BTN_ORGANIZATION).afterWaitingUntilEnabled(),
                        Click.on(PaginaBusinessUnit.BTN_BUSINESS_UNIT).afterWaitingUntilEnabled());
    }
}
