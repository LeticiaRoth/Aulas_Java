public class Exemplo_Switch_Case {
    public static void main(String[] args) {

        /*
        int opcao = 2;

        //Break - vai parar o bloco de código naquele instante
        //São opções disponíveis
        switch (opcao){
            case 1:
                System.out.println("Caso 1");
                break; //Sintaxe mais antiga necessita
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            default://Funciona como o else, caso nenhum dos casos ocorrer
                System.out.println("Default funcionado");
        }
        */


        int opcao = 2;

        //Usando lambidas "->"
        switch (opcao){
            case 1 -> System.out.println("Caso 1");
            case 2 -> System.out.println("Caso 2");
            case 3 -> System.out.println("Caso 3");
            default -> System.out.println("Caso padrão");
        }

    }
}
