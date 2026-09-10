package analise_temperaturas;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] temps = new double [7];
		
		for(int i = 0; i < temps.length; i++) {
			System.out.println("Digite a " + (i + 1) +"º Temperatura: ");
			temps[i] = input.nextDouble();


		}
		
		double maiorTemperatura = 0;
		double menorTemperatura = 0;
		
		for(int i = 1; i < temps.length; i++) {
			
			if(temps[i] > maiorTemperatura) {
				maiorTemperatura = temps[i];
			}
			
			if(temps[i] < menorTemperatura) {
				menorTemperatura = temps[i];
			}
		}
		
		System.out.println("\nTemperaturas Cadastradas:");
		
		for (int i = 0; i < temps.length; i++) {
			System.out.println("Dia " + (i + 1) + ": " + temps[i]);
		}
		
		System.out.println("\nMaior Temperatura: " + maiorTemperatura + " °C");
		System.out.println("\nMenor Temperatura: " + menorTemperatura + " °C");
		
		input.close();

	}
	
}
