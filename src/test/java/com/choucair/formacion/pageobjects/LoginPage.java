package com.choucair.formacion.pageobjects;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

	@DefaultUrl("http://automationpractice.com/index.php")
	public class LoginPage extends PageObject {
	
		//Inicio
		
				/*Boton SignIn*/
				@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
				public WebElementFacade btnSignIn;
			
				/*Email address*/
				@FindBy(xpath="//*[@id=\'email_create\']")
				public WebElementFacade txtEmailAddress;
				
				/*Boton Create*/
				@FindBy(xpath="//*[@id=\'SubmitCreate\']")
				public WebElementFacade btnCreate;
				
				//Campos obligatorios your personal information
				
				/*Campo First Name*/
				@FindBy(xpath="//*[@id=\'customer_firstname\']")
				public WebElementFacade txtFirstName;
				
				/*Campo Last Name*/
				@FindBy(name="customer_lastname")
				public WebElementFacade txtLastName;
				
				/*Campo Email*/
				@FindBy(name="email")
				public WebElementFacade txtEmail;
				
				/*Campo Password*/
				@FindBy(name="passwd")
				public WebElementFacade txtPassword;
				
				/*List Cumpleaños*/
				@FindBy(name="days")
				public WebElementFacade listDia;
				
				@FindBy(name="months")
				public WebElementFacade listMes;
				
				@FindBy(name="years")
				public WebElementFacade listAño;
				
		//Campos obligatorios your address
				
				/*Campo First Name*/
				@FindBy(name="firstname")
				public WebElementFacade txtFirstNameAddress;
				
				/*Campo Last Name*/
				@FindBy(name="lastname")
				public WebElementFacade txtLastNameAddress;
				
				/*Campo Address*/
				@FindBy(name="address1")
				public WebElementFacade txtLastAddress;
				
				/*Campo City*/
				@FindBy(name="city")
				public WebElementFacade txtCity;
				
				/*Campo State*/
				@FindBy(name="id_state")
				public WebElementFacade txtState;
				
				/*Campo Code Postal*/
				@FindBy(name="postcode")
				public WebElementFacade txtPostCode;
				
				/*Campo Country*/
				@FindBy(name="id_country")
				public WebElementFacade listCountry;
				
				/*Campo Mobile*/
				@FindBy(name="phone_mobile")
				public WebElementFacade txtMobile;
				
				/*Assign address*/
				@FindBy(name="alias")
				public WebElementFacade txtAssignAddress;
				
				/*Boton registrar*/
				@FindBy (name="submitAccount")
				public WebElementFacade btnRegistrar;
				
		
				
	
	public void clicIngresar() {
    btnSignIn.click();
    }

    public void ingresar_correo(String correo) {
    txtEmailAddress.click();
    txtEmailAddress.sendKeys(correo);
    }

    public void clic_crear_cuenta() {
   btnCreate.click();	
    }
    
    public void ingresar_nombre(String nombre) {
    	txtFirstName.click();
    	txtFirstName.clear();
    	txtFirstName.sendKeys(nombre);	
    }
    

    public void ingresar_password(String password) {
    	txtPassword.click();
    	txtPassword.sendKeys(password);
    }


    public void seleccionar_dia(String dia) {
    	listDia.click();
    	//Select Dia = new Select(getDriver().findElement((By) listDia));
    //	Dia.selectByVisibleText(dia);
    }


    public void seleccionar_mes(String mes) {
    	// TODO Auto-generated method stub
    	
    }


    public void seleccionar_año(String año) {
    	// TODO Auto-generated method stub
    	
    }


    public void ingresar_NombreAddress(String nombre_address) {
    	txtFirstName.click();
    	txtFirstName.sendKeys(nombre_address);
    	
    }


    public void ingresar_ApellidoAddress(String apellido_address) {
    	txtLastNameAddress.click();
    	txtLastNameAddress.sendKeys(apellido_address);
    }


    public void ingresar_address(String address) {
    	txtLastAddress.click();
    	txtLastAddress.sendKeys(address);
    }


    public void ingresar_ciudad(String ciudad) {
    	txtCity.click();
    	txtCity.sendKeys(ciudad);
    }


    public void ingresar_estado(String estado) {
    }


    public void ingresar_codigo(String postal) {
    	txtPostCode.click();
    	txtPostCode.sendKeys(postal);
    }


    public void ingresar_pais(String pais) {
    }


    public void ingresar_movil(String movil) {
    	txtMobile.click();
    	txtMobile.sendKeys(movil);	
    }


    public void ingresar_alias(String alias) {
    	txtAssignAddress.clear();
    	txtAssignAddress.click();
    	txtAssignAddress.sendKeys(alias);	
    	
    	
    	btnRegistrar.click();
    }

	public void ingresar_apellido(String apellido) {
		txtLastName.click();
		txtLastName.sendKeys(apellido);
	}

	

    
}