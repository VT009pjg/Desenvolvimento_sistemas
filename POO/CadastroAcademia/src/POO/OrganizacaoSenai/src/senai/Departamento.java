package senai;

import java.util.ArrayList;

public class Departamento {
	int codigo;
	String nome;
	String telefone;
	ArrayList<Funcionario> funcionarios;
	
	public Departamento(int codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        funcionarios = new ArrayList<>();
    }
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void exibirDados() {
		System.out.println(codigo + " - " + nome + " - " + telefone);
		System.out.println("===Funcionarios===");
		listarFuncionarios();
	}
	
	public void listarFuncionarios() {
		for (Funcionario f : funcionarios)
			f.exibirDados();
	}
}
