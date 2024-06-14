Feature: Como usuario del portal de Banistmo en la sección personas
  Quiero ingresar desde el menú de acceso rápido
  Para validar el PDF asociado a la auto certificación unificada de FATCA & CRS

  @FlujoEscenario
  Scenario: Validar el PDF asociado a la auto certificación unificada de FATCA & CRS
    Given el usuario ingresa al sitio web de Banistmo
    When ingresa desde el submodulo de acceso directo aprender es fácil hasta el modulo  FATCA & CRS
    Then valida el pdf seleccionado