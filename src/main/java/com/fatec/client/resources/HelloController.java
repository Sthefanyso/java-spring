package com.fatec.client.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
    public class HelloController{

        @GetMapping("hello")
        public String hello(){
            return "Meu primeiro endpoint em java!";
        }
 }

    

