import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Utilizo uma lista
        int[] numeros = new int[10];
        int pares = 0, impares = 0, negativos = 0, positivos = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = read.nextInt();
        }

        //Verificos dentro do se são impares ou pares / negativos ou positivos
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numero < 0) {
                negativos++;
            } else if (numero > 0) {
                positivos++;
            }
        }

        int opcao;
        do {
            System.out.println("\nO que você deseja saber? ");
            System.out.println("a. Quantos números pares?");
            System.out.println("b. Quantos números ímpares?");
            System.out.println("c. Quantos negativos?");
            System.out.println("d. Quantos positivos?");
            System.out.println("e. Sair do programa");
            System.out.print("Escolha uma opção: ");
            char escolha = read.next().charAt(0);

            switch (escolha) {
                case 'a':
                    System.out.println("Quantidade de números pares: " + pares);
                    break;
                case 'b':
                    System.out.println("Quantidade de números ímpares: " + impares);
                    break;
                case 'c':
                    System.out.println("Quantidade de números negativos: " + negativos);
                    break;
                case 'd':
                    System.out.println("Quantidade de números positivos: " + positivos);
                    break;
                case 'e':
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (true);
    }
}