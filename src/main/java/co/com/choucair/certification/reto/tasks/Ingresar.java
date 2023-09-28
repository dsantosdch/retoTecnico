package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.PaginaSharp;
import co.com.choucair.certification.reto.userinterface.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public static Ingresar credenciales() {

        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("admin").into(PaginaSharp.TXT_USUARIO),
                Enter.theValue("serenity").into(PaginaSharp.TXT_CONTRASENA),
                Click.on(PaginaSharp.BTN_SIGN_IN));

    }
}
