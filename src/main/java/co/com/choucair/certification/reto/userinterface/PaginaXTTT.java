package co.com.choucair.certification.reto.userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PaginaXTTT extends PageObject {
    public static final Target TXT_USUARIO = Target.the("Ingresar usuario").located(By.xpath("//*[@placeholder='Username']"));
    public static final Target TXT_CONTRASENA = Target.the("Ingresar contraseña").located(By.xpath("//*[@placeholder='Password']"));
    public static final Target BTN_SIGN_IN = Target.the("Boton ingresar").located(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
    public static final Target LBL_MENU = Target.the("MENU").located(By.xpath("//*[text()='Menu']"));
}
