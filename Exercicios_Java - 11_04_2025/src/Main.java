import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Letícia Alves Roth"); Comando print através do atalho "SOUT"

        /* EXEMPLO 1 de PRINT
        System.out.print("Bem vindo");
        System.out.print("ETS");
        -> Junta as duas linhas, não quebra automaticamente, precisa do \n dentro da string(caracter de escape)



        EXEMPLO 2 de PRINTLN
        System.out.println("Bem vindo");
        System.out.println("ETS");
        -> Quebra de linha automaticamente




        System.out.println("""
                ETS
                Bosch
                Campinas
                """);
         -> Asplas tríplas para pulas linhas



        // TIPOS PRIMITIVOS

        //Tipos de variáveis - INTEIROS
        // Máscara de Substituição - %d (Usado para os inteiros)

        System.out.print("INTEIROS");

        byte variavelByte = 127; //Tipo 1: BYTE
        System.out.printf("\nTamanho do Byte: %d\n", variavelByte);

        short variavelShort = 32767; // Tipo 2: SHORT
        System.out.printf("Tamanho do Short: %d\n", variavelShort);

        int variavelInt = 2_147_483_647; // Tipo 3: INT
        System.out.printf("Tamanho do Int: %d\n", variavelInt);

        long variavelLong = 9_223_372_036_854_775_807L; // Tipo 4: LONG
        System.out.printf("Tamanho do Long: %d\n\n", variavelLong);

        //DICA 1: Colocar o " _ " em número declarados muito grandes;
        //DICA 2: Colocar a letra " L " no final no long para especificar;




        //Tipos de variáveis = REAIS
        // Máscara de Substituição - %f (Usado para os reais)
        System.out.print("REAIS");

        float variavelFloat = 3.4e+38F; //Tipo 1: FLOAT
        System.out.printf("\nTamanho do Float: %f\n", variavelFloat);

        double variavelDouble = 1.7e+308; //Tipo 2: DOUBLE
        System.out.printf("Tamanho de Double: %f\n", variavelDouble);

        double variavelTeste = 3.145667; // Teste Duas casas após a vírgula (%.2f)
        System.out.printf("Valor da Variável Teste: %.2f\n\n", variavelTeste);

        //DICA 1: Colocar o F para especificar que é um FLOAT;
        //DICA 2: Para colocar duas casas é necessario colocar " %.2f ";
        //DICA 3: 0 " + ", siginifica elevar;
        //DICA 4: Os número 38 e 308, alcançam o número máximo possível na memória;



        //Tipos de variáveis = CHAR
        // Máscara de Substituição - %c (Usado para caracteres)
        System.out.print("\nCHAR");

        char variavelCaractere = 'L';
        System.out.printf("\nValor do Char (caractere): %c\n\n", variavelCaractere);
        //DICA 1: Para declarar o char, colocar aspas simples '';


        //Tipos de variáveis = BOOLEAN
        // Máscara de Substituição - %b (Usado para boolean)
        System.out.print("BOOLEAN");
        boolean variavelBoolean = true;
        System.out.printf("\nValor do Boolen: %b\n\n",variavelBoolean);
        //DICA 1: Escrever o valor do boolean, (TRUE e FALSE) com letra minúsucula (true / false);




        // PRÁTICA 1 - Faça um texto de apresentação no print utilizando variáveis para a sua idade e o seu ano de nascimento
        String nomeLeticia = "Letícia Alves Roth";
        int idadeLeticia = 18;
        int anoLeticia = 2007;

        System.out.print("APRESENTAÇÃO PESSOAL\n");
        System.out.printf("Meu nome é %s , tenho %d anos e nasci no ano de %d\n\n", nomeLeticia, idadeLeticia, anoLeticia);



        // TIPO CLASSE - String (muito complexa para ser primitiva, ou seja é um classe)


        //Tipo de Classe = STRING
        // Máscara de Substituição - %S (Usado para String)
        System.out.print("STRING\n");

        String variavelString = "Bem Vindo a Bosch";
        System.out.printf("TEXTO: %S", variavelString); // Mostrará o meu texto

        //MÉTODOS - STRING
        System.out.print("\n\nSTRING - MÉTODOS\n");
        System.out.println(variavelString.length()); //Retornará 17, pois contará os caracteres, contando os espaços
        System.out.println(variavelString.toUpperCase()); // Deixará tudo maiúsculo
        System.out.println(variavelString.toLowerCase()); // Deixará tudo minúsculo
        System.out.println(variavelString.charAt(5)); //Retora um caractere em determinada posição - começa do 0




        //CONCATENAÇÃO - STRING
        System.out.print("\n\nSTRING - CONCATENAÇÃO\n");
        System.out.println(variavelString + "!!!"); //Concatenção dentro do print
        System.out.println(variavelString); //Mostrará apenas o valor da String, pois não dei um valor novo



        //ATRIBUINDO UM NOVO VALOR - com a concatenação
        variavelString = variavelString + "!!!"; //Alterei o valor da váriavel, atribuindo um novo valor com concatenação

        System.out.print("\n\nATRIBUINDO NOVO VALOR\n");
        variavelString += "!!!"; //Utilizado quando repetirá o valor da variavel
        System.out.println(variavelString);




        //OPERAÇÕES MATEMÁTICAS
        System.out.print("\n\nOPERAÇÕES MATEMÁTICAS - 4 OPERAÇÕES BÁSICAS\n");
        int numero1 = 9;
        int numero2 = 2;

        System.out.printf("Adição: %d\n", numero1+numero2); //Adição dentro do print
        System.out.printf("Subtração: %d\n", numero1-numero2); //Subtração dentro do print
        System.out.printf("Multiplicação: %d\n", numero1*numero2); //Multiplicação dentro do print
        System.out.printf("Divisão: %d\n", numero1/numero2); //Divisão dentro do print - se colocar double ele puxa o 4.5
        System.out.printf("Resto: %d\n", numero1 % numero2); //Resto da divisão inteira



        // RAIZ QUADRADA E POTÊNCIA
        System.out.print("\n\nOPERAÇÕES MATEMÁTICAS - RAIZ E POTÊNCIA\n");
        double potencia = Math.pow(2, 3); // Primeiro argumento é a base, segundo a potência
        System.out.printf("Poência %f\n",potencia);


        double raiz = Math.sqrt(4);
        System.out.printf("Raiz: %f\n", raiz);




        //ENTRADA DE DADOS VIA TECLADO
        System.out.print("\n\nENTRADA DE DADOS - SCANNER - INT\n");
        int numero;

        Scanner input = new Scanner(System.in); // Entrada de dados via teclado - " input " serve como variável
        System.out.print("Digite um número: "); //Sem o \n vai ficar na mesma linha do Scanner

        numero = input.nextInt(); //input. (o tipo da variável), " numero " será o valor digitado pelo usuário no " input "

        System.out.print("O número que você digitou foi: " + numero);
         //input.close(); Boa prática fechar o scanner




        //ENTRADA DE DADOS VIA TECLADO - SCANNER
        System.out.print("\n\nENTRADA DE DADOS - SCANNER - STRING\n");
        String palavra;

        Scanner entrada = new Scanner(System.in); // entrada vai ser a váriavel que recebe o valor do usuário;
        System.out.print("Digite uma palavra: ");

        palavra = entrada.nextLine(); // Para String é o "nextLine"
        System.out.print("A palavra que você digitou foi: "+ palavra); // Poderia ser o printf

        //entrada.close(); Fecha o Scanner - no caso a variável "entrada"
        // DICA 1 - nextLine usado para String porque só para de ler depois do "Enter", já o next não





        //ENTRADA DE DADOS VIA TECLADO - 2 SCANNERS
        System.out.print("\n\nENTRADA DE DADOS - 2 SCANNERS \n");
        String nome, sobrenome;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine(); // Chamo a variável nome

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine(); //Chamo a variável sobrenome

        System.out.printf("Meu nome é %s e meu sobrenome é %s", nome, sobrenome);

        //scanner.close(); Fecha o Scanner - no caso a variável "entrada"
        //DICA 1: O nextLine é utilizado para ler String



        System.out.print("\n\nENTRADA DE DADOS - STRING E INT \n");
        String nome1, sobrenome1;
        int idade;

        Scanner teste = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome1 = teste.nextLine();

        System.out.print("Digite sua idade: ");
        idade = teste.nextInt();
        teste.nextLine(); // nextLine vazio para limpar o Buffer - PRIMEIRA SOLUÇÃO


        System.out.print("Digite seu sobrenome: ");
        sobrenome1 = teste.nextLine();

        System.out.println(nome1);
        System.out.println(idade);
        System.out.println(sobrenome1);

        //DICA 1: printou a String sobrenome vazia, devido ao enter no nextInt;
        //DICA 2: Buffer, resquício de lixo na memória;


        //SOLUÇÃO 1: colocar o nextLine vaziou para limpar o Buffer;
        
         */
    }
}
