public class Exemplo_Media {
    public static void main(String[] args) {
        double media = 7.1; //Double é mais preciso
        int faltas = 20;
        boolean postura = true; //Tipo, nome, valor

        String situacao;

        // Caso seja verdadeiro ele vai executar os comandos da chaves;
        // Não preciso de um operador relacional, pois a variável é booleana;

        if(media >= 5.0 && faltas < 25 && postura == true){
            situacao = "Aprovado";
        }
        //Se a média dele for menor 5
        else if (media < 5.0 && faltas < 25 && postura){
            situacao = "Recuperação";
        }
        //As faltas execederam o limite
        else if(media >= 5.0 && faltas>= 25 && postura){
            situacao = "Sem férias";
        }
        // !postura e postura == false, é a mesma coisa
        //Se a postura dele não for adequada
        else if (media >= 5 && faltas <25 && postura == false){
            situacao = "Chamar para conversar";
        }
        //Caso todas as situações tenham ocorrido, cobre todas as possibilidades o ELSE
        else{
            situacao = "Reprovado";
        }

        System.out.println(situacao);

    }
}
