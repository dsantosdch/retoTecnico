#Autor: Dionisio Santos

  @HistoriaDeUsuario
  Feature: Verificar la creacion de una nueva reunion
    Yo como administrador quiero acceder a StartSharp para crear una nueva reunion

    Background:
      Given Andres open StartSharp

  @CasoReunion
  Scenario: Verificar que se haya creado una reunion
    When se crea una reunion
    Then se verifica que se haya creado la reunion