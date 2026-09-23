package supermercado;

public class Principal {
	public static void main(String[] args) {
		Lampada l1 = new Lampada();
		l1.marca = "Samsung";
		l1.modelo = "Lâmpada Bulbo LED T 50W Bivolt 6500K - Elgin";
		l1.preço = 29.75;
		l1.potenciaWatts = 9;
		l1.ligada = true;
		
		l1.exibirDados();
		
		Lampada l2 = new Lampada();
		l2.marca = "Motorola";
		l2.modelo = "Lâmpada Fluorescente Compacta 3u 20w E27 6400k";
		l2.preço = 33.70;
		l2.potenciaWatts = 9;
		l2.ligada = true;
		
		l2.exibirDados();
	}

}
