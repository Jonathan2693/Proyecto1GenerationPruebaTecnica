package com.generation.proyecto.clases;

/**
 * 
 * @author Jonathan Quino
 *@Description Clase Dirección (Punto 12)
 */
public class Direccion {
	
	//Atributos encapsulados para acceso private (Punto 13)
	private String calle;
	private String vecindario;
	private String ciudad;
	private String codigoPostal;
	
	/**
	 * @Description Constructor con atributos iniciales
	 * @param calle
	 * @param vecindario
	 * @param ciudad
	 * @param codigoPostal
	 */
	public Direccion(String calle, String vecindario, String ciudad, String codigoPostal) {
		super();
		this.calle = calle;
		this.vecindario = vecindario;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getVecindario() {
		return vecindario;
	}
	public void setVecindario(String vecindario) {
		this.vecindario = vecindario;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
}
