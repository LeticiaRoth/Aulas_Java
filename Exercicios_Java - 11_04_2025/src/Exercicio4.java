import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        double numero;
        double quadrado;
        double cubo;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o um número: ");
        numero = entrada.nextDouble();

        quadrado = Math.pow(numero,2);
        cubo = Math.pow(numero,3);



        System.out.printf("Número %.2f ao quadrado é: %.2f", numero, quadrado);
        System.out.printf("\nNúmero %.2f ao cubo é: %.2f", numero, cubo);
        entrada.close();

    }
}
