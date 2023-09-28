package co.com.choucair.certification.reto.runners;

import io.cucumber.junit.CucumberOptions.SnippetType;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import io.github.bonigarcia.wdm.WebDriverManager;
//import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import net.thucydides.core.util.SystemEnvironmentVariables;


@RunWith(Cucumber.class)
@CucumberOptions
        (features = "src/test/resources/features/prueba.feature",
                /*tags = "@HistoriaDeUsuario",*/
                glue = "co.com.choucair.certification.reto.stepdefinitions",
                snippets = SnippetType.CAMELCASE)

public class RunnerTags {

   /* @Before
    public void test() {
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;
        }
    }*/

   /* @Test
    public void testRunner() {
        JUnitCore.runClasses(RunnerTags.class);
    }*/

}