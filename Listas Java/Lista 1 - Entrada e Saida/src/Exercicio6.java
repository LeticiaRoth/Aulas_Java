import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Primeira nota
        System.out.print("Digite a primeira nota:");
        double nota1 = read.nextDouble();

        //Segunda nota
        System.out.print("Digite a segunda nota:");
        double nota2 = read.nextDouble();

        //Pesos no cálculo das notas
        double calculoNota1 = (nota1 * 40.0) /100;
        double calculoNota2 = (nota2 * 60.0)/100;

        //Cálculo média ponderada
        double calculoMedia = calculoNota1 + calculoNota2;
        System.out.printf("Média: %.2f", calculoMedia);

        read.close();

    }
}
