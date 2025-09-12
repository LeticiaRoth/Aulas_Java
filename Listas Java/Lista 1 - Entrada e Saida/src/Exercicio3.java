import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o valor da sua compra:");
        double valor_compra = read.nextDouble();

        double representantes = (20.0 / 100) * valor_compra;
        double impostos = (30.0 / 100) * valor_compra;
        double valor_venda = valor_compra + representantes + impostos;

        //Atribuições
        System.out.println("Valor de compra: R$ " + valor_compra);
        System.out.println("Valor do representante (20%): R$ " + representantes);
        System.out.println("Valor dos impostos (30%): R$ " + impostos);
        System.out.println("Valor de venda: R$ " + valor_venda);


    }
}
