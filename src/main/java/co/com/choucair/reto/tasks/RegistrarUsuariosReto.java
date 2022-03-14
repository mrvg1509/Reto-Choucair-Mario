package co.com.choucair.reto.tasks;

import co.com.choucair.reto.model.DatosUtest;
import co.com.choucair.reto.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarUsuariosReto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(Home.REGISTRAR),
            SendKeys.of("Estefania").into(Personal.FIRSTNAME),
            SendKeys.of("Batista").into(Personal.LASTNAME),
            SendKeys.of("EstefaniaBatista23@gmail.com").into(Personal.EMAIL),
            SendKeys.of("June").into(Personal.MONTH),
            SendKeys.of("1").into(Personal.DAY),
            SendKeys.of("2000").into(Personal.YEAR),
            SendKeys.of("June").into(Personal.MONTH),
            Click.on(Personal.NEXTLOCATION),
            SendKeys.of("507").into(Location.CODE),
            Click.on(Location.BOTONLOCATION),
            Click.on(Devices.SISTEMA),
            Click.on(Devices.WINDOWS),
            Click.on(Devices.VERSION),
            Click.on(Devices.WINDOWS10),
            Click.on(Devices.lANGUAJE),
            Click.on(Devices.SPANISH),
            Click.on(Devices.BOTONLASTSTEP),
            SendKeys.of("Estefania1234*").into(Password.PASSWORD),
            SendKeys.of("Estefania1234*").into(Password.CONFIRMPASSWORD),
            Click.on(Password.CHECK1),
            Click.on(Password.CHECK2),
            Click.on(Password.BOTONCOMPLETESETUP)
    );
    }

    public static RegistrarUsuariosReto RealizarInfo(List<DatosUtest> datos){
        return instrumented(RegistrarUsuariosReto.class);
    }

}
