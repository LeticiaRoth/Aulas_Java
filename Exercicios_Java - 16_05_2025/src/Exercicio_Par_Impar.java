import java.util.Scanner;

public class Exercicio_Par_Impar {
    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        numero = entrada.nextInt();

        //Coloca %, para verificar se o resto da divisão será 0
        if (numero % 2 == 0){
            System.out.printf("Número %d é par", numero);
        }
        //PRINTF - para colocar a máscara
        else{
            System.out.printf("Número %d é ímpar",numero);
        }

        entrada.close();
    }
}
