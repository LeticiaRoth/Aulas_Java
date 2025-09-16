import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        final double valorBase = 3000.00;
        double valorFinal = 0.0;

        System.out.print("Onde deseja passar suas Férias: \n1 - Maceió \n2- Porto de Galinhas ");
        int escolhaDestino = read.nextInt();


        int escolhaCardapio;

        if (escolhaDestino == 1) {
            // Maceió
            System.out.println("Deseja ter almoço/janta incluso? \n1- Sim \n2- Não ");
            escolhaCardapio = read.nextInt();

            if (escolhaCardapio == 1) {
                // Maceió + Sim
                valorFinal = valorBase + (valorBase * 1.00); // +100%
            } else if (escolhaCardapio == 2) {
                // Maceió + Não
                valorFinal = valorBase + (valorBase * 0.85); // +85%
            } else {
                System.out.println("Opção de cardápio inválida.");
            }

        } else if (escolhaDestino == 2) {
            // Porto de Galinhas
            System.out.print("Deseja ter almoço/janta incluso? \n1- Sim \n2- Não  ");
            escolhaCardapio = read.nextInt();

            if (escolhaCardapio == 1) {
                // Porto de Galinhas + Sim
                valorFinal = valorBase + (valorBase * 0.60);
            } else if (escolhaCardapio == 2) {
                // Porto de Galinhas + Não
                valorFinal = valorBase + (valorBase * 0.45);
            } else {
                System.out.println("Opção de cardápio inválida.");
            }

        } else {
            System.out.print("Escolha um dos destinos disponíveis!");
        }


        if (valorFinal > 0) {
            System.out.printf("O valor final da viagem é: R$ %.2f\n", valorFinal);
        }

        read.close();
    }
}