public class Colaborador {
        //Uma classe pode ser considerada um molde através do qual objetos de um certo tipo são criados
        //Abstração: modelo de um conjutos de objetos com caracteristicas semelhantas
        //Podem possuir características diferentes, mas possuem as mesmas propriedades e fucnionalidades
        //Instancia: Como vou referenciar naquele contexto

        //Atributos da classe Coloaborador
        int edv;
        String nome;
        String cargo;

        //Construtor padrão existe em toda classe
        //Metodo Construtor sem parâmetro
        Colaborador(){
                System.out.println("Construtor sem parametros foi inicializado");
        }

        //Metodo Construtor com  parametro, sem parametro reclamaria
        Colaborador(String nome){
                //this = self do Python, se referindo ao atributo da classe
                this.nome = nome;
                System.out.println("Construtor com um parâmetro foi inicializado");
        }

        //Metodo Construtor com dois
        Colaborador(String nome, int edv){
                this.nome = nome;
                this.edv = edv;
                System.out.println("Construtor com dois parametros foi incializado");
        }

        //Metodo Construtor com tres
        Colaborador(String nome, int edv, String cargo) {
                this.nome = nome;
                this.edv = edv;
                this.cargo = cargo;
                System.out.println("Construtor com três parametros foi inicializado");
        }

}