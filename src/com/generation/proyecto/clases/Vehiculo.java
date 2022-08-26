package com.generation.proyecto.clases;
/**Clase de Vehiculo
 * Implementar clase vehículo (Punto 5)
 */

public class Vehiculo {

	//Declaración de atributos y encapsulamiento (Punto 6 y 7)
	//Atributosde tipo short y byte para evitar datos con asignación de memoria grande
	//(Integer, double y float)
	private String modelo;
	private String color;
	private Marca marca;
	private String chasis;
	private Propietario propietario;	
	private short velocidadMaxima;	//	km/hr
	private short velocidadActual;	//	km/hr
	private byte numeroPuertas;
	private boolean hasTechoSolar;
	private byte numeroMarchas;
	private boolean hasTransmisionAutomatica;
	private byte nivelCombustible;	//litros
	
	/**
	 * @Description Constructor que inicia un objeto Vehículo con una instancia de propietario obligatoria (Punto 15)
	 * @param propietario
	 */
	public Vehiculo(Propietario propietario) {
		this.propietario=propietario;
	}
	
	/**
	 * @Description Método de acelerar en 1km/hr, se coloca condición para no superar velocidad máxima (Punto 8)
	 * @param No hay parámetros de entrada
	 * @return No hay información de retorno
	 */
	public void acelerar() {	
		if(getVelocidadActual()+1 > getVelocidadMaxima()) {
			setVelocidadActual(getVelocidadMaxima());
		}
		else {
			setVelocidadActual((short) (getVelocidadActual()+1));
		}
		System.out.println("Has acelerado y la velocidad actual es " + getVelocidadActual());
	}
	
	/**
	 * @Description Método para que el vehículo frene, la valocidad actual se coloca en 0 (Punto 9)
	 * @param No hay parámetros de entrada
	 * @return No hay información de retorno
	 */
	public void frenado() {
		setVelocidadActual((short) 0);
		System.out.println("El auto ha frenado, la velocidad actual es " + getVelocidadActual());
	}
	
	/**
	 * @Description Método para cambiar la marcha del vehículo (Punto 10)
	 * @param No hay parámetros de entrada
	 * @return No hay información de retorno
	 */
	public void cambiarMarcha() {
		System.out.println("El auto ha cambiado de marcha");
	}
	
	/**
	 * @Description Método para que el vehículo vaya en reversa, si hay una velocidad positiva no se podra ir marcha atrás (Punto 11,16)
	 * @param No hay parámetros de entrada
	 * @return No hay información de retorno
	 */
	public void reducirMarcha() {
		String mensaje = (getVelocidadActual()>0) ? "No se puede poner marcha atrás, tienes una velocidad positiva":"El auto va marcha atrás";
		System.out.println(mensaje);
	}
	
	/**
	 * @Description Método que muestra el nivel de combustible impreso en consola (Punto 18)
	 * @param No hay parámetros de entrada
	 * @return No hay información de retorno
	 */
	public void mostrarNivelCombustible() {
		System.out.println("El nivel del combustible actual es = "+ getNivelCombustible() + " litros");
	}
	
	/**
	 * @Description Método para calcular la autonomía de vehiculo, Kilómetros restantes = nivel de combustible (litros) * consumo medio (km/litros) (Punto 17)
	 * @param Dato tipo Byte de consumo Medio
	 * @return No hay información de retorno
	 */
	public void calcularAutonomia(byte consumoMedio) {
		System.out.println("Aún puedes viajar "+getNivelCombustible()*consumoMedio+" km");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public short getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(short velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public short getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(short velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public byte getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(byte numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public boolean isHasTechoSolar() {
		return hasTechoSolar;
	}

	public void setHasTechoSolar(boolean hasTechoSolar) {
		this.hasTechoSolar = hasTechoSolar;
	}

	public byte getNumeroMarchas() {
		return numeroMarchas;
	}

	public void setNumeroMarchas(byte numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}

	public boolean isHasTransmisionAutomatica() {
		return hasTransmisionAutomatica;
	}

	public void setHasTransmisionAutomatica(boolean hasTransmisionAutomatica) {
		this.hasTransmisionAutomatica = hasTransmisionAutomatica;
	}

	public byte getNivelCombustible() {
		return nivelCombustible;
	}

	public void setNivelCombustible(byte nivelCombustible) {
		this.nivelCombustible = nivelCombustible;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
}
