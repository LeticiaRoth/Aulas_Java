package Operacao;

import Estrategia.Diretoria;

public class TI {
    Diretoria diretoria = new Diretoria();

    void teste(){
        //System.out.println(diretoria.segredo); // private (interno do arquivo)
        //System.out.println(diretoria.memorandoInterno); //package (pacotes diferentes)
        //System.out.println(diretoria.orcamentoAnual); //protected
        System.out.println(diretoria.missaoDaEmpresa); //public
    }

}
