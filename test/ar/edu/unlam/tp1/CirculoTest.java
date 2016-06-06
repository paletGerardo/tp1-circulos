package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo c = new Circulo(2);
		assertEquals(12.56 , c.getCircunferencia(), 0.01);		
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo c = new Circulo(3.7);
		assertEquals(23.24 , c.getCircunferencia(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo c = new Circulo(5);
		assertEquals(31.41 , c.getCircunferencia(), 0.01);	
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo c = new Circulo(10.9);
		assertEquals(68.48 , c.getCircunferencia(), 0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo c = new Circulo(9.8);
		assertEquals(615.73 , c.getArea(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo c = new Circulo(16.6);
		assertEquals(865.69 , c.getArea(), 0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
