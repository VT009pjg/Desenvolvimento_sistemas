package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTarefas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> tarefas = new ArrayList<>();
		String tarefa;
		String continuar;
		int contador = 0;
		
		do {
			System.out.print("Digite Uma Tarefa: ");
			tarefa = input.nextLine();
			
			tarefas.add(tarefa);
			contador++;
			
			System.out.print("Deseja Cadastrar Outra Tarefa? (s/n): ");
			continuar = input.nextLine();
			
		} while (continuar.contentEquals("s"));
		
		System.out.println("\nTarefas Cadastradas:");
		
		for (String tarefaCadastrada : tarefas) {
			System.out.println(tarefaCadastrada);
		}
		
		System.out.println("\nTarefas Cadastradas: " + contador);
		
		input.close();

	}

}
