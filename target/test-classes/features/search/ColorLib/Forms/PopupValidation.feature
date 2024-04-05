@Regresion
Feature: Formulario Popup Validation
  El usuario debe poder ingresar al formulario los datos requeridos.
  En cada campo del formulario realizar validaciones de obligatoriedad,
  longitud y formato, el sisitmema debe presentar las validaciones respectivas para cada campo a través
  de un globo informativo.

  @CasoExitoso
  Scenario: Diligenciamiento exitosos del formulario Popup Validation,
            no se presenta ningún mensaje de validación.
    Given Autentico en colorlib con el ususario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Valiation
    When Diligencio Formulario Popup Validation
    |Required|MultipleS1|MultipleS2|Url           |Email           |Password1|Password2|MinSize |MaxSize     |Number|IP          |Date      |DateEarlier|
    |valor1  |Football  |Football  |www.valor1.com|valor1@gmail.com|valor1   |valor1   |10123456|100123456789|23    |192.168.0.24|2024-03-23|2023-03-23 |
    |valor1  |Tennis     |Tennis     |www.valor1.com|valor1@gmail.com|valor2   |valor2   |10123456|100123456789|23    |192.168.0.24|2024-03-23|2023-03-23 |
    Then Verifico ingreso exitoso