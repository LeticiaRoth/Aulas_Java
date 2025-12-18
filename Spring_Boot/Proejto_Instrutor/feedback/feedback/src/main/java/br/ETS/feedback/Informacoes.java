package br.ETS.feedback;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter

@Setter
//Construtor com todos os parametros
@AllArgsConstructor

//Sem paramentros
@NoArgsConstructor

//Comparação de objetos
@EqualsAndHashCode

//Vai juntar as duas tabelas, como um JOIN
@Embeddable
//Variaveis private da entidade informações
public class Informacoes {
    private String discipina;
    private String trilha;
    private String faculdade;
    private String turma;

    //Public
    public Informacoes(DadosInformacoes dadosInformacoes){
        this.discipina = dadosInformacoes.disciplina();
        this.trilha = dadosInformacoes.trilha();
        this.faculdade = dadosInformacoes.faculdade();
        this.turma = dadosInformacoes.turma();
    }
}


