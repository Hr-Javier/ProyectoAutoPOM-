package starter.actions;

import net.serenitybdd.annotations.Step;
import starter.pageobjects.ColorlibLoginPage;
import starter.pageobjects.ColorlibMenuPage;
import starter.pageobjects.ColorlibValidationPage;

import java.util.List;

public class PopupValidationSteps {
  ColorlibLoginPage colorlibLoginPage;
  ColorlibMenuPage colorlibMenuPage;

  @Step("Autenticacion")

  public void  login_colorlib (String strUsuario, String strPassword){
//a. Abrir el navegador con la url de prueba
    colorlibLoginPage.open();
/*b. Ingresar usuario demo
c. Ingresar password demo
d. Hacer click en el boton Sign in */
    colorlibLoginPage.IngresarDatos(strUsuario, strPassword);
//e. Verificar la autenticación (label en home)
    colorlibLoginPage.VerificarHome();
  }
  @Step ("Validacion")
  public void ingresar_popup_validation (){
    //Ingresar en el lagina principa de Popup Validation
    colorlibMenuPage.ColorlibPopupValidation();


  }

}
