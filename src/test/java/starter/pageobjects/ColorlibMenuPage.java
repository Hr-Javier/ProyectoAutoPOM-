package starter.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject {

    @FindBy(xpath = "//body/div[@id='wrap']/div[@id='left']/ul[@id='menu']/li[6]/a[1]")
    public WebElementFacade menuForms;
    //Identificador submenu Form validation
    @FindBy(xpath = "//ul[@class='collapse in']//li//a[@href='form-validation.html']")
    public WebElementFacade sbmValidation;
    @FindBy(xpath = "//h5[normalize-space()='Popup Validation']")
    public WebElementFacade lblPopupValidation;

    public void ColorlibPopupValidation (){
        menuForms.click();
        sbmValidation.click();
        String txtMensaje2 = lblPopupValidation.getText();
        assertThat(txtMensaje2, containsString("Popup Validation"));
    }
}
