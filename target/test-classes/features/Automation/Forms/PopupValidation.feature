#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Compra en tienda electrónica

  @CasoExitoso
  Scenario Outline: Realizar la compra de tres productos
    Given Ingresar a la URL dar clic en SignIn
    When Ingresar un correo valido dar clic en crear cuenta
      | correo   |
      | <Correo> |
    Then Diligenciar todos los campos obligatorios y fecha de nacimiento
      | nombre   | apellido   | password   | dia   | mes   | año   | nombre_address   | apellido_address   | address   | ciudad   | estado   | postal   | pais   | movil   | alias   |
      | <Nombre> | <Apellido> | <Password> | <Dia> | <Mes> | <Año> | <Nombre_Address> | <Apellido_Address> | <Address> | <Ciudad> | <Estado> | <Postal> | <Pais> | <Movil> | <Alias> |
    And Abrir el panel de términos y condiciones del servicio
    And Continuar el proceso de compra
    And Confirmar la compra

    Examples: 
      | Correo              | Nombre | Apellido | Password | Dia | Mes   | Año  | Nombre_Address | Apellido_Address | Address        | Ciudad | Estado  | Postal | Pais          | Movil      | Alias |
      | julina473@gmail.com | pepita | perez    |   123456 |  12 | April | 1998 | andres         | perez            | calle 58 i bis | Bogota | Florida | 110111 | United States | 3213454432 | dd    |
