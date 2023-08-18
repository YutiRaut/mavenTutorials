package com.example;

import com.example.controller.PizzaController;
import com.example.service.Pizza;
import com.example.service.VegPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

   // With Constructor
    @Bean
    public PizzaController pizzaController(@Qualifier("nonVegPizza") Pizza pizza){
        return  new PizzaController(pizza);
    }

//    //With Setter Method
//    @Bean
//    public PizzaController pizzaController(){
//        return  new PizzaController();
//    }

}
