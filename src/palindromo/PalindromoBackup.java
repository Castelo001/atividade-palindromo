package palindromo;

import java.util.Scanner;

public class PalindromoBackup {

	public static void main(String[] args) {
		int vogais = 0;// criar variaveis para contar as vogais e consoantes
		int consoantes = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = entrada.nextLine();
		String palavraSemEspaco = palavra.replace(" ", "");
		StringBuilder rv = new StringBuilder(palavra);
		String pInvertida = rv.reverse().toString();
		System.out.printf("Palavra invertida:%s\n", pInvertida);
		if (palavraSemEspaco.equalsIgnoreCase(pInvertida)) {

			System.out.println("É palindrono");
		} else {
			System.out.println("Não é palindromo.");
		}
		System.out.printf("O numero de letras é:%s\n", palavraSemEspaco.length());
		for (int i = 0; i < palavraSemEspaco.length(); i++) {
			Character letra = palavraSemEspaco.charAt(i);
			letra = Character.toLowerCase(letra);
			if (Character.isLetter(letra)) {
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' ||
						letra == 'u' ||letra == 'ã'||letra == 'ó'||letra == 'é'||
						letra == 'ú'||letra == 'ô'||letra == 'õ') {
					
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
