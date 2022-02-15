package questoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String palavra = scan.next();
		scan.close();
		String arr[] = retorneTodasAsSubStrings(palavra, palavra.length());
		printAnagramas(arr);
		
	}
	
	public static void printAnagramas(String arr[]) {
		
		int contagem = 0;
		
        HashMap<String, List<String> > map = new HashMap<>();
 
        for (int i = 0; i < arr.length; i++) {
 
        	
            String palavra = arr[i];
            char[] letras = palavra.toCharArray();
            Arrays.sort(letras);
            String newWord = new String(letras);
 
            if (map.containsKey(newWord)) {
                map.get(newWord).add(palavra);
            }
            else {
                List<String> words = new ArrayList<>();
                words.add(palavra);
                map.put(newWord, words);
            }
        }
 
        for (String s : map.keySet()) {
            List<String> valores = map.get(s);
            if (valores.size() > 1) {
            	contagem++;
                System.out.print(valores);
            }
        }
        
        System.out.println("\nTem " + contagem + " pares de anagramas.");
    }
	
	 public static String[] retorneTodasAsSubStrings(String str, int n) {
		 String retorno = "";
		 for (int i = 0; i < n; i++)
			 for (int j = i+1; j <= n; j++)
				 retorno += str.substring(i, j) + ",";
		 
		 String arr[] = retorno.split(",");
		 
		 return arr;
	 }

}
