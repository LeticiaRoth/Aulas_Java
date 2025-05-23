public class Main {
    public static void main(String[] args) {

        //Primeiro = começo (START)
        //Segundo = termina (STOP)
        //Terceiro = passo (STEP)


        /*
        //Vai de 1 a 10
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
        */

        /*
        //Vai de 10 a 1
        for (int i = 10; i>0; i--){
            System.out.println(i);
        }
         */

        /*
        for (int i = 0; i<=10; i++){
            System.out.println(i);

            if(i==5){
                break;
            }
        }
        */

        for (int i = 0; i<=10; i++){

            if(i%2 == 0){
                continue; //Reinicia a interação desde o inicio, desde o FOR
            }
            System.out.println(i);
            //Ele printará os ímpares, pois nos pares, ele reinicia o laço
        }

    }
}

//Break point = onde o código parará até ser inicializado, ponto vermelho;
//Step into = esta linha por linha, até encerrar o código;
//Utilizar o debug, para mostrar o valor da variável em determinados momentos;