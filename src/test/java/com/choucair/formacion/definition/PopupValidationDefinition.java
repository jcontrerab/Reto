package com.choucair.formacion.definition;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Data;
import net.thucydides.core.annotations.Steps;
import com.choucair.formacion.steps.PopupValidationSteps;
import java.util.List;



public class PopupValidationDefinition {
	
	@Steps
	PopupValidationSteps PopupValidationSteps;

	
	@Given("^Ingresar a la URL dar clic en SignIn$")
	public void ingresar_a_la_URL_y_dar_clic_en_SignIn () {
		PopupValidationSteps.Ingresar_URL();
		PopupValidationSteps.clicSignIn();
	}

	@When("^Ingresar un correo valido dar clic en crear cuenta$")
	public void ingresar_un_correo_valido_dar_clic_en_crear_cuenta(List<Data> CamposIngreso) {
		PopupValidationSteps.Ingresar_Correo(CamposIngreso.get(0).getCorreo());
		PopupValidationSteps.Clic_crear_cuenta();
	}

	@Then("^Diligenciar todos los campos obligatorios y fecha de nacimiento$")
	public void diligenciar_todos_los_campos_obligatorios_y_fecha_de_nacimiento(List<Data> CamposIngreso) {
		PopupValidationSteps.Ingresar_Nombre(CamposIngreso.get(0).getNombre());
		PopupValidationSteps.Ingresar_Apellido(CamposIngreso.get(0).getApellido());
		PopupValidationSteps.Ingresar_Password(CamposIngreso.get(0).getPassword());
	    //PopupValidationSteps.Seleccionar_dia(CamposIngreso.get(0).getDia());
		//PopupValidationSteps.Seleccionar_mes(CamposIngreso.get(0).getMes());
		//PopupValidationSteps.Seleccionar_año(CamposIngreso.get(0).getAño());
		PopupValidationSteps.Ingresar_NombreAddress(CamposIngreso.get(0).getNombre_address());
		PopupValidationSteps.Ingresar_ApellidoAddress(CamposIngreso.get(0).getApellido_address());
		PopupValidationSteps.Ingresar_Address(CamposIngreso.get(0).getAddress());
		PopupValidationSteps.Ingresar_Ciudad(CamposIngreso.get(0).getCiudad());
		//PopupValidationSteps.Ingresar_Estado(CamposIngreso.get(0).getEstado());
		PopupValidationSteps.Ingresar_CodigoPostal(CamposIngreso.get(0).getPostal());
		//PopupValidationSteps.Ingresar_pais(CamposIngreso.get(0).getPais());
		PopupValidationSteps.Ingresar_movil(CamposIngreso.get(0).getMovil());
		PopupValidationSteps.Ingresar_alias(CamposIngreso.get(0).getAlias());

	}

}
