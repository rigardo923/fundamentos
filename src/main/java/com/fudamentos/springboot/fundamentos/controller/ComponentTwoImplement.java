package com.fudamentos.springboot.fundamentos.controller;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements CommandDependency{

    @Override
    public void saludar() {
        System.out.println("Segunda implementacion");
    }
}
