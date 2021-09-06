package com.fudamentos.springboot.fundamentos.controller;

import org.springframework.stereotype.Component;

@Component
public class ComandImplement implements  CommandDependency{
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde el controlador");
    }
}
