public class Desafio {

    public static void main(String[] args) {

        double a = -3; //Se não colocar como double, puxará como inteiro, preciso criar uma variável para guardar esse número negativo;
        double b = -1;
        double c = -2;

        //Conta das frações
        double fracao1 = Math.pow ((a / 4), c);
        double fracao2 = Math.pow(3, b) / 4;
        double fracao3 = Math.pow ((a / 4), b);

        //Conta do numerador e denominador
        double conta_numerador = 3 * fracao1 + 6 * fracao2 - 4;
        double conta_denominador = 7 * fracao3 + 2;

        //Conta do colchete e o total
        double conta_colchete = Math.pow(conta_numerador / conta_denominador, b);
        double total = conta_colchete + 4;

        System.out.printf("Resultado: %.1f", total);

    }
}
