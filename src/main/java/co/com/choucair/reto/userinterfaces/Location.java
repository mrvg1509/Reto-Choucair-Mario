package co.com.choucair.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Location {
        public static final Target BOTONLOCATION = Target.the("Boton Location").
            locatedBy("//a[@aria-label=\"Next step - select your devices\"]");

        public static final Target CODE = Target.the("Codigo postal").
            locatedBy("//input[@id=\"zip\"]");

}
