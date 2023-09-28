package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/")
public class PaginaSharp extends PageObject {
    public static final Target TXT_USUARIO = Target.the("Username").located(By.xpath("//input[@name='Username']"));
    public static final Target TXT_CONTRASENA = Target.the("Password").located(By.xpath("//input[@name='Password']"));
    public static final Target BTN_SIGN_IN = Target.the("Sign In").located(By.xpath("//*[@id='LoginPanel0_LoginButton']"));
    public static final Target LBL_MENU = Target.the("MENU").located(By.xpath("//section[@class='content-header']//h1"));
}


