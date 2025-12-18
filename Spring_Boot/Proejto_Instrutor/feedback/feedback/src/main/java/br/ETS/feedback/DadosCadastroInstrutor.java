package br.ETS.feedback;

// Record é imutavel, utilizado mais na transferencia de dados, quando há a atribuição dos valores
public record DadosCadastroInstrutor(String nome,
                                     String email,
                                     String edv,
                                     Curso curso,
                                     DadosInformacoes informacoes
) {
}


