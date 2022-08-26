package com.generation.proyecto.clases;
/**
 * 
 * @author Jonathan Quino
 * @Description Clase marca (Punto 19)
 */
public class Marca {
	
	private String marca;
	private byte numeroDeModelos;
	private String anioLanzamiento;
	private String codigoIdentificador;
	
	/**
	 * @Description Constructor con parámetros obligatorios
	 * 
	 * @param marca
	 * @param numeroDeModelos
	 * @param anioLanzamiento
	 * @param codigoIdentificador
	 */
	public Marca(String marca, byte numeroDeModelos, String anioLanzamiento, String codigoIdentificador) {
		this.marca = marca;
		this.numeroDeModelos = numeroDeModelos;
		this.anioLanzamiento = anioLanzamiento;
		this.codigoIdentificador = codigoIdentificador;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public byte getNumeroDeModelos() {
		return numeroDeModelos;
	}
	public void setNumeroDeModelos(byte numeroDeModelos) {
		this.numeroDeModelos = numeroDeModelos;
	}
	public String getAnioLanzamiento() {
		return anioLanzamiento;
	}
	public void setAnioLanzamiento(String anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}
	public String getCodigoIdentificador() {
		return codigoIdentificador;
	}
	public void setCodigoIdentificador(String codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
	
	
}
