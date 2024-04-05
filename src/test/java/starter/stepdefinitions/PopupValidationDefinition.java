package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.ColorlibFormValidarionSteps;
import starter.actions.PopupValidationSteps;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class PopupValidationDefinition {

    @Steps
    PopupValidationSteps popupValidationSteps;
    @Steps
    ColorlibFormValidarionSteps colorlibFormValidarionSteps;
    @Given("^Autentico en colorlib con el ususario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void autentico_en_colorlib_con_el_ususario_y_clave(String usuario, String contraseña) {
       popupValidationSteps.login_colorlib(usuario, contraseña);
    }
    @And("^Ingreso a la funcionalidad Forms Valiation$")
    public void ingreso_a_la_funcionalidad_forms_valiation() {
        popupValidationSteps.ingresar_popup_validation();
    }
    @When("^Diligencio Formulario Popup Validation$")
    public void diligencio_formulario_popup_validation(DataTable dtDatosForm) {
        List<List<String>> data = dtDatosForm.asLists();
        for (int i = 1; i < data.size(); i++) {
        colorlibFormValidarionSteps.diligenciar_popup_datos_tabla(data, i);
        }
    }
    @Then("^Verifico ingreso exitoso$")
    public void verifico_ingreso_exitoso() {
        colorlibFormValidarionSteps.verificar_ingreso_datos_form_exitoso();
    }

}
