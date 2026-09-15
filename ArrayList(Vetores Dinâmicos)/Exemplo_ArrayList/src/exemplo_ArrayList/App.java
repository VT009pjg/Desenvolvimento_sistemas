package exemplo_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		String nome;
		String continuar;
		
		//Preenche a Lista
		do {
			System.out.print("Digitr um Nome: ");
			nome = input.nextLine();
			
			nomes.add(nome);
			
			System.out.print("Deseja adicionar outro Nome? (s/n): ");
			continuar = input.nextLine();
			
		} while (continuar.equalsIgnoreCase("s"));
		
		//Percorre e exibe a lista
		System.out.println("\nNomes Cadastrados:");
		
		for(String nomeCadastrado : nomes) {
			System.out.println(nomeCadastrado);
			
		}
		
		input.close();

	}

}
