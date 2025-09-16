import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o valor unitário do produto:");
        double valorUnitario = read.nextDouble();

        System.out.print("Digite a quantidade que deseja comprar: ");
        double quantidade = read.nextDouble();

        double valorTotal;

        if (quantidade <= 12){
            valorTotal = valorUnitario * quantidade;
        } else {
            double valorDesconto = valorUnitario * 0.90;
            valorTotal = valorDesconto * quantidade;
        }

        System.out.printf("Valor total da compra: " + valorTotal);

        read.close();
    }
}
