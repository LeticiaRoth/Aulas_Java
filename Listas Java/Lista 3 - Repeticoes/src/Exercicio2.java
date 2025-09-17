import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int idadeAcima = 0;
        int alturaAcima = 0;
        int pesoAbaixo = 0;

        //INPUT doos usuários
        int idade;
        double altura, peso;

        //Pede os dados das pessoas
        for (int i = 0; i <10; i++){
            System.out.println("Dados das pessoas " + (i + 1));

            System.out.println("Digite a sua idade: ");
            idade = read.nextInt();

            System.out.println("Digite sua altura: ");
            altura = read.nextDouble();

            System.out.println("Digite seu peso: ");
            peso = read.nextDouble();

            if(idade > 50){
                idadeAcima++;
            }
            if (altura > 1.60){
                alturaAcima++;
            }
            if(peso < 80){
                pesoAbaixo++;
            }
        }

        System.out.println("Resultados das verificações");
        System.out.println("a. Quantas pessoas têm idade acima de 50 anos: " + idadeAcima);
        System.out.println("b. Quantas pessoas têm altura acima de 1.60m: " + alturaAcima);
        System.out.println("c. Quantas pessoas têm peso abaixo de 80kg: " + pesoAbaixo);

        read.close();
    }
}
