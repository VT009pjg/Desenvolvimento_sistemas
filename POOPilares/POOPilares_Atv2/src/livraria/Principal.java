package livraria;

public class Principal {

	public static void main(String[] args) {
		System.out.println("=== TESTE DA PARTE 1: LIVROS ===");

		Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Livraria Garnier", 256, 1899);
		Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", "Allen & Unwin", 310, 1937);

		livro1.exibirDados();
		System.out.println();
		livro2.exibirDados();

		System.out.println("\n=== TESTE DA PARTE 2: LIVROS DE LIVRARIA ===");

		LivroDeLivraria livroLivraria1 = new LivroDeLivraria("O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCol", 1200, 1954, 129.90, 15);

		LivroDeLivraria livroLivraria2 = new LivroDeLivraria("1984", "George Orwell", "Companhia das Letras", 336, 1949, 49.90, 8);

		livroLivraria1.exibirDados();
		System.out.println();
		livroLivraria2.exibirDados();
	}
}
