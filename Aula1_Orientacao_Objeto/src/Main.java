public class Main {

    //Start do meu projeto
    public static void main(String[] args) {

//        //Classe - Instancia
//        Colaborador colaborador1 = new Colaborador("Julya Jacometti"); //Instanciação
//        Colaborador colaborador2 = new Colaborador("Yasmin Viera", 234567);
//        Colaborador colaborador3 = new Colaborador("Layslla Oreti", 456789,"Dev.Front-End");
//
//
//        //Especifico quais parametros quero
//        System.out.println(colaborador1.nome);
//        System.out.println(colaborador2.nome + " " + colaborador2.edv);
//        System.out.println(colaborador3.nome + " " + colaborador3.edv + " " + colaborador3.cargo);

        Departamento departamento = new Departamento("ETS", 100000, 400);
        System.out.printf("O departamento %s tem %.2f funcionários",departamento.nome, departamento.obterNumeroDeFuncionarios());
        //Funciona de dentro para fora, começa do calculo e depois para o pritn
        System.out.println("O orçamento foi de: "+departamento.calcularAumentoDeOrcamento(0.20));




    }
}
