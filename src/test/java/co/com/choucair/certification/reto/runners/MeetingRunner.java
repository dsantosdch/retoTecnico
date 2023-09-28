package co.com.choucair.certification.reto.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features/reuniones.feature",
        //tags = "@CasoReunion",
        glue = "co.com.choucair.certification.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

@RunWith(CucumberWithSerenity.class)
public class MeetingRunner {
}
