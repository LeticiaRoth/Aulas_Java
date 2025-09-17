import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = read.nextInt();

        System.out.println("Digite o valor que deve ser incrementado:");
        int incremento = read.nextInt();

        for (int i = 0; i <= numero; i += incremento){
            System.out.print(i);
            if (i < numero){
                //Saída do incremento
                System.out.print(", ");
            }
        }
        read.close();
    }
}
