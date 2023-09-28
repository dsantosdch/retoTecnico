package co.com.choucair.certification.reto.questions;

import co.com.choucair.certification.reto.userinterface.PaginaBusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarBusinessUnit implements Question {
    public static VerificarBusinessUnit resultado() {
        return new VerificarBusinessUnit();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaBusinessUnit.TXT_NAME_VERIFY).answeredBy(actor).toString();
    }

}
