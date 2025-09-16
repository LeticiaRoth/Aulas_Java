import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o nome do produto:");
        String nomeProduto = read.nextLine();

        System.out.print("Quantidade atual em estoque:");
        double quantidadeAtual = read.nextDouble();

        System.out.print("Quanitade máxima em estoque:");
        double quantidadeMaxima = read.nextDouble();

        System.out.print("Quantidade mínima em estoque: ");
        double quantidadeMinima = read.nextDouble();

        double quantidadeMedia =((quantidadeMaxima + quantidadeMinima)/ 2);
        String mensagem;

        if (quantidadeAtual >= quantidadeMedia){
            mensagem = "Não efetuar compra de " + nomeProduto;
        }else{
            mensagem = "Efetuar compra" + nomeProduto;
        }

        System.out.printf("DIAGNÓSTICO DO ESTOQUE: %s", mensagem);

        read.close();
    }
}
