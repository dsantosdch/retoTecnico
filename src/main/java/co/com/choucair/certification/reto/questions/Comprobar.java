package co.com.choucair.certification.reto.questions;

import co.com.choucair.certification.reto.userinterface.PaginaSharp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Comprobar implements Question {
    public static Comprobar resultado() {
        return new Comprobar();
    }

    @Override
    public Object answeredBy(Actor actor) {
            return Text.of(PaginaSharp.LBL_MENU).answeredBy(actor).toString();
    }
}
