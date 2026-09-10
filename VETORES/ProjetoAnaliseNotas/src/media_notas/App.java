package media_notas;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] notas = new double [4];
		double soma = 0;
		double media = 0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) +"º Nota: ");
			notas[i] = input.nextDouble();
		}
		
		for(double nota : notas) {
			System.out.println("\nNotas Cadastradas: " + nota);
			soma = soma + nota;
		
		}
		
		media = soma / notas.length;
			System.out.println("\n\nMedia: " + media);
	
	}

}
