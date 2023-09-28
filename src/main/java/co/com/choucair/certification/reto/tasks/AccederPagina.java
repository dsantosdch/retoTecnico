package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.PaginaSharp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AccederPagina implements Task {

    private PaginaSharp paginaSharp;
    public static AccederPagina urlApp() {
        return Tasks.instrumented(AccederPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(paginaSharp));
        System.out.println("Hello");
        //actor.attemptsTo(Open.url("https://google.com")); //thePageNamed("https://google.com"));
        System.out.println("Hello2");
        //actor.attemptsTo(Open.browserOn().thePageNamed("https://demo.serenity.is/").withLanguage("${webdriver.language.en}"));
    }

}
