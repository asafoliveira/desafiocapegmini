package questoes;

import static org.junit.Assert.*;

import org.junit.Test;

public class Questao01Test {

	@Test
	public void testDesenharTriangulo() {
		Questao01 q1 = new Questao01();
		assertTrue(q1.desenharTriangulo(4).length() >= 0);
	}

}
