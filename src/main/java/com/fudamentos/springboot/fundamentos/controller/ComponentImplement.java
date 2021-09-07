package com.fudamentos.springboot.fundamentos.controller;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements  CommandDependency{
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde el controlador");
    }
}
