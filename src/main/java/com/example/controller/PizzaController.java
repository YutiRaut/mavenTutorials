package com.example.controller;

import com.example.service.Pizza;
import com.example.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class PizzaController {

   // private VegPizza vegPizza;
////WITH Constructor
//    @Autowired
//    public PizzaController(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    //WITH Setter Methid

private Pizza pizza;
@Autowired
public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }
//    @Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza(){
        return pizza.getPizza();
    }
}
