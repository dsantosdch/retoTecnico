#autor Dionisio Santos
  #language: es

  @HistoriaDeUsuario
  Característica: Verificar el ingreso correcto al app XTTT
    Yo como usuario quiero ingresar a la XTTT para verificar que tengo acceso a ella

  @CasoLogueo
  Escenario: Verificar ingresos correcto
    Dado que Andres ingresa a XTTT
    Cuando digita sus credenciales e ingresa al app
    Entonces verifica que puede ingresar correctamente