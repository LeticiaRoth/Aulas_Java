import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Qual pergunta você quer responder?");
        System.out.println("1 - Pergunta sobre o Corinthians");
        System.out.println("2 - Pergunta sobre a história do Corinthians");
        System.out.print("Digite 1 ou 2: ");
        String escolhaPergunta = read.nextLine();

        if (escolhaPergunta.equals("1")) {

            // Pergunta 1: Títulos
            System.out.println("\nQual desses títulos o Corinthians possui?");
            System.out.println("a) Copa do Mundo de Clubes da FIFA");
            System.out.println("b) Copa da UEFA");
            System.out.println("c) Copa Libertadores da América Feminina");
            System.out.print("Sua resposta: ");
            String resposta = read.nextLine();

            //Converte para minusculo
            if (resposta.toLowerCase().equals("a")) {
                System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners.");
            } else {
                System.out.println("Você não acertou, mas tente novamente numa próxima.");
            }

        } else if (escolhaPergunta.equals("2")) {

            // Pergunta 2: Fundação
            System.out.println("\nEm que ano o Corinthians foi fundado?");
            System.out.println("a) 1910");
            System.out.println("b) 1914");
            System.out.println("c) 1920");
            System.out.print("Sua resposta: ");
            String resposta = read.nextLine();

            //Converte para minusculo
            if (resposta.toLowerCase().equals("a")) {
                System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners.");
            } else {
                System.out.println("Você não acertou, mas tente novamente numa próxima.");
            }

        } else {
            System.out.println("Opção de pergunta inválida.");
        }

        read.close();
    }
}