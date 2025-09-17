import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Declaro as variaveis que serão usadas dentro do FOR
        String nomeMaisPesado = "";
        double pesoMaisPesado = 0;

        String nomeMaisAlto = "";
        double alturaMaisAlta = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("--- Pessoa " + i + " ---");
            System.out.print("Digite o nome: ");
            String nome = read.nextLine();

            System.out.print("Digite a altura: ");
            double altura = read.nextDouble();

            System.out.print("Digite o seu peso: ");
            double peso = read.nextDouble();

            // Limpa o buffer do scanner após ler o número
            read.nextLine();

            if (peso > pesoMaisPesado) {
                pesoMaisPesado = peso;
                nomeMaisPesado = nome;
            }

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlto = nome;
            }
        }


        System.out.printf("A pessoa mais pesada é %s, com %.2f kg.\n", nomeMaisPesado, pesoMaisPesado);
        System.out.printf("A pessoa mais alta é %s, com %.2f metros.\n", nomeMaisAlto, alturaMaisAlta);

        read.close();
    }
}