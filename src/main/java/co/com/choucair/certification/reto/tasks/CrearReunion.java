package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.PaginaBusinessUnit;
import co.com.choucair.certification.reto.userinterface.PaginaReuniones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class CrearReunion implements Task{


    public static Task PulsarDesplegableReunion() {
        return Tasks.instrumented(CrearReunion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PaginaReuniones.DWN_MEETING, isCurrentlyVisible()).forNoMoreThan(60).seconds()
                //Click.on(PaginaReuniones.DWN_MEETING).afterWaitingUntilEnabled()
                );
        actor.attemptsTo(
                WaitUntil.the(PaginaReuniones.BTN_MEETING, isCurrentlyVisible()).forNoMoreThan(60).seconds()
                //Click.on(PaginaReuniones.BTN_MEETING).afterWaitingUntilEnabled()
                );
        actor.attemptsTo(
                WaitUntil.the(PaginaReuniones.BTN_NEW_MEETING, isCurrentlyVisible()).forNoMoreThan(60).seconds()
                //Click.on(PaginaReuniones.BTN_NEW_MEETING).afterWaitingUntilEnabled()
                );
    }
}
