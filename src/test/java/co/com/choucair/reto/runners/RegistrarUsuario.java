package co.com.choucair.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/registrar_usuario.feature",
    glue = "co.com.choucair.reto.stepdefinitions",
    snippets = SnippetType.CAMELCASE)

    public class RegistrarUsuario {

    }
