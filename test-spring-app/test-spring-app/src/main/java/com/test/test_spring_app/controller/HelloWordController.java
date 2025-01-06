package com.test.test_spring_app.controller;

import com.test.test_spring_app.domain.User;
import com.test.test_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Existem dois tipos de status, a Stateless que a cada nova requisição eu recebo todas as informações necessárias para o login e o que vai ser feito
//Já o Statefull, o estado de cada cliente é mantido no servidor
@RestController //Aqui é a soma de @Controller e @ResponseBody
@RequestMapping("/hello-world")
public class HelloWordController {

    @Autowired
    private HelloWorldService helloWorldService;

    /* Essa é uma forma de instanciar, outra forma é com o @Autowired
    public  HelloWordController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }*/

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Diego");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World Post" + body.getName();
    }

    @PostMapping("/{id}")
    public String helloWorldPostt(@PathVariable("id") String id, @RequestBody User body) {
        return "Hello World Post" + body.getName();
    }
}
