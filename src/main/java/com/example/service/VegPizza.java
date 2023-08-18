package com.example.service;


import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza {

//    public String getTopping(){
//        return "Veggies";
//    }

    @Override
    public String getPizza() {
        return "hot pizza";
    }
}
