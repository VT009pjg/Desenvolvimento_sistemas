package exercicio;

import java.net.Socket;

public class App_1 {

	public static void main(String[] args) {
		
		String numero1 = "10";
		String numero2 = "5";
		String preco = "12.50";
		
		System.out.println(numero1 + numero2);
		
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		
		System.out.println("Soma: " + (n1 + n2));
		System.out.println("Subtração: " + (n1 - n2));
		System.out.println("Multiplicação: " + (n1 * n2));
		
		double precoConvertido = Double.parseDouble(preco);
		double precoAposAumento = precoConvertido + 5;
		
		System.out.println("Preço original: " + precoConvertido);
        System.out.println("Preço após aumento: " + precoAposAumento);


	}

}
