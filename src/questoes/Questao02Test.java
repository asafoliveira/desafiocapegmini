package questoes;

import static org.junit.Assert.*;

import org.junit.Test;

public class Questao02Test {
	Questao02 q = new Questao02();

	@Test
	public void testTem6Digitos() {
		boolean tem6 = q.tem6Digitos("asdfghjk");
		assertTrue(tem6);
		tem6 = q.tem6Digitos("f");
		assertFalse(tem6);
	}

	@Test
	public void testFaltamQuantas() {
		int fq = q.faltamQuantas("afdfadsfasdfas");
		assertEquals(0, fq);
		int fq2 = q.faltamQuantas("gg");
		assertEquals(4, fq2);
	}

	@Test
	public void testTemNumero() {
		boolean temN = q.temNumero("asdfgh6");
		assertTrue(temN);
	}

	@Test
	public void testTemLetraMinuscula() {
		boolean temLMn = q.temLetraMinuscula("asdrtr");
		assertTrue(temLMn);
	}

	@Test
	public void testTemLetraMaiuscula() {
		boolean temLMa = q.temLetraMaiuscula("AFDDFhjk");
		assertTrue(temLMa);
	}

	@Test
	public void testTemCaracEsp() {
		boolean temCEsp = q.temCaracEsp("asdfgh");
		assertFalse(temCEsp);
	}

}
