import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = read.nextDouble();

        System.out.print("\nDigite o segundo número: ");
        double numero2 = read.nextDouble();

        //Soma
        double soma = numero1 + numero2;

        //Subtração
        double subtracao = numero1 - numero2;

        //Multiplicação
        double multiplicacao = numero1 * numero2;

        //Divisao
        double divisao = numero1 / numero2;

        //Resto da divisão
        double restoDivisao = numero1 % numero2;



        //Desafio 1
        double divisao2 = 0;
        String mensagemDivisao;
        if (numero2 != 0){
            divisao2 = numero1 / numero2;
            mensagemDivisao = String.format("%.2f",divisao2);
        } else {
            mensagemDivisao = "A divisão não poderá ser realizada!";
        }

        read.nextLine();

        //Desafio2
        double potenciacao = Math.pow(numero1,numero2);

        System.out.printf("\nSoma: %.2f \nSubtração: %.2f \nMultiplicação: %.2f \nDivisão: %.2f \nResto da divisão: %.2f \nDesafio 1: %s  \nPotenciação: %.2f", soma,subtracao,multiplicacao,divisao,restoDivisao,mensagemDivisao,potenciacao);
    }
}
