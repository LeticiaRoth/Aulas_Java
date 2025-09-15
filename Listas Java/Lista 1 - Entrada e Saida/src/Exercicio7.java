import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nomeVendedor;

        // Loop infinito até o usuário digitar o nome corretamente
        while (true) {
            System.out.print("Digite seu nome: ");
            nomeVendedor = read.nextLine();

            try {
                validarApenasLetras(nomeVendedor);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // Mês da venda
        System.out.print("Digite o mês: ");
        String mesVenda = read.nextLine();

        // Quantidade de carros vendidos
        System.out.print("Quantidade de carros vendidos: ");
        int quantidadeCarros = read.nextInt();
        read.nextLine();  // Consome o \n deixado pelo nextInt()

        // Valor das vendas
        System.out.print("Valor total das vendas: ");
        double valorVendas = read.nextDouble();
        read.nextLine();  // Consome o \n deixado pelo nextDouble()

        // Cálculo da comissão por carro
        double comissaoCarros = quantidadeCarros * 350.0;

        // Cálculo da comissão das vendas
        double comissaoVendas = valorVendas * 0.00001;

        // Cálculo do salário do vendedor no mês
        double salarioFinal = 1500 + comissaoCarros + comissaoVendas;

        // Exibindo os dados
        System.out.printf("Nome do vendedor: %s\n", nomeVendedor);
        System.out.printf("Mês referente à venda: %s\n", mesVenda);
        System.out.printf("Quantidade de carros vendidos: %d\n", quantidadeCarros);
        System.out.printf("Valor das vendas: R$%.2f\n", valorVendas);
        System.out.printf("Comissão por carros: R$%.2f\n", comissaoCarros);
        System.out.printf("Participação nos lucros: R$%.2f\n", comissaoVendas);
        System.out.printf("Salário final: R$%.2f\n", salarioFinal);

        read.close();
    }

    //Verificação da string com regex
    public static void validarApenasLetras(String input) {
        if (!input.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("O campo aceita apenas letras.");
        }
    }
}
