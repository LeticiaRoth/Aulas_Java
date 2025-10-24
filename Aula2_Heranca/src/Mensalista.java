//simboliza a relacao entre duas classes,  é a palavra extends
public class Mensalista extends Colaborador {
    double bancoDeHoras;
    double salarioMensal;

    public Mensalista(int edv, String nome, String cargo, double salarioMensal){
        //Toda vez que tiver a classe filha que eu tenho que referenciar a classe pai, vou utilizar a palavra reservada super
        super(nome, cargo, edv);
        //So existe no mensalista e nao no colaborador
        this.salarioMensal = salarioMensal;
    }

    //Metodo
    double receberSalario(){
        return this.salarioMensal;
    }


    @Override
    public String toString() {
        return "Mensalista{" +
                "edv=" + edv +
                ", salarioMensal=" + salarioMensal +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
