package questoes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao02 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		String senhaString = scan.next();
		scan.close();
		
		System.out.println("Possui 6 dígitos? " + tem6Digitos(senhaString));
		System.out.println("Possui número? " + temNumero(senhaString));
		System.out.println("Possui letra minúscula? " + temLetraMinuscula(senhaString));
		System.out.println("Possui letra maiúscula? " + temLetraMaiuscula(senhaString));
		System.out.println("Possui caracter especial? " + temCaracEsp(senhaString));
		System.out.println("Faltam quantos dígitos: " + faltamQuantas(senhaString));
		
	}
	
	public static boolean tem6Digitos(String senha) {
		return senha.length() >= 6 ? true : false; 
	}
	
	public static int faltamQuantas(String senha) {
		return senha.length() <= 6 ? (6 - senha.length()) : 0;
	}
	
	public static boolean temNumero(String senha) {
		String regex = "^(?=.*[0-9]).{1,1000000}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(senha);
		return m.matches();
	}
	
	public static boolean temLetraMinuscula(String senha) {
		String regex = "(?=.*[a-z]).{1,1000000}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(senha);
		return m.matches();
	}
	
	public static boolean temLetraMaiuscula(String senha) {
		String regex = "(?=.*[A-Z]).{1,1000000}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(senha);
		return m.matches();
	}
	
	public static boolean temCaracEsp(String senha) {
		String regex = "(?=.*[!@#$%^&*()-+]).{1,1000000}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(senha);
		return m.matches();
	}

}

