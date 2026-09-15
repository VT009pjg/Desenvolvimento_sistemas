package exemplo7;

import java.util.ArrayList;
import java.util.Scanner;

public class app7 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();
        int op;

        do {
            System.out.print("\n1-Add | 2-Alterar | 3-Remover | 4-Procurar | 5-Listar | 6-Sair\nOpção: ");
            op = Scanner.nextInt();
            Scanner.nextLine(); 

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    convidados.add(Acan.nextLine());
                    break;
                case 2:
                    System.out.print("Posição (0 a " + (convidados.size() - 1) + "): ");
                    int pos = scan.nextInt();
                    scan.nextLine();
                    if (pos >= 0 && pos < convidados.size()) {
                        System.out.print("Novo nome: ");
                        convidados.set(pos, scan.nextLine());
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    break;
                case 3:
                    System.out.print("Nome para remover: ");
                    String rem = scan.nextLine();
                    if (convidados.contains(rem)) {
                        convidados.remove(rem);
                        System.out.println("Removido!");
                    } else {
                        System.out.println("Não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Nome para procurar: ");
                    int idx = convidados.indexOf(scan.nextLine());
                    System.out.println(idx != -1 ? "Posição: " + idx : "Não encontrado.");
                    break;
                case 5:
                    System.out.println("--- Convidados ---");
                    for (String c : convidados) {
                        System.out.println("- " + c);
                    }
                    break;
                case 6:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 6);

        scan.close();
    }
}
    }
}