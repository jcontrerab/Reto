package models;

public class Data {
	
String correo;
String nombre;
String apellido;
String password;
String dia;
String mes;
String año;
String nombre_address;
String apellido_address;
String address;
String ciudad;
String estado;
String postal;
String pais;
String movil;
String alias;

public Data(String correo, String nombre, String apellido, String password, String dia, String mes, String año,
		String nombre_address, String apellido_address, String address, String ciudad, String estado, String postal,
		String pais, String movil, String alias) {
	super();
	this.correo = correo;
	this.nombre = nombre;
	this.apellido = apellido;
	this.password = password;
	this.dia = dia;
	this.mes = mes;
	this.año = año;
	this.nombre_address = nombre_address;
	this.apellido_address = apellido_address;
	this.address = address;
	this.ciudad = ciudad;
	this.estado = estado;
	this.postal = postal;
	this.pais = pais;
	this.movil = movil;
	this.alias = alias;
}

public String getCorreo() {
	return correo;
}

public String getNombre() {
	return nombre;
}

public String getApellido() {
	return apellido;
}

public String getPassword() {
	return password;
}

public String getDia() {
	return dia;
}

public String getMes() {
	return mes;
}

public String getAño() {
	return año;
}

public String getNombre_address() {
	return nombre_address;
}

public String getApellido_address() {
	return apellido_address;
}

public String getAddress() {
	return address;
}

public String getCiudad() {
	return ciudad;
}

public String getEstado() {
	return estado;
}

public String getPostal() {
	return postal;
}

public String getPais() {
	return pais;
}

public String getMovil() {
	return movil;
}

public String getAlias() {
	return alias;
}








	
}
