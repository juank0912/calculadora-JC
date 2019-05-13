package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class restaTest {

	@Test
	public void restar() {
		System.out.println("resta de positivos...");
		resta r = new resta (2,3);
		assertTrue(r.restar() == 1);
	}
	
	@Test
	public void restanegativos() {
		System.out.println("resta de negativos...");
		resta r = new resta (-10,-10);
		assertTrue(r.restar() == 0);
	}

}
