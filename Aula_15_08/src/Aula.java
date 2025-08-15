import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {

        //i existe apenas dentro do for
        //++ é incremento
        // For quando tem inicio e fim;
        // While não sei quantas vezes será executado

        /*
        System.out.print("PROGRESSIVO");
        for (int m = 0; m < 10; m++) {
            //Start    //Stop   //Step
            //Começa do 0 e vai até o 10
            System.out.print(m);
        }
        */


        /*
        System.out.print("REGRESSIVO");
        for (int j = 10; j < 0; j--) {
            //Start     //Stop  //Step
            //Começa do 9 e vai até o 0
            System.out.print(j);

        }
        */


        //COMANDOS DE CONTROLE

        /*
        //BREAK
        for (int i = 0; i <= 10 ; i++) {
            if(i==5){
                break; //Quebra o laço de repetição
            }
            System.out.println(i);
        }
        */


        /*
        //CONTINUE
        for (int i = 0; i < 10; i++) {
            if(i % 2==0){
                continue; //Reinicia o laço de repetição, ao encontrar o divisível por 2 antes do print, ele reinicia
            }
            System.out.println(i);
        }
         */



        //ENCADEADO - for dentro do outro, ou while dentro do outro
        //Cria outro contador, existindo duas variaveis o I e  J
        /*
        externo: //Nome para o laço (não usual)
        for (int i = 0; i < 3; i++) {
            //Printa 3x
            System.out.println("DS18");


            //Printa 6x
            // DS17 está dentro do laço maior DS18, ou seja repetirá 2x3 = 6
            for (int j = 0; j < 2; j++) {
                System.out.println("DS17");
                break externo; // quebra o laço interno
            }
        }
        */


        //WHILE
        /*Toda vez que o usuário digitar algo diferente de sair, o código continua
        quando o usuário digitar a palavra "sair", o código encerra*/
        //== e != usado para tipos primitivos
        //para palavra é equals
        //diferente, como um ! na frente do valor, da variavel
        //String só se compara com metodo equals, nao utilize == ou !=

        /*
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while(!valor.equalsIgnoreCase("sair")){
            System.out.print("Digite algo:");

            //Armazena
            valor = entrada.nextLine();
        }
        entrada.close();
        */

        /*
        //EXEMPLO 1
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int acumulador = 0;

        //Controle dele é um expressão booleana
        //Começa do 0 vai até 4 = 5x
        //Contador vai grescer em progressão aritimetica
        //Acumulador vai juntando os numeros digitados pelo usuário e vai somando
        while (contador < 5){
            System.out.println(contador);
            contador ++; //Valor dele somado a mais 1

            System.out.print("Digite um número: ");
            //acumulador = acumulador + entrada
            acumulador += entrada.nextInt();
            entrada.nextLine();

            //Printa a variavel dentro da frase, d de decimal
            System.out.printf("Contador está em %d e " +
                    "o acumulador em %d\n", contador,acumulador);
        }
        */

        /*
        //DO WHILE
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        //DO - primeira interacao é executada
        //Primeira interacao do laco é sempre executada
        do{
            System.out.print("Diga me algo:");
            valor = entrada.nextLine();
        }while (!valor.equalsIgnoreCase("algo"));
        //Demais interações do laço, apenas executadas se a condição for verdadeira
        entrada.close();
        */

        //CORREÇÃO DE ERROS - TRY / CATCH
        Scanner scanner = new Scanner(System.in);

        try {
            int numero = scanner.nextInt();
            System.out.println(numero);
        }catch (Exception error){
            System.out.println("Digite apenas números!");
        }
    }
}
