#Autor: Dionisio Santos

@HistoriaDeUsuario
Feature: Verificar la creacion de una organizacion
  Yo como administrador de StartSharp quiero crear una organización para añadirla a mis unidades de negocio

  Background:
    Given Andres open StartSharp

  @CasoUnidadDeNegocio
  Scenario: Verificar la creacion de una unidad de negocio
    When Andres inicia sesion y programa la reunion de la unidad de negocio
    Then se verifica que la unidad de negocio se haya creado