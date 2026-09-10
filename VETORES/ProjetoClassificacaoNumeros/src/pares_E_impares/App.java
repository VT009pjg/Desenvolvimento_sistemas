package pares_E_impares;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numeros = new int [8];
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite a " + (i + 1) +"º Número: ");
			numeros[i] = input.nextInt();

		}
		
		for(int i = 1; i < numeros.length; i++) {
			
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " PAR\n");
				pares++;
			} else {
				System.out.println(numeros[i] + " ÍMPAR\n");
				impares++;
			}
		}
		
		System.out.println("\nQuantidade de Números Pares: " + pares);
		System.out.println("\nQuantidade de Números Impares: " + impares);
		
		input.close();

	}
	
}
