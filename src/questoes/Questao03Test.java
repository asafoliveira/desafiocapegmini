package questoes;

import static org.junit.Assert.*;

import org.junit.Test;

public class Questao03Test {
	
	Questao03 q3 = new Questao03();
	
	@Test
	public void testRetorneTodasAsSubStrings() {
		String arr[] = q3.retorneTodasAsSubStrings("ab", 2);
		assertEquals(3, arr.length);
	}
	
	@Test
	public void testPrintAnagramas() {
		String str[] = {"ovo", "ava", "fala"};
		q3.printAnagramas(str);
	}

}
