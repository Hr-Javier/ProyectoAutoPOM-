package starter.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.jsoup.helper.Validate.isFalse;

public class ColorlibValidationPage extends PageObject {

    @FindBy(xpath = "//input[@id='req']")//Required
    public WebElementFacade txtRequired;
    @FindBy(xpath = "//select[@id='sport']")//Select
    public WebElementFacade cmbSport1;
    @FindBy(xpath = "//select[@id='sport2']")//Multiple select
    public WebElementFacade cmbSport2;
    @FindBy(xpath = "//input[@id='url1']")// URL
    public WebElementFacade txtUrl;
    @FindBy(xpath = "//input[@id='email1']") // Email
    public WebElementFacade txtEmail;
    @FindBy(xpath = "//input[@id='pass1']")// Password
    public WebElementFacade txtPassword1;
    @FindBy(xpath = "//input[@id='pass2']") // Password confirmation
    public WebElementFacade txtpassword2;
    @FindBy(xpath = "//input[@id='minsize1']")// Minimum
    public WebElementFacade txtMin;
    @FindBy(xpath = "//input[@id='maxsize1']")// Maximum
    public WebElementFacade txtMax;
    @FindBy(xpath = "//input[@id='number2']")// Number
    public WebElementFacade txtNumber;
    @FindBy(xpath = "//input[@id='ip']")// Ip
    public WebElementFacade txtIp;
    @FindBy(xpath = "//input[@id='date3']")// Date
    public WebElementFacade txtDate;
    @FindBy(xpath = "//input[@id='past']")// Date earlier
    public WebElementFacade txtDateEarlier;
    @FindBy(xpath = "//form[@id='popup-validation']//input[@value='Validate']") // Boton validate
    public  WebElementFacade btnValidate;
    @FindBy(xpath = "//div[@class='formErrorContent']") //Validar mensaje Required
    public WebElementFacade globoValidation;
public void required (String datoPrueba){
    txtRequired.click();
    txtRequired.clear();
    txtRequired.sendKeys(datoPrueba);
}
public void select_sport(String datoPrueba){
    cmbSport1.click();
    cmbSport1.selectByVisibleText(datoPrueba);
}
public void select_sport1(String datoPrueba){
    cmbSport2.click();
    cmbSport2.selectByVisibleText(datoPrueba);
}
public void url(String datoPrueba){
    txtUrl.click();
    txtUrl.clear();
    txtUrl.sendKeys(datoPrueba);
}
public void email(String datoPrueba){
    txtEmail.click();
    txtEmail.clear();
    txtEmail.sendKeys(datoPrueba);
    }
public void setTxtPassword1(String datoPrueba){
    txtPassword1.click();
    txtPassword1.clear();
    txtPassword1.sendKeys(datoPrueba);
}
public void setTxtPassword2(String datoPrueba){
    txtpassword2.click();
    txtpassword2.clear();
    txtpassword2.sendKeys(datoPrueba);
}
public void setTxtMin(String datoPrueba){
    txtMin.click();
    txtMin.clear();
    txtMin.sendKeys(datoPrueba);
}
public void setTxtMax(String datoPrueba){
    txtMax.click();
    txtMax.clear();
    txtMax.sendKeys(datoPrueba);
}
public void setTxtNumber(String datoPrueba){
    txtNumber.click();
    txtNumber.clear();
    txtNumber.sendKeys(datoPrueba);
}
public void setTxtIp(String datoPrueba){
    txtIp.click();
    txtIp.clear();
    txtIp.sendKeys(datoPrueba);
}
public void setTxtDate(String datoPrueba){
    txtDate.click();
    txtDate.clear();
    txtDate.sendKeys(datoPrueba);
}
public void setTxtDateEarlier(String datoPrueba){
    txtDateEarlier.click();
    txtDateEarlier.clear();
    txtDateEarlier.sendKeys(datoPrueba);
}
public void setBtnValidate(){
    btnValidate.click();
}
public void validation_form_error(){
    Ensure.that(globoValidation.isCurrentlyVisible());
}
}
