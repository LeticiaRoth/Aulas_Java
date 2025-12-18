package br.ETS.feedback.controller;

import br.ETS.feedback.DadosCadastroInstrutor;
import br.ETS.feedback.Instrutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {

    //Metodo POST
    @PostMapping //Recebe uma informação
    //Request Body -  serve para mostrar que o metodo tem corpo na requisicao

    //Mostra no Bruno, o void nao retornaria nada
    public DadosCadastroInstrutor cadastrar(@RequestBody DadosCadastroInstrutor dadosCadastroInstrutor){
        Instrutor instrutor = new Instrutor(dadosCadastroInstrutor);
        //Lombok para acontecer o retunr

        //Mostra
        System.out.println(instrutor.getNome());
        return dadosCadastroInstrutor;
    }
}
