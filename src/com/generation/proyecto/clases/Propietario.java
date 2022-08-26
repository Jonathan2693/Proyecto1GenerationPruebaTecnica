package com.generation.proyecto.clases;
/**
 * 
 * @author Jonathan Quino
 * @Description Clase Propietario con acceso público (Punto 1)
 */
public class Propietario {

	//Declaración y Encapsulamiento de atributos con acceso private	(Punto 2 y 3)
	private String nombre;
	private String rfc;
	private String curp;
	private String fechaNacimiento;
	private Direccion direccion;
	private String infoAdicional;
	
	/**
	 * 
	 * @param nombre
	 * @param rfc
	 * @param curp
	 * @param direccion
	 * 
	 * @Notes Constructor con parámetros obligatorios (Punto 4, 12, 14)
	 */
	public Propietario(String nombre,String rfc, String curp, Direccion direccion) {
		this.nombre=nombre;
		this.rfc=rfc;
		this.curp=curp;
		this.direccion=direccion;
	}

	//Declaración de getters y setters, ningún atributo debe accederse o declararse en valor de manera directa
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getInfoAdicional() {
		return infoAdicional;
	}

	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	
	
}
