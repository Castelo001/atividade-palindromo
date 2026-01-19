package palindromo;

import java.util.Scanner;

public class AtvPalindromo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = entrada.nextLine();
		StringBuilder rv = new StringBuilder(palavra);
		String pInvertida = rv.reverse().toString();
		System.out.printf("Palavra invertida:%s\n", pInvertida);
		if (palavra.equalsIgnoreCase(pInvertida)) {
			System.out.println("É palindrono");
		} else {
			System.out.println("Não é palindromo");
		}
			System.out.printf("O numero de letras da palavra é:%s",palavra.length());
			entrada.close();
	}
}