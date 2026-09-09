package exercicio6;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 6:
			System.out.println("Quinta-Feira");
			break;
		case 7:
			System.out.println("Sexta-Feira");
			break;
		case 8:
			System.out.println("Sábado");
			break;
			
		default:
            System.out.println("Opção inválida");
        
		}

	}

}
