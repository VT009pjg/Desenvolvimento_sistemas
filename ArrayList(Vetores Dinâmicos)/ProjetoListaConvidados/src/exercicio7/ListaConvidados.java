package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- MENU DE CONVIDADOS ---");
            System.out.println("1 - Adicionar convidado");
            System.out.println("2 - Alterar convidado");
            System.out.println("3 - Remover convidado");
            System.out.println("4 - Procurar convidado");
            System.out.println("5 - Exibir convidados");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha uma opção: ");
            
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    
                    System.out.print("Digite o nome do convidado: ");
                    String nomeAdicionar = scanner.nextLine();
                    convidados.add(nomeAdicionar);
                    System.out.println("Convidado adicionado com sucesso!");
                    break;

                case 2:
                    
                    if (convidados.isEmpty()) {
                        System.out.println("A lista de convidados está vazia.");
                        break;
                    }
                    System.out.print("Digite a posição (índice) do convidado a ser alterado (0 a " + (convidados.size() - 1) + "): ");
                    int posicao = scanner.nextInt();
                    scanner.nextLine(); 

                    
                    if (posicao >= 0 && posicao < convidados.size()) {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = scanner.nextLine();
                        convidados.set(posicao, novoNome);
                        System.out.println("Convidado alterado com sucesso!");
                    } else {
                        System.out.println("Posição inválida! Tente novamente.");
                    }
                    break;

                case 3:
                   
                    System.out.print("Digite o nome do convidado que deseja remover: ");
                    String nomeRemover = scanner.nextLine();
                    
                    if (convidados.contains(nomeRemover)) {
                        convidados.remove(nomeRemover);
                        System.out.println("Convidado removido com sucesso!");
                    } else {
                        System.out.println("Convidado não encontrado na lista.");
                    }
                    break;

                case 4:
                   
                    System.out.print("Digite o nome do convidado que deseja procurar: ");
                    String nomeProcurar = scanner.nextLine();
                    
                    int indice = convidados.indexOf(nomeProcurar);
                    if (indice != -1) {
                        System.out.println("O convidado está na posição (índice): " + indice);
                    } else {
                        System.out.println("Convidado não encontrado.");
                    }
                    break;

                case 5:
                   
                    System.out.println("\n--- LISTA DE CONVIDADOS ---");
                    if (convidados.isEmpty()) {
                        System.out.println("Nenhum convidado cadastrado.");
                    } else {
                        int i = 0;
                        for (String convidado : convidados) {
                            System.out.println("Posição " + i + ": " + convidado);
                            i++;
                        }
                    }
                    break;

                case 6:
                    
                    System.out.println("Encerrando o programa. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 6.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
