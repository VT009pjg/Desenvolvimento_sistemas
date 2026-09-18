package horario;

public class Principal {
	public static void main(String[] args) {
		System.out.println("----Teste 1: Construtor Sem Parâmetros----");
		Horario horario1 = new Horario();
		
		System.out.print("Horário Inicial: ");
		horario1.exibir();
		
		System.out.println("Total em Segundos: " + horario1.calcularSegundos() + "\n");
		System.out.println("--- Teste 2: Alterando o primeiro objeto ---");
        horario1.setHora(8);
        horario1.setMinuto(15);
        horario1.setSegundo(30);
        
       
        System.out.print("Horário alterado: ");
        horario1.exibir();
        System.out.println("Total em segundos: " + horario1.calcularSegundos() + "\n");
      
        System.out.println("--- Teste 3: Construtor com parâmetros ---");
        Horario horario2 = new Horario(14, 20, 5);
       
        System.out.print("Horário 2: ");
        horario2.exibir();
        System.out.println("Total em segundos: " + horario2.calcularSegundos());
    }
}