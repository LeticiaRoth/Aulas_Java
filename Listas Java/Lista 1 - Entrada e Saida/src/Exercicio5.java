import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Horas
        System.out.println("Digite a quantidade de horas:");
        double horas = read.nextDouble();

        //Minutos
        System.out.println("Digite a quantidade minutos: ");
        double minutos = read.nextDouble();

        //Segundos
        System.out.println("Digite a quantidade de segundos:");
        double segundos = read.nextDouble();

        double calculoHoras = horas * 3600;
        double calculoMinutos = minutos * 60;

        double calculoGeral = calculoHoras + calculoMinutos + segundos;
        System.out.printf("Resultado geral: %.2f", calculoGeral);

    }
}
