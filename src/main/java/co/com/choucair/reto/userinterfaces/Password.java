package co.com.choucair.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Password {

    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id=\"password\"]");

    public static final Target CONFIRMPASSWORD = Target.the("confirm password").
            locatedBy(" //input[@id=\"confirmPassword\"]");

    public static final Target CHECK1 = Target.the("check1").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox error\"]");

    public static final Target CHECK2 = Target.the("check2").
            locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");

    public static final Target BOTONCOMPLETESETUP = Target.the("complete").
            locatedBy("//a[@class=\"btn btn-blue\"]");

}
