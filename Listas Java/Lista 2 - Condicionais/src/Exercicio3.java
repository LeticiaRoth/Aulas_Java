import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite os gols do TIME A:");
        double golsTimeA = read.nextDouble();

        System.out.print("Digite os gols do TIME B:");
        double golsTimeB = read.nextDouble();

        String resultadoJogo;

        if (golsTimeA > golsTimeB){
            resultadoJogo = "Time A venceu!!";
        } else if (golsTimeA == golsTimeB){
            resultadoJogo = "Os dois times empataram!";
        } else{
            resultadoJogo = "Time B venceu";
        }

        System.out.printf("Resultado do Jogo: %s", resultadoJogo);
    }
}

