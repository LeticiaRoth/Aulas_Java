package CasaB;

import CasaA.Maria;

public class Joao extends Maria {
    //Proteced, funciona como tem relaçao de herança, ou seja utilizo o extends
    //quando estao em pacotes diferentes, preciso fazer o import, como no caso CasaA.Maria
    //as unicas coisas que não importamos no java é o java.lengh que esta no pacote


    void teste(){
        //System.out.println(super.segredo); // private - só ve na mesma classe
        //System.out.println(super.facoDentroDeCasa); // package - só vê o mesmo pacote
        System.out.println(super.familiaSabe); //protected - eles tem relação de herança, podem ver pacotes diferentes
        System.out.println(super.todoMundoSabe); // public - é publico ou seja sempre sera visto
    }
}
