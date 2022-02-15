package questoes;

import java.util.Scanner;

public class Questao01 {
	
	public static String desenharTriangulo(int altura) {
		int asteriscos = 1;
		int espacos = altura -1;
		
		String trng = "";
		
		for (int fileira = 0; fileira < altura; fileira++ ) {
			for (int espacosDaColuna = 0; espacosDaColuna < espacos; espacosDaColuna++ ) {
				trng += " ";
			}
			for (int asteriscosDaColuna = 0; asteriscosDaColuna < asteriscos; asteriscosDaColuna++ ) {
				trng += "*";
			}
			trng += "\n";
			
			asteriscos ++;
			espacos --;
		}
		
		return trng;
		
	}
	
	public static void main(String[] args) {
		
		int angulo;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o angulo do triangulo");
		angulo = scan.nextInt();
		scan.close();
		System.out.println(desenharTriangulo(angulo));
	}
}