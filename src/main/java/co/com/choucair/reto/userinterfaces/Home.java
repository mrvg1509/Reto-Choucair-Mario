package co.com.choucair.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {

        public static final Target REGISTRAR = Target.the("registrar").
            locatedBy(" //a[@class=\"unauthenticated-nav-bar__sign-up\"]");
}
