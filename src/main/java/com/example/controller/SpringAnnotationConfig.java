package com.example.controller;

import com.example.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationConfig {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PizzaController pizzaController = context.getBean(PizzaController.class);
        System.out.println(pizzaController.getPizza());
    }



}
