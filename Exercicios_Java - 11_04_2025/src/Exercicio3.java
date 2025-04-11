import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        peso = entrada.nextDouble();

        System.out.print("Digite a sua altura: "); // Deve colocar a vírgula após a primeira casa.
        altura = entrada.nextDouble();

        imc = peso / (Math.pow(altura,2));

        System.out.printf("IMC: %.2f", imc);
        entrada.close();

    }
}
