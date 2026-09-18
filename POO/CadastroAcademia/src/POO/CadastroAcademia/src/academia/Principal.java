package academia;

public class Principal {
	public static void main(String[] args) {
		
		AlunoAcademia ana = new AlunoAcademia("Ana", 17, 60.0, 1.65);
		AlunoAcademia bruno = new AlunoAcademia("Bruno", 25, 80.0, 1.80);
		
		System.out.println("---DADOS DOS ALUNOS---");
		ana.exibirDados();
		bruno.exibirDados();
		
		bruno.setPeso(78.0);
		System.out.println("Atualização de dados:");
        System.out.println("O peso de Bruno foi alterado para: " + bruno.getPeso() + " kg");
        System.out.printf("Novo IMC de Bruno: %.2f\n", bruno.calcularIMC());
	}

}
