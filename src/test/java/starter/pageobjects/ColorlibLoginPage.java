package starter.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")

public class ColorlibLoginPage extends PageObject {

    //Campo Usuario
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElementFacade txtUsername;

    // Campo Password
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElementFacade txtPassword;

    //Boton Sign in
    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    public WebElementFacade btnSignIn;
    // Texto Page Home a validar
    @FindBy(xpath = "//h1[@id='bootstrap-admin-template']")
    public WebElementFacade lblHomePpal;
    //Identificador del menu Forms


    public void IngresarDatos(String strUsuario, String strPassword){
        txtUsername.sendKeys(strUsuario);
        txtPassword.sendKeys(strPassword);
        btnSignIn.click();

    }
    public void VerificarHome(){

        String labelv = "Bootstrap-Admin-Template";
        String txtMensaje = lblHomePpal.getText();
        assertThat(txtMensaje, containsAllText(labelv));

    }

}
