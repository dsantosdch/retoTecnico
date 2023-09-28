package co.com.choucair.certification.reto.userinterface;

import co.com.choucair.certification.reto.questions.VerificarReunion;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaReuniones {

    public static final Target DWN_MEETING = Target.the("Meetings Dropdown").located(By.xpath("//span[text()='Meeting']"));
    public static final Target BTN_MEETING = Target.the("Meeting Button").located(By.xpath("//span[contains(text(),'Meetings')]"));
    public static final Target BTN_NEW_MEETING = Target.the("New Meeting").located(By.xpath("//span[@class='button-inner']"));
    public static final Target TXT_NOMBRE = Target.the("Meeting Name").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']"));

    public static final Target BTN_TIPO = Target.the("Meeting Type").located(By.xpath("//div[@name='select2-drop select2-display-none select2-with-searchbox select2-drop-active']"));
    public static final Target TXT_NUMERO = Target.the("Meeting Number").located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']"));
    public static final Target TXT_VERIFICAR = Target.the("Verificar Resultado").located(By.xpath("//*[@id=\"GridDiv\"]/div[1]/div"));
    public static final Target BTN_GUARDAR = Target.the("Save Button").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_Toolbar\"]/div/div/div/div[1]"));
}
