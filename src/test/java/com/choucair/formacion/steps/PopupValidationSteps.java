package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.LoginPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {

	LoginPage LoginPage;

	@Step
	public void Ingresar_URL() {
		LoginPage.open();
	 }

	@Step
	public void clicSignIn() {
		LoginPage.clicIngresar();
	}
	
	@Step
	public void Ingresar_Correo(String correo) {
		LoginPage.ingresar_correo(correo);	
	}
	
	@Step
	public void Clic_crear_cuenta() {
		LoginPage.clic_crear_cuenta();		
	}
	
	@Step
	public void Ingresar_Nombre(String nombre) {
		LoginPage.ingresar_nombre(nombre);
	}

	@Step
	public void Ingresar_Apellido(String apellido) {
		LoginPage.ingresar_apellido(apellido);
	}

	@Step
	public void Ingresar_Password(String password) {
		LoginPage.ingresar_password(password);
	}

	@Step
	public void Seleccionar_dia(String dia) {
		LoginPage.seleccionar_dia(dia);
	}

	@Step
	public void Seleccionar_mes(String mes) {
		LoginPage.seleccionar_mes(mes);
	}

	@Step
	public void Seleccionar_año(String año) {
		LoginPage.seleccionar_año(año);
	}

	@Step
	public void Ingresar_NombreAddress(String nombre_address) {
		LoginPage.ingresar_NombreAddress(nombre_address);
	}

	@Step
	public void Ingresar_ApellidoAddress(String apellido_address) {
		LoginPage.ingresar_ApellidoAddress(apellido_address);
	}

	@Step
	public void Ingresar_Address(String address) {
		LoginPage.ingresar_address(address);
	}

	@Step
	public void Ingresar_Ciudad(String ciudad) {
		LoginPage.ingresar_ciudad(ciudad);
	}

	@Step
	public void Ingresar_Estado(String estado) {
		LoginPage.ingresar_estado(estado);
	}
	
	@Step
	public void Ingresar_CodigoPostal(String postal) {
		LoginPage.ingresar_codigo(postal);
	}

	@Step
	public void Ingresar_pais(String pais) {
		LoginPage.ingresar_pais(pais);
	}

	@Step
	public void Ingresar_movil(String movil) {
		LoginPage.ingresar_movil(movil);
	}

	@Step
	public void Ingresar_alias(String alias) {
		LoginPage.ingresar_alias(alias);
	}
}
