public class Exemplo_Tempo {
    public static void main(String[] args) {

        double tempo = 91;

        //Executa os dois, pois são bloco de código separados, o if ele é o ínicio do bloco
        //BLOCO A - Bloco de código separado
        if(tempo > 90){
            System.out.println("O tempo foi maior que 90");
        }

        //BLOCO B - Bloco de código separado
         if (tempo > 60){
            System.out.println("O tempo foi maior que 60");
        }


        // Colocando o else if, se torna um código só
        //BLOCO C - Bloco de código único
        if(tempo > 90){
            System.out.println("O tempo foi maior que 90");
        }
        else if (tempo > 60){
            System.out.println("O tempo foi maior que 60");
        }



    }
}
