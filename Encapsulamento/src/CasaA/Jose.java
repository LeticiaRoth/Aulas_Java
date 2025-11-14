package CasaA;

public class Jose {
    //Instanciação
    Maria esposa = new Maria();

    //O print so funciona se outra função chamar ele
    void teste(){
        //System.out.println(esposa.segredo);
        //Estam dentro da mesma pasta(PACKAGE)
        System.out.println(esposa.facoDentroDeCasa);
        //(PROTECTED)
        System.out.println(esposa.familiaSabe);
        //Publico para totods
        System.out.println(esposa.todoMundoSabe);
    }

}
