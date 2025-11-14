package Operacao;

import Estrategia.Diretoria;

//Nao preciso instanciar apenas tentar puxar os atributos
public class PlanejamentoEstrategico extends Diretoria {

    void teste(){
        //System.out.println(super.segredo); // private (interno do arquivo)
        //System.out.println(super.memorandoInterno); //package (pacotes diferentes)
        System.out.println(super.orcamentoAnual); //protected
        System.out.println(super.missaoDaEmpresa); //public
    }

}
