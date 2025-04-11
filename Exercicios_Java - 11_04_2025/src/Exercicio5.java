import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        double base;
        double altura;
        double area;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base: ");
        base = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;
        System.out.printf("\nÁrea do triângulo: %.2f", area);
        entrada.close();


    }
}
