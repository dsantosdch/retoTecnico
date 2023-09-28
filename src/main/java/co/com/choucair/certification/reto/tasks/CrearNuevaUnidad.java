package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.PaginaBusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;

public class CrearNuevaUnidad implements Task {
    public static CrearNuevaUnidad nombreUnidad() {
        return Tasks.instrumented(CrearNuevaUnidad.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitUntil.the(DELAYED_BUTTON, isCurrentlyVisible()).forNoMoreThan(10).seconds()
                Click.on(PaginaBusinessUnit.BTN_NEW_BUSINESS_UNIT).afterWaitingUntilEnabled(),
                Enter.theValue("UnidadDePrueba").into(PaginaBusinessUnit.TXT_NAME),
                Click.on(PaginaBusinessUnit.BTN_SAVE).afterWaitingUntilEnabled());

        System.out.println("SE GUARDÓ");

    }
}

