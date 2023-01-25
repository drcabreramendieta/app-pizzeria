/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hola
 */
public class Order {
    private ArrayList<Pizza> pizzas;
    private ArrayList<Extra> extras;
    private Client client;
    private double cost;

    public Order() {
        pizzas = new ArrayList<>();
        extras = new ArrayList<>();
    }
    
    public void addPizza(int size, String pizzaIngredient) throws IOException{
        pizzas.add(new Pizza(size, pizzaIngredient));
    }
    
    public void addPizza(int size, 
            String pizzaIngredient, 
            String borderIngredient) throws IOException{
        pizzas.add(new Pizza(size, pizzaIngredient, 
                borderIngredient));
        computeCost();
    }
    
    public void addExtra(String name) throws IOException{
        extras.add(new Extra(name));
        computeCost();
    }
    
    public void addClient(String name){
        client = new Client(name);
    }
    
    private void computeCost(){
        double cost = 0;
        for(Pizza pizza:pizzas){
            cost += pizza.getCost();
        }
        for(Extra extra:extras){
            cost += extra.getCost();
        }
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
    
    
}
