package consumo;

public class Eletrodomestico {
	 public String nome;
	 public double potenciaWatts;
	 public double  horasPorDia;
	
	 public Eletrodomestico() { 
	 }
	 
	 public Eletrodomestico(String nome, double potenciaWatts, double horasPorDia ) {
		 this.nome = nome;
		 this.potenciaWatts = potenciaWatts;
		 this.horasPorDia = horasPorDia;
	 }
	 
	 public double consumoDiarioWh() {
		 return this.potenciaWatts * this.horasPorDia;
	 }
	 
	 public double consumoMensalWh() {
		 return consumoDiarioWh() * 30;
	 }
	 
	 public double consumoAnualWh() {
		 return consumoMensalWh() * 12;
	 }
	 
	 public double gastoMensal(double precoKwh) {
		 double consumoMensalKwh = consumoMensalWh() / 1000.0;
		 return consumoMensalKwh = precoKwh;
	 }
	 
	 public void exibirRelatorio(double precoKwh) {
	        System.out.println("========================================");
	        System.out.println("RELATÓRIO DE CONSUMO: " + this.nome.toUpperCase());
	        System.out.println("========================================");
	        System.out.printf("Potência: %.2f W%n", this.potenciaWatts);
	        System.out.printf("Uso diário: %.2f h%n", this.horasPorDia);
	        System.out.printf("Consumo diário: %.2f Wh%n", consumoDiarioWh());
	        System.out.printf("Consumo mensal: %.2f Wh (%.2f kWh)%n", consumoMensalWh(), consumoMensalWh() / 1000.0);
	        System.out.printf("Consumo anual: %.2f Wh (%.2f kWh)%n", consumoAnualWh(), consumoAnualWh() / 1000.0);
	        System.out.printf("Tarifa: R$ %.2f / kWh%n", precoKwh);
	        System.out.printf("Custo mensal estimado: R$ %.2f%n", gastoMensal(precoKwh));
	        System.out.println("========================================\n");
	 }
	 
	 public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getPotenciaWatts() {
	        return potenciaWatts;
	    }

	    public void setPotenciaWatts(double potenciaWatts) {
	        this.potenciaWatts = potenciaWatts;
	    }

	    public double getHorasPorDia() {
	        return horasPorDia;
	    }

	    public void setHorasPorDia(double horasPorDia) {
	        this.horasPorDia = horasPorDia;
	    }
}

