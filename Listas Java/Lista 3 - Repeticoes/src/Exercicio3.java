import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int otimo = 0;
        int bom = 0;
        int ruim = 0;
        int totalRespostas = 0;
        double somaNotas = 0;
        //Char pois é único caracter que será usado
        char continuar;

        //DO - WHILE: faça isso enquanto a condição for verdadeiras
        do {
            System.out.println("Qual a sua opinião sobre o filme ??");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");
            System.out.print("Sua resposta: ");
            int opiniao = read.nextInt();

            switch (opiniao) {
                case 1:
                    otimo++;
                    break;
                case 2:
                    bom++;
                    break;
                case 3:
                    ruim++;
                    break;
                default:
                    System.out.println("Opção inválida!!!");
            }

            if (opiniao >= 1 && opiniao <= 3) {
                totalRespostas++;
                somaNotas += opiniao;
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = read.next().charAt(0);

            // || funciona como ou
        } while (continuar == 'S' || continuar == 's');

        System.out.println("\nVeja abaixo o resultado:");
        System.out.println("a. Quantos responderam 'Ótimo': " + otimo);
        System.out.printf("   Isso representa %.2f%% do total de respondentes.\n", (otimo * 100.0 / totalRespostas));

        System.out.println("b. Quantos responderam 'Bom': " + bom);
        System.out.printf("   Isso representa %.2f%% do total de respondentes.\n", (bom * 100.0 / totalRespostas));

        System.out.println("c. Quantos responderam 'Ruim': " + ruim);
        System.out.printf("   Isso representa %.2f%% do total de respondentes.\n", (ruim * 100.0 / totalRespostas));

        System.out.println("d. Quantas pessoas ao todo responderam: " + totalRespostas);

        //Calculo da media do filme
        double media = somaNotas / totalRespostas;
        System.out.printf("e. Média de notas do filme: %.2f\n", media);

        read.close();
    }
}