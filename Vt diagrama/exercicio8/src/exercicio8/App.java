package exercicio8;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, opção;
		
		System.out.println("Digite o Primero Número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o Segundo Número: ");
		num2 = leia.nextInt();

		System.out.println("\n======MENU======\n");
		System.out.println("1 - Calcular Media");
		System.out.println("2 - Subtrair o Menor Número do Maior");
		System.out.println("3 - Multiplicar os Número");
		System.out.println("4 - Dividir o Primeiro Número Pelo Segundo");
		opção = leia.nextInt();
		
		switch(opção) {
		case 1:
			System.out.println("Média: " + (num1 + num2) / 2);
			break;
		case 2:
			if(num1 > num2) System.out.println(num1 = num2);
			else System.out.println("Subtração: " + (num1 = num2));
			break;
		case 3: 
			System.out.println("Multiplicação: " + (num1 * num2));
		case 4: 
			if(num2 != 0) System.out.println("Divisão: " + (num1 / num2));
			break;
		default:
		}
	}

}
