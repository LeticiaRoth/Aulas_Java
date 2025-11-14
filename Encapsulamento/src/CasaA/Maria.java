package CasaA;

public class Maria {
    //Refactori, refatora em todas as nossas classes
    //Modificador vem antes do tipo e do nome
    private String segredo = "Roubei um carro";

    //Default nao tem modificador, so se estiver na mesma classe
    String facoDentroDeCasa = "Ronca durante o sono";

    // DIFERENÇA: Protected sera vista a Default nõa

    //Protected
    protected  String familiaSabe = "Deve no banco";

    //Public, acessivel em todas as classes
    public String todoMundoSabe = "Vai no bar";

    //Dentro da propria classe vejo tudo, fora nao
    void teste(){
        System.out.println(this.segredo);
        System.out.println(this.facoDentroDeCasa);
        System.out.println(this.familiaSabe);
        System.out.println(this.todoMundoSabe);
    }
}
