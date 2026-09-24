package livraria;

public class LivroDeLivraria extends Livro {
	private double preco;
	private int quantidadeEstoque;

	public LivroDeLivraria(String titulo, String autor, String editora, int numeroPaginas, int anoPublicacao,
			double preco, int quantidadeEstoque) {
		super(titulo, autor, editora, numeroPaginas, anoPublicacao);
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	

	public LivroDeLivraria(String titulo, String autor, String editora, int numeroPaginas, int anoPublicacao) {
		super(titulo, autor, editora, numeroPaginas, anoPublicacao);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public void exibirDados() {
		super.exibirDados();
		System.out.printf("Preço: R$ %.2f\n", preco);
		System.out.println("Estoque Disponível: " + quantidadeEstoque + " unidade(s)");
	}
}