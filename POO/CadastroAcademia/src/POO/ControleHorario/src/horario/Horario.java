package horario;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;

	public Horario() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}

	public Horario(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public void setHora(int hora) {
		this.hora = hora;

	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;

	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;

	}
	
	public void exibir() {
		System.out.printf("%02d:%02d:%02d\\n", hora, minuto, segundo);
	}
	
	public int calcularSegundos() {
		int segundosDaHora = this.hora * 3600;
		int segundosDoMinuto = this.minuto * 60;
		return segundosDaHora + segundosDoMinuto + this.segundo;
	}

}
