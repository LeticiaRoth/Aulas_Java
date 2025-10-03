public class Departamento {
    String nome;
    double orcamento;
    int numeroFuncionarios;

    //Public do Departamento, startando com um construtor de 3 parametros
    public Departamento(String nome, double orcamento, int numeroFuncionarios) {
        this.nome = nome;
        this.orcamento = orcamento;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    //Metodo de atualizar o nome

    //VOID - são métodos que não possuem retorno
    void atualizarNome(String nome){
        this.nome = nome;
    }

    //Metodo exibir detalhes
    void exibirDetalhes(String nome){
        System.out.printf("O departamento de %s está com %d funcionários e com o orçamento de R$%.2f\n", this.nome,this.numeroFuncionarios, this.orcamento);
    }

    //Metodo calcular orcamento
    double calcularAumentoDeOrcamento(double percentual){
        return (orcamento*percentual)+orcamento;
    }

    //Metodo obter numeor de funcionarios
    double obterNumeroDeFuncionarios(){
        return  numeroFuncionarios;
    }


}
