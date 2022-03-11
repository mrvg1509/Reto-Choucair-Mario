package co.com.choucair.reto.stepdefinitions;
import co.com.choucair.reto.tasks.RegistrarUsuariosReto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


    public class RegistrarUsuarioStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Estefania");
    }

    @Given("^user open home page$")
    public void userOpenHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }

    @When("^user create account filling all fields$")
    public void userCreateAccountFillingAllFields() {
    theActorInTheSpotlight().attemptsTo(RegistrarUsuariosReto.RealizarInfo());
    }

    @Then("^user sees its username$")
    public void userSeesItsUsername() {

    }

                                                }
