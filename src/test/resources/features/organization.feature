#Autor: Dionisio Santos

  @HistoriaDeUsuario
  Feature: Verificar la creación de una organización
    Yo como administrador de StartSharp quiero crear una organización para añadirla a mis unidades de negocio

    Background:
    Given Andres ingresa a StartSharp

  @CasoUnidadDeNegocio
    Scenario: Verificar la creacion de una unidad de negocio
    When rellena los campos de la unidad de negocio
    Then se verifica que la unidad de negocio se haya creado
