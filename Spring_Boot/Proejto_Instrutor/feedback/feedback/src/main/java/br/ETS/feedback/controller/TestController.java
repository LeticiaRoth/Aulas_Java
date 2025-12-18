package br.ETS.feedback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // essa anotation serve para mostrar que é um controller de uma API rest
@RequestMapping("/test") // essa anotation serve para mapea p endpoint das requisições


public class TestController{
    //Métodos HTTP
    @GetMapping //Defini essa anotation define que o metodo vai ser do tipo get
        public  String hello(){
            return "Spring Boot Teste - DS18";
        }


}

