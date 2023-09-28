package co.com.choucair.certification.reto.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features/UnidadDeNegocio.feature",
        tags = "@HistoriaDeUsuario",
        glue = "co.com.choucair.certification.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

@RunWith(CucumberWithSerenity.class)
public class LoginRunner {
}
