package starter.actions;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Step;
import starter.pageobjects.ColorlibValidationPage;

import java.util.List;
import java.util.Map;

public class ColorlibFormValidarionSteps {
    ColorlibValidationPage colorlibValidationPage;
    @Step
    public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {

            colorlibValidationPage.required(data.get(id).get(0).trim());
            colorlibValidationPage.select_sport(data.get(id).get(1).trim());
            colorlibValidationPage.select_sport1(data.get(id).get(2).trim());
            colorlibValidationPage.url(data.get(id).get(3).trim());
            colorlibValidationPage.email(data.get(id).get(4).trim());
            colorlibValidationPage.setTxtPassword1(data.get(id).get(5).trim());
            colorlibValidationPage.setTxtPassword2(data.get(id).get(6).trim());
            colorlibValidationPage.setTxtMin(data.get(id).get(7).trim());
            colorlibValidationPage.setTxtMax(data.get(id).get(8).trim());
            colorlibValidationPage.setTxtNumber(data.get(id).get(9).trim());
            colorlibValidationPage.setTxtIp(data.get(id).get(10).trim());
            colorlibValidationPage.setTxtDate(data.get(id).get(11).trim());
            colorlibValidationPage.setTxtDateEarlier(data.get(id).get(12).trim());
            colorlibValidationPage.setBtnValidate();

    }
    public  void verificar_ingreso_datos_form_exitoso(){
        colorlibValidationPage.validation_form_error();
    }

}
