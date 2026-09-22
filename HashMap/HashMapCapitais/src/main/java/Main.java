package main.java;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("São Paulo", "São Paulo");
		capitais.put("Minas Gerais", "Belo Horizonte");
		capitais.put("Bahia", "Salvador");
		capitais.put("Paraná", "Curitiba");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um Estado: ");
		String estado = scanner.nextLine();
		
		if (capitais.containsKey(estado)) {
			String capital = capitais.get(estado);
			System.out.println("A Capital De " + estado + " É: " + capital);
		} else {
			System.out.println("O Estado " + estado + " Não Está Cadastrado.");
		}
		
		scanner.close();
			
	}

}
