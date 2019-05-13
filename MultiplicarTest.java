package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicarTest {

	@Test
	public void multiplicar() {
		System.out.println("multiplicacion de positivos...");
		Multiplicar M = new Multiplicar (2,3);
		assertTrue(M.multiplicar() == 6);
	}
	
	@Test
	public void multiplicarnegativo() {
		System.out.println("multiplicacion de negativos...");
		Multiplicar M = new Multiplicar (-2,-8);
		assertTrue(M.multiplicar() == 16);
	}
	
	@Test
	public void multiplicacionMixto() {
		System.out.println("mutiplicacion mixta...");
		Multiplicar M = new Multiplicar  (-1,2);
		assertTrue(M.multiplicar() == -2);
		
	}

}
