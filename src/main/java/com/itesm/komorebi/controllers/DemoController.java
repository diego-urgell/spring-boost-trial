package com.itesm.komorebi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
// dirección

public class DemoController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        String miString="Hola";
        return miString;
    }
}
