package cadastro_numeros;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] num = new int [5];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Digite o Numero da Posição " + i + ": ");
			num[i] = input.nextInt();

		}
		
		for(int nums : num){
		System.out.println("\nNúmeros Cadastrados: " + nums);
		
		}
	
	}

}
