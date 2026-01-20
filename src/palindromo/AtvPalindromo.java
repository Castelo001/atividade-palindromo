package palindromo;

import java.util.Scanner;

public class AtvPalindromo {

	public static void main(String[] args) {
		int vogais = 0;// criar variaveis para contar as vogais e consoantes
		int consoantes = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = entrada.nextLine();
		StringBuilder rv = new StringBuilder(palavra);
		String pInvertida = rv.reverse().toString();
		System.out.printf("Palavra invertida:%s\n", pInvertida);
		if (palavra.equalsIgnoreCase(pInvertida)) {

			System.out.println("É palindrono");
		} else {
			System.out.println("Não é palindromo.");
		}
		System.out.printf("O numero de letras da palavra é:%s\n", palavra.length());
		for (int i = 0; i < palavra.length(); i++) {
			Character letra = palavra.charAt(i);
			letra = Character.toLowerCase(letra);
			if (Character.isLetter(letra)) {
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
					vogais++;
				} else {
					consoantes++;
				}
			}
		}
		System.out.printf("Numero de consoantes:%d\n", consoantes);
		System.out.printf("Numero de vogais:%d\n", vogais);
		entrada.close();
	}
}
