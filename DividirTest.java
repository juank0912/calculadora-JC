package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DividirTest {

	@Test
	public void dividir() {
		System.out.println("division de doubles...");
		Dividir d = new Dividir (6,3);
		assertTrue(d.dividir() == 2);
	}

}
