package academia;

public class AlunoAcademia {
	private String nome;
	private int idade;
	private double peso;
	private double altura;

	public AlunoAcademia(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean ehMenorDeIdade() {
		return this.idade < 18;
	}

	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}

	public void exibirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade + " anos");
		System.out.println("Peso: " + this.peso + " kg");
		System.out.println("Altura: " + this.altura + " m");
		System.out.printf("IMC: %.2f\n", calcularIMC());

		if (ehMenorDeIdade()) {
			System.out.println("Direito a Desconto: Sim (Menor de Idade)");
		} else {
			System.out.println("Direito a Desconto: Não");
		}
		System.out.println("----------------------------------------------");
	}

}
