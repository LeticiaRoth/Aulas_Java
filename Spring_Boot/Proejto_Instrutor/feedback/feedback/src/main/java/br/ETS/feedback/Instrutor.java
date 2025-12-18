package br.ETS.feedback;
//alt + insert
//Lombock permite os geteer e setter atraves de annotations (comparação com o decorators)
import jakarta.persistence.*;
import lombok.*;

//ENUM: Texto que e convertido em numero para o computador entender

@Getter

@Setter
//Construtor com todos os parametros
@AllArgsConstructor

//Sem paramentros
@NoArgsConstructor

//Comparação de objetos
@EqualsAndHashCode

//Enntidade, toda vez que falar instrutor ele entendera
@Entity(name = "Instrutor")

//Table
@Table(name = "tbInstrutor")


//Classe do instrutor com as variaveis private
public class Instrutor {
    //Primary Key
    @Id
    //Fala ao banco que ele sera responsavel por gerar os ID vai de um em um de acordo com o instrutor que eu adiciono
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String email;
    private String edv;

    //Para o banco entender o meu enum como texto e não como numero
    @Enumerated(EnumType.STRING)
    //Pega do enum cirado dentro da raiz, para pegar as opções
    private Curso curso;

    //Faz com que eles fiquem juntos no caso, JOIN das tabelas
    //Ele vai procurar uma tabela que se chama informacoes
    @Embedded
    //Pega da entidade informações
    private Informacoes informacoes;

    //Public, construtor com um parametro
    public Instrutor(DadosCadastroInstrutor dadosCadastroInstrutor){
        this.nome = dadosCadastroInstrutor.nome();
        this.email = dadosCadastroInstrutor.email();
        this.edv = dadosCadastroInstrutor.edv();
        this.curso = dadosCadastroInstrutor.curso();
        //Json dentro do outro, dentro da entidade instrutor eu recebo a entidade informações
        this.informacoes = new Informacoes(dadosCadastroInstrutor.informacoes());
    }
}
