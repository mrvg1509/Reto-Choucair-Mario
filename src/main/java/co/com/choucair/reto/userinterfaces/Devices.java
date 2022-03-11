package co.com.choucair.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {
    public static final Target SISTEMA = Target.the("sistema").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");

    public static final Target WINDOWS = Target.the("windows").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");

    public static final Target VERSION = Target.the("version").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");

    public static final Target WINDOWS10 = Target.the("windows10").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[17]");

    public static final Target lANGUAJE = Target.the("lenguaje").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");

    public static final Target SPANISH = Target.the("spanish").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[38]");

    public static final Target BOTONLASTSTEP = Target.the("boton next").
            locatedBy("//a[@aria-label=\"Next - final step\"]");


}
