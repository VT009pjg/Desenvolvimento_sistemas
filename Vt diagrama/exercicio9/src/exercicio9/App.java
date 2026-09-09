package exercicio9;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um Número");
		num = leia.nextInt();
		
		while (num > 0) {
			System.out.printf("Valor Digitado: %d%n"
					+ "Quadrdo: %d%n"
					+ "Cubo: %d%n"
					+ "Raiz: %.2f%n", num, num *num, num * num * num, Math.sqrt(num));
			
			System.out.println("Informe um Número");
			num = leia.nextInt();
		}
		

	}

}
