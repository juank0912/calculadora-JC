package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	public void sumaEnteros() {
		System.out.println("suma de enteros...");
		Suma s = new Suma (2,3);
		assertTrue(s.suma() == 5);
	}
	
	@Test
	public void sumaNegativo() {
		System.out.println("suma de negativos...");
		Suma s = new Suma (-2,-8);
		assertTrue(s.suma() == -10);
	}
	
	@Test
	public void sumaMixto() {
		System.out.println("Suma mixta...");
		Suma s = new Suma (-1,2);
		assertTrue(s.suma() == 1);
		
	}

}
