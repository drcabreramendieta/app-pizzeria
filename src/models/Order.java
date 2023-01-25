/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.ArrayList;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author hola
 */
public class Order {
    private ArrayList<Pizza> pizzas;
    private ArrayList<Extra> extras;
    private Client client;
    private double cost;
    private int state;
    private PropertyChangeSupport pcs;

    public Order() {
        pizzas = new ArrayList<>();
        extras = new ArrayList<>();
        state = 0;
        cost = 0;
        pcs = new PropertyChangeSupport(this);
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
        this.client = new Client(name);
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

    public void setState(int state) {
        int old = this.state;
        this.state = state;
        pcs.firePropertyChange("state", old, state);
    }
    
    public void addListener(PropertyChangeListener l){
        pcs.addPropertyChangeListener(l);
    }
    
    public void removeListener(PropertyChangeListener l){
        pcs.removePropertyChangeListener(l);
    }
}
