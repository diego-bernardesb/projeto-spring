package br.com.estoque.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/teste")
public class teste {

    @GetMapping("/")
    public String hello(){
        return "Hello, world!!";
    }
}
