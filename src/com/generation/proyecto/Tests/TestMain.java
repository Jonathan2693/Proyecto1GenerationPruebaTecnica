package com.generation.proyecto.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.generation.proyecto.clases.Direccion;
import com.generation.proyecto.clases.Marca;
import com.generation.proyecto.clases.Propietario;
import com.generation.proyecto.clases.Vehiculo;

/**
 * 
 * @author Jonathan Quino
 * @Description Clase donde se realizan los test del proyecto 1
 */
class TestMain {

	
	
	//Instancia de clases para utilizarse en los test
	
	private static Direccion direccionTest;
	private static Propietario propietarioTest;
	private static Marca marcaTest;
	private static Vehiculo vehiculoTest;
	
	/**
	 * @Description Metodo para iniciar todas las instancias que se probaran en métodos 
	 */
	@BeforeAll
	@DisplayName(value="Inicialización de clases de proyecto")
	static void initTest() {
		direccionTest = new Direccion("CalleTest", "VecindarioTest", "CiudadTest", "CPTest");
		propietarioTest = new Propietario("NombreTest", "RFCTest", "CURPTest", direccionTest);
		propietarioTest.setFechaNacimiento("FechaTest");
		propietarioTest.setInfoAdicional("InfoTest");
		marcaTest = new Marca("MarcaTest", (byte) 2, "AñoTest", "CodigoTest");
		vehiculoTest = new Vehiculo(propietarioTest);
		vehiculoTest.setModelo("PriusTest");
		vehiculoTest.setColor("NegroTest");
		vehiculoTest.setMarca(marcaTest);
		vehiculoTest.setChasis("ChasisTest");
		vehiculoTest.setVelocidadMaxima((short) 10);
		vehiculoTest.setVelocidadActual((short) 5);
		vehiculoTest.setNumeroPuertas((byte) 5);
		vehiculoTest.setHasTechoSolar(false);
		vehiculoTest.setNumeroMarchas((byte) 6);
		vehiculoTest.setHasTransmisionAutomatica(true);
		vehiculoTest.setNivelCombustible((byte) 40);

	}
	
	/**
	 * @Description Test para probar la clase direccion
	 */
	@Test
	@DisplayName(value="Test para clase Dirección")
	void testDireccion() {
		Direccion direccion = new Direccion("CalleTest", "VecindarioTest", "CiudadTest", "CPTest");
		assertEquals(direccionTest.getCalle(), direccion.getCalle());
		assertEquals(direccionTest.getVecindario(),direccion.getVecindario());
		assertEquals(direccionTest.getCiudad(), direccion.getCiudad());
		assertEquals(direccionTest.getCodigoPostal(), direccion.getCodigoPostal());
		
	}

	/**
	 * @Description Test para probar clase propietario
	 */
	@Test
	@DisplayName(value="Test para clase propietario")
	void testPropietario() {
		Propietario propietario= new Propietario("NombreTest", "RFCTest", "CURPTest", direccionTest);
		propietario.setFechaNacimiento("FechaTest");
		propietario.setInfoAdicional("InfoTest");
		assertEquals(propietarioTest.getNombre(), propietario.getNombre());
		assertEquals(propietarioTest.getRfc(), propietario.getRfc());
		assertEquals(propietarioTest.getCurp(), propietario.getCurp());
		assertEquals(propietarioTest.getDireccion(), propietario.getDireccion());
		assertEquals(propietarioTest.getFechaNacimiento(), "FechaTest");
		assertEquals(propietarioTest.getInfoAdicional(), "InfoTest");
	}
	
	/**
	 * @Description Test para clase Marca
	 */
	@Test
	@DisplayName(value="Test para clase Marca")
	void testMarca() {
		Marca marca = new Marca("MarcaTest", (byte) 2, "AñoTest", "CodigoTest");
		assertEquals(marcaTest.getMarca(), marca.getMarca());
		assertEquals(marcaTest.getNumeroDeModelos(), marca.getNumeroDeModelos());
		assertEquals(marcaTest.getAnioLanzamiento(), marca.getAnioLanzamiento());
		assertEquals(marcaTest.getCodigoIdentificador(), marca.getCodigoIdentificador());
	}
	
	/**
	 * @Description Test para clase Vehiculo
	 */
	@Test
	@DisplayName(value = "Test para clase Vehiculo")
	void testVehiculo() {
		Vehiculo vehiculo = new Vehiculo(propietarioTest);
		vehiculo.setModelo("PriusTest");
		vehiculo.setColor("NegroTest");
		vehiculo.setMarca(marcaTest);
		vehiculo.setChasis("ChasisTest");
		vehiculo.setVelocidadMaxima((short) 10);
		vehiculo.setVelocidadActual((short) 5);
		vehiculo.setNumeroPuertas((byte) 5);
		vehiculo.setHasTechoSolar(false);
		vehiculo.setNumeroMarchas((byte) 6);
		vehiculo.setHasTransmisionAutomatica(true);
		vehiculo.setNivelCombustible((byte) 40);
		assertEquals(vehiculoTest.getModelo(), vehiculo.getModelo());
		assertEquals(vehiculoTest.getColor(), vehiculo.getColor());
		assertEquals(vehiculoTest.getMarca(), vehiculo.getMarca());
		assertEquals(vehiculoTest.getChasis(), vehiculo.getChasis());
		assertEquals(vehiculoTest.getVelocidadActual(), vehiculo.getVelocidadActual());
		assertEquals(vehiculoTest.getVelocidadMaxima(), vehiculo.getVelocidadMaxima());
		assertEquals(vehiculoTest.getNumeroPuertas(), vehiculo.getNumeroPuertas());
		assertFalse(vehiculoTest.isHasTechoSolar());
		assertTrue(vehiculoTest.isHasTransmisionAutomatica());
		assertEquals(vehiculoTest.getNumeroMarchas(), vehiculo.getNumeroMarchas());
		assertEquals(vehiculoTest.getNivelCombustible(), vehiculo.getNivelCombustible());
		
		//Se suma 1 a velocidad actual, que es 5 en initTest()
		vehiculoTest.acelerar();
		assertEquals(vehiculoTest.getVelocidadActual(),(byte) 6);
		
		//Se frena el vehiculo para que la velocidad actual sea 0
		vehiculoTest.frenado();
		assertEquals(vehiculoTest.getVelocidadActual(),(byte) 0);
		
		vehiculoTest.reducirMarcha();
		vehiculoTest.calcularAutonomia((byte)10);
		vehiculoTest.mostrarNivelCombustible();
		
		//A traves de mocks y powermocks(para métodos static y private) se crean instancias falsas de clases y se pueden determinar número de ejecuciones
		//resultados de retorno y condiciones de ejecucion sobre los mocks creados
		//Sin embargo, los mock se reservan para instancias y servicios más complejos, contra proyectos que no son de alta cohesión
		//Ejemplos
		//@Mock
		//private Vehiculo vehiculoMock;
		//mockito.verify(vehiculo.class,atLeastOnce().acelerar();
		//este verificacion contaría que el metodo acelerar de vehiculo se ejecutara una vez
	}
	
}
