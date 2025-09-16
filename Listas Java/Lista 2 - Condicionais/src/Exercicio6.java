import java.util.Random;
import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroSorte = random.nextInt(100) + 1;
        int tentativasRestantes = 3;
        boolean acertou = false;

        System.out.println("Tente adivinhar o número da sorte entre 1 e 100!");

        // Loop para dar 3 chances ao usuário
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Tentativa %d de %d. Digite um número: ", i, tentativasRestantes);
            int palpite = read.nextInt();

            if (palpite == numeroSorte) {
                acertou = true;
                break; //Sai o loop se o usuário acertar
            } else {
                System.out.println("Você errou. Tente novamente!");
            }
        }

        if (acertou) {
            System.out.println("Parabéns! Você acertou o número.");
        } else {
            System.out.printf("Você errou. O número da sorte era: %d", numeroSorte);
        }

        read.close();
    }
}