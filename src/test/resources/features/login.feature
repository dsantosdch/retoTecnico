#autor Dionisio Santos
  #language: en

@HistoriaDeUsuario
Feature: : Verificar el ingreso correcto al app StartSharp
  Yo como usuario quiero ingresar a la StartSharp para verificar que tengo acceso a ella

  @CasoLogueo
  Scenario: : Verificar ingresos correcto a StartSharp
    Given que Andres ingresa a StartSharp
    When digita sus credenciales e ingresa al app StartSharp
    Then verifica que puede ingresar correctamente a StartSharp