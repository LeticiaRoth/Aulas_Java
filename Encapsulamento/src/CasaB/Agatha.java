package CasaB;

import CasaA.Maria;

//Nao tem relaçao de herança com maria
public class Agatha {
    Maria sogra = new Maria();

    void teste(){
        //Nao tem relação, nao esta dentro da mesma pasta e nao é a sogra
        //System.out.println(sogra.segredo); // private
        //System.out.println(sogra.facoDentroDeCasa); //package
        //System.out.println(sogra.familiaSabe); // proteced
        System.out.println(sogra.todoMundoSabe); // public
    }

}

