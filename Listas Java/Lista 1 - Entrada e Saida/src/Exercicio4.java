import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Número
        System.out.print("Digite um número inteiro:");
        int numero = read.nextInt();

        //Antecessor e Sucessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.printf("Número digitado: %d \nAntecessor: %d \nSucessor: %d", numero,antecessor,sucessor);
        System.out.printf("\n%d - %d - %d", antecessor,numero,sucessor);
    }
}
