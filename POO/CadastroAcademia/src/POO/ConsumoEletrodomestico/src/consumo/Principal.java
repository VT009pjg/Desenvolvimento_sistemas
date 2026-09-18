package consumo;

public class Principal {
	public static void main(String[] args) {
		double tarifa = 0.90;
		
        Eletrodomestico ventilador = new Eletrodomestico("Ventilador", 100.0, 8.0);
        ventilador.exibirRelatorio(tarifa);     
        ventilador.setHorasPorDia(4.0);     
        ventilador.exibirRelatorio(tarifa);
	}

}
