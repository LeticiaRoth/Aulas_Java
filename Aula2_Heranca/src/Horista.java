public class Horista extends Colaborador{
    double  horasTrabalhadas;
    double  salarioPorHora;

    public Horista(int edv, String nome, String cargo, double horasTrabalhadas, double salarioPorHora){
        super(nome, cargo, edv);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }
    //Preciso utilizar quando estou mostrando que a variavel da classe vai recever a variavel do parametro

    double receberSalario(){
        //Conta basica
        return this.salarioPorHora * this.horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "horasTrabalhadas=" + horasTrabalhadas +
                ", edv=" + edv +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salarioPorHora=" + salarioPorHora +
                '}';
    }
}
