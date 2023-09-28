package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.PaginaReuniones;
import co.com.choucair.certification.reto.userinterface.PaginaSharp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RellenarCamposReunion implements Task {

    public static Task campos() {
        return Tasks.instrumented(RellenarCamposReunion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Reunión Nueva").into(PaginaReuniones.TXT_NOMBRE),
                        /*Click.on(PaginaReuniones.BTN_TIPO)*/
                        Enter.theValue("001").into(PaginaReuniones.TXT_NUMERO),
                        Click.on(PaginaReuniones.BTN_GUARDAR));

    }
}
