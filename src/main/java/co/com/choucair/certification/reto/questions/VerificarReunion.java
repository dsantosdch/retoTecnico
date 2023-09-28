package co.com.choucair.certification.reto.questions;

import co.com.choucair.certification.reto.userinterface.PaginaReuniones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarReunion implements Question {
    public static VerificarReunion resultado() {
        return new VerificarReunion();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaReuniones.TXT_VERIFICAR).answeredBy(actor).toString();
    }
}
