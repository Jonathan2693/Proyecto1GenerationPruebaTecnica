/**
 * 
 */
package com.generation.proyecto;

import com.generation.proyecto.clases.Direccion;
import com.generation.proyecto.clases.Marca;
import com.generation.proyecto.clases.Propietario;
import com.generation.proyecto.clases.Vehiculo;

/**
 * @author Jonathan Quino
 *
 */
public class Main {

	/**Método principal para probar las clases implementadas (Punto 20)
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Instanciar una direccion nueva con parámetros
		Direccion direccionNueva = new Direccion("Baja California", "Santa María", "Ecatepec", "55400");
		
		//Instanciar propietario nuevo con constructor definido
		Propietario propietarioNuevo = new Propietario("Jonathan", "QURJ894571", "QURJ930726LNLURH10", direccionNueva);
		
		//Los atributos restantes se inician a traves de setters
		propietarioNuevo.setFechaNacimiento("26-07-1993");
		propietarioNuevo.setInfoAdicional("Estudiante");
		
		//Se instancia una marca nueva con constructor
		Marca marcaNueva = new Marca("Toyota", (byte) 2, "2021", "NIV555154541");
		
		//Se instancia vehículo nuevo con propietario obligatorio
		Vehiculo vehiculoNuevo = new Vehiculo(propietarioNuevo);
		
		//Se inician los atributos restantes de vehículo nuevo através de setters
		vehiculoNuevo.setModelo("Prius");
		vehiculoNuevo.setColor("Negro");
		vehiculoNuevo.setMarca(marcaNueva);
		vehiculoNuevo.setChasis("Chasis de Titanio");
		vehiculoNuevo.setVelocidadMaxima((short) 10);
		vehiculoNuevo.setVelocidadActual((short) 5);
		vehiculoNuevo.setNumeroPuertas((byte) 5);
		vehiculoNuevo.setHasTechoSolar(false);
		vehiculoNuevo.setNumeroMarchas((byte) 6);
		vehiculoNuevo.setHasTransmisionAutomatica(true);
		vehiculoNuevo.setNivelCombustible((byte) 40);
		
		//Uso de métodos de vehículo nuevo
		//Revisar consola de Eclipse para verificar resultados
		vehiculoNuevo.acelerar();
		vehiculoNuevo.cambiarMarcha();
		vehiculoNuevo.reducirMarcha();
		vehiculoNuevo.calcularAutonomia((byte) 13);
		vehiculoNuevo.mostrarNivelCombustible();
		vehiculoNuevo.frenado();
		vehiculoNuevo.acelerar();
		vehiculoNuevo.frenado();
		vehiculoNuevo.reducirMarcha();
		
	}

}
