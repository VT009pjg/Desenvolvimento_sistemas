package supermercado;

public class Lampada {
	String marca, modelo;
	double preço;
	int potenciaWatts;
	boolean ligada;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public int getPotenciaWatts() {
		return potenciaWatts;
	}
	public void setPotenciaWatts(int potenciaWatts) {
		this.potenciaWatts = potenciaWatts;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligada() {
		ligada = false;
		
	}
	
	public void monstrarEstado() {
		if(ligada = true) {
			System.out.println("A lâmpada está ligada");
		} else {
			System.out.println("A lampada está desligada.");
		}
	}
	
	public void exibirDados() {
    System.out.println("\nMarca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Preço: R$ " + preço);
    System.out.println("Potência: " + potenciaWatts + "W");
    System.out.println("Está Ligada ?: " + ligada);
	
	}

}
