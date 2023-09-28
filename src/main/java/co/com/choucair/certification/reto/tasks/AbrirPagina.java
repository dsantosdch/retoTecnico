package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
    private PaginaXTTT paginaXTTT;
    public static AbrirPagina urlApp(){

        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(paginaXTTT));
    }
}
