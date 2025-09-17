import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double saldo;
        int totalPessoas = 0;
        int saldoPositivo = 0;
        int saldoNegativo = 0;
        char continuar;

        //Faça isso equanto, enquanto isso for verdade
        do {
            System.out.print("Informe o saldo da pessoa: ");
            saldo = read.nextDouble();
            totalPessoas++;

            if (saldo >= 0) {
                saldoPositivo++;
            } else {
                saldoNegativo++;
            }

            //Pergunta se quer continuar
            System.out.print("Deseja continuar informando saldos? (S/N): ");
            continuar = read.next().charAt(0);


        } while (continuar == 'S' || continuar == 's');

        System.out.println("\nRESUMO GERAL DOS SALDOS");
        System.out.println("Pessoas com saldo positivo: " + saldoPositivo);
        System.out.println("Pessoas com saldo negativo: " + saldoNegativo);

        //Opção para converter o saldo enquanto realizo a divisao
        double percentualPositivo = (double) saldoPositivo / totalPessoas * 100;

        if (percentualPositivo >= 50) {
            System.out.println("Nenhum risco!");
        } else {
            System.out.println("Risco ao banco!");
        }

        read.close();
    }
}