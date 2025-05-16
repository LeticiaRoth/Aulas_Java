import java.util.Scanner;

public class Exercicio_FizzBuzz {
    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número:");
        numero = entrada.nextInt();

        //Coloco como primeira condição para verificar se é múltiplo dos dois
        if( numero % 2 == 0 && numero % 5 == 0){
            System.out.printf("FizzBuzz");
        }
        else if(numero % 5 == 0){
            System.out.printf("Buzz");
        }
        else if (numero % 2 == 0){
            System.out.printf("Fizz");
        }
        else {
            System.out.printf("ERRO!");
        }

        entrada.close();
    }
}
