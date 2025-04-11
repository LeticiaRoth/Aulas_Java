import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        double tempC;
        double tempF;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius:");
        tempC = entrada.nextDouble();

        tempF = (tempC * 9/5) + 32;
        System.out.printf("A temperatura em Fahnheit: %.2f", tempF);
        entrada.close();


    }
}
