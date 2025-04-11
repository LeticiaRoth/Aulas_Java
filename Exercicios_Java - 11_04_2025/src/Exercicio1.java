import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        double tempF;
        double  tempC;

        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        tempF = entrada.nextDouble();

        tempC = (tempF - 32) * 5/9;

        System.out.printf("A temperatura em Celsius é: %.2f", tempC);
        entrada.close();


    }
}
