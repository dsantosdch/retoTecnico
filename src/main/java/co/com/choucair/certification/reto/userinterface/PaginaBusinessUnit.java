package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaBusinessUnit extends PageObject {
    public static final Target BTN_ORGANIZATION = Target.the("Organization").located(By.xpath("//span[text()='Organization']"));
    public static final Target BTN_BUSINESS_UNIT = Target.the("Business Unit").located(By.xpath("//span[text()='Business Units']"));
    public static final Target BTN_NEW_BUSINESS_UNIT = Target.the("New Business Unit").located(By.xpath("//span[@class='button-inner']"));
    public static final Target TXT_NAME = Target.the("Name").located(By.xpath("//*[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Name']"));
    public static final Target BTN_SAVE = Target.the("Save").located(By.xpath("//*[@class='tool-button save-and-close-button icon-tool-button']"));
    public static final Target TXT_NAME_VERIFY = Target.the("Name_Verify").located(By.xpath("//div[@class='title-text']"));
}
